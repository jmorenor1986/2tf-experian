package com.dostf.clients.imp;

import co.com.datacredito.services.servicioidentificacion.v1.Idws2Exception;
import com.dc.id.ws.v1.DatosValidacionRequest;
import com.dostf.clients.IEvidenteClient;
import com.dostf.config.properties.EvidenteProperties;
import com.dostf.config.properties.OperacionesProperties;
import com.dostf.dtos.evidente.ValidarDto;
import com.dostf.security.identificacion.imp.SecurityIdentificacion;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EvidenteCliente implements IEvidenteClient {
    private final ModelMapper modelMapper;
    private final OperacionesProperties operacionesProperties;
    private final EvidenteProperties evidenteProperties;
    private SecurityIdentificacion port;
    private Object client;

    //https://www.baeldung.com/circular-dependencies-in-spring
    @Autowired
    public void setPort(SecurityIdentificacion port) {
        this.port = port;
    }

    @Autowired
    public EvidenteCliente(OperacionesProperties operacionesProperties, ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
        this.operacionesProperties = operacionesProperties;
        this.evidenteProperties = operacionesProperties.getEvidenteProperties();
    }

    @Override
    public String validarIdentidad(ValidarDto validarDto) throws Idws2Exception {
        DatosValidacionRequest validacionRequest = modelMapper.map(validarDto, DatosValidacionRequest.class);
        return port.getPort().validar(evidenteProperties.getIdUsuarioEntidad(), evidenteProperties.getParamProducto(),
                evidenteProperties.getProducto(), evidenteProperties.getCanal(), validacionRequest);
    }


}
