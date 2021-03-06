/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danielgluhak.controller;

import com.danielgluhak.util.ExceptionServiceLog;
import com.danielgluhak.util.HibernateUtil;
import java.util.List;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import org.hibernate.Session;

/**
 *
 * @author Daniel
 */
public abstract class Controller<T> {
    
    
    
    protected Validator validator;
    protected T EntityDefault;
    protected Session session;
    
    public abstract List<T> getData();

    protected abstract void controlCreate() throws ExceptionServiceLog;
    protected abstract void controlUpdate() throws ExceptionServiceLog;
    protected abstract void controlDelete() throws ExceptionServiceLog;

    // Java beans validator implementation 40,50
//    Set<ConstraintViolation<T>> constraintViolations = validator.validate(EntityDefault);
    
    
    
    public Controller() {
        this.session = HibernateUtil.getSession();
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory(); 
        this.validator=factory.getValidator();
    }
    
    public Controller(T entityDefault) {
        this();
        this.EntityDefault=entityDefault;
    }
    
    public T create() throws ExceptionServiceLog {
        control();
        controlCreate();
        save();
        return this.EntityDefault;
    }
    public T update() throws ExceptionServiceLog {
        control();
        controlUpdate();
//        session.beginTransaction();
//        session.update(this.EntityDefault);
//        session.getTransaction().commit();
        save();
        return this.EntityDefault;
    }
    public boolean delete() throws ExceptionServiceLog {
//        control();
        controlDelete();
        session.beginTransaction();
        session.delete(this.EntityDefault);
        session.getTransaction().commit();
        return true;
    }
//    metoda save:
    private void save() throws ExceptionServiceLog{
        session.beginTransaction();
        session.save(this.EntityDefault);
        session.getTransaction().commit();
    }
    
    public void control() throws ExceptionServiceLog {
        StringBuilder sb = new StringBuilder();
        Set<ConstraintViolation<T>> constraintViolations = validator.validate(this.EntityDefault);
        
        if(constraintViolations.size()>0){
             for (ConstraintViolation<T> violation : constraintViolations) {  
             sb.append(violation.getMessage());
             sb.append(", ");
            }
             throw new ExceptionServiceLog(sb.toString());
         }
    }
    
    public T getEntityDefault() {
        return EntityDefault;
    }

    public void setEntityDefault(T EntityDefault) {
        this.EntityDefault = EntityDefault;
    }
    
    
}
