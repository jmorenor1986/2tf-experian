package com.dostf.services.evidente;

import co.com.datacredito.services.servicioidentificacion.v1.Idws2Exception;
import com.dostf.clients.IEvidenteClient;
import com.dostf.common.exception.MandatoryFieldException;
import com.dostf.config.StringUtilities;
import com.dostf.dtos.BaseDto;
import com.dostf.dtos.evidente.IdentificacionRequest;
import com.dostf.dtos.evidente.PreguntasDto;
import com.dostf.dtos.evidente.ValidarDto;
import com.dostf.dtos.evidente.validators.PreguntasValidator;
import com.dostf.services.evidente.imp.EvidenteService;
import io.vavr.collection.Seq;
import io.vavr.control.Validation;
import org.json.JSONException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class EvidenteServiceTest {
    private static final String EXPECTED_RESULT = "{\"result\": \"result\"}";
    private IEvidenteService evidenteService;
    @Mock
    private IEvidenteClient evidenteClient;
    @Mock
    private ValidarDto validarDto;

    @Mock
    private PreguntasDto preguntasDto;
    @Mock
    private BaseDto baseDto;
    @Mock
    private IdentificacionRequest identificacionRequest;
    @Mock
    private StringUtilities stringUtilities;
    @Mock
    private PreguntasValidator preguntasValidator;
    @Mock
    Validation<Seq<String>, PreguntasDto> seqPreguntasDtoValidation;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        evidenteService = new EvidenteService(evidenteClient, stringUtilities);
    }

    @Test
    public void testValidarSuccess() throws Idws2Exception, JSONException {
        Mockito.doNothing().when(validarDto).validateMandatoryField();
        Mockito.when(stringUtilities.xmlToJson(Mockito.anyString())).thenReturn(EXPECTED_RESULT);
        Mockito.when(evidenteClient.validarIdentidad(validarDto)).thenReturn(EXPECTED_RESULT);
        Mockito.when(evidenteService.validarIdentidad(validarDto)).thenReturn(EXPECTED_RESULT);
        String result = evidenteService.validarIdentidad(validarDto);
        Assert.assertNotNull(result);
    }

    @Test(expected = MandatoryFieldException.class)
    public void testValidarErrorIdentificacionRequest() throws Idws2Exception, JSONException {
        ValidarDto validarDto = new ValidarDto();
        evidenteService.validarIdentidad(validarDto);
    }

    @Test(expected = MandatoryFieldException.class)
    public void testValidarErrorIdentificacionRequestNumero() throws Idws2Exception, JSONException {
        ValidarDto validarDto = new ValidarDto();
        identificacionRequest.setNumero(null);
        validarDto.setIdentificacionRequest(identificacionRequest);
        evidenteService.validarIdentidad(validarDto);
    }

    @Test(expected = MandatoryFieldException.class)
    public void testValidarErrorIdentificacionRequestTipo() throws Idws2Exception, JSONException {
        ValidarDto validarDto = new ValidarDto();
        identificacionRequest.setNumero(Mockito.anyString());
        identificacionRequest.setTipo(null);
        validarDto.setIdentificacionRequest(identificacionRequest);
        evidenteService.validarIdentidad(validarDto);
    }

    @Test(expected = MandatoryFieldException.class)
    public void testValidarErrorIdentificacionRequestPrimerApellido() throws Idws2Exception, JSONException {
        ValidarDto validarDto = new ValidarDto();
        Mockito.doNothing().when(identificacionRequest).validateMandatoryField();
        evidenteService.validarIdentidad(validarDto);
    }

    @Test
    public void testValidarConsultaPreguntaSuccess() throws Idws2Exception, JSONException {
        Mockito.when(preguntasValidator.validateObject(preguntasDto)).thenReturn(seqPreguntasDtoValidation);
        Mockito.when(evidenteClient.consultarPreguntas(preguntasDto)).thenReturn(EXPECTED_RESULT);
        Mockito.when(stringUtilities.xmlToJson(Mockito.anyString())).thenReturn(EXPECTED_RESULT);
        String result = evidenteService.consultarPreguntas(preguntasDto);
        Assert.assertNotNull(result);
    }




}
