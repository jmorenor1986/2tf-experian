package com.dostf.controller;

import co.com.datacredito.services.serviciohistoriacreditoplus.v1.HC2PNJException;
import com.dostf.controllers.HistoriaCrediticiaController;
import com.dostf.dtos.historiacrediticia.HistoriaCrediticiaDTO;
import com.dostf.services.historiacrediticia.IHistoriaCrediticiaService;
import org.json.JSONException;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class HistoriaCrediciticiaControllerTest {
    private static final String EXPECTED_RESULT = "{\"result\": \"result\"}";
    @Mock
    private IHistoriaCrediticiaService historiaCrediticiaService;
    @Mock
    private HistoriaCrediticiaDTO historiaCrediticiaDTO;
    private HistoriaCrediticiaController historiaCrediticiaController;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        historiaCrediticiaController = new HistoriaCrediticiaController(historiaCrediticiaService);
    }

    @Test
    public void testHistoriaCrediticiaPJController() throws HC2PNJException, JSONException {
        Mockito.when(historiaCrediticiaService.consultarHistoriaCrediticiaPJ(historiaCrediticiaDTO)).thenReturn(EXPECTED_RESULT);
        String result = historiaCrediticiaController.consultarHistoriaCrediticiaPJ(historiaCrediticiaDTO);
    }

}
