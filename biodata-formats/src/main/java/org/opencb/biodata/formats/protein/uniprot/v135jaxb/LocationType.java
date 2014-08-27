//
// This path was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this path will be lost upon recompilation of the source schema.
// Generated on: 2010.06.14 at 12:38:27 PM CEST 
//


package org.opencb.biodata.formats.protein.uniprot.v135jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * A location can be either a position or have
 * both a begin and end.
 * <p/>
 * <p/>
 * <p>Java class for locationType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="locationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="begin" type="{http://uniprot.org/uniprot}positionType"/>
 *           &lt;element name="end" type="{http://uniprot.org/uniprot}positionType"/>
 *         &lt;/sequence>
 *         &lt;element name="position" type="{http://uniprot.org/uniprot}positionType"/>
 *       &lt;/choice>
 *       &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "locationType", propOrder = {
        "begin",
        "end",
        "position"
})
public class LocationType {

    protected PositionType begin;
    protected PositionType end;
    protected PositionType position;
    @XmlAttribute
    protected String sequence;

    /**
     * Gets the value of the begin property.
     *
     * @return possible object is
     *         {@link PositionType }
     */
    public PositionType getBegin() {
        return begin;
    }

    /**
     * Sets the value of the begin property.
     *
     * @param value allowed object is
     *              {@link PositionType }
     */
    public void setBegin(PositionType value) {
        this.begin = value;
    }

    /**
     * Gets the value of the end property.
     *
     * @return possible object is
     *         {@link PositionType }
     */
    public PositionType getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     *
     * @param value allowed object is
     *              {@link PositionType }
     */
    public void setEnd(PositionType value) {
        this.end = value;
    }

    /**
     * Gets the value of the position property.
     *
     * @return possible object is
     *         {@link PositionType }
     */
    public PositionType getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     *
     * @param value allowed object is
     *              {@link PositionType }
     */
    public void setPosition(PositionType value) {
        this.position = value;
    }

    /**
     * Gets the value of the sequence property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSequence(String value) {
        this.sequence = value;
    }

}