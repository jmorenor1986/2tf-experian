package com.dostf.services.evidente.imp;


import com.dostf.clients.IEvidenteClient;
import com.dostf.dtos.evidente.ValidarDto;
import com.dostf.services.evidente.IEvidenteService;
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
