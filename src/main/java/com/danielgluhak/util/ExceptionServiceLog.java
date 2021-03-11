/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danielgluhak.util;

/**
 *
 * @author Daniel
 */
public class ExceptionServiceLog extends Exception {
    
    private String message;
    
    public ExceptionServiceLog(String message) {
        super();
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
    
}
