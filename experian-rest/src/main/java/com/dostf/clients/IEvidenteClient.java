package com.dostf.clients;

import co.com.datacredito.services.servicioidentificacion.v1.Idws2Exception;

import com.dostf.dtos.evidente.ParametrizacionDto;
import com.dostf.dtos.evidente.ValidarDto;

public interface IEvidenteClient {
    public String validarIdentidad(ValidarDto validarDto) throws Idws2Exception;
    
    public String consultarParametrizacion(ParametrizacionDto parametrizacionDto) throws Idws2Exception;
}
