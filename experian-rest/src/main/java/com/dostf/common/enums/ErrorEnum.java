package com.dostf.common.enums;


public enum ErrorEnum {
    FECHA_EXPEDICION_MANDATORY("La fecha de expediciòn del documento de identidad es obligatoria"),
    NUMERO_IDENTIFICACION_MANDATORY("El número de identificacion es obligatorio"),
    TIPO_IDENTIFICACION_MANDATORY("El tipo de identificación es obligatorio"),
    DATOS_IDENTIFICACION_MANDATORY("Los datos de identificación son obligatorios"),
    PRIMER_APELLIDO_MANDATORY("El primer apellido es obligatorio"),
    NOMBRES_MANDATORY("los nombres son obligatorios");
    private final String message;

    ErrorEnum(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
