/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danielgluhak.model;

import java.math.BigDecimal;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author Daniel
 */
@MappedSuperclass
public abstract class ArticlesAndServices extends EntityDefault {
    
    private String articleCode;
    private String productName;
    private BigDecimal price;

    public ArticlesAndServices() {
    }

    public ArticlesAndServices(String productName, BigDecimal price) {
        this.articleCode = articleCode;
        this.productName = productName;
        this.price = price;
    }

    public String getArticleCode() {
        return articleCode;
    }

    public void setArticleCode(String articleCode) {
        this.articleCode = articleCode;
    }
    
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    
    
   
    
}
