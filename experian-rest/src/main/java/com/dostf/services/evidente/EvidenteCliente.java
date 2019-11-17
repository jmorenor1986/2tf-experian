package com.dostf.services.evidente;

import com.dostf.clients.IEvidenteClient;
import com.dostf.config.properties.EvidenteProperties;
import com.dostf.dtos.evidente.ValidarDto;

public class EvidenteCliente implements IEvidenteClient {

    public EvidenteCliente(EvidenteProperties evidenteProperties) {
    }

    @Override
    public String validarIdentidad(ValidarDto validarDto) {
        return null;
    }
}
