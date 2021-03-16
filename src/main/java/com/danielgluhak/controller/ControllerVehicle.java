/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danielgluhak.controller;

import com.danielgluhak.model.Customer;
import com.danielgluhak.model.Vehicle;
import com.danielgluhak.util.ExceptionServiceLog;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Daniel
 */

public class ControllerVehicle extends Controller<Vehicle> {
   
    

    public ControllerVehicle() {
    }

    public ControllerVehicle(Vehicle v) {
        super(v);
    }

    
    
    @Override
    public List<Vehicle> getData() {
        return session.createQuery("from Vehicle").list();
    }

    @Override
    protected void controlCreate() throws ExceptionServiceLog {
        controlCustomerSet();
        controlManufacturerSet();
        controlModelSet();
        controlYearSet();
    }

    @Override
    protected void controlUpdate() throws ExceptionServiceLog {
        controlCreate();
    }

    @Override
    protected void controlDelete() throws ExceptionServiceLog {
        
    }
    
    private void controlCustomerSet() throws ExceptionServiceLog {
        if(EntityDefault.getCustomer()==null) throw new ExceptionServiceLog("Customer must be set.");
}
    private void controlManufacturerSet() throws ExceptionServiceLog {
        if(EntityDefault.getManufacturer().isEmpty() || EntityDefault.getManufacturer()==null) {
            throw new ExceptionServiceLog("Manufacturer name must be set.");
        }
    }
    private void controlModelSet() throws ExceptionServiceLog {
        if(EntityDefault.getModel().isEmpty() || EntityDefault.getModel()==null){
            throw new ExceptionServiceLog("Model must be set.");
        }
    }
    private void controlYearSet() throws ExceptionServiceLog {
        if(EntityDefault.getProductionYear()<1970 || EntityDefault.getProductionYear()>2021) {
            throw new ExceptionServiceLog("Production year between 1970 and 2021 must be set.");
        }
    }
    
}
