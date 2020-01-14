package com.dostf.clients.evidente;

import co.com.datacredito.services.servicioidentificacion.v1.Idws2Exception;
import com.dc.id.ws.v1.DatosValidacionRequest;
import com.dc.id.ws.v1.SolicitudCuestionarioRequest;
import com.dostf.clients.IEvidenteClient;
import com.dostf.clients.imp.EvidenteClient;
import com.dostf.config.properties.EvidenteProperties;
import com.dostf.config.properties.OperacionesProperties;
import com.dostf.dtos.evidente.PreguntasDto;
import com.dostf.dtos.evidente.ValidarDto;
import com.dostf.common.validators.evidente.PreguntasValidator;
import com.dostf.security.identificacion.imp.SecurityIdentificacion;
import io.vavr.collection.Seq;
import io.vavr.control.Validation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;

public class EvidenteClientTest {
    private IEvidenteClient evidenteClient;

    private static final String EXPECTED_RESULT = "{\"result\": \"result\"}";
    @Mock
    private OperacionesProperties operacionesProperties;
    @Mock
    private ModelMapper modelMapper;
    @Mock
    private SecurityIdentificacion port;
    @Mock
    private EvidenteProperties evidenteProperties;
    @Mock
    private DatosValidacionRequest datosValidacionRequest;
    @Mock
    private SolicitudCuestionarioRequest solicitudCuestionarioRequest;
    @Mock
    private ValidarDto validarDto;
    @Mock
    private PreguntasDto preguntasDto;
    @Mock
    private PreguntasValidator preguntasValidator;
    @Mock
    private Validation<Seq<String>, PreguntasDto> seqPreguntasDtoValidation;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        Mockito.when(operacionesProperties.getEvidenteProperties()).thenReturn(evidenteProperties);
        evidenteClient = new EvidenteClient(operacionesProperties, modelMapper, port);
    }

    @Test
    @Ignore("is ignore because the parameter port is injected by setter")
    public void testValidarIdentidadOk() throws Idws2Exception {
        Mockito.when(modelMapper.map(validarDto, DatosValidacionRequest.class)).thenReturn(datosValidacionRequest);
        Mockito.when(port.getPort().validar("", "", "", "", datosValidacionRequest)).thenReturn(EXPECTED_RESULT);
        String result = evidenteClient.validarIdentidad(Mockito.any());
        Assert.assertNotNull(result);
    }

    @Ignore("is ignore because the parameter port is injected by setter")
    @Test
    public void testPreguntasOk() throws Idws2Exception {
        Mockito.when(modelMapper.map(preguntasDto, SolicitudCuestionarioRequest.class)).thenReturn(solicitudCuestionarioRequest);
        Mockito.when(preguntasValidator.validateObject(preguntasDto)).thenReturn(seqPreguntasDtoValidation);
        Mockito.when(port.getPort()
                .preguntas(Mockito.eq(""), Mockito.eq(""), Mockito.eq(""), Mockito.eq(""), solicitudCuestionarioRequest))
                .thenReturn(EXPECTED_RESULT);
        String result = evidenteClient.consultarPreguntas(preguntasDto);
        Assert.assertNotNull(result);
    }

}