package com.dostf.clients.imp;

import co.com.datacredito.services.serviciohistoriacreditoplus.v1.HC2PNJException;
import com.dc.hc2.ws.v1.SolicitudPlus;
import com.dostf.clients.IHistoriaCrediticiaClient;
import com.dostf.config.properties.HistoriaCrediticiaProperties;
import com.dostf.config.properties.OperacionesProperties;
import com.dostf.dtos.historiacrediticia.HistoriaCrediticiaDTO;
import com.dostf.security.historiacrediticia.IWsSecurityHistoriaCrediticia;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HistoriaCrediticiaClient implements IHistoriaCrediticiaClient {
    private final ModelMapper modelMapper;
    private final OperacionesProperties operacionesProperties;
    private final HistoriaCrediticiaProperties historiaCrediticiaProperties;
    private final IWsSecurityHistoriaCrediticia iWsSecurityHistoriaCrediticia;

    @Autowired
    public HistoriaCrediticiaClient(ModelMapper modelMapper, OperacionesProperties operacionesProperties,
                                    IWsSecurityHistoriaCrediticia iWsSecurityHistoriaCrediticia) {
        this.modelMapper = modelMapper;
        this.operacionesProperties = operacionesProperties;
        this.iWsSecurityHistoriaCrediticia = iWsSecurityHistoriaCrediticia;
        this.historiaCrediticiaProperties = operacionesProperties.getHistoriaCrediticiaProperties();
    }

    @Override
    public String getHistoriaCrediticiaPJ(HistoriaCrediticiaDTO historiaCrediticiaDTO) throws HC2PNJException {
        return service.consultarHC2PJ(modelMapper.map(historiaCrediticiaDTO, SolicitudPlus.class));
    }
}
