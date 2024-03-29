package co.com.datacredito.services.servicioidentificacion.v1;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2019-11-17T16:34:38.806+01:00
 * Generated source version: 3.2.1
 * 
 */
@WebServiceClient(name = "ServicioIdentificacionPlus", 
                  wsdlLocation = "classpath:wsdl/ServicioIdentificacionPlus.wsdl",
                  targetNamespace = "http://www.datacredito.com.co/services/ServicioIdentificacion/v1") 
public class ServicioIdentificacionPlus extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.datacredito.com.co/services/ServicioIdentificacion/v1", "ServicioIdentificacionPlus");
    public final static QName ServicioIdentificacionPlusDmzHttps = new QName("http://www.datacredito.com.co/services/ServicioIdentificacion/v1", "ServicioIdentificacionPlus.dmz.https");
    public final static QName ServicioIdentificacionPlusWanHttps = new QName("http://www.datacredito.com.co/services/ServicioIdentificacion/v1", "ServicioIdentificacionPlus.wan.https");
    public final static QName ServicioIdentificacionPlus = new QName("http://www.datacredito.com.co/services/ServicioIdentificacion/v1", "ServicioIdentificacionPlus");
    static {
        URL url = ServicioIdentificacionPlus.class.getClassLoader().getResource("wsdl/ServicioIdentificacionPlus.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(ServicioIdentificacionPlus.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "classpath:wsdl/ServicioIdentificacionPlus.wsdl");
        }       
        WSDL_LOCATION = url;   
    }

    public ServicioIdentificacionPlus(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ServicioIdentificacionPlus(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServicioIdentificacionPlus() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public ServicioIdentificacionPlus(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ServicioIdentificacionPlus(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ServicioIdentificacionPlus(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns ServicioIdentificacion
     */
    @WebEndpoint(name = "ServicioIdentificacionPlus.dmz.https")
    public ServicioIdentificacion getServicioIdentificacionPlusDmzHttps() {
        return super.getPort(ServicioIdentificacionPlusDmzHttps, ServicioIdentificacion.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServicioIdentificacion
     */
    @WebEndpoint(name = "ServicioIdentificacionPlus.dmz.https")
    public ServicioIdentificacion getServicioIdentificacionPlusDmzHttps(WebServiceFeature... features) {
        return super.getPort(ServicioIdentificacionPlusDmzHttps, ServicioIdentificacion.class, features);
    }


    /**
     *
     * @return
     *     returns ServicioIdentificacion
     */
    @WebEndpoint(name = "ServicioIdentificacionPlus.wan.https")
    public ServicioIdentificacion getServicioIdentificacionPlusWanHttps() {
        return super.getPort(ServicioIdentificacionPlusWanHttps, ServicioIdentificacion.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServicioIdentificacion
     */
    @WebEndpoint(name = "ServicioIdentificacionPlus.wan.https")
    public ServicioIdentificacion getServicioIdentificacionPlusWanHttps(WebServiceFeature... features) {
        return super.getPort(ServicioIdentificacionPlusWanHttps, ServicioIdentificacion.class, features);
    }


    /**
     *
     * @return
     *     returns ServicioIdentificacion
     */
    @WebEndpoint(name = "ServicioIdentificacionPlus")
    public ServicioIdentificacion getServicioIdentificacionPlus() {
        return super.getPort(ServicioIdentificacionPlus, ServicioIdentificacion.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServicioIdentificacion
     */
    @WebEndpoint(name = "ServicioIdentificacionPlus")
    public ServicioIdentificacion getServicioIdentificacionPlus(WebServiceFeature... features) {
        return super.getPort(ServicioIdentificacionPlus, ServicioIdentificacion.class, features);
    }

}
