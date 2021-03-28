/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danielgluhak.model;

/**
 *
 * @author Daniel
 */
public class Operator {
 
    private String userName;
    private String firstName;
    private String lastName;
    private String password;
    
    
    
    public String getUserName() {
        return firstName.toLowerCase().trim().substring(0, 1) + 
               lastName.toLowerCase().trim();
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
