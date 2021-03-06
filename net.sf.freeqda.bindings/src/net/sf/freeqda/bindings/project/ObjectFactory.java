/*******************************************************************************
 * FreeQDA,  a software for professional qualitative research data 
 * analysis, such as interviews, manuscripts, journal articles, memos
 * and field notes.
 *
 * Copyright (C) 2011 Dirk Kitscha, Jörg große Schlarmann
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *******************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.01.20 at 02:15:28 PM MEZ 
//


package net.sf.freeqda.bindings.project;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sf.net.freeqda.bindings.project package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FQDAProject_QNAME = new QName("http://sf.net.freeqda/FQDAProject", "FQDAProject"); //$NON-NLS-1$ //$NON-NLS-2$

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sf.net.freeqda.bindings.project
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TextType }
     * 
     */
    public TextType createTextType() {
        return new TextType();
    }

    /**
     * Create an instance of {@link TextListType }
     * 
     */
    public TextListType createTextListType() {
        return new TextListType();
    }

    /**
     * Create an instance of {@link TextCategoryListType }
     * 
     */
    public TextCategoryListType createTextCategoryListType() {
        return new TextCategoryListType();
    }

    /**
     * Create an instance of {@link TagType }
     * 
     */
    public TagType createTagType() {
        return new TagType();
    }

    /**
     * Create an instance of {@link TagListType }
     * 
     */
    public TagListType createTagListType() {
        return new TagListType();
    }

    /**
     * Create an instance of {@link FQDAProjectType }
     * 
     */
    public FQDAProjectType createFQDAProjectType() {
        return new FQDAProjectType();
    }

    /**
     * Create an instance of {@link TextCategoryType }
     * 
     */
    public TextCategoryType createTextCategoryType() {
        return new TextCategoryType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FQDAProjectType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sf.net.freeqda/FQDAProject", name = "FQDAProject")
    public JAXBElement<FQDAProjectType> createFQDAProject(FQDAProjectType value) {
        return new JAXBElement<FQDAProjectType>(_FQDAProject_QNAME, FQDAProjectType.class, null, value);
    }

}
