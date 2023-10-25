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
public class Batch {
    
    private int batchNo;
    private Date date_Of_plant;
    private Date end_date_ofBatch;
    private List<Plant> plants;

    public int getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(int batchNo) {
        this.batchNo = batchNo;
        
    }

    public Date getDate_Of_plant() {
        return date_Of_plant;
    }

    public void setDate_Of_plant(Date date_Of_plant) {
        this.date_Of_plant = date_Of_plant;
    }

    public Date getEnd_date_ofBatch() {
        return end_date_ofBatch;
    }

    public void setEnd_date_ofBatch(Date end_date_ofBatch) {
        this.end_date_ofBatch = end_date_ofBatch;
    }

    public List<Plant> getPlants() {
        return plants;
    }

    public void setPlants(List<Plant> plants) {
        this.plants = plants;
    }

    public Batch(int batchNo, Date date_Of_plant, Date end_date_ofBatch, List<Plant> plants) {
        this.batchNo = batchNo;
        this.date_Of_plant = date_Of_plant;
        this.end_date_ofBatch = end_date_ofBatch;
        this.plants = plants;
    }
   
        
   
    
}
