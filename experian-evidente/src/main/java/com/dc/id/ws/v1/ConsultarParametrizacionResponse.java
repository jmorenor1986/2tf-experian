
package com.dc.id.ws.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultarParametrizacionResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultarParametrizacionResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="consultarParametrizacionReturn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarParametrizacionResponse", propOrder = {
    "consultarParametrizacionReturn"
})
public class ConsultarParametrizacionResponse {

    @XmlElement(required = true)
    protected String consultarParametrizacionReturn;

    /**
     * Obtiene el valor de la propiedad consultarParametrizacionReturn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsultarParametrizacionReturn() {
        return consultarParametrizacionReturn;
    }

    /**
     * Define el valor de la propiedad consultarParametrizacionReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsultarParametrizacionReturn(String value) {
        this.consultarParametrizacionReturn = value;
    }

}
