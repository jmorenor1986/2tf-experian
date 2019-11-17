
package com.dc.id.ws.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultarParametrizacionesCompletasResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultarParametrizacionesCompletasResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="consultarParametrizacionesCompletasReturn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarParametrizacionesCompletasResponse", propOrder = {
    "consultarParametrizacionesCompletasReturn"
})
public class ConsultarParametrizacionesCompletasResponse {

    @XmlElement(required = true)
    protected String consultarParametrizacionesCompletasReturn;

    /**
     * Obtiene el valor de la propiedad consultarParametrizacionesCompletasReturn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsultarParametrizacionesCompletasReturn() {
        return consultarParametrizacionesCompletasReturn;
    }

    /**
     * Define el valor de la propiedad consultarParametrizacionesCompletasReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsultarParametrizacionesCompletasReturn(String value) {
        this.consultarParametrizacionesCompletasReturn = value;
    }

}
