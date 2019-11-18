package com.dostf.security;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.stereotype.Service;

import java.util.Map;

public interface IWsSecurityConsume {
    public Map<String, Object> getPropsOut();
}
