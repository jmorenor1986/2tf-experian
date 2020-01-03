package com.dostf.dtos.evidente.validators;

import com.dostf.common.enums.ErrorEnum;
import com.dostf.dtos.evidente.PreguntasDto;
import io.vavr.collection.Seq;
import io.vavr.control.Validation;

import java.util.Objects;

public abstract class GenericValidator<T> {

    protected Validation<String, String> validateTipoId(String tipoId) {
        return Objects.isNull(tipoId) || tipoId.isEmpty()
                ? Validation.invalid(ErrorEnum.TIPO_IDENTIFICACION_MANDATORY.getMessage())
                : Validation.valid(tipoId);
    }

    protected Validation<String, String> validateIdentificacion(String identificacion) {
        return Objects.isNull(identificacion) || identificacion.isEmpty()
                ? Validation.invalid(ErrorEnum.NUMERO_IDENTIFICACION_MANDATORY.getMessage())
                : Validation.valid(identificacion);
    }

    public abstract Validation<Seq<String>, T> validateObject(T dto);
}
