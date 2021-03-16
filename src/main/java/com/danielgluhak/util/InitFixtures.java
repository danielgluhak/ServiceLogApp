/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danielgluhak.util;


import com.danielgluhak.controller.ControllerCustomer;
import com.danielgluhak.model.Customer;
import com.danielgluhak.model.Vehicle;
import org.hibernate.Session;


/**
 *
 * @author Daniel
 */
public class InitFixtures {
    
    public static void start() {
        Session sess = HibernateUtil.getSession();
        sess.beginTransaction();
        
      
        Customer c5 = new Customer();
        
        c5.setName("Customer1");
        c5.setLastName("CustomerLastName");
        c5.setContact("09988995965");
        sess.save(c5);
        
        Vehicle v1 = new Vehicle();
        v1.setCustomer(c5);
        v1.setManufacturer("Audi");
        v1.setModel("");
        v1.setProductionYear(1950);
        sess.save(v1);
        
        
       
       
        
        sess.getTransaction().commit();
         sess.close();
        
        
    }
    
}
