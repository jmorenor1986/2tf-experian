package co.com.datacredito.services.servicioidentificacion.v1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2019-11-17T16:34:38.790+01:00
 * Generated source version: 3.2.1
 * 
 */
@WebService(targetNamespace = "http://www.datacredito.com.co/services/ServicioIdentificacion/v1", name = "ServicioIdentificacion")
@XmlSeeAlso({com.dc.id.ws.v1.ObjectFactory.class})
public interface ServicioIdentificacion {

    @WebMethod
    @RequestWrapper(localName = "consultarParametrizacion", targetNamespace = "http://ws.id.dc.com/v1", className = "com.dc.id.ws.v1.ConsultarParametrizacionRequest")
    @ResponseWrapper(localName = "consultarParametrizacionResponse", targetNamespace = "http://ws.id.dc.com/v1", className = "com.dc.id.ws.v1.ConsultarParametrizacionResponse")
    @WebResult(name = "consultarParametrizacionReturn", targetNamespace = "http://ws.id.dc.com/v1")
    public java.lang.String consultarParametrizacion(
        @WebParam(name = "idUsuarioEntidad", targetNamespace = "http://ws.id.dc.com/v1")
        java.lang.String idUsuarioEntidad,
        @WebParam(name = "producto", targetNamespace = "http://ws.id.dc.com/v1")
        java.lang.String producto,
        @WebParam(name = "consecutivo", targetNamespace = "http://ws.id.dc.com/v1")
        java.lang.String consecutivo,
        @WebParam(name = "nit", targetNamespace = "http://ws.id.dc.com/v1")
        java.lang.String nit
    ) throws Idws2Exception;

    @WebMethod
    @RequestWrapper(localName = "validar", targetNamespace = "http://ws.id.dc.com/v1", className = "com.dc.id.ws.v1.ValidarRequest")
    @ResponseWrapper(localName = "validarResponse", targetNamespace = "http://ws.id.dc.com/v1", className = "com.dc.id.ws.v1.ValidarResponse")
    @WebResult(name = "validarReturn", targetNamespace = "http://ws.id.dc.com/v1")
    public java.lang.String validar(
        @WebParam(name = "idUsuarioEntidad", targetNamespace = "http://ws.id.dc.com/v1")
        java.lang.String idUsuarioEntidad,
        @WebParam(name = "paramProducto", targetNamespace = "http://ws.id.dc.com/v1")
        java.lang.String paramProducto,
        @WebParam(name = "producto", targetNamespace = "http://ws.id.dc.com/v1")
        java.lang.String producto,
        @WebParam(name = "canal", targetNamespace = "http://ws.id.dc.com/v1")
        java.lang.String canal,
        @WebParam(name = "datosValidacion", targetNamespace = "http://ws.id.dc.com/v1")
        com.dc.id.ws.v1.DatosValidacionRequest datosValidacion
    ) throws Idws2Exception;

    @WebMethod
    @RequestWrapper(localName = "preguntas", targetNamespace = "http://ws.id.dc.com/v1", className = "com.dc.id.ws.v1.PreguntasRequest")
    @ResponseWrapper(localName = "preguntasResponse", targetNamespace = "http://ws.id.dc.com/v1", className = "com.dc.id.ws.v1.PreguntasResponse")
    @WebResult(name = "preguntasReturn", targetNamespace = "http://ws.id.dc.com/v1")
    public java.lang.String preguntas(
        @WebParam(name = "idUsuarioEntidad", targetNamespace = "http://ws.id.dc.com/v1")
        java.lang.String idUsuarioEntidad,
        @WebParam(name = "paramProducto", targetNamespace = "http://ws.id.dc.com/v1")
        java.lang.String paramProducto,
        @WebParam(name = "producto", targetNamespace = "http://ws.id.dc.com/v1")
        java.lang.String producto,
        @WebParam(name = "canal", targetNamespace = "http://ws.id.dc.com/v1")
        java.lang.String canal,
        @WebParam(name = "solicitudCuestionario", targetNamespace = "http://ws.id.dc.com/v1")
        com.dc.id.ws.v1.SolicitudCuestionarioRequest solicitudCuestionario
    ) throws Idws2Exception;

    @WebMethod
    @RequestWrapper(localName = "consultarParametrizacionesCompletas", targetNamespace = "http://ws.id.dc.com/v1", className = "com.dc.id.ws.v1.ConsultarParametrizacionesCompletasRequest")
    @ResponseWrapper(localName = "consultarParametrizacionesCompletasResponse", targetNamespace = "http://ws.id.dc.com/v1", className = "com.dc.id.ws.v1.ConsultarParametrizacionesCompletasResponse")
    @WebResult(name = "consultarParametrizacionesCompletasReturn", targetNamespace = "http://ws.id.dc.com/v1")
    public java.lang.String consultarParametrizacionesCompletas(
        @WebParam(name = "idUsuarioEntidad", targetNamespace = "http://ws.id.dc.com/v1")
        java.lang.String idUsuarioEntidad,
        @WebParam(name = "producto", targetNamespace = "http://ws.id.dc.com/v1")
        java.lang.String producto,
        @WebParam(name = "tipoIdentificacion", targetNamespace = "http://ws.id.dc.com/v1")
        java.lang.String tipoIdentificacion,
        @WebParam(name = "entidad", targetNamespace = "http://ws.id.dc.com/v1")
        java.lang.String entidad,
        @WebParam(name = "indParametros", targetNamespace = "http://ws.id.dc.com/v1")
        boolean indParametros
    ) throws Idws2Exception;

    @WebMethod
    @RequestWrapper(localName = "verificar", targetNamespace = "http://ws.id.dc.com/v1", className = "com.dc.id.ws.v1.VerificarRequest")
    @ResponseWrapper(localName = "verificarResponse", targetNamespace = "http://ws.id.dc.com/v1", className = "com.dc.id.ws.v1.VerificarResponse")
    @WebResult(name = "verificarReturn", targetNamespace = "http://ws.id.dc.com/v1")
    public java.lang.String verificar(
        @WebParam(name = "idUsuarioEntidad", targetNamespace = "http://ws.id.dc.com/v1")
        java.lang.String idUsuarioEntidad,
        @WebParam(name = "producto", targetNamespace = "http://ws.id.dc.com/v1")
        java.lang.String producto,
        @WebParam(name = "paramProducto", targetNamespace = "http://ws.id.dc.com/v1")
        java.lang.String paramProducto,
        @WebParam(name = "respuestas", targetNamespace = "http://ws.id.dc.com/v1")
        com.dc.id.ws.v1.RespuestasRequest respuestas
    ) throws Idws2Exception;

    @WebMethod
    @RequestWrapper(localName = "consultarUltimoResultado", targetNamespace = "http://ws.id.dc.com/v1", className = "com.dc.id.ws.v1.ConsultarUltimoResultadoRequest")
    @ResponseWrapper(localName = "consultarUltimoResultadoResponse", targetNamespace = "http://ws.id.dc.com/v1", className = "com.dc.id.ws.v1.ConsultarUltimoResultadoResponse")
    @WebResult(name = "consultarUltimoResultadoReturn", targetNamespace = "http://ws.id.dc.com/v1")
    public java.lang.String consultarUltimoResultado(
        @WebParam(name = "idUsuarioEntidad", targetNamespace = "http://ws.id.dc.com/v1")
        java.lang.String idUsuarioEntidad,
        @WebParam(name = "producto", targetNamespace = "http://ws.id.dc.com/v1")
        java.lang.String producto,
        @WebParam(name = "nit", targetNamespace = "http://ws.id.dc.com/v1")
        java.lang.String nit,
        @WebParam(name = "tipo_identificacion", targetNamespace = "http://ws.id.dc.com/v1")
        java.lang.String tipoIdentificacion,
        @WebParam(name = "identificacion", targetNamespace = "http://ws.id.dc.com/v1")
        java.lang.String identificacion
    ) throws Idws2Exception;
}
