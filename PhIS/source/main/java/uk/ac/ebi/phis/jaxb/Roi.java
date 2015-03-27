//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.26 at 03:17:20 PM GMT 
//


package uk.ac.ebi.phis.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Roi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Roi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="associated_image" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="associated_channel" type="{http://www.example.org/phisSchema}StringArray" minOccurs="0"/>
 *         &lt;element name="coordinates" type="{http://www.example.org/phisSchema}Coordinates"/>
 *         &lt;element name="depicted_anatomical_structure" type="{http://www.example.org/phisSchema}AnnotationArray" minOccurs="0"/>
 *         &lt;element name="is_expression_pattern" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="abnormality_in_anatomical_structure" type="{http://www.example.org/phisSchema}AnnotationArray" minOccurs="0"/>
 *         &lt;element name="phenotype_annotations" type="{http://www.example.org/phisSchema}AnnotationArray" minOccurs="0"/>
 *         &lt;element name="observations" type="{http://www.example.org/phisSchema}StringArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Roi", propOrder = {

})
public class Roi {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(name = "associated_image", required = true)
    protected String associatedImage;
    @XmlElement(name = "associated_channel")
    protected StringArray associatedChannel;
    @XmlElement(required = true)
    protected Coordinates coordinates;
    @XmlElement(name = "depicted_anatomical_structure")
    protected AnnotationArray depictedAnatomicalStructure;
    @XmlElement(name = "is_expression_pattern")
    protected Boolean isExpressionPattern;
    @XmlElement(name = "abnormality_in_anatomical_structure")
    protected AnnotationArray abnormalityInAnatomicalStructure;
    @XmlElement(name = "phenotype_annotations")
    protected AnnotationArray phenotypeAnnotations;
    protected StringArray observations;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the associatedImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociatedImage() {
        return associatedImage;
    }

    /**
     * Sets the value of the associatedImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociatedImage(String value) {
        this.associatedImage = value;
    }

    /**
     * Gets the value of the associatedChannel property.
     * 
     * @return
     *     possible object is
     *     {@link StringArray }
     *     
     */
    public StringArray getAssociatedChannel() {
        return associatedChannel;
    }

    /**
     * Sets the value of the associatedChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringArray }
     *     
     */
    public void setAssociatedChannel(StringArray value) {
        this.associatedChannel = value;
    }

    /**
     * Gets the value of the coordinates property.
     * 
     * @return
     *     possible object is
     *     {@link Coordinates }
     *     
     */
    public Coordinates getCoordinates() {
        return coordinates;
    }

    /**
     * Sets the value of the coordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coordinates }
     *     
     */
    public void setCoordinates(Coordinates value) {
        this.coordinates = value;
    }

    /**
     * Gets the value of the depictedAnatomicalStructure property.
     * 
     * @return
     *     possible object is
     *     {@link AnnotationArray }
     *     
     */
    public AnnotationArray getDepictedAnatomicalStructure() {
        return depictedAnatomicalStructure;
    }

    /**
     * Sets the value of the depictedAnatomicalStructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnotationArray }
     *     
     */
    public void setDepictedAnatomicalStructure(AnnotationArray value) {
        this.depictedAnatomicalStructure = value;
    }

    /**
     * Gets the value of the isExpressionPattern property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsExpressionPattern() {
        return isExpressionPattern;
    }

    /**
     * Sets the value of the isExpressionPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsExpressionPattern(Boolean value) {
        this.isExpressionPattern = value;
    }

    /**
     * Gets the value of the abnormalityInAnatomicalStructure property.
     * 
     * @return
     *     possible object is
     *     {@link AnnotationArray }
     *     
     */
    public AnnotationArray getAbnormalityInAnatomicalStructure() {
        return abnormalityInAnatomicalStructure;
    }

    /**
     * Sets the value of the abnormalityInAnatomicalStructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnotationArray }
     *     
     */
    public void setAbnormalityInAnatomicalStructure(AnnotationArray value) {
        this.abnormalityInAnatomicalStructure = value;
    }

    /**
     * Gets the value of the phenotypeAnnotations property.
     * 
     * @return
     *     possible object is
     *     {@link AnnotationArray }
     *     
     */
    public AnnotationArray getPhenotypeAnnotations() {
        return phenotypeAnnotations;
    }

    /**
     * Sets the value of the phenotypeAnnotations property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnotationArray }
     *     
     */
    public void setPhenotypeAnnotations(AnnotationArray value) {
        this.phenotypeAnnotations = value;
    }

    /**
     * Gets the value of the observations property.
     * 
     * @return
     *     possible object is
     *     {@link StringArray }
     *     
     */
    public StringArray getObservations() {
        return observations;
    }

    /**
     * Sets the value of the observations property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringArray }
     *     
     */
    public void setObservations(StringArray value) {
        this.observations = value;
    }

}
