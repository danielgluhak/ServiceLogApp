
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
    
    @NotNull(message = "Name must be set (null)")
    @NotEmpty(message = "Name cannot be empty")
    @Size(min=2, max=50, message = "Name length must be between 2 and 50 characters long")
    private String name;
    
    @NotNull(message = "Last name must be set (null)")
    @NotEmpty(message = "Last name cannot be empty")
    @Size(min=2, max=50, message = "Last name length must be between 2 and 50 characters long")
    private String lastName;
    
    @NotNull(message = "Contact number must be set (null)")
    @NotEmpty(message = "Please enter contact number")
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
