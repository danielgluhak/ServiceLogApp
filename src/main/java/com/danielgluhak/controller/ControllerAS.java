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
            throw new ExceptionServiceLog("No products or services were selected.");
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
