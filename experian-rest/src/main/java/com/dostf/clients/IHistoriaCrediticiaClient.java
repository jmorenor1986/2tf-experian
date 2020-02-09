package com.dostf.clients;

import co.com.datacredito.services.serviciohistoriacreditoplus.v1.HC2PNJException;
import com.dostf.dtos.historiacrediticia.HistoriaCrediticiaDTO;

public interface IHistoriaCrediticiaClient {
    String getHistoriaCrediticiaPJ(HistoriaCrediticiaDTO historiaCrediticiaDTO) throws HC2PNJException;
}
