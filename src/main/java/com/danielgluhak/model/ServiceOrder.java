/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danielgluhak.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


/**
 *
 * @author Daniel
 */
@Entity
public class ServiceOrder extends EntityDefault{
    
    @ManyToOne
    private Customer customer;
    @ManyToOne
    private Vehicle vehicle;
//    private List<Vehicle> vehicle = new ArrayList<>();
    @ManyToMany (cascade = CascadeType.ALL)
    private List<AddedItems> item = new ArrayList<>();
    private Date recievingDate;
    private String remarks;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
   
    

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    
    public List<AddedItems> getItem() {
        return item;
    }

    public void setItem(List<AddedItems> item) {
        this.item = item;
    }

    public Date getRecievingDate() {
        return recievingDate;
    }

    public void setRecievingDate(Date recievingDate) {
        this.recievingDate = recievingDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    
   @Override
    public String toString() {
        return getId().toString();
    }
    
    

    
    
}
