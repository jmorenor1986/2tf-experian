package com.dostf.security.historiacrediticia.impl;

import co.com.datacredito.services.serviciohistoriacreditoplus.v1.HC2PNJService;
import com.dostf.config.properties.HistoriaCrediticiaProperties;
import com.dostf.config.properties.OperacionesProperties;
import com.dostf.security.IWsSecurityConsume;
import com.dostf.security.historiacrediticia.IWsSecurityHistoriaCrediticia;
import org.apache.cxf.configuration.jsse.TLSClientParameters;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.transport.http.HTTPConduit;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class SecurityHistoriaCrediticia implements IWsSecurityHistoriaCrediticia {

    private final OperacionesProperties operacionesProperties;
    private final String uri;
    private final HistoriaCrediticiaProperties historiaCrediticiaProperties;
    private final IWsSecurityConsume wsSecurityConsume;
    private final JaxWsProxyFactoryBean jaxWsProxyFactoryBean;
    private final LoggingInInterceptor loggingInInterceptor;
    private final LoggingOutInterceptor loggingOutInterceptor;
    private final TLSClientParameters tlsCP;
    private Object client;
    private HTTPConduit httpConduit;

    public SecurityHistoriaCrediticia(OperacionesProperties operacionesProperties, @Lazy IWsSecurityConsume wsSecurityConsume,
                                      JaxWsProxyFactoryBean jaxWsProxyFactoryBean, LoggingInInterceptor loggingInInterceptor,
                                      LoggingOutInterceptor loggingOutInterceptor, TLSClientParameters tlsCP) {
        this.operacionesProperties = operacionesProperties;
        this.wsSecurityConsume = wsSecurityConsume;
        this.jaxWsProxyFactoryBean = jaxWsProxyFactoryBean;
        this.loggingInInterceptor = loggingInInterceptor;
        this.loggingOutInterceptor = loggingOutInterceptor;
        this.tlsCP = tlsCP;
        this.historiaCrediticiaProperties = operacionesProperties.getHistoriaCrediticiaProperties();
        this.uri = operacionesProperties.getUrlBase().concat(historiaCrediticiaProperties.getUrlHistoriaCrediticia());
    }

    @PostConstruct
    private void init() {
        this.client = createFactory();
        setInterceptors();
        setTlsCP();
        setHttpConduit();
    }

    @Override
    public HC2PNJService getPort() {
        return (HC2PNJService) client;
    }

    private Object createFactory() {
        jaxWsProxyFactoryBean.setAddress(uri);
        jaxWsProxyFactoryBean.setServiceClass(HC2PNJService.class);
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
