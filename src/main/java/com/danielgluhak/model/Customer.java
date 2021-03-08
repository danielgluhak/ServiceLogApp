
package com.danielgluhak.model;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * 
 * @author Daniel
 */
@Entity
public class Customer extends EntityDefault{
    
//    @Column(name = "First name", columnDefinition = "VARCHAR(50) NOT NULL")
    private String name;
//    @Column(name = "Last name", columnDefinition = "VARCHAR(50) NOT NULL")
    private String lastName;
//    @Column(name = "Phone number", columnDefinition = "VARCHAR(100) NOT NULL")
    private String contact;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    
    
}
