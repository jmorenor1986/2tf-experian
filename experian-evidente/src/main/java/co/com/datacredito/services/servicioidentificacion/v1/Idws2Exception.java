
package co.com.datacredito.services.servicioidentificacion.v1;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.1
 * 2019-11-17T16:34:38.759+01:00
 * Generated source version: 3.2.1
 */

@WebFault(name = "Fault", targetNamespace = "http://ws.id.dc.com/v1")
public class Idws2Exception extends Exception {
    
    private com.dc.id.ws.v1.Fault fault;

    public Idws2Exception() {
        super();
    }
    
    public Idws2Exception(String message) {
        super(message);
    }
    
    public Idws2Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public Idws2Exception(String message, com.dc.id.ws.v1.Fault fault) {
        super(message);
        this.fault = fault;
    }

    public Idws2Exception(String message, com.dc.id.ws.v1.Fault fault, Throwable cause) {
        super(message, cause);
        this.fault = fault;
    }

    public com.dc.id.ws.v1.Fault getFaultInfo() {
        return this.fault;
    }
}
