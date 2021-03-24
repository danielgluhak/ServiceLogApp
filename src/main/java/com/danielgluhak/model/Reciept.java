
package com.danielgluhak.model;


import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
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
    
    private Calendar issueDate;
    @OneToOne
    private ServiceOrder sOrder;
    @ManyToMany
    private List<Articles> Articles;
    private List<Services> Services;

    public List<Services> getServices() {
        return Services;
    }

    public void setServices(List<Services> Services) {
        this.Services = Services;
    }

    public ServiceOrder getsOrder() {
        return sOrder;
    }

    public void setsOrder(ServiceOrder sOrder) {
        this.sOrder = sOrder;
    }
    

    public List<Articles> getArticles() {
        return Articles;
    }

    public void setArticles(List<Articles> Articles) {
        this.Articles = Articles;
    }

    public Calendar getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Calendar issueDate) {
        this.issueDate = issueDate;
    }
    
    
}
