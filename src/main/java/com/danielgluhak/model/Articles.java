package com.danielgluhak.model;


import java.math.BigDecimal;
import javax.persistence.Entity;

/**
 *
 * @author Daniel
 */
@Entity
public class Articles extends ArticlesAndServices {

    public Articles() {
    }

    public Articles(String productName, BigDecimal price) {
        super(productName, price);
    }

    
    
    
    
}
