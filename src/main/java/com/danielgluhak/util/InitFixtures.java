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
        sess.getTransaction().commit();
        sess.close();
        
        
    }
    
}
