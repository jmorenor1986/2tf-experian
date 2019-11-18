package com.dostf.config;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class GeneralConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Bean
    public JaxWsProxyFactoryBean jaxWsProxyFactoryBean() {
        return new JaxWsProxyFactoryBean();
    }

    @Bean
    public Map<String, Object> propsOut() {
        return new new HashMap<>();
    }
}
