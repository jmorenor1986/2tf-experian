
package com.dc.id.ws.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para preguntasResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="preguntasResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="preguntasReturn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "preguntasResponse", propOrder = {
    "preguntasReturn"
})
public class PreguntasResponse {

    @XmlElement(required = true)
    protected String preguntasReturn;

    /**
     * Obtiene el valor de la propiedad preguntasReturn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreguntasReturn() {
        return preguntasReturn;
    }

    /**
     * Define el valor de la propiedad preguntasReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreguntasReturn(String value) {
        this.preguntasReturn = value;
    }

}
