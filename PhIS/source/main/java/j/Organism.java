//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.11 at 03:15:43 PM BST 
//


package j;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Organism complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organism">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="age" type="{http://www.example.org/phisSchema}Age"/>
 *         &lt;element name="taxon" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sex" type="{http://www.example.org/phisSchema}Sex"/>
 *         &lt;element name="ncbi_taxon_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stage_ontology_term" type="{http://www.example.org/phisSchema}OntologyTerm" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organism", propOrder = {

})
public class Organism {

    @XmlElement(required = true)
    protected Age age;
    @XmlElement(required = true)
    protected String taxon;
    @XmlElement(required = true)
    protected Sex sex;
    @XmlElement(name = "ncbi_taxon_id")
    protected String ncbiTaxonId;
    protected String stage;
    @XmlElement(name = "stage_ontology_term")
    protected OntologyTerm stageOntologyTerm;

    /**
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link Age }
     *     
     */
    public Age getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link Age }
     *     
     */
    public void setAge(Age value) {
        this.age = value;
    }

    /**
     * Gets the value of the taxon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxon() {
        return taxon;
    }

    /**
     * Sets the value of the taxon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxon(String value) {
        this.taxon = value;
    }

    /**
     * Gets the value of the sex property.
     * 
     * @return
     *     possible object is
     *     {@link Sex }
     *     
     */
    public Sex getSex() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sex }
     *     
     */
    public void setSex(Sex value) {
        this.sex = value;
    }

    /**
     * Gets the value of the ncbiTaxonId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNcbiTaxonId() {
        return ncbiTaxonId;
    }

    /**
     * Sets the value of the ncbiTaxonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNcbiTaxonId(String value) {
        this.ncbiTaxonId = value;
    }

    /**
     * Gets the value of the stage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStage() {
        return stage;
    }

    /**
     * Sets the value of the stage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStage(String value) {
        this.stage = value;
    }

    /**
     * Gets the value of the stageOntologyTerm property.
     * 
     * @return
     *     possible object is
     *     {@link OntologyTerm }
     *     
     */
    public OntologyTerm getStageOntologyTerm() {
        return stageOntologyTerm;
    }

    /**
     * Sets the value of the stageOntologyTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link OntologyTerm }
     *     
     */
    public void setStageOntologyTerm(OntologyTerm value) {
        this.stageOntologyTerm = value;
    }

}
