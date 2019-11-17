package com.dostf.services.evidente;

import com.dostf.clients.IEvidenteClient;
import com.dostf.config.properties.EvidenteProperties;
import com.dostf.dtos.BaseDto;
import com.dostf.dtos.evidente.ValidarDto;
import com.dostf.services.evidente.imp.EvidenteService;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class EvidenteServiceTest {
    private IEvidenteService evidenteService;
    @Mock
    private IEvidenteClient evidenteClient;
    @Mock
    private ValidarDto validarDto;
    @Mock
    private BaseDto baseDto;
    @Mock
    private EvidenteProperties evidenteProperties;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        evidenteService = new EvidenteService(evidenteClient);
        evidenteClient = new EvidenteCliente(evidenteProperties);
    }

    @Test
    @Ignore
    public void testValidarSuccess() {
        Mockito.when(evidenteClient.validarIdentidad(Mockito.any())).thenReturn(Mockito.anyString());
    }
}
