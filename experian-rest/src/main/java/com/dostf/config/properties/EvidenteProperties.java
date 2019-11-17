package com.dostf.config.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class EvidenteProperties {
    private String urlEvidente;
    private String idUsuarioEntidad;
    private String paramProducto;
    private String producto;
    private String canal;
}
