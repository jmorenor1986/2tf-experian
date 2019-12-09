
package com.dc.hc2.ws.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consultarHC2Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consultarHC2Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="consultarHC2Return" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarHC2Response", propOrder = {
    "consultarHC2Return"
})
public class ConsultarHC2Response {

    @XmlElement(required = true)
    protected String consultarHC2Return;

    /**
     * Gets the value of the consultarHC2Return property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsultarHC2Return() {
        return consultarHC2Return;
    }

    /**
     * Sets the value of the consultarHC2Return property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsultarHC2Return(String value) {
        this.consultarHC2Return = value;
    }

}
