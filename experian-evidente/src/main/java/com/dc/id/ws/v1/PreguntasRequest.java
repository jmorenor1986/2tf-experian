
package com.dc.id.ws.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para preguntasRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="preguntasRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idUsuarioEntidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paramProducto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="producto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="canal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="solicitudCuestionario" type="{http://ws.id.dc.com/v1}solicitudCuestionarioRequest"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "preguntasRequest", propOrder = {
    "idUsuarioEntidad",
    "paramProducto",
    "producto",
    "canal",
    "solicitudCuestionario"
})
public class PreguntasRequest {

    protected String idUsuarioEntidad;
    @XmlElement(required = true)
    protected String paramProducto;
    @XmlElement(required = true)
    protected String producto;
    @XmlElement(required = true)
    protected String canal;
    @XmlElement(required = true)
    protected SolicitudCuestionarioRequest solicitudCuestionario;

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
     * Obtiene el valor de la propiedad canal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanal() {
        return canal;
    }

    /**
     * Define el valor de la propiedad canal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanal(String value) {
        this.canal = value;
    }

    /**
     * Obtiene el valor de la propiedad solicitudCuestionario.
     * 
     * @return
     *     possible object is
     *     {@link SolicitudCuestionarioRequest }
     *     
     */
    public SolicitudCuestionarioRequest getSolicitudCuestionario() {
        return solicitudCuestionario;
    }

    /**
     * Define el valor de la propiedad solicitudCuestionario.
     * 
     * @param value
     *     allowed object is
     *     {@link SolicitudCuestionarioRequest }
     *     
     */
    public void setSolicitudCuestionario(SolicitudCuestionarioRequest value) {
        this.solicitudCuestionario = value;
    }

}
