package com.dostf.clients.imp;

import co.com.datacredito.services.serviciohistoriacreditoplus.v1.HC2PNJException;
import co.com.datacredito.services.serviciohistoriacreditoplus.v1.HC2PNJService;
import com.dc.hc2.ws.v1.SolicitudPlus;
import com.dostf.clients.IHistoriaCrediticiaClient;
import com.dostf.dtos.historiacrediticia.HistoriaCrediticiaDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HistoriaCrediticiaClient implements IHistoriaCrediticiaClient {
    private final HC2PNJService service;
    private final ModelMapper modelMapper;


    @Autowired
    public HistoriaCrediticiaClient(HC2PNJService service, ModelMapper modelMapper) {
        this.service = service;
        this.modelMapper = modelMapper;
    }

    @Override
    public String getHistoriaCrediticiaPJ(HistoriaCrediticiaDTO historiaCrediticiaDTO) throws HC2PNJException {
        return service.consultarHC2PJ(modelMapper.map(historiaCrediticiaDTO, SolicitudPlus.class));
    }
}
