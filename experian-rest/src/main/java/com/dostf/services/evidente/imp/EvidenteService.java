package com.dostf.services.evidente.imp;


import co.com.datacredito.services.servicioidentificacion.v1.Idws2Exception;
import com.dostf.clients.IEvidenteClient;
import com.dostf.config.StringUtilities;
import com.dostf.dtos.evidente.ParametrizacionDto;
import com.dostf.dtos.evidente.ValidarDto;
import com.dostf.services.evidente.IEvidenteService;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EvidenteService implements IEvidenteService {

    private final IEvidenteClient evidenteClient;
    private final StringUtilities stringUtilities;

    @Autowired
    public EvidenteService(IEvidenteClient evidenteClient, StringUtilities stringUtilities) {
        this.evidenteClient = evidenteClient;
        this.stringUtilities = stringUtilities;
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
}
