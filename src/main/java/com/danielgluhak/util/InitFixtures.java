/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danielgluhak.util;


import com.danielgluhak.cotroller.ControllerCustomer;
import com.danielgluhak.model.Customer;
import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Session;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

/**
 *
 * @author Daniel
 */
public class InitFixtures {
    
    public static void start() {
        Session sess = HibernateUtil.getSession();
        sess.beginTransaction();
        
        
        Customer c2 = new Customer();
        
        c2.setName("Lalalla");
        c2.setLastName("G");
        c2.setContact("0");
      
        sess.save(c2);
       

        
//       instances
         Faker faker = new Faker();
         List<Item> items = new ArrayList<>();
//          
      
        
        sess.getTransaction().commit();
        
        
        
    }
    
}
