/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danielgluhak.controller;

import com.danielgluhak.model.ServiceOrder;
import com.danielgluhak.util.ExceptionServiceLog;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class ControllerServiceOrder extends Controller<ServiceOrder> {

    public ControllerServiceOrder() {
    }

    public ControllerServiceOrder(ServiceOrder so) {
        super(so);
    }
    
    @Override
    public List<ServiceOrder> getData() {
        return session.createQuery("from ServiceOrder").list();
    }
    
    private void detectedFailuresSet() throws ExceptionServiceLog {
        if(EntityDefault.getDetectedFailures()== null || 
           EntityDefault.getDetectedFailures().isBlank() || 
           EntityDefault.getDetectedFailures().isEmpty()) {
            throw new ExceptionServiceLog("You must enter all detected vehicle failures.");
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
