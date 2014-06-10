//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.09 at 03:07:12 PM BST 
//


package j;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImageDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImageDescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="image_url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="image_context_url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="image_dimensions" type="{http://www.example.org/phisSchema}Dimensions"/>
 *         &lt;element name="machine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="image_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="original_image_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="image_generated_by" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="organism_generated_by" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="host_url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="host_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="imaging_method" type="{http://www.example.org/phisSchema}OntologyTermArray" minOccurs="0"/>
 *         &lt;element name="sample_preparation" type="{http://www.example.org/phisSchema}OntologyTermArray" minOccurs="0"/>
 *         &lt;element name="visualisation_method" type="{http://www.example.org/phisSchema}OntologyTermArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageDescription", propOrder = {

})
public class ImageDescription {

    @XmlElement(name = "image_url", required = true)
    protected String imageUrl;
    @XmlElement(name = "image_context_url")
    protected String imageContextUrl;
    @XmlElement(name = "image_dimensions", required = true)
    protected Dimensions imageDimensions;
    protected String machine;
    @XmlElement(name = "image_type")
    protected String imageType;
    @XmlElement(name = "original_image_id", required = true)
    protected String originalImageId;
    @XmlElement(name = "image_generated_by", required = true)
    protected String imageGeneratedBy;
    @XmlElement(name = "organism_generated_by", required = true)
    protected String organismGeneratedBy;
    @XmlElement(name = "host_url", required = true)
    protected String hostUrl;
    @XmlElement(name = "host_name", required = true)
    protected String hostName;
    @XmlElement(name = "imaging_method")
    protected OntologyTermArray imagingMethod;
    @XmlElement(name = "sample_preparation")
    protected OntologyTermArray samplePreparation;
    @XmlElement(name = "visualisation_method")
    protected OntologyTermArray visualisationMethod;

    /**
     * Gets the value of the imageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Sets the value of the imageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageUrl(String value) {
        this.imageUrl = value;
    }

    /**
     * Gets the value of the imageContextUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageContextUrl() {
        return imageContextUrl;
    }

    /**
     * Sets the value of the imageContextUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageContextUrl(String value) {
        this.imageContextUrl = value;
    }

    /**
     * Gets the value of the imageDimensions property.
     * 
     * @return
     *     possible object is
     *     {@link Dimensions }
     *     
     */
    public Dimensions getImageDimensions() {
        return imageDimensions;
    }

    /**
     * Sets the value of the imageDimensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dimensions }
     *     
     */
    public void setImageDimensions(Dimensions value) {
        this.imageDimensions = value;
    }

    /**
     * Gets the value of the machine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMachine() {
        return machine;
    }

    /**
     * Sets the value of the machine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMachine(String value) {
        this.machine = value;
    }

    /**
     * Gets the value of the imageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageType() {
        return imageType;
    }

    /**
     * Sets the value of the imageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageType(String value) {
        this.imageType = value;
    }

    /**
     * Gets the value of the originalImageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalImageId() {
        return originalImageId;
    }

    /**
     * Sets the value of the originalImageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalImageId(String value) {
        this.originalImageId = value;
    }

    /**
     * Gets the value of the imageGeneratedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageGeneratedBy() {
        return imageGeneratedBy;
    }

    /**
     * Sets the value of the imageGeneratedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageGeneratedBy(String value) {
        this.imageGeneratedBy = value;
    }

    /**
     * Gets the value of the organismGeneratedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganismGeneratedBy() {
        return organismGeneratedBy;
    }

    /**
     * Sets the value of the organismGeneratedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganismGeneratedBy(String value) {
        this.organismGeneratedBy = value;
    }

    /**
     * Gets the value of the hostUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostUrl() {
        return hostUrl;
    }

    /**
     * Sets the value of the hostUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostUrl(String value) {
        this.hostUrl = value;
    }

    /**
     * Gets the value of the hostName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostName() {
        return hostName;
    }

    /**
     * Sets the value of the hostName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostName(String value) {
        this.hostName = value;
    }

    /**
     * Gets the value of the imagingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link OntologyTermArray }
     *     
     */
    public OntologyTermArray getImagingMethod() {
        return imagingMethod;
    }

    /**
     * Sets the value of the imagingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link OntologyTermArray }
     *     
     */
    public void setImagingMethod(OntologyTermArray value) {
        this.imagingMethod = value;
    }

    /**
     * Gets the value of the samplePreparation property.
     * 
     * @return
     *     possible object is
     *     {@link OntologyTermArray }
     *     
     */
    public OntologyTermArray getSamplePreparation() {
        return samplePreparation;
    }

    /**
     * Sets the value of the samplePreparation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OntologyTermArray }
     *     
     */
    public void setSamplePreparation(OntologyTermArray value) {
        this.samplePreparation = value;
    }

    /**
     * Gets the value of the visualisationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link OntologyTermArray }
     *     
     */
    public OntologyTermArray getVisualisationMethod() {
        return visualisationMethod;
    }

    /**
     * Sets the value of the visualisationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link OntologyTermArray }
     *     
     */
    public void setVisualisationMethod(OntologyTermArray value) {
        this.visualisationMethod = value;
    }

}
