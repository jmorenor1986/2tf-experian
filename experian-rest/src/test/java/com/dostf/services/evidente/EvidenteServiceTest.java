package com.dostf.services.evidente;

import com.dostf.clients.IEvidenteClient;
import com.dostf.clients.imp.EvidenteCliente;
import com.dostf.config.properties.OperacionesProperties;
import com.dostf.dtos.BaseDto;
import com.dostf.dtos.evidente.ValidarDto;
import com.dostf.services.evidente.imp.EvidenteService;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;

public class EvidenteServiceTest {
    private IEvidenteService evidenteService;
    @Mock
    private IEvidenteClient evidenteClient;
    @Mock
    private ValidarDto validarDto;
    @Mock
    private BaseDto baseDto;
    @Mock
    private OperacionesProperties operacionesProperties;
    @Mock
    private ModelMapper modelMapper;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        evidenteService = new EvidenteService(evidenteClient);
//        evidenteClient = new EvidenteCliente(operacionesProperties,modelMapper);
    }

    @Test
    @Ignore
    public void testValidarSuccess() {
        //Mockito.when(evidenteClient.validarIdentidad(Mockito.any())).thenReturn(Mockito.anyString());
    }
}
