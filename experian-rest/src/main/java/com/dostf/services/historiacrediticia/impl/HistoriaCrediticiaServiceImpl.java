package com.dostf.services.historiacrediticia.impl;

import co.com.datacredito.services.serviciohistoriacreditoplus.v1.HC2PNJException;
import com.dostf.clients.imp.HistoriaCrediticiaClient;
import com.dostf.config.StringUtilities;
import com.dostf.dtos.historiacrediticia.HistoriaCrediticiaDTO;
import com.dostf.services.historiacrediticia.IHistoriaCrediticiaService;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HistoriaCrediticiaServiceImpl implements IHistoriaCrediticiaService {

    private final HistoriaCrediticiaClient historiaCrediticiaClient;
    private final StringUtilities stringUtilities;

    @Autowired
    public HistoriaCrediticiaServiceImpl(HistoriaCrediticiaClient historiaCrediticiaClient, StringUtilities stringUtilities) {
        this.historiaCrediticiaClient = historiaCrediticiaClient;
        this.stringUtilities = stringUtilities;
    }

    @Override
    public String consultarHistoriaCrediticiaPJ(HistoriaCrediticiaDTO historiaCrediticiaDTO) throws HC2PNJException, JSONException {
        return stringUtilities.xmlToJson(historiaCrediticiaClient.getHistoriaCrediticiaPJ(historiaCrediticiaDTO));
    }

    @Override
    public String consultarHistoriaCrediticiaPN(HistoriaCrediticiaDTO historiaCrediticiaDTO) throws HC2PNJException, JSONException {
        return stringUtilities.xmlToJson(historiaCrediticiaClient.getHistoriaCrediticiaPN(historiaCrediticiaDTO));
    }
}
