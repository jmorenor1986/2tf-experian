
package com.dc.hc2.ws.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for parametros complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="parametros">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parametro" type="{http://ws.hc2.dc.com/v1}parametro" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parametros", propOrder = {
        "parametro"
})
public class Parametros {

    protected List<Parametro> parametro;

    /**
     * Gets the value of the parametro property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parametro property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParametro().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Parametro }
     */
    public List<Parametro> getParametro() {
        if (parametro == null) {
            parametro = new ArrayList<Parametro>();
        }
        return this.parametro;
    }

    public void setParametro(List<Parametro> parametro) {
        this.parametro = parametro;
    }
}
