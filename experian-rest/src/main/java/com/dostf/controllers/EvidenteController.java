package com.dostf.controllers;

import co.com.datacredito.services.servicioidentificacion.v1.Idws2Exception;
import com.dostf.dtos.evidente.ValidarDto;
import com.dostf.services.evidente.IEvidenteService;
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

    @PostMapping(value = "/validar", produces = MediaType.APPLICATION_JSON_VALUE)
    public String validar(@RequestBody ValidarDto validarDto) throws Idws2Exception {
        return evidenteService.validarIdentidad(validarDto);
    }
}