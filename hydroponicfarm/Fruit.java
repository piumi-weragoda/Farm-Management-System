/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Index :AS2019574
//Name: W.A.P.T. Weragoda
package hydroponicfarm;

/**
 *
 * @author lenovo
 */
public class Fruit extends Plant{
    
    private float standardVolume;
    private int standard_avg_colour;
    private float standard_pH;

    public float getStandardVolume() {
        return standardVolume;
    }

    public void setStandardVolume(float standardVolume) {
        this.standardVolume = standardVolume;
    }

    public int getStandard_avg_colour() {
        return standard_avg_colour;
    }

    public void setStandard_avg_colour(int standard_avg_colour) {
        
        if(standard_avg_colour>=0 && standard_avg_colour<=16777215){
            this.standard_avg_colour = standard_avg_colour;
        }
        else{
            System.out.println("Wrong colour code...");
        }
    }

    public float getStandard_pH() {
        return standard_pH;
    }

    public void setStandard_pH(float standard_pH) {
       // this.standard_pH = standard_pH;
       if(standard_pH>=0 && standard_pH<=14){
           this.standard_pH = standard_pH;
       }
       else{
           System.out.println("Wrong pH value...");
           
       }
    }

    public Fruit(String plantName, int growingDuration, int croppingInterval, int lifeTime,float standardVolume, int standard_avg_colour, float standard_pH) {
        
        super(plantName,growingDuration,croppingInterval,lifeTime);
        this.standardVolume = standardVolume;
        this.setStandard_pH(standard_pH);
        this.setStandard_avg_colour(standard_avg_colour);
        
    }

    @Override
    public String toString() {
        String msg;
        msg = "Plant Name :"+super.getPlantName()+"\nGrowing Duration :"+super.getGrowingDuration()+"\nCropping Interval :"+super.getCroppingInterval()+"\nLife Time :"+super.getLifeTime()+"\nStandard Volume :"+standardVolume+"mm^3"+"\nStandard Average Colour :"+this.getStandard_avg_colour()+"\nStandard pH value :"+this.getStandard_pH();
        return msg;
    }
    
    
    
}
