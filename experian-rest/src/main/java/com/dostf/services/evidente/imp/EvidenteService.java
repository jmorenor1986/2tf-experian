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
    public String consultarPreguntas(PreguntasDto preguntasDto) throws Idws2Exception, JSONException {
        String validation = "";
        if (preguntasValidator.validateObject(preguntasDto).isInvalid()) {
            validation = new PreguntasValidator().validateObject(preguntasDto)
                    .getError()
                    .intersperse(",")
                    .fold("", String::concat);
        }
        return Optional.ofNullable(validateDtoPreguntas(validation))
                .orElse(getResultPreguntas(preguntasDto));
    }

    private String getResultPreguntas(PreguntasDto preguntasDto) throws Idws2Exception, JSONException {
        return Optional.ofNullable(stringUtilities.xmlToJson(
                evidenteClient.consultarPreguntas(preguntasDto)))
                .orElseThrow(Idws2Exception::new);
    }

    private String validateDtoPreguntas(String responseDto) {
        if (responseDto.isEmpty())
            return null;
        throw new MandatoryFieldException(responseDto);
    }
}
