package co.com.datacredito.services.serviciohistoriacreditoplus.v1;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.4.2
 * 2019-12-09T18:06:19.077+01:00
 * Generated source version: 2.4.2
 * 
 */
@WebServiceClient(name = "ServicioHistoriaCreditoPlus", 
                  wsdlLocation = "file:/E:/proyectos/2TF/experian/fuentes/experian/historia-crediticia/src/main/resources/wsdl/DHServicePlus.wsdl",
                  targetNamespace = "http://www.datacredito.com.co/services/serviciohistoriacreditoplus/v1") 
public class ServicioHistoriaCreditoPlus extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.datacredito.com.co/services/serviciohistoriacreditoplus/v1", "ServicioHistoriaCreditoPlus");
    public final static QName ServicioHistoriaCreditoPlusDmzHttps = new QName("http://www.datacredito.com.co/services/serviciohistoriacreditoplus/v1", "ServicioHistoriaCreditoPlus.dmz.https");
    public final static QName ServicioHistoriaCreditoPlusWanHttp = new QName("http://www.datacredito.com.co/services/serviciohistoriacreditoplus/v1", "ServicioHistoriaCreditoPlus.wan.http");
    public final static QName ServicioHistoriaCreditoPlusWanHttps = new QName("http://www.datacredito.com.co/services/serviciohistoriacreditoplus/v1", "ServicioHistoriaCreditoPlus.wan.https");
    static {
        URL url = null;
        try {
            url = new URL("file:/E:/proyectos/2TF/experian/fuentes/experian/historia-crediticia/src/main/resources/wsdl/DHServicePlus.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ServicioHistoriaCreditoPlus.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/E:/proyectos/2TF/experian/fuentes/experian/historia-crediticia/src/main/resources/wsdl/DHServicePlus.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ServicioHistoriaCreditoPlus(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ServicioHistoriaCreditoPlus(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServicioHistoriaCreditoPlus() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ServicioHistoriaCreditoPlus(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ServicioHistoriaCreditoPlus(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ServicioHistoriaCreditoPlus(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns HC2PNJService
     */
    @WebEndpoint(name = "ServicioHistoriaCreditoPlus.dmz.https")
    public HC2PNJService getServicioHistoriaCreditoPlusDmzHttps() {
        return super.getPort(ServicioHistoriaCreditoPlusDmzHttps, HC2PNJService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HC2PNJService
     */
    @WebEndpoint(name = "ServicioHistoriaCreditoPlus.dmz.https")
    public HC2PNJService getServicioHistoriaCreditoPlusDmzHttps(WebServiceFeature... features) {
        return super.getPort(ServicioHistoriaCreditoPlusDmzHttps, HC2PNJService.class, features);
    }
    /**
     *
     * @return
     *     returns HC2PNJService
     */
    @WebEndpoint(name = "ServicioHistoriaCreditoPlus.wan.http")
    public HC2PNJService getServicioHistoriaCreditoPlusWanHttp() {
        return super.getPort(ServicioHistoriaCreditoPlusWanHttp, HC2PNJService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HC2PNJService
     */
    @WebEndpoint(name = "ServicioHistoriaCreditoPlus.wan.http")
    public HC2PNJService getServicioHistoriaCreditoPlusWanHttp(WebServiceFeature... features) {
        return super.getPort(ServicioHistoriaCreditoPlusWanHttp, HC2PNJService.class, features);
    }
    /**
     *
     * @return
     *     returns HC2PNJService
     */
    @WebEndpoint(name = "ServicioHistoriaCreditoPlus.wan.https")
    public HC2PNJService getServicioHistoriaCreditoPlusWanHttps() {
        return super.getPort(ServicioHistoriaCreditoPlusWanHttps, HC2PNJService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HC2PNJService
     */
    @WebEndpoint(name = "ServicioHistoriaCreditoPlus.wan.https")
    public HC2PNJService getServicioHistoriaCreditoPlusWanHttps(WebServiceFeature... features) {
        return super.getPort(ServicioHistoriaCreditoPlusWanHttps, HC2PNJService.class, features);
    }

}
