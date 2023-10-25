/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*--------------------------------------Index Number : AS2019574-----------------------------------------
----------------------------------------Name         : W.A.P.T.Weragoda----------------------------------
*/

package hydroponicfarm;
import java.util.List;

/**
 *
 * @author lenovo
 */
public class Plant {

    private String plantName;
    private int growingDuration;
    private int croppingInterval;
    private int lifeTime;
    private List<Crop> crops;

    
    public String getPlantName() {
        return plantName;
    }

    public void setPlantName(String plantName) {
        this.plantName = plantName;
    }

    public int getGrowingDuration() {
        return growingDuration;
    }

    public void setGrowingDuration(int growingDuration) {
        this.growingDuration = growingDuration;
    }

    public int getCroppingInterval() {
        return croppingInterval;
    }

    public void setCroppingInterval(int croppingInterval) {
        this.croppingInterval = croppingInterval;
    }

    public int getLifeTime() {
        return lifeTime;
    }

    public void setLifeTime(int lifeTime) {
        this.lifeTime = lifeTime;
    }

    public Plant(String plantName, int growingDuration, int croppingInterval, int lifeTime) {
        this.plantName = plantName;
        this.growingDuration = growingDuration;
        this.croppingInterval = croppingInterval;
        this.lifeTime = lifeTime;
    }
    
    @Override
    public String toString(){
        String msg2 = "Plant Name :"+plantName+"Growing Duration :"+growingDuration+"croppingInterval :"+croppingInterval+"Life Time :"+lifeTime;
        return msg2;
    }
    
    public void addCrops(Crop crop){
        this.crops.add(crop);
    }
    
   public List<Crop> getCrops() {
        return crops;
    }

      
    
    }
    

