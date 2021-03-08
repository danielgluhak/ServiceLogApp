/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danielgluhak.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;


/**
 *
 * @author Daniel
 */
@Entity
public class ServiceOrder extends EntityDefault{
    
    @OneToOne
    private Vehicle vehicle;
    private LocalDate recievingDate;
    private String detectedFailures;
    

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public LocalDate getRecievingDate() {
        return recievingDate;
    }

    public void setRecievingDate(LocalDate recievingDate) {
        this.recievingDate = recievingDate;
    }
    public String getDetectedFailures() {
        return detectedFailures;
    }

    public void setDetectedFailures(String detectedFailures) {
        this.detectedFailures = detectedFailures;
    }


   
}
