package com.dostf.evidente.services;

import com.dostf.evidente.clients.IEvidenteClient;
import com.dostf.evidente.services.imp.EvidenteService;
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
