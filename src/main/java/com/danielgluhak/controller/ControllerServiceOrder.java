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
