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
public class Vegetable extends Plant {
    
    private float standard_area_per_leaf;
    private float thickness;

    public float getStandard_area_per_leaf() {
        return standard_area_per_leaf;
    }

    public void setStandard_area_per_leaf(float standard_area_per_leaf) {
        this.standard_area_per_leaf = standard_area_per_leaf;
    }

    public float getThickness() {
        return thickness;
    }

    public void setThickness(float thickness) {
        this.thickness = thickness;
    }

    public Vegetable(String plantName, int growingDuration, int croppingInterval, int lifeTime,float standard_area_per_leaf, float thickness) {
        
        super(plantName,growingDuration,croppingInterval,lifeTime);
        this.standard_area_per_leaf = standard_area_per_leaf;
        this.thickness = thickness;
    }

    @Override
    public String toString() {
        String msg1;
        msg1 = "Plant Name :"+super.getPlantName()+"\nGrowing Duration :"+super.getGrowingDuration()+"\nCropping Interval :"+super.getCroppingInterval()+"\nLife Time :"+super.getLifeTime()+"\nStandard area per Leaf :"+this.getStandard_area_per_leaf()+"mm^2"+"\nStandard thickness :"+this.getThickness()+"(micro meter)";
        return msg1;
    }
    
    
    
    
}
