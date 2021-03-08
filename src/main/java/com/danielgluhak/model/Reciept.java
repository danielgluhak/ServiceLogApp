
package com.danielgluhak.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


/**
 *
 * @author Daniel
 */
@Entity
public class Reciept extends EntityDefault {
    
    private LocalDateTime issueDate;
    @ManyToOne
    private ServiceOrder sOrder;
    @ManyToMany
    private List<Items> items;

    public ServiceOrder getsOrder() {
        return sOrder;
    }

    public void setsOrder(ServiceOrder sOrder) {
        this.sOrder = sOrder;
    }
    

    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }

    
    
//    public ServiceOrder getSo() {
//        return so;
//    }
//
//    public void setSo(ServiceOrder so) {
//        this.so = so;
//    }

    public LocalDateTime getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDateTime issueDate) {
        this.issueDate = issueDate;
    }
    
    
}
