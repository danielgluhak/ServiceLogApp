/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danielgluhak.util;


import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

/**
 *
 * @author Daniel
 */
public class InitFixtures {
    
    public static void start() {
        Session s = HibernateUtil.getSession();
        s.beginTransaction();
        
//       instances
         Faker faker = new Faker();
         List<Item> items = new ArrayList<>();
//         
  
      
        
        s.getTransaction().commit();
        
    }
    
//    Scanner scan = new Scanner(System.in);
//    public void addCustomer() {
//        System.out.println("First name:");
//        c.setName(scan.next());
//        System.out.println("Last name:");
//        c.setLastName(scan.next());
//        System.out.println("Phone number:");
//        c.setContact(scan.next());
//    }
}
