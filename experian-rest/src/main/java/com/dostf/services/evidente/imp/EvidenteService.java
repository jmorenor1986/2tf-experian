package com.dostf.services.evidente.imp;


import co.com.datacredito.services.servicioidentificacion.v1.Idws2Exception;
import com.dostf.clients.IEvidenteClient;
import com.dostf.dtos.evidente.ParametrizacionDto;
import com.dostf.dtos.evidente.ValidarDto;
import com.dostf.services.evidente.IEvidenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EvidenteService implements IEvidenteService {
	
    private final IEvidenteClient evidenteClient;

    @Autowired
    public EvidenteService(IEvidenteClient evidenteClient) {
        this.evidenteClient = evidenteClient;
    }

    @Override
    public String validarIdentidad(ValidarDto validarDto) throws Idws2Exception {
        validarDto.validateMandatoryField();
        return evidenteClient.validarIdentidad(validarDto);
    }

	@Override
	public String consultarParametrizacion(ParametrizacionDto parametrizacionDto) throws Idws2Exception {
		parametrizacionDto.validateMandatoryField();
		return evidenteClient.consultarParametrizacion(parametrizacionDto);
	}
}
