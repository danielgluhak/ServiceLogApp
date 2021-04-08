/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danielgluhak.util;

import com.danielgluhak.controller.ControllerOperator;
import com.danielgluhak.model.Operator;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Daniel
 */
public class NewOperator {

    public static void main(String[] args) {
        Operator o1 = new Operator();
        o1.setFirstName("Daniel");
        o1.setLastName("Gluhak");
        o1.setPassword(BCrypt.hashpw("default012", BCrypt.gensalt()));
//        o1.setUserName(o1.getFirstName().substring(0, 1).trim().toLowerCase()
//                        + o1.getLastName().trim().toLowerCase());
        
        
        ControllerOperator co = new ControllerOperator();
        co.setEntityDefault(o1);
       
        
        try {
            co.create();
        } catch (ExceptionServiceLog e) {
            System.out.println(e.getMessage());
        }
        
    }
       
    
    
    
    
    
}
