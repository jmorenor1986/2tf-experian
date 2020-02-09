
package com.dc.hc2.ws.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="faultcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="faultstring" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="detail" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="HC2PNJException" type="{http://ws.hc2.dc.com/v1}HC2PNJException" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "faultcode",
    "faultstring",
    "detail"
})
@XmlRootElement(name = "Fault")
public class Fault {

    protected String faultcode;
    protected String faultstring;
    protected Fault.Detail detail;

    /**
     * Gets the value of the faultcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaultcode() {
        return faultcode;
    }

    /**
     * Sets the value of the faultcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultcode(String value) {
        this.faultcode = value;
    }

    /**
     * Gets the value of the faultstring property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaultstring() {
        return faultstring;
    }

    /**
     * Sets the value of the faultstring property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultstring(String value) {
        this.faultstring = value;
    }

    /**
     * Gets the value of the detail property.
     * 
     * @return
     *     possible object is
     *     {@link Fault.Detail }
     *     
     */
    public Fault.Detail getDetail() {
        return detail;
    }

    /**
     * Sets the value of the detail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fault.Detail }
     *     
     */
    public void setDetail(Fault.Detail value) {
        this.detail = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="HC2PNJException" type="{http://ws.hc2.dc.com/v1}HC2PNJException" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "hc2PNJException"
    })
    public static class Detail {

        @XmlElement(name = "HC2PNJException")
        protected HC2PNJException hc2PNJException;

        /**
         * Gets the value of the hc2PNJException property.
         * 
         * @return
         *     possible object is
         *     {@link HC2PNJException }
         *     
         */
        public HC2PNJException getHC2PNJException() {
            return hc2PNJException;
        }

        /**
         * Sets the value of the hc2PNJException property.
         * 
         * @param value
         *     allowed object is
         *     {@link HC2PNJException }
         *     
         */
        public void setHC2PNJException(HC2PNJException value) {
            this.hc2PNJException = value;
        }

    }

}
