package com.dostf.services.historiacrediticia;

import co.com.datacredito.services.serviciohistoriacreditoplus.v1.HC2PNJException;
import com.dostf.dtos.historiacrediticia.HistoriaCrediticiaDTO;
import org.json.JSONException;

public interface IHistoriaCrediticiaService {
    String consultarHistoriaCrediticiaPJ(HistoriaCrediticiaDTO historiaCrediticiaDTO) throws HC2PNJException, JSONException;

    String consultarHistoriaCrediticiaPN(HistoriaCrediticiaDTO historiaCrediticiaDTO) throws HC2PNJException, JSONException;
}
