
package com.danielgluhak.model;

import com.sun.xml.bind.v2.runtime.reflect.opt.Const;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author Daniel
 */
@Entity
public class Vehicle extends EntityDefault {
    
    
    @Column(columnDefinition = "varchar(30)", name = "Manufacturer")
    private String manufacturer;
    @Column(columnDefinition = "varchar(30)", name = "Model")
    private String model;
    private String licensePlate;
    @Column(columnDefinition = "smallint(4)", name = "Productionyear")
    private String productionYear;

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(String productionYear) {
        this.productionYear = productionYear;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    @Override
    public String toString() {
        return String.format("%1s %1s %2s %2s %2s", 
                "#"+getId(),
                getManufacturer().substring(0).toUpperCase(), 
                getModel().toUpperCase(), getProductionYear(), 
                getLicensePlate());
    }
}
