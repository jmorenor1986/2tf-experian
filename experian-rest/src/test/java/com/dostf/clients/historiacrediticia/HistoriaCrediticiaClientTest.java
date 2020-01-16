package com.dostf.clients.historiacrediticia;

import com.dostf.clients.IHistoriaCrediticiaClient;
import org.junit.Test;

public class HistoriaCrediticiaClientTest {

    private IHistoriaCrediticiaClient client;
    @Test
    public void historiaCrediticiaPersonaJuridicaTest() {
        String result = client.getHistoriaCrediticiaPJ();
    }

}
