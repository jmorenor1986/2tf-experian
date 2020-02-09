
package com.dc.id.ws.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultarUltimoResultadoResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultarUltimoResultadoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="consultarUltimoResultadoReturn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarUltimoResultadoResponse", propOrder = {
    "consultarUltimoResultadoReturn"
})
public class ConsultarUltimoResultadoResponse {

    @XmlElement(required = true)
    protected String consultarUltimoResultadoReturn;

    /**
     * Obtiene el valor de la propiedad consultarUltimoResultadoReturn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsultarUltimoResultadoReturn() {
        return consultarUltimoResultadoReturn;
    }

    /**
     * Define el valor de la propiedad consultarUltimoResultadoReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsultarUltimoResultadoReturn(String value) {
        this.consultarUltimoResultadoReturn = value;
    }

}
