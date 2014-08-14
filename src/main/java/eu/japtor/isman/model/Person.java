/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eu.japtor.isman.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Honza
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@Entity
@NamedQueries({
		@NamedQuery(name = "Person.findAll", query = "SELECT p FROM Person p"),
		@NamedQuery(name = "Person.countAll", query = "SELECT COUNT(p) FROM Book p")
//		@NamedQuery(name = "Book.findAll.toSimpleBook", query = "SELECT NEW com.hascode.tutorial.dto.SimpleBook(b.id, b.title, b.author) FROM Book b")
})
public class Person {
    @XmlAttribute(name="id")
    @Id
    @GeneratedValue    
    private long id;
    
    @XmlAttribute(name="code")
    private String code;
    
    @XmlAttribute(name="name")
    private String name;

    protected Person() {
        // ..for JAXB & JPA
    }

    public Person(String code, String name) {
        this.code = code;
        this.name = name;
        System.out.println("###   Person " + name + " created");
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    
}
