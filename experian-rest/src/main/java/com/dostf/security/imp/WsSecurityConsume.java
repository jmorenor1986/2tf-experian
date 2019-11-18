package com.dostf.security.imp;

import com.dostf.config.properties.WsSecurityProperties;
import com.dostf.security.IWsSecurityConsume;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

public class WsSecurityConsume implements IWsSecurityConsume {

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

    }
}
