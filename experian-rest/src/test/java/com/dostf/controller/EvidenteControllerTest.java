package com.dostf.controller;

import co.com.datacredito.services.servicioidentificacion.v1.Idws2Exception;
import com.dostf.controllers.EvidenteController;
import com.dostf.dtos.evidente.PreguntasDto;
import com.dostf.services.evidente.IEvidenteService;
import com.dostf.services.evidente.imp.EvidenteService;
import org.json.JSONException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class EvidenteControllerTest {
    private static final String EXPECTED_RESULT = "{\"result\": \"result\"}";
    @Mock
    private IEvidenteService evidenteService;
    @Mock
    private PreguntasDto preguntasDto;
    private EvidenteController evidenteController;


    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        evidenteController = new EvidenteController(evidenteService);
    }

    @Test
    public void testValidarIdentificacionSucess() throws Idws2Exception, JSONException {
        Mockito.when(evidenteService.validarIdentidad(Mockito.any())).thenReturn(EXPECTED_RESULT);
        String result = evidenteController.validar(null);
        Assert.assertNotNull(result);
    }

    @Test
    public void testConsultarPreguntasSuccess() throws Idws2Exception, JSONException {
        Mockito.when(evidenteService.consultarPreguntas(Mockito.any())).thenReturn(EXPECTED_RESULT);
        String result = evidenteController.consultarPreguntas(preguntasDto);
        Assert.assertNotNull(result);
    }
}
