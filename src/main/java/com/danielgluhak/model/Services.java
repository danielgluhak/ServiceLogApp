/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danielgluhak.model;

import java.math.BigDecimal;
import javax.persistence.Entity;

/**
 *
 * @author Daniel
 */
@Entity
public class Services extends ArticlesAndServices {

    public Services() {
    }

    public Services(String productName, BigDecimal price) {
        super(productName, price);
    }
    
    
}
