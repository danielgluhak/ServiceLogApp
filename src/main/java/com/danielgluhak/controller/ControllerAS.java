/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danielgluhak.controller;

import com.danielgluhak.model.ArticlesAndServices;
import com.danielgluhak.util.ExceptionServiceLog;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class ControllerAS<T extends ArticlesAndServices> extends Controller<T> {

    @Override
    public List<T> getData() {
        return session.createQuery("from ArticlesAndServices").list();
    }

    private void productNameSet()throws ExceptionServiceLog {
        if(EntityDefault.getProductName().isBlank() || 
            EntityDefault.getProductName().isEmpty() || 
            EntityDefault.getPrice()==null) {
            throw new ExceptionServiceLog("Product/service name and price must be set.");
        }
    }
    
    @Override
    protected void controlCreate() throws ExceptionServiceLog {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void controlUpdate() throws ExceptionServiceLog {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void controlDelete() throws ExceptionServiceLog {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
