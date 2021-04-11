/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danielgluhak.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author Daniel
 */
@Entity
public class AddedItems extends EntityDefault {
    
    @ManyToOne
    private ServiceOrder serviceOrder;
    @ManyToOne
    private Articles articles;

    public ServiceOrder getServiceOrder() {
        return serviceOrder;
    }

    public void setServiceOrder(ServiceOrder serviceOrder) {
        this.serviceOrder = serviceOrder;
    }

    public Articles getArticles() {
        return articles;
    }

    public void setArticles(Articles articles) {
        this.articles = articles;
    }
    
    @Override
    public String toString() {
        return String.format(articles.getArticleCode() + " | " + articles.getProductName() + " | " + articles.getPrice());
    }
}
