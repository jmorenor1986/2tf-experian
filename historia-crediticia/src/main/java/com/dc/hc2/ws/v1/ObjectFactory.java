
package com.dc.hc2.ws.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.dc.hc2.ws.v1 package. 
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

    private final static QName _ConsultarHC2PJ_QNAME = new QName("http://ws.hc2.dc.com/v1", "consultarHC2PJ");
    private final static QName _ConsultarHC2_QNAME = new QName("http://ws.hc2.dc.com/v1", "consultarHC2");
    private final static QName _ConsultarHC2PJResponse_QNAME = new QName("http://ws.hc2.dc.com/v1", "consultarHC2PJResponse");
    private final static QName _ConsultarHC2Response_QNAME = new QName("http://ws.hc2.dc.com/v1", "consultarHC2Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.dc.hc2.ws.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarHC2PJResponse }
     * 
     */
    public ConsultarHC2PJResponse createConsultarHC2PJResponse() {
        return new ConsultarHC2PJResponse();
    }

    /**
     * Create an instance of {@link SolicitudPlus }
     * 
     */
    public SolicitudPlus createSolicitudPlus() {
        return new SolicitudPlus();
    }

    /**
     * Create an instance of {@link Parametro }
     * 
     */
    public Parametro createParametro() {
        return new Parametro();
    }

    /**
     * Create an instance of {@link Runtime }
     * 
     */
    public Runtime createRuntime() {
        return new Runtime();
    }

    /**
     * Create an instance of {@link Fault }
     * 
     */
    public Fault createFault() {
        return new Fault();
    }

    /**
     * Create an instance of {@link HistoriaCreditoPlus }
     * 
     */
    public HistoriaCreditoPlus createHistoriaCreditoPlus() {
        return new HistoriaCreditoPlus();
    }

    /**
     * Create an instance of {@link Business }
     * 
     */
    public Business createBusiness() {
        return new Business();
    }

    /**
     * Create an instance of {@link Parametros }
     * 
     */
    public Parametros createParametros() {
        return new Parametros();
    }

    /**
     * Create an instance of {@link ConsultarHC2Response }
     * 
     */
    public ConsultarHC2Response createConsultarHC2Response() {
        return new ConsultarHC2Response();
    }

    /**
     * Create an instance of {@link HistoriaCreditoPlusPJ }
     * 
     */
    public HistoriaCreditoPlusPJ createHistoriaCreditoPlusPJ() {
        return new HistoriaCreditoPlusPJ();
    }

    /**
     * Create an instance of {@link Fault.Detail }
     * 
     */
    public Fault.Detail createFaultDetail() {
        return new Fault.Detail();
    }

    /**
     * Create an instance of {@link HC2PNJException }
     * 
     */
    public HC2PNJException createHC2PNJException() {
        return new HC2PNJException();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HistoriaCreditoPlusPJ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hc2.dc.com/v1", name = "consultarHC2PJ")
    public JAXBElement<HistoriaCreditoPlusPJ> createConsultarHC2PJ(HistoriaCreditoPlusPJ value) {
        return new JAXBElement<HistoriaCreditoPlusPJ>(_ConsultarHC2PJ_QNAME, HistoriaCreditoPlusPJ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HistoriaCreditoPlus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hc2.dc.com/v1", name = "consultarHC2")
    public JAXBElement<HistoriaCreditoPlus> createConsultarHC2(HistoriaCreditoPlus value) {
        return new JAXBElement<HistoriaCreditoPlus>(_ConsultarHC2_QNAME, HistoriaCreditoPlus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarHC2PJResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hc2.dc.com/v1", name = "consultarHC2PJResponse")
    public JAXBElement<ConsultarHC2PJResponse> createConsultarHC2PJResponse(ConsultarHC2PJResponse value) {
        return new JAXBElement<ConsultarHC2PJResponse>(_ConsultarHC2PJResponse_QNAME, ConsultarHC2PJResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarHC2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hc2.dc.com/v1", name = "consultarHC2Response")
    public JAXBElement<ConsultarHC2Response> createConsultarHC2Response(ConsultarHC2Response value) {
        return new JAXBElement<ConsultarHC2Response>(_ConsultarHC2Response_QNAME, ConsultarHC2Response.class, null, value);
    }

}
