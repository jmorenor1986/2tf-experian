package com.dostf.services.evidente;


import co.com.datacredito.services.servicioidentificacion.v1.Idws2Exception;

import com.dostf.dtos.evidente.ParametrizacionDto;
import com.dostf.dtos.evidente.ValidarDto;

public interface IEvidenteService {
	
    String validarIdentidad(ValidarDto validarDto) throws Idws2Exception;
    
    String consultarParametrizacion(ParametrizacionDto parametrizacionDto) throws Idws2Exception ;
}
