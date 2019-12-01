
package com.dc.id.ws.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para verificarRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="verificarRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idUsuarioEntidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="producto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="paramProducto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="respuestas" type="{http://ws.id.dc.com/v1}respuestasRequest"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verificarRequest", propOrder = {
    "idUsuarioEntidad",
    "producto",
    "paramProducto",
    "respuestas"
})
public class VerificarRequest {

    protected String idUsuarioEntidad;
    @XmlElement(required = true)
    protected String producto;
    @XmlElement(required = true)
    protected String paramProducto;
    @XmlElement(required = true)
    protected RespuestasRequest respuestas;

    /**
     * Obtiene el valor de la propiedad idUsuarioEntidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdUsuarioEntidad() {
        return idUsuarioEntidad;
    }

    /**
     * Define el valor de la propiedad idUsuarioEntidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdUsuarioEntidad(String value) {
        this.idUsuarioEntidad = value;
    }

    /**
     * Obtiene el valor de la propiedad producto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProducto() {
        return producto;
    }

    /**
     * Define el valor de la propiedad producto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducto(String value) {
        this.producto = value;
    }

    /**
     * Obtiene el valor de la propiedad paramProducto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParamProducto() {
        return paramProducto;
    }

    /**
     * Define el valor de la propiedad paramProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParamProducto(String value) {
        this.paramProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad respuestas.
     * 
     * @return
     *     possible object is
     *     {@link RespuestasRequest }
     *     
     */
    public RespuestasRequest getRespuestas() {
        return respuestas;
    }

    /**
     * Define el valor de la propiedad respuestas.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestasRequest }
     *     
     */
    public void setRespuestas(RespuestasRequest value) {
        this.respuestas = value;
    }

}
