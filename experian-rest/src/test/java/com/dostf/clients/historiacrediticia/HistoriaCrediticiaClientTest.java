package com.dostf.clients.historiacrediticia;

import co.com.datacredito.services.serviciohistoriacreditoplus.v1.HC2PNJException;
import co.com.datacredito.services.serviciohistoriacreditoplus.v1.HC2PNJService;
import com.dc.hc2.ws.v1.SolicitudPlus;
import com.dostf.clients.IHistoriaCrediticiaClient;
import com.dostf.clients.imp.HistoriaCrediticiaClient;
import com.dostf.config.properties.HistoriaCrediticiaProperties;
import com.dostf.config.properties.OperacionesProperties;
import com.dostf.dtos.historiacrediticia.HistoriaCrediticiaDTO;
import com.dostf.security.wsecurity.imp.SecurityService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;

public class HistoriaCrediticiaClientTest {
    @Mock
    private HC2PNJService service;
    @Mock
    private HistoriaCrediticiaDTO historiaCrediticiaDTO;
    @Mock
    private ModelMapper modelMapper;
    @Mock
    private SolicitudPlus solicitudPlus;
    @Mock
    private SecurityService port;

    private OperacionesProperties operacionesProperties;
    private HistoriaCrediticiaProperties historiaCrediticiaProperties;
    private static final String EXPECTED_RESULT = "{\"result\": \"result\"}";
    private IHistoriaCrediticiaClient client;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        operacionesProperties = new OperacionesProperties();
        historiaCrediticiaProperties = new HistoriaCrediticiaProperties();
        historiaCrediticiaProperties.setClave("1234");
        historiaCrediticiaProperties.setProducto("010");
        historiaCrediticiaProperties.setUrlHistoriaCrediticia("/wss/dhws3/services/DHServicePlus");
        historiaCrediticiaProperties.setUsuario("12345");
        operacionesProperties.setHistoriaCrediticiaProperties(historiaCrediticiaProperties);
        operacionesProperties.setUrlBase("https://demo-servicesesb.datacredito.com.co");
        Mockito.when(port.getService(Mockito.any())).thenReturn(service);
        client = new HistoriaCrediticiaClient(modelMapper, port, operacionesProperties);
    }

    @Test
    public void historiaCrediticiaPersonaJuridicaSuccess() throws HC2PNJException {
        Mockito.when(modelMapper.map(historiaCrediticiaDTO, SolicitudPlus.class)).thenReturn(solicitudPlus);
        Mockito.when(service.consultarHC2PJ(solicitudPlus)).thenReturn(EXPECTED_RESULT);
        String result = client.getHistoriaCrediticiaPJ(historiaCrediticiaDTO);
        Assert.assertNotNull(result);
    }

    @Test
    public void historiaCrediticiaPersonaNaturalSuccess() throws HC2PNJException {
        Mockito.when(modelMapper.map(historiaCrediticiaDTO, SolicitudPlus.class)).thenReturn(solicitudPlus);
        Mockito.when(service.consultarHC2(solicitudPlus)).thenReturn(EXPECTED_RESULT);
        String result = client.getHistoriaCrediticiaPN(historiaCrediticiaDTO);
        Assert.assertNotNull(result);
    }
}
