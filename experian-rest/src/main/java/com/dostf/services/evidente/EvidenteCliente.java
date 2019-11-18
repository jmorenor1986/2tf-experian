package com.dostf.services.evidente;

import com.dc.id.ws.v1.DatosValidacionRequest;
import com.dostf.clients.IEvidenteClient;
import com.dostf.config.properties.EvidenteProperties;
import com.dostf.config.properties.OperacionesProperties;
import com.dostf.dtos.evidente.ValidarDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EvidenteCliente implements IEvidenteClient extends  {

    private final ModelMapper modelMapper;
    private final OperacionesProperties operacionesProperties;
    private final EvidenteProperties evidenteProperties;
    private final String uri;

    @Autowired
    public EvidenteCliente(OperacionesProperties operacionesProperties, ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
        this.operacionesProperties = operacionesProperties;
        this.evidenteProperties = operacionesProperties.getEvidenteProperties();
        this.uri = operacionesProperties.getUrlBase().concat(evidenteProperties.getUrlEvidente());
    }

    @Override
    public String validarIdentidad(ValidarDto validarDto) {
        DatosValidacionRequest validacionRequest = modelMapper.map(validarDto, DatosValidacionRequest.class);
        return consumeValidarIdentidad(validacionRequest);
    }

    private String consumeValidarIdentidad(DatosValidacionRequest datosValidacionRequest) {
        return
    }
}
