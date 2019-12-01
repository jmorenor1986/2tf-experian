package com.dostf.security;

import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;

public interface IWsSecurityConsume {
    public WSS4JOutInterceptor getWSS4JOutInterceptor();
}
