package com.dostf.services.evidente;


import com.dostf.dtos.evidente.ValidarDto;

public interface IEvidenteService {
    String validarIdentidad(ValidarDto validarDto);
}
