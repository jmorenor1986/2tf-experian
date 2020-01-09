package com.dostf.security.identificacion.imp;

import co.com.datacredito.services.servicioidentificacion.v1.ServicioIdentificacion;
import com.dostf.config.properties.EvidenteProperties;
import com.dostf.config.properties.OperacionesProperties;
import com.dostf.security.IWsSecurityConsume;
import com.dostf.security.identificacion.IWsSecurityIdentificacion;
import org.apache.cxf.configuration.jsse.TLSClientParameters;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.transport.http.HTTPConduit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class SecurityIdentificacion implements IWsSecurityIdentificacion {
    private final OperacionesProperties operacionesProperties;
    private final String uri;
    private final EvidenteProperties evidenteProperties;
    private final IWsSecurityConsume wsSecurityConsume;
    private final JaxWsProxyFactoryBean jaxWsProxyFactoryBean;
    private final LoggingInInterceptor loggingInInterceptor;
    private final LoggingOutInterceptor loggingOutInterceptor;
    private final TLSClientParameters tlsCP;
    private Object client;
    private HTTPConduit httpConduit;


    @Autowired
    public SecurityIdentificacion(OperacionesProperties operacionesProperties,
                                  JaxWsProxyFactoryBean jaxWsProxyFactoryBean, LoggingInInterceptor loggingInInterceptor,
                                  LoggingOutInterceptor loggingOutInterceptor, TLSClientParameters tlsCP,
                                  @Lazy IWsSecurityConsume wsSecurityConsume) {
        this.operacionesProperties = operacionesProperties;
        this.evidenteProperties = operacionesProperties.getEvidenteProperties();
        this.uri = operacionesProperties.getUrlBase().concat(evidenteProperties.getUrlEvidente());
        this.jaxWsProxyFactoryBean = jaxWsProxyFactoryBean;
        this.loggingInInterceptor = loggingInInterceptor;
        this.loggingOutInterceptor = loggingOutInterceptor;
        this.tlsCP = tlsCP;
        this.wsSecurityConsume = wsSecurityConsume;
    }

    @PostConstruct
    private void init() {
        this.client = createFactory();
        setInterceptors();
        setTlsCP();
        setHttpConduit();
    }

    @Override
    public ServicioIdentificacion getPort() {
        return (ServicioIdentificacion) client;
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
