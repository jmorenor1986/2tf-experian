
package com.dc.id.ws.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.dc.id.ws.v1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ConsultarParametrizacionResponse_QNAME = new QName("http://ws.id.dc.com/v1", "consultarParametrizacionResponse");
    private final static QName _ConsultarParametrizacion_QNAME = new QName("http://ws.id.dc.com/v1", "consultarParametrizacion");
    private final static QName _ConsultarParametrizacionesCompletasResponse_QNAME = new QName("http://ws.id.dc.com/v1", "consultarParametrizacionesCompletasResponse");
    private final static QName _ConsultarParametrizacionesCompletas_QNAME = new QName("http://ws.id.dc.com/v1", "consultarParametrizacionesCompletas");
    private final static QName _ConsultarUltimoResultadoResponse_QNAME = new QName("http://ws.id.dc.com/v1", "consultarUltimoResultadoResponse");
    private final static QName _ConsultarUltimoResultado_QNAME = new QName("http://ws.id.dc.com/v1", "consultarUltimoResultado");
    private final static QName _PreguntasResponse_QNAME = new QName("http://ws.id.dc.com/v1", "preguntasResponse");
    private final static QName _Preguntas_QNAME = new QName("http://ws.id.dc.com/v1", "preguntas");
    private final static QName _ValidarResponse_QNAME = new QName("http://ws.id.dc.com/v1", "validarResponse");
    private final static QName _Validar_QNAME = new QName("http://ws.id.dc.com/v1", "validar");
    private final static QName _VerificarResponse_QNAME = new QName("http://ws.id.dc.com/v1", "verificarResponse");
    private final static QName _Verificar_QNAME = new QName("http://ws.id.dc.com/v1", "verificar");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.dc.id.ws.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Fault }
     * 
     */
    public Fault createFault() {
        return new Fault();
    }

    /**
     * Create an instance of {@link ConsultarParametrizacionResponse }
     * 
     */
    public ConsultarParametrizacionResponse createConsultarParametrizacionResponse() {
        return new ConsultarParametrizacionResponse();
    }

    /**
     * Create an instance of {@link ConsultarParametrizacionRequest }
     * 
     */
    public ConsultarParametrizacionRequest createConsultarParametrizacionRequest() {
        return new ConsultarParametrizacionRequest();
    }

    /**
     * Create an instance of {@link ConsultarParametrizacionesCompletasResponse }
     * 
     */
    public ConsultarParametrizacionesCompletasResponse createConsultarParametrizacionesCompletasResponse() {
        return new ConsultarParametrizacionesCompletasResponse();
    }

    /**
     * Create an instance of {@link ConsultarParametrizacionesCompletasRequest }
     * 
     */
    public ConsultarParametrizacionesCompletasRequest createConsultarParametrizacionesCompletasRequest() {
        return new ConsultarParametrizacionesCompletasRequest();
    }

    /**
     * Create an instance of {@link ConsultarUltimoResultadoResponse }
     * 
     */
    public ConsultarUltimoResultadoResponse createConsultarUltimoResultadoResponse() {
        return new ConsultarUltimoResultadoResponse();
    }

    /**
     * Create an instance of {@link ConsultarUltimoResultadoRequest }
     * 
     */
    public ConsultarUltimoResultadoRequest createConsultarUltimoResultadoRequest() {
        return new ConsultarUltimoResultadoRequest();
    }

    /**
     * Create an instance of {@link PreguntasResponse }
     * 
     */
    public PreguntasResponse createPreguntasResponse() {
        return new PreguntasResponse();
    }

    /**
     * Create an instance of {@link PreguntasRequest }
     * 
     */
    public PreguntasRequest createPreguntasRequest() {
        return new PreguntasRequest();
    }

    /**
     * Create an instance of {@link ValidarResponse }
     * 
     */
    public ValidarResponse createValidarResponse() {
        return new ValidarResponse();
    }

    /**
     * Create an instance of {@link ValidarRequest }
     * 
     */
    public ValidarRequest createValidarRequest() {
        return new ValidarRequest();
    }

    /**
     * Create an instance of {@link VerificarResponse }
     * 
     */
    public VerificarResponse createVerificarResponse() {
        return new VerificarResponse();
    }

    /**
     * Create an instance of {@link VerificarRequest }
     * 
     */
    public VerificarRequest createVerificarRequest() {
        return new VerificarRequest();
    }

    /**
     * Create an instance of {@link Fault.Detail }
     * 
     */
    public Fault.Detail createFaultDetail() {
        return new Fault.Detail();
    }

    /**
     * Create an instance of {@link SolicitudCuestionarioRequest }
     * 
     */
    public SolicitudCuestionarioRequest createSolicitudCuestionarioRequest() {
        return new SolicitudCuestionarioRequest();
    }

    /**
     * Create an instance of {@link DatosValidacionRequest }
     * 
     */
    public DatosValidacionRequest createDatosValidacionRequest() {
        return new DatosValidacionRequest();
    }

    /**
     * Create an instance of {@link IdentificacionRequest }
     * 
     */
    public IdentificacionRequest createIdentificacionRequest() {
        return new IdentificacionRequest();
    }

    /**
     * Create an instance of {@link FechaExpedicionRequest }
     * 
     */
    public FechaExpedicionRequest createFechaExpedicionRequest() {
        return new FechaExpedicionRequest();
    }

    /**
     * Create an instance of {@link RespuestasRequest }
     * 
     */
    public RespuestasRequest createRespuestasRequest() {
        return new RespuestasRequest();
    }

    /**
     * Create an instance of {@link Respuesta }
     * 
     */
    public Respuesta createRespuesta() {
        return new Respuesta();
    }

    /**
     * Create an instance of {@link Idws2Exception }
     * 
     */
    public Idws2Exception createIdws2Exception() {
        return new Idws2Exception();
    }

    /**
     * Create an instance of {@link Business }
     * 
     */
    public Business createBusiness() {
        return new Business();
    }

    /**
     * Create an instance of {@link Runtime }
     * 
     */
    public Runtime createRuntime() {
        return new Runtime();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarParametrizacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.id.dc.com/v1", name = "consultarParametrizacionResponse")
    public JAXBElement<ConsultarParametrizacionResponse> createConsultarParametrizacionResponse(ConsultarParametrizacionResponse value) {
        return new JAXBElement<ConsultarParametrizacionResponse>(_ConsultarParametrizacionResponse_QNAME, ConsultarParametrizacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarParametrizacionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.id.dc.com/v1", name = "consultarParametrizacion")
    public JAXBElement<ConsultarParametrizacionRequest> createConsultarParametrizacion(ConsultarParametrizacionRequest value) {
        return new JAXBElement<ConsultarParametrizacionRequest>(_ConsultarParametrizacion_QNAME, ConsultarParametrizacionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarParametrizacionesCompletasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.id.dc.com/v1", name = "consultarParametrizacionesCompletasResponse")
    public JAXBElement<ConsultarParametrizacionesCompletasResponse> createConsultarParametrizacionesCompletasResponse(ConsultarParametrizacionesCompletasResponse value) {
        return new JAXBElement<ConsultarParametrizacionesCompletasResponse>(_ConsultarParametrizacionesCompletasResponse_QNAME, ConsultarParametrizacionesCompletasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarParametrizacionesCompletasRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.id.dc.com/v1", name = "consultarParametrizacionesCompletas")
    public JAXBElement<ConsultarParametrizacionesCompletasRequest> createConsultarParametrizacionesCompletas(ConsultarParametrizacionesCompletasRequest value) {
        return new JAXBElement<ConsultarParametrizacionesCompletasRequest>(_ConsultarParametrizacionesCompletas_QNAME, ConsultarParametrizacionesCompletasRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarUltimoResultadoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.id.dc.com/v1", name = "consultarUltimoResultadoResponse")
    public JAXBElement<ConsultarUltimoResultadoResponse> createConsultarUltimoResultadoResponse(ConsultarUltimoResultadoResponse value) {
        return new JAXBElement<ConsultarUltimoResultadoResponse>(_ConsultarUltimoResultadoResponse_QNAME, ConsultarUltimoResultadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarUltimoResultadoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.id.dc.com/v1", name = "consultarUltimoResultado")
    public JAXBElement<ConsultarUltimoResultadoRequest> createConsultarUltimoResultado(ConsultarUltimoResultadoRequest value) {
        return new JAXBElement<ConsultarUltimoResultadoRequest>(_ConsultarUltimoResultado_QNAME, ConsultarUltimoResultadoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PreguntasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.id.dc.com/v1", name = "preguntasResponse")
    public JAXBElement<PreguntasResponse> createPreguntasResponse(PreguntasResponse value) {
        return new JAXBElement<PreguntasResponse>(_PreguntasResponse_QNAME, PreguntasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PreguntasRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.id.dc.com/v1", name = "preguntas")
    public JAXBElement<PreguntasRequest> createPreguntas(PreguntasRequest value) {
        return new JAXBElement<PreguntasRequest>(_Preguntas_QNAME, PreguntasRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.id.dc.com/v1", name = "validarResponse")
    public JAXBElement<ValidarResponse> createValidarResponse(ValidarResponse value) {
        return new JAXBElement<ValidarResponse>(_ValidarResponse_QNAME, ValidarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.id.dc.com/v1", name = "validar")
    public JAXBElement<ValidarRequest> createValidar(ValidarRequest value) {
        return new JAXBElement<ValidarRequest>(_Validar_QNAME, ValidarRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.id.dc.com/v1", name = "verificarResponse")
    public JAXBElement<VerificarResponse> createVerificarResponse(VerificarResponse value) {
        return new JAXBElement<VerificarResponse>(_VerificarResponse_QNAME, VerificarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificarRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.id.dc.com/v1", name = "verificar")
    public JAXBElement<VerificarRequest> createVerificar(VerificarRequest value) {
        return new JAXBElement<VerificarRequest>(_Verificar_QNAME, VerificarRequest.class, null, value);
    }

}
