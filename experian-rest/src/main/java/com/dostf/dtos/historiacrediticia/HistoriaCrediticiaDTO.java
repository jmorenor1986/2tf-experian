package com.dostf.dtos.historiacrediticia;

import lombok.Data;

@Data
public class HistoriaCrediticiaDTO {
    private String identificacion;
    private String primerApellido;
    private String tipoIdentificacion;
    private Parametros parametros;
}
