/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danielgluhak.model;

import javax.persistence.ManyToOne;

/**
 *
 * @author Daniel
 */
public class AddedItems {
    
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
        return getArticles().toString();
    }
}
