/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Index :AS2019574
//Name: W.A.P.T. Weragoda
package hydroponicfarm;

import java.util.Date;
import java.util.List;

/**
 *
 * @author lenovo
 */
enum StateType{STANDARD,BELOW_STANDARD,ABOVE_STANDARD}

public class Crop {
   
    private Date date_of_harvest;
    private float totalWeight;

    Crop(String date_of_harvest, float f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public Date getDate_of_harvest() {
        return date_of_harvest;
    }

    public void setDate_of_harvest(Date date_of_harvest) {
        this.date_of_harvest = date_of_harvest;
    }

    public float getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(float totalWeight) {
        this.totalWeight = totalWeight;
        
    }

    public Crop(Date date_of_harvest, float totalWeight) {
        this.date_of_harvest = date_of_harvest;
        this.totalWeight = totalWeight;
    }
    
    
    
    
    
}
