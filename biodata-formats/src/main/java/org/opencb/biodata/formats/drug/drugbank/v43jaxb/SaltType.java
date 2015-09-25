//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.25 at 11:40:12 AM BST 
//


package org.opencb.biodata.formats.drug.drugbank.v43jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for salt-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="salt-type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="drugbank-id" type="{http://www.drugbank.ca}drugbank-salt-id-type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cas-number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="inchikey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "salt-type", propOrder = {
    "drugbankId",
    "name",
    "casNumber",
    "inchikey"
})
public class SaltType {

    @XmlElement(name = "drugbank-id")
    protected List<DrugbankSaltIdType> drugbankId;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "cas-number", required = true)
    protected String casNumber;
    @XmlElement(required = true)
    protected String inchikey;

    /**
     * Gets the value of the drugbankId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the drugbankId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDrugbankId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DrugbankSaltIdType }
     * 
     * 
     */
    public List<DrugbankSaltIdType> getDrugbankId() {
        if (drugbankId == null) {
            drugbankId = new ArrayList<DrugbankSaltIdType>();
        }
        return this.drugbankId;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the casNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCasNumber() {
        return casNumber;
    }

    /**
     * Sets the value of the casNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCasNumber(String value) {
        this.casNumber = value;
    }

    /**
     * Gets the value of the inchikey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInchikey() {
        return inchikey;
    }

    /**
     * Sets the value of the inchikey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInchikey(String value) {
        this.inchikey = value;
    }

}
