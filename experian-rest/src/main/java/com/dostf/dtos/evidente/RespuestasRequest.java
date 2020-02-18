package com.dostf.dtos.evidente;

import lombok.Data;

import java.util.List;

@Data
public class RespuestasRequest {
    private String idCuestionario;
    private String regCuestionario;
    private IdentificacionRequest identificacionRequest;
    private List<Respuesta> respuesta;
}
