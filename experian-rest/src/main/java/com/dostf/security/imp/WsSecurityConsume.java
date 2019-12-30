package com.dostf.security.imp;

import com.dostf.config.properties.WsSecurityProperties;
import com.dostf.security.IWsSecurityConsume;
import com.dostf.security.SignaturePwdClientCallBackHandler;
import com.dostf.security.constants.SystemProperties;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.apache.ws.security.WSConstants;
import org.apache.ws.security.handler.WSHandlerConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Map;

@Service
public class WsSecurityConsume implements IWsSecurityConsume {

    private final WsSecurityProperties wsSecurityProperties;
    private final Map<String, Object> propsOut;

    @Autowired
    public WsSecurityConsume(WsSecurityProperties wsSecurityProperties, Map<String, Object> propsOut) {
        this.wsSecurityProperties = wsSecurityProperties;
        this.propsOut = propsOut;
    }

    @PostConstruct
    public void init() {
        setSystemProperty();
        setPropertiesOutput();
        setSignaturePwsClient();
    }

    public WSS4JOutInterceptor getWSS4JOutInterceptor() {
        return new WSS4JOutInterceptor(propsOut);
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

}

