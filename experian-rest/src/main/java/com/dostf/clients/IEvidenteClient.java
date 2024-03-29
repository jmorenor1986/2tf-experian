package com.dostf.clients;

import co.com.datacredito.services.servicioidentificacion.v1.Idws2Exception;
import com.dostf.dtos.evidente.ParametrizacionDto;
import com.dostf.dtos.evidente.PreguntasDto;
import com.dostf.dtos.evidente.RespuestasRequest;
import com.dostf.dtos.evidente.ValidarDto;

public interface IEvidenteClient {
    public String validarIdentidad(ValidarDto validarDto) throws Idws2Exception;

    public String consultarParametrizacion(ParametrizacionDto parametrizacionDto) throws Idws2Exception;

    public String consultarPreguntas(PreguntasDto preguntasDto) throws Idws2Exception;

    public String verificarPreguntas(RespuestasRequest respuestasRequest) throws Idws2Exception;
}
