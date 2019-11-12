package com.dostf.experian.evidente.services;

import com.dostf.experian.evidente.clients.IEvidenteClient;
import com.dostf.experian.evidente.services.imp.EvidenteService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class EvidenteServiceTest {
    private IEvidenteService evidenteService;
    @Mock
    private IEvidenteClient evidenteClient;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        evidenteService = new EvidenteService(evidenteClient);
    }

    @Test
    public void testValidarSuccess() {
        Mockito.when(evidenteClient.validarIdentidad(Mockito.any())).thenReturn(Mockito.anyString());
    }

}
