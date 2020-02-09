package com.dostf.clients.imp;

import co.com.datacredito.services.serviciohistoriacreditoplus.v1.HC2PNJException;
import co.com.datacredito.services.serviciohistoriacreditoplus.v1.HC2PNJService;
import com.dc.hc2.ws.v1.SolicitudPlus;
import com.dostf.clients.IHistoriaCrediticiaClient;
import com.dostf.config.properties.HistoriaCrediticiaProperties;
import com.dostf.config.properties.OperacionesProperties;
import com.dostf.dtos.SecurityDto;
import com.dostf.dtos.historiacrediticia.HistoriaCrediticiaDTO;
import com.dostf.security.wsecurity.imp.SecurityService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HistoriaCrediticiaClient implements IHistoriaCrediticiaClient {
    private final ModelMapper modelMapper;
    private final HC2PNJService hc2PNJService;
    private final SecurityService port;
    private final OperacionesProperties operacionesProperties;
    private Object client;
    private SecurityDto securityDto;
    private HistoriaCrediticiaProperties historiaCrediticiaProperties;

    @Autowired
    public HistoriaCrediticiaClient(ModelMapper modelMapper, SecurityService port, OperacionesProperties operacionesProperties) {
        this.modelMapper = modelMapper;
        this.port = port;
        this.operacionesProperties = operacionesProperties;
        this.historiaCrediticiaProperties = operacionesProperties.getHistoriaCrediticiaProperties();
        this.securityDto = SecurityDto.builder()
                .logRequest(true)
                .logResponse(true)
                .uri(this.operacionesProperties.getUrlBase().concat(this.historiaCrediticiaProperties.getUrlHistoriaCrediticia()))
                .serviceClass(HC2PNJService.class)
                .build();
        this.hc2PNJService = (HC2PNJService) port.getService(securityDto);
    }

    @Override
    public String getHistoriaCrediticiaPJ(HistoriaCrediticiaDTO historiaCrediticiaDTO) throws HC2PNJException {
        SolicitudPlus solicitudPlus = modelMapper.map(historiaCrediticiaDTO, SolicitudPlus.class);
        solicitudPlus.setClave(historiaCrediticiaProperties.getClave());
        solicitudPlus.setProducto(historiaCrediticiaProperties.getProducto());
        solicitudPlus.setUsuario(historiaCrediticiaProperties.getProducto());
        return hc2PNJService.consultarHC2PJ(solicitudPlus);
    }

    @Override
    public String getHistoriaCrediticiaPN(HistoriaCrediticiaDTO historiaCrediticiaDTO) throws HC2PNJException {
        SolicitudPlus solicitudPlus = modelMapper.map(historiaCrediticiaDTO, SolicitudPlus.class);
        solicitudPlus.setClave(historiaCrediticiaProperties.getClave());
        solicitudPlus.setProducto(historiaCrediticiaProperties.getProducto());
        solicitudPlus.setUsuario(historiaCrediticiaProperties.getProducto());
        return hc2PNJService.consultarHC2(solicitudPlus);
    }
}
