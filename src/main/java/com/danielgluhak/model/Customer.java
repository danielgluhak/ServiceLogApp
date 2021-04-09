
package com.danielgluhak.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * 
 * @author Daniel
 */
@Entity
public class Customer extends EntityDefault{
    
    
    private String firstName;
    private String lastName;
    private String contact;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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
    @Override
    public String toString() {
//          return String.format("%15f"+getArticleCode()+getProductName()+getPrice());
        return String.format("%5s %5s",getFirstName(), getLastName());
    }
    
}
