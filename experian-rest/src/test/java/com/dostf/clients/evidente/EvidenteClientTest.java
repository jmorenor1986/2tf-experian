package com.dostf.clients.evidente;

import co.com.datacredito.services.servicioidentificacion.v1.Idws2Exception;
import co.com.datacredito.services.servicioidentificacion.v1.ServicioIdentificacion;
import com.dc.id.ws.v1.DatosValidacionRequest;
import com.dc.id.ws.v1.SolicitudCuestionarioRequest;
import com.dostf.clients.IEvidenteClient;
import com.dostf.clients.imp.EvidenteClient;
import com.dostf.common.validators.evidente.PreguntasValidator;
import com.dostf.config.properties.EvidenteProperties;
import com.dostf.config.properties.OperacionesProperties;
import com.dostf.dtos.evidente.PreguntasDto;
import com.dostf.dtos.evidente.ValidarDto;
import com.dostf.security.wsecurity.imp.SecurityService;
import io.vavr.collection.Seq;
import io.vavr.control.Validation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;

public class EvidenteClientTest {
    public static final String EXPECTED_URL_BASE = "localhost://";
    private IEvidenteClient evidenteClient;

    private static final String EXPECTED_RESULT = "{\"result\": \"result\"}";
    private OperacionesProperties operacionesProperties;
    @Mock
    private ModelMapper modelMapper;
    @Mock
    private SecurityService port;

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
    @Mock
    private ServicioIdentificacion servicioIdentificacion;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        OperacionesProperties operacionesProperties = new OperacionesProperties();
        operacionesProperties.setUrlBase(EXPECTED_URL_BASE);
        evidenteProperties = new EvidenteProperties();
        evidenteProperties.setUrlEvidente("");
        evidenteProperties.setCanal("");
        evidenteProperties.setIdUsuarioEntidad("");
        evidenteProperties.setParamProducto("");
        evidenteProperties.setProducto("");
        operacionesProperties.setEvidenteProperties(this.evidenteProperties);
        Mockito.when(port.getService(Mockito.any())).thenReturn(servicioIdentificacion);
        evidenteClient = new EvidenteClient(operacionesProperties, modelMapper, port);
    }

    @Test
    public void testValidarIdentidadOk() throws Idws2Exception {
        Mockito.when(modelMapper.map(validarDto, DatosValidacionRequest.class)).thenReturn(datosValidacionRequest);
        Mockito.when(servicioIdentificacion.validar("", "", "", "", datosValidacionRequest)).thenReturn(EXPECTED_RESULT);
        String result = evidenteClient.validarIdentidad(validarDto);
        Assert.assertNotNull(result);
    }

    @Test
    public void testPreguntasOk() throws Idws2Exception {
        Mockito.when(modelMapper.map(preguntasDto, SolicitudCuestionarioRequest.class)).thenReturn(solicitudCuestionarioRequest);
        Mockito.when(preguntasValidator.validateObject(preguntasDto)).thenReturn(seqPreguntasDtoValidation);
        Mockito.when(servicioIdentificacion
                .preguntas("", "", "", "", solicitudCuestionarioRequest))
                .thenReturn(EXPECTED_RESULT);
        String result = evidenteClient.consultarPreguntas(preguntasDto);
        Assert.assertNotNull(result);
    }

}