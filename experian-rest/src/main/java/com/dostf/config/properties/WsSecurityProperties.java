package com.dostf.config.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = "security")
public class WsSecurityProperties {
    private String trustStore;
    private String trustStorePassword;
    private String keyStore;
    private String keyStorePassword;
    private String allowInsecureParser;
    private String certPassword;
    private String password;
    private String user;
    private String signaturePropertyFile;
    private String signatureUser;
    private String mustUnderstand;
    private String signatureParts;
    private String signatureKeyId;
    private String signatureAlgorithm;
}
