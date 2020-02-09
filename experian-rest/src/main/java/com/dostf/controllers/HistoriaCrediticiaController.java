package com.dostf.controllers;

import co.com.datacredito.services.serviciohistoriacreditoplus.v1.HC2PNJException;
import com.dostf.dtos.historiacrediticia.HistoriaCrediticiaDTO;
import com.dostf.services.historiacrediticia.IHistoriaCrediticiaService;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/experian/historia-crediticia")
public class HistoriaCrediticiaController {

    private IHistoriaCrediticiaService historiaCrediticiaService;

    @Autowired
    public HistoriaCrediticiaController(IHistoriaCrediticiaService historiaCrediticiaService) {
        this.historiaCrediticiaService = historiaCrediticiaService;
    }

    @PostMapping(value = "/persona-juridica", produces = MediaType.APPLICATION_JSON_VALUE)
    public String consultarHistoriaCrediticiaPJ(@RequestBody HistoriaCrediticiaDTO historiaCrediticiaDTO) throws HC2PNJException, JSONException {
        return historiaCrediticiaService.consultarHistoriaCrediticiaPJ(historiaCrediticiaDTO);
    }
}
