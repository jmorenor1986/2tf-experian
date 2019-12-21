package com.dostf.dtos.evidente;

import java.util.Objects;

import com.dostf.common.enums.ErrorEnum;
import com.dostf.common.exception.MandatoryFieldException;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ParametrizacionDto {
	@JsonProperty("idUsuarioEntidad")
	private String idUsuarioEntidad;
	@JsonProperty("producto")
	private String producto;
	@JsonProperty("consecutivo")
	private String consecutivo;
	@JsonProperty("nit")
	private String nit;
	
	public void validateMandatoryField() {
        if (Objects.isNull(idUsuarioEntidad))
            throw new MandatoryFieldException(ErrorEnum.IDUSUARIOENTIDAD.getMessage());
        if (Objects.isNull(producto))
            throw new MandatoryFieldException(ErrorEnum.PRODUCTO.getMessage());
        if (Objects.isNull(consecutivo))
            throw new MandatoryFieldException(ErrorEnum.CONSECUTIVO.getMessage());
        if (Objects.isNull(nit))
            throw new MandatoryFieldException(ErrorEnum.NIT.getMessage());
    }

}
