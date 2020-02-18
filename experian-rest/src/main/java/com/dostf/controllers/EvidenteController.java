package com.dostf.controllers;

import co.com.datacredito.services.servicioidentificacion.v1.Idws2Exception;
import com.dostf.dtos.evidente.ParametrizacionDto;
import com.dostf.dtos.evidente.PreguntasDto;
import com.dostf.dtos.evidente.RespuestasRequest;
import com.dostf.dtos.evidente.ValidarDto;
import com.dostf.services.evidente.IEvidenteService;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/experian/evidente")
public class EvidenteController {

    private final IEvidenteService evidenteService;

    @Autowired
    public EvidenteController(IEvidenteService evidenteService) {
        this.evidenteService = evidenteService;
    }

    @PostMapping(value = "/validarIdentificacion", produces = MediaType.APPLICATION_JSON_VALUE)
    public String validar(@RequestBody ValidarDto validarDto) throws Idws2Exception, JSONException {
        return evidenteService.validarIdentidad(validarDto);
    }

    @PostMapping(value = "/consultarParametros", produces = MediaType.APPLICATION_JSON_VALUE)
    public String consultaParametrizacion(@RequestBody ParametrizacionDto parametrosDto) throws Idws2Exception {
        return evidenteService.consultarParametrizacion(parametrosDto);
    }

    @PostMapping(value = "/consultarPreguntas", produces = MediaType.APPLICATION_JSON_VALUE)
    public String consultarPreguntas(@RequestBody PreguntasDto preguntasDto) throws Idws2Exception, JSONException {
        return evidenteService.consultarPreguntas(preguntasDto);
    }

    @PostMapping(value = "/verificarPreguntas", produces = MediaType.APPLICATION_JSON_VALUE)
    public String verificarPreguntas(@RequestBody RespuestasRequest respuestasRequest) throws Idws2Exception, JSONException {
        return evidenteService.verificarPreguntas(respuestasRequest);
    }
}