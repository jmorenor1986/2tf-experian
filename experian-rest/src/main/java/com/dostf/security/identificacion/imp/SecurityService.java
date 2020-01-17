package com.dostf.security.identificacion.imp;

import com.dostf.config.properties.WsSecurityProperties;
import com.dostf.dtos.SecurityDto;
import com.dostf.security.SignaturePwdClientCallBackHandler;
import com.dostf.security.constants.SystemProperties;
import com.dostf.security.identificacion.IWsSecurityService;
import org.apache.cxf.configuration.jsse.TLSClientParameters;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.apache.ws.security.WSConstants;
import org.apache.ws.security.handler.WSHandlerConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class SecurityService implements IWsSecurityService {

    private final JaxWsProxyFactoryBean jaxWsProxyFactoryBean;
    private final LoggingInInterceptor loggingInInterceptor;
    private final LoggingOutInterceptor loggingOutInterceptor;
    private final TLSClientParameters tlsCP;
    private final WsSecurityProperties wsSecurityProperties;
    private Map<String, Object> propsOut;
    private Object client;
    private HTTPConduit httpConduit;
    private String uri;
    private Class<?> serviceClass;


    @Autowired
    public SecurityService(
            JaxWsProxyFactoryBean jaxWsProxyFactoryBean, LoggingInInterceptor loggingInInterceptor,
            LoggingOutInterceptor loggingOutInterceptor, TLSClientParameters tlsCP, WsSecurityProperties wsSecurityProperties) {
        this.jaxWsProxyFactoryBean = jaxWsProxyFactoryBean;
        this.loggingInInterceptor = loggingInInterceptor;
        this.loggingOutInterceptor = loggingOutInterceptor;
        this.tlsCP = tlsCP;
        this.wsSecurityProperties = wsSecurityProperties;
        this.propsOut = new HashMap<>();
    }

    private Object createFactory() {
        jaxWsProxyFactoryBean.setAddress(uri);
        jaxWsProxyFactoryBean.setServiceClass(serviceClass);
        return jaxWsProxyFactoryBean.create();
    }

    private void setInterceptors(boolean logIn, boolean logOut) {
        if (logOut) {
            loggingOutInterceptor.setPrettyLogging(true);
            ClientProxy.getClient(client).getOutInterceptors().add(loggingOutInterceptor);
        }
        if (logIn) {
            loggingInInterceptor.setPrettyLogging(true);
            ClientProxy.getClient(client).getInInterceptors().add(loggingInInterceptor);
        }
        ClientProxy.getClient(client).getOutInterceptors().add(getWSS4JOutInterceptor());
    }

    private void setTlsCP() {
        tlsCP.setDisableCNCheck(true);
    }

    private void setHttpConduit() {
        httpConduit = (HTTPConduit) ClientProxy.getClient(client).getConduit();
        httpConduit.setTlsClientParameters(tlsCP);
    }


    @Override
    public Object getService(SecurityDto securityDto) {
        this.uri = securityDto.getUri();
        this.serviceClass = securityDto.getServiceClass();
        this.client = createFactory();
        setInterceptors(securityDto.isLogRequest(), securityDto.isLogResponse());
        setTlsCP();
        setHttpConduit();
        return client;
    }


    private void setSystemProperty() {
        System.setProperty(SystemProperties.JAVAX_NET_DEBUG, SystemProperties.VALUE_JAVAX_NET_DEBUG);
        System.setProperty(SystemProperties.JAVAX_NET_SSL_TRUST_STORE, wsSecurityProperties.getTrustStore());
        System.setProperty(SystemProperties.JAVAX_NET_SSL_TRUST_STORE_PASSWORD, wsSecurityProperties.getTrustStorePassword());
        System.setProperty(SystemProperties.JAVAX_NET_SSL_KEY_STORE, wsSecurityProperties.getKeyStore());
        System.setProperty(SystemProperties.JAVAX_NET_SSL_KEY_STORE_PASSWORD, wsSecurityProperties.getKeyStorePassword());
        System.setProperty(SystemProperties.ORG_APACHE_CXF_STAX_ALLOW_INSECURE_PARSER, SystemProperties.VALUE_ALLOW_INSECURE_PARSER);
    }

    private void setSignaturePwsClient() {
        SignaturePwdClientCallBackHandler.certPassword = wsSecurityProperties.getCertPassword();
        SignaturePwdClientCallBackHandler.password = wsSecurityProperties.getPassword();
    }

    private void setPropertiesOutput() {
        propsOut.put(WSHandlerConstants.USER, wsSecurityProperties.getUser()); //Usuario dado por Experian
        propsOut.put(WSHandlerConstants.ACTION, WSHandlerConstants.USERNAME_TOKEN + " " + WSHandlerConstants.TIMESTAMP + " " + WSHandlerConstants.SIGNATURE);
        propsOut.put(WSHandlerConstants.SIG_PROP_FILE, wsSecurityProperties.getSignaturePropertyFile());
        propsOut.put(WSHandlerConstants.SIGNATURE_USER, wsSecurityProperties.getSignatureUser());
        propsOut.put(WSHandlerConstants.ADD_UT_ELEMENTS, WSConstants.NONCE_LN + " " + WSConstants.CREATED_LN);
        propsOut.put(WSHandlerConstants.MUST_UNDERSTAND, wsSecurityProperties.getMustUnderstand());
        propsOut.put(WSHandlerConstants.SIGNATURE_PARTS, wsSecurityProperties.getSignatureParts());
        propsOut.put(WSHandlerConstants.SIG_KEY_ID, wsSecurityProperties.getSignatureKeyId());
        propsOut.put(WSHandlerConstants.SIG_ALGO, wsSecurityProperties.getSignatureAlgorithm());
        propsOut.put(WSHandlerConstants.PASSWORD_TYPE, WSConstants.PW_TEXT);
        propsOut.put(WSHandlerConstants.PW_CALLBACK_CLASS, SignaturePwdClientCallBackHandler.class.getName());
    }

    private WSS4JOutInterceptor getWSS4JOutInterceptor() {
        setSystemProperty();
        setPropertiesOutput();
        setSignaturePwsClient();
        return new WSS4JOutInterceptor(propsOut);
    }

}
