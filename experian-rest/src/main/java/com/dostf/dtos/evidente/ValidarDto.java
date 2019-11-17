package com.dostf.dtos.evidente;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ValidarDto {
    private IdentificacionRequest identificacionRequest;
    private String primerApellido;
    private String nombres;
    private FechaExpedicionRequest datosValidacionFechaExpedicion;
}
