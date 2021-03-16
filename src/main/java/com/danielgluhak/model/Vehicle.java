
package com.danielgluhak.model;

import com.sun.xml.bind.v2.runtime.reflect.opt.Const;
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
    @Column(columnDefinition = "smallint(4)", name = "Productionyear")
    private int productionYear;
    

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }
    

    

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
