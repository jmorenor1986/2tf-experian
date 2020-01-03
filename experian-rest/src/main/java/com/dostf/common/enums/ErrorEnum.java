package com.dostf.common.enums;


public enum ErrorEnum {
	//Objeto de validacion
    FECHA_EXPEDICION_MANDATORY("La fecha de expediciòn del documento de identidad es obligatoria"),
    NUMERO_IDENTIFICACION_MANDATORY("El número de identificacion es obligatorio"),
    TIPO_IDENTIFICACION_MANDATORY("El tipo de identificación es obligatorio"),
    DATOS_IDENTIFICACION_MANDATORY("Los datos de identificación son obligatorios"),
    PRIMER_APELLIDO_MANDATORY("El primer apellido es obligatorio"),
    NOMBRES_MANDATORY("los nombres son obligatorios"),
	
	//Objeto de ParametrizacionDto
	IDUSUARIOENTIDAD("El id de la entidad es obligatorio"),
	PRODUCTO("El producto es obligatorio"),
	CONSECUTIVO("El consecutivo es obligatorio"),
	NIT("El nit es obligatoriossss"),

    // object of preguntas
    REG_VALIDATION_MANDATORY("El código de validación es obligatorio");
	
	
	
    private final String message;

    ErrorEnum(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
