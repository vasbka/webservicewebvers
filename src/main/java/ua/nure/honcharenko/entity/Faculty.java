//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.31 at 02:14:41 PM EET 
//


package ua.nure.honcharenko.entity;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.Objects;


/**
 * <p>Java class for Faculty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Faculty">
 *   &lt;complexContent>
 *     &lt;extension base="{http://nure.ua/honcharenkoilchishen/faculty}Entity">
 *       &lt;sequence>
 *         &lt;element name="title" type="{http://nure.ua/honcharenkoilchishen/faculty}title"/>
 *         &lt;element name="shortTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="placeCount" type="{http://nure.ua/honcharenkoilchishen/faculty}placeCount"/>
 *         &lt;element name="budgetPlaceCount" type="{http://nure.ua/honcharenkoilchishen/faculty}budgetPlaceCount" minOccurs="0"/>
 *         &lt;element name="facultyBranch" type="{http://nure.ua/honcharenkoilchishen/faculty}facultyBranch"/>
 *         &lt;element name="facultyRoomNumber">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="yes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="no" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="additional" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="bacheloerCount" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="year" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                 &lt;minInclusive value="2010"/>
 *                                 &lt;maxExclusive value="2030"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="employedStudents" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Faculty", propOrder = {
    "title",
    "shortTitle",
    "placeCount",
    "budgetPlaceCount",
    "facultyBranch",
    "facultyRoomNumber",
    "additional"
})
public class Faculty
    extends Entity
{


    @XmlElement(required = true)
    protected String title;
    protected String shortTitle;
    protected int placeCount;
    protected Integer budgetPlaceCount;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected FacultyBranch facultyBranch;
    @XmlElement(required = true)
    protected Faculty.FacultyRoomNumber facultyRoomNumber;
    protected Faculty.Additional additional;

    /**
     * Gets the value of the title property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTitle() {
        return title;
    }

    public static void main(String[] args) {
        Faculty faculty = new Faculty();
        faculty.facultyRoomNumber = new FacultyRoomNumber();
        faculty.facultyRoomNumber.setYes("302");
        System.out.println(faculty.facultyRoomNumber);
        Faculty faculty1 = new Faculty();
        System.out.println(faculty1.getFacultyRoomNumber());
    }

    /**
     * Sets the value of the title property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the shortTitle property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getShortTitle() {
        return shortTitle;
    }

    /**
     * Sets the value of the shortTitle property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setShortTitle(String value) {
        this.shortTitle = value;
    }

    /**
     * Gets the value of the placeCount property.
     *
     */
    public int getPlaceCount() {
        return placeCount;
    }

    /**
     * Sets the value of the placeCount property.
     *
     */
    public void setPlaceCount(int value) {
        this.placeCount = value;
    }

    /**
     * Gets the value of the budgetPlaceCount property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getBudgetPlaceCount() {
        return budgetPlaceCount;
    }

    /**
     * Sets the value of the budgetPlaceCount property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setBudgetPlaceCount(Integer value) {
        this.budgetPlaceCount = value;
    }

    /**
     * Gets the value of the facultyBranch property.
     *
     * @return
     *     possible object is
     *     {@link FacultyBranch }
     *
     */
    public FacultyBranch getFacultyBranch() {
        return facultyBranch;
    }

    /**
     * Sets the value of the facultyBranch property.
     *
     * @param value
     *     allowed object is
     *     {@link FacultyBranch }
     *
     */
    public void setFacultyBranch(FacultyBranch value) {
        this.facultyBranch = value;
    }

    /**
     * Gets the value of the facultyRoomNumber property.
     *
     * @return
     *     possible object is
     *     {@link Faculty.FacultyRoomNumber }
     *
     */
    public Faculty.FacultyRoomNumber getFacultyRoomNumber() {
        return facultyRoomNumber;
    }

    /**
     * Sets the value of the facultyRoomNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link Faculty.FacultyRoomNumber }
     *
     */
    public void setFacultyRoomNumber(Faculty.FacultyRoomNumber value) {
        this.facultyRoomNumber = value;
    }

    /**
     * Gets the value of the additional property.
     *
     * @return
     *     possible object is
     *     {@link Faculty.Additional }
     *
     */
    public Faculty.Additional getAdditional() {
        return additional;
    }

    /**
     * Sets the value of the additional property.
     *
     * @param value
     *     allowed object is
     *     {@link Faculty.Additional }
     *
     */
    public void setAdditional(Faculty.Additional value) {
        this.additional = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;all>
     *         &lt;element name="bacheloerCount" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *                 &lt;attribute name="year" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                       &lt;minInclusive value="2010"/>
     *                       &lt;maxExclusive value="2030"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="employedStudents" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *       &lt;/all>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class Additional {

        protected Faculty.Additional.BacheloerCount bacheloerCount;
        protected BigInteger employedStudents;

        /**
         * Gets the value of the bacheloerCount property.
         *
         * @return
         *     possible object is
         *     {@link Faculty.Additional.BacheloerCount }
         *
         */
        public Faculty.Additional.BacheloerCount getBacheloerCount() {
            return bacheloerCount;
        }

        /**
         * Sets the value of the bacheloerCount property.
         *
         * @param value
         *     allowed object is
         *     {@link Faculty.Additional.BacheloerCount }
         *
         */
        public void setBacheloerCount(Faculty.Additional.BacheloerCount value) {
            this.bacheloerCount = value;
        }

        /**
         * Gets the value of the employedStudents property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getEmployedStudents() {
            return employedStudents;
        }

        /**
         * Sets the value of the employedStudents property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setEmployedStudents(BigInteger value) {
            this.employedStudents = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
         *       &lt;attribute name="year" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *             &lt;minInclusive value="2010"/>
         *             &lt;maxExclusive value="2030"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class BacheloerCount {

            @XmlValue
            protected BigInteger value;
            @XmlAttribute(name = "year", required = true)
            protected int year;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setValue(BigInteger value) {
                this.value = value;
            }

            /**
             * Gets the value of the year property.
             * 
             */
            public int getYear() {
                return year;
            }

            /**
             * Sets the value of the year property.
             * 
             */
            public void setYear(int value) {
                this.year = value;
            }


            @Override
            public String toString() {
                return "BacheloerCount{" +
                        "value=" + value +
                        ", year=" + year +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "Additional{" +
                    "bacheloerCount=" + bacheloerCount +
                    ", employedStudents=" + employedStudents +
                    '}';
        }
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="yes" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="no" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "yes",
        "no"
    })
    public static class FacultyRoomNumber {

        protected String yes;
        protected String no;

        /**
         * Gets the value of the yes property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getYes() {
            return yes;
        }

        /**
         * Sets the value of the yes property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setYes(String value) {
            this.yes = value;
        }

        /**
         * Gets the value of the no property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNo() {
            return no;
        }

        /**
         * Sets the value of the no property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNo(String value) {
            this.no = value;
        }

        @Override
        public String toString() {
            return "FacultyRoomNumber{" +
                    "yes='" + yes + '\'' +
                    ", no='" + no + '\'' +
                    '}';
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Faculty faculty = (Faculty) o;
        return placeCount == faculty.placeCount &&
                Objects.equals(title, faculty.title) &&
                Objects.equals(shortTitle, faculty.shortTitle) &&
                Objects.equals(budgetPlaceCount, faculty.budgetPlaceCount) &&
                facultyBranch == faculty.facultyBranch &&
                Objects.equals(facultyRoomNumber, faculty.facultyRoomNumber) &&
                Objects.equals(additional, faculty.additional);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, shortTitle, placeCount, budgetPlaceCount, facultyBranch, facultyRoomNumber, additional);
    }

    @Override
    public String
    toString() {
        return "Faculty{" +
                "title='" + title + '\'' +
                ", shortTitle='" + shortTitle + '\'' +
                ", placeCount=" + placeCount +
                ", budgetPlaceCount=" + budgetPlaceCount +
                ", facultyBranch=" + facultyBranch +
                ", facultyRoomNumber=" + facultyRoomNumber +
                ", additional=" + additional +
                '}';
    }
}