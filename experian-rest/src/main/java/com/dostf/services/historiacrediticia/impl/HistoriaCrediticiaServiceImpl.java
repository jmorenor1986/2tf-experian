package com.dostf.services.historiacrediticia.impl;

import co.com.datacredito.services.serviciohistoriacreditoplus.v1.HC2PNJException;
import com.dostf.clients.imp.HistoriaCrediticiaClient;
import com.dostf.dtos.historiacrediticia.HistoriaCrediticiaDTO;
import com.dostf.services.historiacrediticia.IHistoriaCrediticiaService;
import org.springframework.beans.factory.annotation.Autowired;

public class HistoriaCrediticiaServiceImpl implements IHistoriaCrediticiaService {

    private final HistoriaCrediticiaClient historiaCrediticiaClient;

    @Autowired
    public HistoriaCrediticiaServiceImpl(HistoriaCrediticiaClient historiaCrediticiaClient) {
        this.historiaCrediticiaClient = historiaCrediticiaClient;
    }

    @Override
    public String consultarHistoriaCrediticiaPJ(HistoriaCrediticiaDTO historiaCrediticiaDTO) throws HC2PNJException {
        return historiaCrediticiaClient.getHistoriaCrediticiaPJ(historiaCrediticiaDTO);
    }
}
