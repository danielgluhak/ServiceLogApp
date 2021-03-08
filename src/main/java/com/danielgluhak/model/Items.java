
package com.danielgluhak.model;


import javax.persistence.Entity;

/**
 *
 * @author Daniel
 */
@Entity
public class Items extends EntityDefault {
    
    
    private String name;
    private float price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    

    
    
}
