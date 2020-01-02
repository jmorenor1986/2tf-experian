package com.dostf.dtos.evidente;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;

@Data
public class PreguntasDto {
    @JsonProperty("tipoDocumento")
    private String tipoId;
    @JsonProperty("identificacion")
    private String identificacion;
    @JsonProperty("codigoValidacion")
    private BigInteger regValidacion;

    public PreguntasDto() {
    }

    public PreguntasDto(String tipoId, String identificacion, BigInteger regValidacion) {
        this.tipoId = tipoId;
        this.identificacion = identificacion;
        this.regValidacion = regValidacion;
    }
}
