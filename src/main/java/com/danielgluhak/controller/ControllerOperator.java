/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danielgluhak.controller;

import com.danielgluhak.model.Operator;
import com.danielgluhak.util.ExceptionServiceLog;
import java.awt.Frame;
import java.util.List;
import javax.swing.JOptionPane;
import org.mindrot.jbcrypt.BCrypt;

/**
 * Authorize new operator on database
 * @param firstName as 1st parameter to authorize
 * @param lastName as 2nd parameter to authorize
 * @param password 
 * @return 
 * Returns the instance of the class Operator if all conditions are met.
 * Returns null if instance of the class does not exists or password is not valid.
 * 
 * @author Daniel
 */
public class ControllerOperator extends Controller<Operator>{
    
    public Operator authorize(String userName, char[] password) {
        
        Operator o = (Operator) session
                .createQuery("from Operator o1 where o1.userName=:userName")
                .setParameter("userName", userName)
                .getSingleResult(); 
        if(o == null) {
            JOptionPane.showMessageDialog(null, "Username does not exist.");
            return null; 
        } else {
            return BCrypt.checkpw(new String(password),o.getPassword()) ? o : null;
        }
    }

    @Override
    public List<Operator> getData() {
        return session.createQuery("from Operator").list();
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
