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
 * <p>Java class for Image complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Image">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="organism" type="{http://www.example.org/phisSchema}Organism"/>
 *         &lt;element name="image_description" type="{http://www.example.org/phisSchema}ImageDescription"/>
 *         &lt;element name="mutant_genotype_traits" type="{http://www.example.org/phisSchema}Genotype" minOccurs="0"/>
 *         &lt;element name="conditions" type="{http://www.example.org/phisSchema}StringArray" minOccurs="0"/>
 *         &lt;element name="observations" type="{http://www.example.org/phisSchema}StringArray" minOccurs="0"/>
 *         &lt;element name="associated_roi" type="{http://www.example.org/phisSchema}StringArray" minOccurs="0"/>
 *         &lt;element name="associated_channel" type="{http://www.example.org/phisSchema}StringArray" minOccurs="0"/>
 *         &lt;element name="depicted_anatomical_structure" type="{http://www.example.org/phisSchema}Annotation" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Image", propOrder = {

})
public class Image {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected Organism organism;
    @XmlElement(name = "image_description", required = true)
    protected ImageDescription imageDescription;
    @XmlElement(name = "mutant_genotype_traits")
    protected Genotype mutantGenotypeTraits;
    protected StringArray conditions;
    protected StringArray observations;
    @XmlElement(name = "associated_roi")
    protected StringArray associatedRoi;
    @XmlElement(name = "associated_channel")
    protected StringArray associatedChannel;
    @XmlElement(name = "depicted_anatomical_structure")
    protected Annotation depictedAnatomicalStructure;

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
     * Gets the value of the organism property.
     * 
     * @return
     *     possible object is
     *     {@link Organism }
     *     
     */
    public Organism getOrganism() {
        return organism;
    }

    /**
     * Sets the value of the organism property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organism }
     *     
     */
    public void setOrganism(Organism value) {
        this.organism = value;
    }

    /**
     * Gets the value of the imageDescription property.
     * 
     * @return
     *     possible object is
     *     {@link ImageDescription }
     *     
     */
    public ImageDescription getImageDescription() {
        return imageDescription;
    }

    /**
     * Sets the value of the imageDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageDescription }
     *     
     */
    public void setImageDescription(ImageDescription value) {
        this.imageDescription = value;
    }

    /**
     * Gets the value of the mutantGenotypeTraits property.
     * 
     * @return
     *     possible object is
     *     {@link Genotype }
     *     
     */
    public Genotype getMutantGenotypeTraits() {
        return mutantGenotypeTraits;
    }

    /**
     * Sets the value of the mutantGenotypeTraits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Genotype }
     *     
     */
    public void setMutantGenotypeTraits(Genotype value) {
        this.mutantGenotypeTraits = value;
    }

    /**
     * Gets the value of the conditions property.
     * 
     * @return
     *     possible object is
     *     {@link StringArray }
     *     
     */
    public StringArray getConditions() {
        return conditions;
    }

    /**
     * Sets the value of the conditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringArray }
     *     
     */
    public void setConditions(StringArray value) {
        this.conditions = value;
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

    /**
     * Gets the value of the associatedRoi property.
     * 
     * @return
     *     possible object is
     *     {@link StringArray }
     *     
     */
    public StringArray getAssociatedRoi() {
        return associatedRoi;
    }

    /**
     * Sets the value of the associatedRoi property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringArray }
     *     
     */
    public void setAssociatedRoi(StringArray value) {
        this.associatedRoi = value;
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
     * Gets the value of the depictedAnatomicalStructure property.
     * 
     * @return
     *     possible object is
     *     {@link Annotation }
     *     
     */
    public Annotation getDepictedAnatomicalStructure() {
        return depictedAnatomicalStructure;
    }

    /**
     * Sets the value of the depictedAnatomicalStructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Annotation }
     *     
     */
    public void setDepictedAnatomicalStructure(Annotation value) {
        this.depictedAnatomicalStructure = value;
    }

}
