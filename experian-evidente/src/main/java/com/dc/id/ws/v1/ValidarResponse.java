
package com.dc.id.ws.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para validarResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="validarResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="validarReturn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validarResponse", propOrder = {
    "validarReturn"
})
public class ValidarResponse {

    @XmlElement(required = true)
    protected String validarReturn;

    /**
     * Obtiene el valor de la propiedad validarReturn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidarReturn() {
        return validarReturn;
    }

    /**
     * Define el valor de la propiedad validarReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidarReturn(String value) {
        this.validarReturn = value;
    }

}
