
package com.danielgluhak.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author Daniel
 */
@Entity
public class Vehicle extends EntityDefault {
    
    @ManyToOne
    private Customer customer;
    @Column(columnDefinition = "varchar(30)", name = "Manufacturer")
    private String manufacturer;
    @Column(columnDefinition = "varchar(30)", name = "Model")
    private String model;
    

    

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    
}
