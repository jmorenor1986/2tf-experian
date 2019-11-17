
package com.dc.id.ws.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Idws2Exception complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Idws2Exception"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Business" type="{http://ws.id.dc.com/v1}Business" minOccurs="0"/&gt;
 *         &lt;element name="Runtime" type="{http://ws.id.dc.com/v1}Runtime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Idws2Exception", propOrder = {
    "business",
    "runtime"
})
public class Idws2Exception {

    @XmlElement(name = "Business")
    protected Business business;
    @XmlElement(name = "Runtime")
    protected Runtime runtime;

    /**
     * Obtiene el valor de la propiedad business.
     * 
     * @return
     *     possible object is
     *     {@link Business }
     *     
     */
    public Business getBusiness() {
        return business;
    }

    /**
     * Define el valor de la propiedad business.
     * 
     * @param value
     *     allowed object is
     *     {@link Business }
     *     
     */
    public void setBusiness(Business value) {
        this.business = value;
    }

    /**
     * Obtiene el valor de la propiedad runtime.
     * 
     * @return
     *     possible object is
     *     {@link Runtime }
     *     
     */
    public Runtime getRuntime() {
        return runtime;
    }

    /**
     * Define el valor de la propiedad runtime.
     * 
     * @param value
     *     allowed object is
     *     {@link Runtime }
     *     
     */
    public void setRuntime(Runtime value) {
        this.runtime = value;
    }

}
