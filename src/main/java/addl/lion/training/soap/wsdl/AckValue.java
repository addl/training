//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.26 at 09:56:50 PM EET 
//


package addl.lion.training.soap.wsdl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AckValue.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AckValue"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Success"/&gt;
 *     &lt;enumeration value="Failure"/&gt;
 *     &lt;enumeration value="Warning"/&gt;
 *     &lt;enumeration value="PartialFailure"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AckValue")
@XmlEnum
public enum AckValue {


    /**
     * 
     * 								eBay successfully processed the request and the business data is returned
     * 								in the response. Note that it is possible for a response to return
     * 								Success, but still not contain the expected data in the result.
     * 							
     * 
     */
    @XmlEnumValue("Success")
    SUCCESS("Success"),

    /**
     * 
     * 								eBay encountered a fatal error during the processing of the request,
     * 								causing the request to fail. When a serious application-level error
     * 								occurs, the error is returned instead of the business data.
     * 							
     * 
     */
    @XmlEnumValue("Failure")
    FAILURE("Failure"),

    /**
     * 
     * 								The request was successfully processed, but eBay encountered a non-fatal
     * 								error during the processing. For best results, requests should return
     * 								without warnings. Inspect the warning details and resolve the problem
     * 								before resubmitting the request.
     * 							
     * 
     */
    @XmlEnumValue("Warning")
    WARNING("Warning"),

    /**
     * 
     * 								eBay successfully processed the request, but one or more non-fatal errors
     * 								occurred during the processing. For best results, requests should return
     * 								without warning messages. Inspect the message details and resolve any
     * 								problems before resubmitting the request.
     * 							
     * 
     */
    @XmlEnumValue("PartialFailure")
    PARTIAL_FAILURE("PartialFailure");
    private final String value;

    AckValue(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AckValue fromValue(String v) {
        for (AckValue c: AckValue.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}