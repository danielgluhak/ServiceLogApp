/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danielgluhak.controller;

import com.danielgluhak.model.Customer;
import com.danielgluhak.util.ExceptionServiceLog;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class ControllerCustomer extends Controller<Customer> {

    public ControllerCustomer(){
        super();
    }
    public ControllerCustomer(Customer c){
        super(c);
    }
    
    @Override
    public List<Customer> getData() {
        //https://docs.jboss.org/hibernate/orm/3.3/reference/en/html/queryhql.html
       return session.createQuery("from Customer").list();
    }

    @Override
    protected void controlCreate() throws ExceptionServiceLog {
       controlName();
       controlContactSet();
    }

    @Override
    protected void controlUpdate()throws ExceptionServiceLog {
       controlCreate();
    }
    @Override
    protected void controlDelete()throws ExceptionServiceLog {
       
    }
    
    private void controlName() throws ExceptionServiceLog{
       controlNameSet();
       controlLastNameSet();
       controlNameLength();
       controlLastNameLength();
    }
    
    private void controlNameSet() throws ExceptionServiceLog{
        if(EntityDefault.getName()==null 
               || EntityDefault.getName().isEmpty()){
           throw new ExceptionServiceLog("Name must be set");
       }
    }

    private void controlNameLength()throws ExceptionServiceLog {
        if(EntityDefault.getName() == null || EntityDefault.getName().length()>50 || EntityDefault.getName().length()<2){
            throw new ExceptionServiceLog("Name length must be between 2 and 50 letters.");
        }
    }
     private void controlLastNameSet() throws ExceptionServiceLog{
        if(EntityDefault.getLastName() == null || EntityDefault.getLastName()==null 
               || EntityDefault.getLastName().isEmpty()){
           throw new ExceptionServiceLog("Last name must be set");
       }
    }

    private void controlLastNameLength()throws ExceptionServiceLog {
        if(EntityDefault.getLastName() == null || EntityDefault.getLastName().length()>50){
            throw new ExceptionServiceLog("Last name too long.");
        }
    }
    private void controlContactSet() throws ExceptionServiceLog{
        if(EntityDefault.getContact()==null || EntityDefault.getContact().isEmpty()){
           throw new ExceptionServiceLog("Contact number must be set.");
       }
    }

    
    
}
