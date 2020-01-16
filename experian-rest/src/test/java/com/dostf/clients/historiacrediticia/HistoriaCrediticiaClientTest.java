package com.dostf.clients.historiacrediticia;

import co.com.datacredito.services.serviciohistoriacreditoplus.v1.HC2PNJException;
import co.com.datacredito.services.serviciohistoriacreditoplus.v1.HC2PNJService;
import com.dc.hc2.ws.v1.SolicitudPlus;
import com.dostf.clients.IHistoriaCrediticiaClient;
import com.dostf.clients.imp.HistoriaCrediticiaClient;
import com.dostf.dtos.historiacrediticia.HistoriaCrediticiaDTO;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;
import org.springframework.ui.ModelMap;

public class HistoriaCrediticiaClientTest {
    @Mock
    private HC2PNJService service;
    @Mock
    private HistoriaCrediticiaDTO historiaCrediticiaDTO;
    @Mock
    private ModelMapper modelMapper;
    @Mock
    private SolicitudPlus solicitudPlus;
    private static final String EXPECTED_RESULT = "{\"result\": \"result\"}";
    private IHistoriaCrediticiaClient client;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void historiaCrediticiaPersonaJuridicaTest() throws HC2PNJException {
        client = new HistoriaCrediticiaClient(service, modelMapper);
        Mockito.when(modelMapper.map(historiaCrediticiaDTO, SolicitudPlus.class)).thenReturn(solicitudPlus);
        Mockito.when(service.consultarHC2PJ(solicitudPlus)).thenReturn(EXPECTED_RESULT);
        String result = client.getHistoriaCrediticiaPJ(historiaCrediticiaDTO);
        Assert.assertNotNull(result);
    }

}
