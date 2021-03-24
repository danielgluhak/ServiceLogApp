/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danielgluhak.controller;

import com.danielgluhak.model.Reciept;
import com.danielgluhak.util.ExceptionServiceLog;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/**
 *
 * @author Daniel
 */
public class ControllerReciept extends Controller<Reciept> {

    @Override
    public List<Reciept> getData() {
        return session.createQuery("from Reciept").list();
    }
    
   private void setIssueDate() {
       EntityDefault.getIssueDate().getInstance(TimeZone.getDefault(), Locale.ITALY);
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
