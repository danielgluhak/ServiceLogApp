/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danielgluhak.controller;

import com.danielgluhak.model.Services;
import com.danielgluhak.util.ExceptionServiceLog;
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
