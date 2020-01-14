package com.dostf.services.evidente.imp;


import co.com.datacredito.services.servicioidentificacion.v1.Idws2Exception;
import com.dostf.clients.IEvidenteClient;
import com.dostf.common.exception.MandatoryFieldException;
import com.dostf.config.StringUtilities;
import com.dostf.dtos.evidente.ParametrizacionDto;
import com.dostf.dtos.evidente.PreguntasDto;
import com.dostf.dtos.evidente.ValidarDto;
import com.dostf.dtos.evidente.validators.PreguntasValidator;
import com.dostf.services.evidente.IEvidenteService;
import io.vavr.collection.Seq;
import io.vavr.control.Validation;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EvidenteService implements IEvidenteService {

    private final IEvidenteClient evidenteClient;
    private final StringUtilities stringUtilities;
    private final PreguntasValidator preguntasValidator;

    @Autowired
    public EvidenteService(IEvidenteClient evidenteClient, StringUtilities stringUtilities, PreguntasValidator preguntasValidator) {
        this.evidenteClient = evidenteClient;
        this.stringUtilities = stringUtilities;
        this.preguntasValidator = preguntasValidator;
    }

    @Override
    public String validarIdentidad(ValidarDto validarDto) throws Idws2Exception, JSONException {
        validarDto.validateMandatoryField();
        return Optional.ofNullable(stringUtilities.xmlToJson(
                evidenteClient.validarIdentidad(validarDto))).
                orElseThrow(Idws2Exception::new);
    }

    @Override
    public String consultarParametrizacion(ParametrizacionDto parametrizacionDto) throws Idws2Exception {
        parametrizacionDto.validateMandatoryField();
        return evidenteClient.consultarParametrizacion(parametrizacionDto);
    }

    @Override
    public String consultarPreguntas(PreguntasDto preguntasDto) throws Idws2Exception, JSONException, MandatoryFieldException {
        final Validation<Seq<String>, PreguntasDto> validator = preguntasValidator.validateObject(preguntasDto);
        if (validator.isInvalid())
            throw new MandatoryFieldException(validator
                    .getError()
                    .intersperse(",")
                    .fold("", String::concat));
        return getResultPreguntas(preguntasDto);
    }

    private String getResultPreguntas(PreguntasDto preguntasDto) throws Idws2Exception, JSONException {
        return Optional.ofNullable(stringUtilities.xmlToJson(
                evidenteClient.consultarPreguntas(preguntasDto)))
                .orElseThrow(Idws2Exception::new);
    }
}
