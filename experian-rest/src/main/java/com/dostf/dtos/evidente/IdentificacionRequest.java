package com.dostf.dtos.evidente;

import com.dostf.common.enums.ErrorEnum;
import com.dostf.common.exception.MandatoryFieldException;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class IdentificacionRequest {
    @JsonProperty("numeroIdentificacion")
    private String numero;
    @JsonProperty("tipoIdentificacion")
    private String tipo;

    public void validateMandatoryField() {
        if (Objects.isNull(numero))
            throw new MandatoryFieldException(ErrorEnum.NUMERO_IDENTIFICACION_MANDATORY.getMessage());
        if (Objects.isNull(tipo))
            throw new MandatoryFieldException(ErrorEnum.TIPO_IDENTIFICACION_MANDATORY.getMessage());
    }
}
