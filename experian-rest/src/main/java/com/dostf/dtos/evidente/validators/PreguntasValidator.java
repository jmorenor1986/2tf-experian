package com.dostf.dtos.evidente.validators;

import com.dostf.common.enums.ErrorEnum;
import com.dostf.dtos.evidente.PreguntasDto;
import io.vavr.collection.Seq;
import io.vavr.control.Validation;
import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.util.Objects;

@Component
public class PreguntasValidator extends GenericValidator<PreguntasDto> {

    @Override
    public Validation<Seq<String>, PreguntasDto> validateObject(PreguntasDto dto) {
        return Validation.combine(validateTipoId(dto.getTipoId())
                , validateIdentificacion(dto.getIdentificacion())
                , validateRegValidacion(dto.getRegValidacion()))
                .ap(PreguntasDto::new);
    }

    private Validation<String, BigInteger> validateRegValidacion(BigInteger regValidacion) {
        return Objects.isNull(regValidacion)
                ? Validation.invalid(ErrorEnum.REG_VALIDATION_MANDATORY.getMessage())
                : Validation.valid(regValidacion);
    }
}
