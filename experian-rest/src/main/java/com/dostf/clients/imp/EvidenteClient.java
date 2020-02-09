package com.dostf.clients.imp;

import co.com.datacredito.services.servicioidentificacion.v1.Idws2Exception;
import co.com.datacredito.services.servicioidentificacion.v1.ServicioIdentificacion;
import com.dc.id.ws.v1.DatosValidacionRequest;
import com.dc.id.ws.v1.SolicitudCuestionarioRequest;
import com.dostf.clients.IEvidenteClient;
import com.dostf.config.properties.EvidenteProperties;
import com.dostf.config.properties.OperacionesProperties;
import com.dostf.dtos.SecurityDto;
import com.dostf.dtos.evidente.ParametrizacionDto;
import com.dostf.dtos.evidente.PreguntasDto;
import com.dostf.dtos.evidente.ValidarDto;
import com.dostf.security.wsecurity.imp.SecurityService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EvidenteClient implements IEvidenteClient {
    private final ModelMapper modelMapper;
    private final OperacionesProperties operacionesProperties;
    private final SecurityService port;
    private ServicioIdentificacion servicioIdentificacion;
            private Object client;
            private SecurityDto securityDto;
    private EvidenteProperties evidenteProperties;


    @Autowired
    public EvidenteClient(OperacionesProperties operacionesProperties, ModelMapper modelMapper, SecurityService port) {
        this.modelMapper = modelMapper;
        this.operacionesProperties = operacionesProperties;
        this.evidenteProperties = operacionesProperties.getEvidenteProperties();
        this.port = port;
        this.securityDto = SecurityDto.builder()
                .logRequest(true)
                .logResponse(true)
                .uri(this.operacionesProperties.getUrlBase().concat(evidenteProperties.getUrlEvidente()))
                .serviceClass(ServicioIdentificacion.class)
                .build();
        this.servicioIdentificacion = (ServicioIdentificacion) port.getService(securityDto);
    }

    @Override
    public String validarIdentidad(ValidarDto validarDto) throws Idws2Exception {
        DatosValidacionRequest validacionRequest = modelMapper.map(validarDto, DatosValidacionRequest.class);
        return servicioIdentificacion.validar(evidenteProperties.getIdUsuarioEntidad(), evidenteProperties.getParamProducto(),
                evidenteProperties.getProducto(), evidenteProperties.getCanal(), validacionRequest);
    }

    @Override
    public String consultarParametrizacion(ParametrizacionDto parametrizacionDto) throws Idws2Exception {
        return servicioIdentificacion.consultarParametrizacion(parametrizacionDto.getIdUsuarioEntidad(),
                parametrizacionDto.getProducto(), parametrizacionDto.getConsecutivo(), parametrizacionDto.getNit());
    }

    @Override
    public String consultarPreguntas(PreguntasDto preguntasDto) throws Idws2Exception {
        return servicioIdentificacion.preguntas(evidenteProperties.getIdUsuarioEntidad(), evidenteProperties.getParamProducto()
                , evidenteProperties.getProducto(), evidenteProperties.getCanal(),
                modelMapper.map(preguntasDto, SolicitudCuestionarioRequest.class));
    }

}
