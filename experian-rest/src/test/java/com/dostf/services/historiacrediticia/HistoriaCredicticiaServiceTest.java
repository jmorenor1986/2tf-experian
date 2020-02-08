package com.dostf.services.historiacrediticia;

import co.com.datacredito.services.serviciohistoriacreditoplus.v1.HC2PNJException;
import com.dostf.clients.imp.HistoriaCrediticiaClient;
import com.dostf.dtos.historiacrediticia.HistoriaCrediticiaDTO;
import com.dostf.services.historiacrediticia.impl.HistoriaCrediticiaServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class HistoriaCredicticiaServiceTest {

    private static final String EXPECTED_RESULT = "{\"result\": \"result\"}";
    private IHistoriaCrediticiaService historiaCrediticiaService;

    @Mock
    private HistoriaCrediticiaClient historiaCrediticiaClient;
    @Mock
    private HistoriaCrediticiaDTO historiaCrediticiaDTO;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        historiaCrediticiaService = new HistoriaCrediticiaServiceImpl(historiaCrediticiaClient);
    }

    @Test
    public void testConsultarHistoriaCrediticiaPersonaJuridica() throws HC2PNJException {
        Mockito.when(historiaCrediticiaClient.getHistoriaCrediticiaPJ(historiaCrediticiaDTO)).thenReturn(EXPECTED_RESULT);
        String respuesta = historiaCrediticiaService.consultarHistoriaCrediticiaPJ(historiaCrediticiaDTO);
        Assert.assertNotNull(respuesta);
    }
}
