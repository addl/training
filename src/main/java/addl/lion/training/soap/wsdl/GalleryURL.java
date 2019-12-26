//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.26 at 09:56:50 PM EET 
//


package addl.lion.training.soap.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 * 				Defines the image URL returned in galleryInfoContainer.
 * 			
 * 
 * <p>Java class for GalleryURL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GalleryURL"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;anyURI"&gt;
 *       &lt;attribute name="gallerySize" use="required" type="{http://www.ebay.com/marketplace/search/v1/services}GallerySizeEnum" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GalleryURL", propOrder = {
    "value"
})
public class GalleryURL {

    @XmlValue
    @XmlSchemaType(name = "anyURI")
    protected String value;
    @XmlAttribute(name = "gallerySize", required = true)
    protected GallerySizeEnum gallerySize;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the gallerySize property.
     * 
     * @return
     *     possible object is
     *     {@link GallerySizeEnum }
     *     
     */
    public GallerySizeEnum getGallerySize() {
        return gallerySize;
    }

    /**
     * Sets the value of the gallerySize property.
     * 
     * @param value
     *     allowed object is
     *     {@link GallerySizeEnum }
     *     
     */
    public void setGallerySize(GallerySizeEnum value) {
        this.gallerySize = value;
    }

}
