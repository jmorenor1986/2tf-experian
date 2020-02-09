package com.dostf.dtos.evidente;

import com.dostf.common.enums.ErrorEnum;
import com.dostf.common.exception.MandatoryFieldException;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class FechaExpedicionRequest {
    @JsonProperty("fechaExpedicion")
    private String timestamp;

    public void validateMandatoryField() {
        if (Objects.isNull(timestamp))
            throw new MandatoryFieldException(ErrorEnum.FECHA_EXPEDICION_MANDATORY.getMessage());
    }

}
