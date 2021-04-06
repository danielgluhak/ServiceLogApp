/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danielgluhak.controller;

import com.danielgluhak.model.Articles;
import com.danielgluhak.model.ArticlesAndServices;
import com.danielgluhak.util.ExceptionServiceLog;
import java.util.List;
import org.hibernate.CacheMode;

/**
 *
 * @author Daniel
 */
public class ControllerArticles extends Controller<Articles> {

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

    private void productNameSet()throws ExceptionServiceLog {
        if(EntityDefault.getProductName().isBlank() || 
            EntityDefault.getProductName().isEmpty()) {
//            EntityDefault.getProductName().equals(getEntityDefault().getProductName()){
            throw new ExceptionServiceLog("Please enter product name.");
        }
    }
    
    @Override
    protected void controlCreate() throws ExceptionServiceLog {
        
    }

    @Override
    protected void controlUpdate() throws ExceptionServiceLog {
        
    }

    @Override
    protected void controlDelete() throws ExceptionServiceLog {
        
    }
    
    
}
