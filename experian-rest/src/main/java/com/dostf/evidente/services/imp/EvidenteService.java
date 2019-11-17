package com.dostf.evidente.services.imp;

import com.dostf.evidente.clients.IEvidenteClient;
import com.dostf.evidente.dtos.ValidarDto;
import com.dostf.evidente.services.IEvidenteService;
import org.springframework.beans.factory.annotation.Autowired;

public class EvidenteService implements IEvidenteService {
    private final IEvidenteClient evidenteClient;

    @Autowired
    public EvidenteService(IEvidenteClient evidenteClient) {
        this.evidenteClient = evidenteClient;
    }

    @Override
    public String validarIdentidad(ValidarDto validarDto) {
        return "null";
    }
}
