package com.dostf.experian.evidente.clients;

public interface IEvidenteClient {
    String validarIdentidad(com.dc.id.ws.v1.DatosValidacionRequest datosValidacionRequest);
}
