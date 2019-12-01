package com.dostf.dtos.evidente;

import com.dostf.common.enums.ErrorEnum;
import com.dostf.common.exception.MandatoryFieldException;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class ValidarDto {
    @JsonProperty("datosIdentificacion")
    private IdentificacionRequest identificacionRequest;
    @JsonProperty("primerApellido")
    private String primerApellido;
    @JsonProperty("nombres")
    private String nombres;
    @JsonProperty("datosFechaExpedicion")
    private FechaExpedicionRequest datosValidacionFechaExpedicion;

    public void validateMandatoryField() {
        if (Objects.isNull(identificacionRequest))
            throw new MandatoryFieldException(ErrorEnum.DATOS_IDENTIFICACION_MANDATORY.getMessage());
        identificacionRequest.validateMandatoryField();
        if (Objects.isNull(primerApellido))
            throw new MandatoryFieldException(ErrorEnum.PRIMER_APELLIDO_MANDATORY.getMessage());
        if (Objects.isNull(nombres))
            throw new MandatoryFieldException(ErrorEnum.NOMBRES_MANDATORY.getMessage());
        if (Objects.isNull(datosValidacionFechaExpedicion))
            throw new MandatoryFieldException(ErrorEnum.FECHA_EXPEDICION_MANDATORY.getMessage());
        datosValidacionFechaExpedicion.validateMandatoryField();
    }

}
