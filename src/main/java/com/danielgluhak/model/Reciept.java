
package com.danielgluhak.model;


import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


/**
 *
 * @author Daniel
 */
@Entity
public class Reciept extends EntityDefault {
    
    private LocalDateTime issueDate;
    @OneToOne
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

    public LocalDateTime getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDateTime issueDate) {
        this.issueDate = issueDate;
    }
    
    
}
