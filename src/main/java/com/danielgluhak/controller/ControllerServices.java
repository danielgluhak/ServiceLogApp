/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danielgluhak.controller;

import com.danielgluhak.model.Services;
import com.danielgluhak.util.ExceptionServiceLog;
import java.math.BigDecimal;
import java.util.List;
import org.hibernate.CacheMode;

/**
 *
 * @author Daniel
 */
public class ControllerServices extends Controller<Services> {

    @Override
    public List<Services> getData() {
        List<Services> serList = session.createQuery("from Services").list();
        session.setCacheMode(CacheMode.IGNORE);
        return serList;
    }
    public List<Services> getData(String condition) {
        return session.createQuery("from Services s "
                + " where concat(s.articleCode, ' ', s.productName, ' ', s.price) "
                + " like :condition order by s.articleCode, s.productName, s.price")
                .setParameter("condition", "%" + condition + "%")
                .list();
    }
    
    protected void nameSet()throws ExceptionServiceLog {
        if(EntityDefault.getProductName().isBlank() || 
            EntityDefault.getProductName().isEmpty()){
            throw new ExceptionServiceLog("Please enter service name.");
        }
    }
    protected void length()throws ExceptionServiceLog {
        if(EntityDefault.getProductName().length()<3 ||
                EntityDefault.getArticleCode().length()<3) {
            throw new ExceptionServiceLog("Service name and service code \n must contain 3 characters or more.");
        }
                
    }
    protected void codeSet()throws ExceptionServiceLog {
        if(EntityDefault.getArticleCode().isBlank() || 
            EntityDefault.getArticleCode().isEmpty()) {
            throw new ExceptionServiceLog("Please enter service code.");
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
