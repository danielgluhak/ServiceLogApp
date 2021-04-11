/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danielgluhak.controller;

import com.danielgluhak.model.AddedItems;
import com.danielgluhak.util.ExceptionServiceLog;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class ControllerAddedItems extends Controller<AddedItems> {

    @Override
    public List<AddedItems> getData() {
        List<AddedItems> itemList = session.createQuery("from AddedItems").list();
        return itemList;
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
