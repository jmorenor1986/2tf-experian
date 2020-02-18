package com.dostf.services.evidente;


import co.com.datacredito.services.servicioidentificacion.v1.Idws2Exception;

import com.dostf.dtos.evidente.ParametrizacionDto;
import com.dostf.dtos.evidente.PreguntasDto;
import com.dostf.dtos.evidente.RespuestasRequest;
import com.dostf.dtos.evidente.ValidarDto;
import org.json.JSONException;

public interface IEvidenteService {
	
    String validarIdentidad(ValidarDto validarDto) throws Idws2Exception, JSONException;
    
    String consultarParametrizacion(ParametrizacionDto parametrizacionDto) throws Idws2Exception ;

    String consultarPreguntas(PreguntasDto preguntasDto) throws Idws2Exception, JSONException;

    String verificarPreguntas(RespuestasRequest respuestasRequest)throws Idws2Exception, JSONException;
}
