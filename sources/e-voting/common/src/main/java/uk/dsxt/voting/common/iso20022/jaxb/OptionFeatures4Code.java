//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.25 at 03:58:45 PM GMT+03:00 
//


package uk.dsxt.voting.common.iso20022.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OptionFeatures4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OptionFeatures4Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CAOS"/>
 *     &lt;enumeration value="COND"/>
 *     &lt;enumeration value="MAXC"/>
 *     &lt;enumeration value="MAXS"/>
 *     &lt;enumeration value="OPLF"/>
 *     &lt;enumeration value="PROR"/>
 *     &lt;enumeration value="QOVE"/>
 *     &lt;enumeration value="QREC"/>
 *     &lt;enumeration value="VVPR"/>
 *     &lt;enumeration value="NOSE"/>
 *     &lt;enumeration value="PINS"/>
 *     &lt;enumeration value="ASVO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OptionFeatures4Code")
@XmlEnum
public enum OptionFeatures4Code {

    CAOS,
    COND,
    MAXC,
    MAXS,
    OPLF,
    PROR,
    QOVE,
    QREC,
    VVPR,
    NOSE,
    PINS,
    ASVO;

    public String value() {
        return name();
    }

    public static OptionFeatures4Code fromValue(String v) {
        return valueOf(v);
    }

}