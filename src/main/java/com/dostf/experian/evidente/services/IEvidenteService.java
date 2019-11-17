package com.dostf.experian.evidente.services;

import com.dostf.experian.evidente.dtos.ValidarDto;

public interface IEvidenteService {
    String validarIdentidad(ValidarDto validarDto);
}
