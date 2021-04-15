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
    public List<Customer> getData(String condition) {
        return session.createQuery("from Customer c "
                + " where concat(c.firstName, ' ', c.lastName, ' ', c.contact) "
                + " like :condition order by c.firstName, c.lastName, c.contact")
                .setParameter("condition", "%" + condition + "%")
                .list();
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
    
    private void controlVehicleSet() throws ExceptionServiceLog {
        if(EntityDefault.getVehicles()==null) throw new ExceptionServiceLog("Choose a vehicle.");
}
    private void controlNameSet() throws ExceptionServiceLog{
        if(EntityDefault.getFirstName().isBlank()
               || EntityDefault.getFirstName().isEmpty()){
           throw new ExceptionServiceLog("First name must be set");
       }
    }

    private void controlNameLength()throws ExceptionServiceLog {
        if(EntityDefault.getFirstName() == null || EntityDefault.getFirstName().length()>50 || EntityDefault.getFirstName().length()<2){
            throw new ExceptionServiceLog("First name length must be between 2 and 50 letters.");
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
