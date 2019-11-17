
package com.dc.id.ws.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para verificarResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="verificarResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="verificarReturn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verificarResponse", propOrder = {
    "verificarReturn"
})
public class VerificarResponse {

    @XmlElement(required = true)
    protected String verificarReturn;

    /**
     * Obtiene el valor de la propiedad verificarReturn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerificarReturn() {
        return verificarReturn;
    }

    /**
     * Define el valor de la propiedad verificarReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerificarReturn(String value) {
        this.verificarReturn = value;
    }

}
