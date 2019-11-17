
package com.dc.id.ws.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para respuesta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="respuesta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idPregunta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idRespuesta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respuesta", propOrder = {
    "idPregunta",
    "idRespuesta"
})
public class Respuesta {

    @XmlElement(required = true)
    protected String idPregunta;
    @XmlElement(required = true)
    protected String idRespuesta;

    /**
     * Obtiene el valor de la propiedad idPregunta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPregunta() {
        return idPregunta;
    }

    /**
     * Define el valor de la propiedad idPregunta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPregunta(String value) {
        this.idPregunta = value;
    }

    /**
     * Obtiene el valor de la propiedad idRespuesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdRespuesta() {
        return idRespuesta;
    }

    /**
     * Define el valor de la propiedad idRespuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdRespuesta(String value) {
        this.idRespuesta = value;
    }

}
