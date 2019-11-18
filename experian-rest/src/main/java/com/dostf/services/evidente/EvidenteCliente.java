package com.dostf.services.evidente;

import co.com.datacredito.services.servicioidentificacion.v1.ServicioIdentificacion;
import com.dc.id.ws.v1.DatosValidacionRequest;
import com.dostf.clients.IEvidenteClient;
import com.dostf.config.properties.EvidenteProperties;
import com.dostf.config.properties.OperacionesProperties;
import com.dostf.dtos.evidente.ValidarDto;
import com.dostf.security.IWsSecurityConsume;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EvidenteCliente implements IEvidenteClient {

    private final ModelMapper modelMapper;
    private final OperacionesProperties operacionesProperties;
    private final EvidenteProperties evidenteProperties;
    private final String uri;
    private final IWsSecurityConsume wsSecurityConsume;
    private final JaxWsProxyFactoryBean jaxWsProxyFactoryBean;

    @Autowired
    public EvidenteCliente(OperacionesProperties operacionesProperties, ModelMapper modelMapper, IWsSecurityConsume wsSecurityConsume, JaxWsProxyFactoryBean jaxWsProxyFactoryBean) {
        this.modelMapper = modelMapper;
        this.operacionesProperties = operacionesProperties;
        this.evidenteProperties = operacionesProperties.getEvidenteProperties();
        this.uri = operacionesProperties.getUrlBase().concat(evidenteProperties.getUrlEvidente());
        this.wsSecurityConsume = wsSecurityConsume;
        this.jaxWsProxyFactoryBean = jaxWsProxyFactoryBean;
    }

    @Override
    public String validarIdentidad(ValidarDto validarDto) {
        DatosValidacionRequest validacionRequest = modelMapper.map(validarDto, DatosValidacionRequest.class);
        return consumeValidarIdentidad(validacionRequest);
    }

    private String consumeValidarIdentidad(DatosValidacionRequest datosValidacionRequest) {
        return
    }

    private ServicioIdentificacion getPortConsume() {

    }

    private Object createFactory() {
        jaxWsProxyFactoryBean.setAddress(uri);
        jaxWsProxyFactoryBean.setServiceClass(ServicioIdentificacion.class);
        return jaxWsProxyFactoryBean.create();
    }

}
