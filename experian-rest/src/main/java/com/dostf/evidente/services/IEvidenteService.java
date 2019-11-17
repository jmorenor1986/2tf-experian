package com.dostf.evidente.services;


import com.dostf.evidente.dtos.ValidarDto;

public interface IEvidenteService {
    String validarIdentidad(ValidarDto validarDto);
}
