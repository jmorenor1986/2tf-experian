package com.dostf.dtos.historiacrediticia;

import lombok.Data;

@Data
public class HistoriaCrediticiaDTO {
    private String clave;
    private String identificacion;
    private String primerApellido;
    private String producto;
    private String tipoIdentificacion;
    private String usuario;
    private Parametros parametros;
}
