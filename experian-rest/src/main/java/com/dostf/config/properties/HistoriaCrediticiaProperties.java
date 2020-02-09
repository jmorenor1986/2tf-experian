package com.dostf.config.properties;


import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class HistoriaCrediticiaProperties {
    private String urlHistoriaCrediticia;
    private String clave;
    private String usuario;
    private String producto;
}
