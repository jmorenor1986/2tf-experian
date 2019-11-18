package com.dostf.services.evidente;

import co.com.datacredito.services.servicioidentificacion.v1.ServicioIdentificacion;
import com.dc.id.ws.v1.DatosValidacionRequest;
import com.dostf.clients.IEvidenteClient;
import com.dostf.config.properties.EvidenteProperties;
import com.dostf.config.properties.OperacionesProperties;
import com.dostf.dtos.evidente.ValidarDto;
import com.dostf.security.IWsSecurityConsume;
import org.apache.cxf.configuration.jsse.TLSClientParameters;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.transport.http.HTTPConduit;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class EvidenteCliente implements IEvidenteClient {

    private final ModelMapper modelMapper;
    private final OperacionesProperties operacionesProperties;
    private final EvidenteProperties evidenteProperties;
    private final String uri;
    private final IWsSecurityConsume wsSecurityConsume;
    private final JaxWsProxyFactoryBean jaxWsProxyFactoryBean;
    private final LoggingInInterceptor loggingInInterceptor;
    private final LoggingOutInterceptor loggingOutInterceptor;
    private final TLSClientParameters tlsCP;
    private Object client;
    private HTTPConduit httpConduit;
    private ServicioIdentificacion port;

    @Autowired
    public EvidenteCliente(OperacionesProperties operacionesProperties, ModelMapper modelMapper,
                           IWsSecurityConsume wsSecurityConsume, JaxWsProxyFactoryBean jaxWsProxyFactoryBean,
                           LoggingInInterceptor loggingInInterceptor, LoggingOutInterceptor loggingOutInterceptor,
                           TLSClientParameters tlsCP) {
        this.modelMapper = modelMapper;
        this.operacionesProperties = operacionesProperties;
        this.evidenteProperties = operacionesProperties.getEvidenteProperties();
        this.uri = operacionesProperties.getUrlBase().concat(evidenteProperties.getUrlEvidente());
        this.wsSecurityConsume = wsSecurityConsume;
        this.jaxWsProxyFactoryBean = jaxWsProxyFactoryBean;
        this.loggingInInterceptor = loggingInInterceptor;
        this.loggingOutInterceptor = loggingOutInterceptor;
        this.tlsCP = tlsCP;
    }

    @PostConstruct
    private void init() {
        this.client = createFactory();
        setInterceptors();
        setTlsCP();
        setHttpConduit();
        port = ((ServicioIdentificacion) client);
    }

    @Override
    public String validarIdentidad(ValidarDto validarDto) {
        DatosValidacionRequest validacionRequest = modelMapper.map(validarDto, DatosValidacionRequest.class);
        return consumeValidarIdentidad(validacionRequest);
    }

    private String consumeValidarIdentidad(DatosValidacionRequest datosValidacionRequest) {
        return port.validar(evidenteProperties.getIdUsuarioEntidad(), evidenteProperties.getParamProducto(),
                evidenteProperties.getProducto(), evidenteProperties.getCanal(), datosValidacionRequest);
    }

    private Object createFactory() {
        jaxWsProxyFactoryBean.setAddress(uri);
        jaxWsProxyFactoryBean.setServiceClass(ServicioIdentificacion.class);
        return jaxWsProxyFactoryBean.create();
    }

    private void setInterceptors() {
        loggingOutInterceptor.setPrettyLogging(true);
        ClientProxy.getClient(client).getOutInterceptors().add(loggingOutInterceptor);
        loggingInInterceptor.setPrettyLogging(true);
        ClientProxy.getClient(client).getInInterceptors().add(loggingInInterceptor);
        ClientProxy.getClient(client).getOutInterceptors().add(wsSecurityConsume.getWSS4JOutInterceptor());
    }

    private void setTlsCP() {
        tlsCP.setDisableCNCheck(true);
    }

    private void setHttpConduit() {
        httpConduit = (HTTPConduit) ClientProxy.getClient(client).getConduit();
        httpConduit.setTlsClientParameters(tlsCP);
    }

}
