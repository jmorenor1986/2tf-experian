
package com.dc.hc2.ws.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for historiaCreditoPlus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="historiaCreditoPlus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="solicitud" type="{http://ws.hc2.dc.com/v1}solicitudPlus"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "historiaCreditoPlus", propOrder = {
    "solicitud"
})
public class HistoriaCreditoPlus {

    @XmlElement(required = true)
    protected SolicitudPlus solicitud;

    /**
     * Gets the value of the solicitud property.
     * 
     * @return
     *     possible object is
     *     {@link SolicitudPlus }
     *     
     */
    public SolicitudPlus getSolicitud() {
        return solicitud;
    }

    /**
     * Sets the value of the solicitud property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolicitudPlus }
     *     
     */
    public void setSolicitud(SolicitudPlus value) {
        this.solicitud = value;
    }

}
