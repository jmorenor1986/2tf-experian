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
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.math.BigInteger;

public class EvidenteServiceTest {
    private static final String EXPECTED_RESULT = "{\"result\": \"result\"}";
    public static final String EXPECTED_MESSAGE_TIPO_IDENTIFICACION = "El tipo de identificación es obligatorio";
    public static final String EXPECTED_MESSAGE_NUMERO_IDENTIFICACION = "El número de identificacion es obligatorio";
    public static final String EXPECTED_MESSAGE_REQ = "El código de validación es obligatorio";
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

    private PreguntasValidator preguntasValidator;
    @Mock
    Validation<Seq<String>, PreguntasDto> seqPreguntasDtoValidation;
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before
    public void setUp() {
        preguntasValidator = new PreguntasValidator();
        MockitoAnnotations.initMocks(this);
        evidenteService = new EvidenteService(evidenteClient, stringUtilities, preguntasValidator);
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
    public void testValidarConsultaPreguntaErrorTipoIdentificacion() throws Idws2Exception, JSONException, MandatoryFieldException {
        PreguntasDto preguntasDtoRequest = new PreguntasDto(null, "123456", new BigInteger("111"));
        Mockito.when(evidenteClient.consultarPreguntas(preguntasDtoRequest)).thenReturn(EXPECTED_RESULT);
        Mockito.when(stringUtilities.xmlToJson(Mockito.anyString())).thenReturn(EXPECTED_RESULT);
        expectedException.expect(MandatoryFieldException.class);
        expectedException.expectMessage(EXPECTED_MESSAGE_TIPO_IDENTIFICACION);
        String result = evidenteService.consultarPreguntas(preguntasDtoRequest);
        Assert.assertNotNull(result);
    }

    @Test
    public void testValidarConsultaPreguntaErrorIdentificacion() throws Idws2Exception, JSONException, MandatoryFieldException {
        PreguntasDto preguntasDtoRequest = new PreguntasDto("1", "", new BigInteger("111"));
        Mockito.when(evidenteClient.consultarPreguntas(preguntasDtoRequest)).thenReturn(EXPECTED_RESULT);
        Mockito.when(stringUtilities.xmlToJson(Mockito.anyString())).thenReturn(EXPECTED_RESULT);
        expectedException.expect(MandatoryFieldException.class);
        expectedException.expectMessage(EXPECTED_MESSAGE_NUMERO_IDENTIFICACION);
        String result = evidenteService.consultarPreguntas(preguntasDtoRequest);
        Assert.assertNotNull(result);
    }

    @Test
    public void testValidarConsultaPreguntaErrorReq() throws Idws2Exception, JSONException, MandatoryFieldException {
        PreguntasDto preguntasDtoRequest = new PreguntasDto("1", "22222", null);
        Mockito.when(evidenteClient.consultarPreguntas(preguntasDtoRequest)).thenReturn(EXPECTED_RESULT);
        Mockito.when(stringUtilities.xmlToJson(Mockito.anyString())).thenReturn(EXPECTED_RESULT);
        expectedException.expect(MandatoryFieldException.class);
        expectedException.expectMessage(EXPECTED_MESSAGE_REQ);
        String result = evidenteService.consultarPreguntas(preguntasDtoRequest);
        Assert.assertNotNull(result);
    }

    @Test
    public void testValidarConsultaPreguntaSuccess() throws Idws2Exception, JSONException {
        PreguntasDto preguntasDtoRequest = new PreguntasDto("1", "22222", new BigInteger("1"));
        Mockito.when(evidenteClient.consultarPreguntas(preguntasDtoRequest)).thenReturn(EXPECTED_RESULT);
        Mockito.when(stringUtilities.xmlToJson(Mockito.anyString())).thenReturn(EXPECTED_RESULT);
        String result = evidenteService.consultarPreguntas(preguntasDtoRequest);
        Assert.assertNotNull(result);
    }


}
