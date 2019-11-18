package com.dostf.security.imp;

import com.dostf.config.properties.WsSecurityProperties;
import com.dostf.security.IWsSecurityConsume;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

public class WsSecurityConsume implements IWsSecurityConsume {

    public static final String JAVAX_NET_DEBUG = "javax.net.debug";
    public static final String VALUE_JAVAX_NET_DEBUG = "ssl,handshake";
    public static final String JAVAX_NET_SSL_TRUST_STORE = "javax.net.ssl.trustStore";
    public static final String JAVAX_NET_SSL_TRUST_STORE_PASSWORD = "javax.net.ssl.trustStorePassword";
    public static final String JAVAX_NET_SSL_KEY_STORE = "javax.net.ssl.keyStore";
    public static final String JAVAX_NET_SSL_KEY_STORE_PASSWORD = "javax.net.ssl.keyStorePassword";
    public static final String ORG_APACHE_CXF_STAX_ALLOW_INSECURE_PARSER = "org.apache.cxf.stax.allowInsecureParser";
    public static final String VALUE_ALLOW_INSECURE_PARSER = "1";
    private final JaxWsProxyFactoryBean jaxWsProxyFactoryBean;
    private final WsSecurityProperties wsSecurityProperties;
    private final Map<String, Object> propsOut;

    @Autowired
    public WsSecurityConsume(JaxWsProxyFactoryBean jaxWsProxyFactoryBean, WsSecurityProperties wsSecurityProperties, Map<String, Object> propsOut) {
        this.jaxWsProxyFactoryBean = jaxWsProxyFactoryBean;
        this.wsSecurityProperties = wsSecurityProperties;
        this.propsOut = propsOut;
    }


    @Override
    public void applyWsSecurity() {

    }

    private void setSystemProperty() {
        System.setProperty(JAVAX_NET_DEBUG, VALUE_JAVAX_NET_DEBUG);
        System.setProperty(JAVAX_NET_SSL_TRUST_STORE, wsSecurityProperties.getTrustStore());
        System.setProperty(JAVAX_NET_SSL_TRUST_STORE_PASSWORD, wsSecurityProperties.getTrustStorePassword());
        System.setProperty(JAVAX_NET_SSL_KEY_STORE, wsSecurityProperties.getKeyStore());
        System.setProperty(JAVAX_NET_SSL_KEY_STORE_PASSWORD, wsSecurityProperties.getKeyStorePassword());
        System.setProperty(ORG_APACHE_CXF_STAX_ALLOW_INSECURE_PARSER, VALUE_ALLOW_INSECURE_PARSER);
    }
}
