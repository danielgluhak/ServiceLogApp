/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danielgluhak.controller;

import com.danielgluhak.model.Articles;
import com.danielgluhak.model.ArticlesAndServices;
import com.danielgluhak.util.ExceptionServiceLog;
import java.math.BigDecimal;
import java.util.List;
import org.hibernate.CacheMode;

/**
 *
 * @author Daniel
 */
public class ControllerArticles extends Controller<Articles> {

    public ControllerArticles() {
    }

    public ControllerArticles(Articles art) {
        super(art);
    }

    
    
    @Override
    public List<Articles> getData() {
        List<Articles> artList = session.createQuery("from Articles").list();
        session.setCacheMode(CacheMode.IGNORE);
        return artList;
    }
    public List<Articles> getData(String condition) {
        return session.createQuery("from Articles a "
                + " where concat(a.articleCode, ' ', a.productName, ' ', a.price) "
                + " like :condition order by a.articleCode, a.productName, a.price")
                .setParameter("condition", "%" + condition + "%")
                .list();
    }

    
    
    protected void nameSet()throws ExceptionServiceLog {
        if(EntityDefault.getProductName().isBlank() || 
            EntityDefault.getProductName().isEmpty()){
            throw new ExceptionServiceLog("Please enter product code.");
        }
    }
    protected void length()throws ExceptionServiceLog {
        if(EntityDefault.getProductName().length()<3 ||
                EntityDefault.getArticleCode().length()<3) {
            throw new ExceptionServiceLog("Article name and article code \n must contain 3 characters or more.");
        }
                
    }
    protected void codeSet()throws ExceptionServiceLog {
        if(EntityDefault.getArticleCode().isBlank() || 
            EntityDefault.getArticleCode().isEmpty()) {
            throw new ExceptionServiceLog("Please enter product code.");
        }
    }
    protected void priceSet()throws ExceptionServiceLog {
        if(EntityDefault.getPrice()==null &&
                EntityDefault.getPrice().compareTo(BigDecimal.ZERO)<1) {
            throw new ExceptionServiceLog("Please enter price. \n Price value must be greater than 1€.");
        }
    }
    
    
    @Override
    protected void controlCreate() throws ExceptionServiceLog {
        nameSet();
        codeSet();
        priceSet();
        length();
    }

    @Override
    protected void controlUpdate() throws ExceptionServiceLog {
        controlCreate();
    }

    @Override
    protected void controlDelete() throws ExceptionServiceLog {
        
    }
    
    
}
