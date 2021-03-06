//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.26 at 09:56:50 PM EET 
//


package addl.lion.training.soap.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 						Reserved for future use.
 * 					
 * 
 * <p>Java class for FindItemsForFavoriteSearchRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindItemsForFavoriteSearchRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.ebay.com/marketplace/search/v1/services}BaseServiceRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="searchId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="searchName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startTimeFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="paginationInput" type="{http://www.ebay.com/marketplace/search/v1/services}PaginationInput" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindItemsForFavoriteSearchRequest", propOrder = {
    "searchId",
    "searchName",
    "startTimeFrom",
    "paginationInput"
})
public class FindItemsForFavoriteSearchRequest
    extends BaseServiceRequest
{

    protected Long searchId;
    protected String searchName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTimeFrom;
    protected PaginationInput paginationInput;

    /**
     * Gets the value of the searchId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSearchId() {
        return searchId;
    }

    /**
     * Sets the value of the searchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSearchId(Long value) {
        this.searchId = value;
    }

    /**
     * Gets the value of the searchName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchName() {
        return searchName;
    }

    /**
     * Sets the value of the searchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchName(String value) {
        this.searchName = value;
    }

    /**
     * Gets the value of the startTimeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTimeFrom() {
        return startTimeFrom;
    }

    /**
     * Sets the value of the startTimeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTimeFrom(XMLGregorianCalendar value) {
        this.startTimeFrom = value;
    }

    /**
     * Gets the value of the paginationInput property.
     * 
     * @return
     *     possible object is
     *     {@link PaginationInput }
     *     
     */
    public PaginationInput getPaginationInput() {
        return paginationInput;
    }

    /**
     * Sets the value of the paginationInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginationInput }
     *     
     */
    public void setPaginationInput(PaginationInput value) {
        this.paginationInput = value;
    }

}
