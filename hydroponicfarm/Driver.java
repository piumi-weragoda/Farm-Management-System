/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Index :AS2019574
//Name: W.A.P.T. Weragoda
package hydroponicfarm;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author lenovo
 */
public class Driver {
    private static final Scanner sc = new Scanner(System.in);
    private static List<Plant> plantListofBatch;
    public static void main(String[] args){
        plantListofBatch = getPlantsofBatch();
        Plant selectedPlant = getSelectedPlantByTheUser();
        
        System.out.println("Select the option from below list...");
        System.out.println();
        System.out.println("1. View the plant details");
        System.out.println("2. View the details of all crops");
        System.out.println("3. Add a crop harvest.");
        System.out.println("4. Check the maximum crops are reached or not.");
        

        System.out.print("Enter option: ");
        int option = sc.nextInt();
        //System.out.println("\n-------------------------------");
        
         switch(option){
            case 1:
                getPlantDetails(selectedPlant);
                break;
            case 2:
                getCropDetails(selectedPlant);
                break;
            case 3:
                try{
                    addCropHarvest(selectedPlant);
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
                
                break;
            case 4:
                isMaximumCropsReached(selectedPlant);
                break;
            default:
             
         }
        
        
    }
    
    private static void isMaximumCropsReached(Plant selectedPlant){
        if(selectedPlant.getCroppingInterval() < selectedPlant.getLifeTime()){
            System.out.println("Yay!maximum crops are reached!");
        }
        else{
            System.out.println("Ops!maximum crops are not reached!");
        }
        
    }
    
    
    private static Plant getSelectedPlantByTheUser(){
        boolean isPlantValid = false;
        Plant selectedPlant = null;
        while(!isPlantValid){
            System.out.print("Select plant(Enter plant name): ");
            String plantName = sc.next();
            //System.out.println("\n-------------------------------");
            
            Iterator<Plant> itr = plantListofBatch.iterator();
            while (itr.hasNext()) {
                    selectedPlant = itr.next();
                   if(selectedPlant.getPlantName().equalsIgnoreCase(plantName)) {
                       isPlantValid = true;
                       break;
                   }
                }
        }
        return selectedPlant;
        
    }

    private static void getCropDetails(Plant selectedPlant){
        
        if(selectedPlant.getCrops()!=null){Iterator<Crop> itr = selectedPlant.getCrops().iterator();
        while (itr.hasNext()) {
            Crop c = itr.next();
            System.out.println(c.getDate_of_harvest()+"\t"+c.getTotalWeight());
        }}
        else{
            System.out.println("No crops available, please add crops first");
        }
        
       
        
    }
    
    private static void addCropHarvest(Plant selectedPlant) throws Exception{
        System.out.print("Enter date of harvest(dd-MM-yyyy): ");
        String date_of_harvest = sc.next();
        
        System.out.print("Enter total weight: ");
        float totalWeight = sc.nextFloat();
        Date date=new SimpleDateFormat("dd-MM-yyyy").parse(date_of_harvest); 
        selectedPlant.addCrops(new Crop(date, totalWeight));
        
        
    }
     
    private static void getPlantDetails(Plant plant){
        System.out.print("Plant Details :"+plant.toString());
     }
    
    private static List<Plant> getPlantsofBatch(){
        
        List<Plant> plantList = new ArrayList<>();
        try{
            System.out.println("--------------------------------------\n");
            System.out.println("         Hydroponic Farm              \n");
            System.out.println("--------------------------------------\n");
            System.out.print("Enter no of a plants in the batch: ");
            int noOfPlants = sc.nextInt();
            System.out.println("Enter details of a batch of plants: ");
            for(int i = 0; i<noOfPlants; i++){
                //get user input - plant type - is it a fruit or vege - use switch case
                System.out.print("Enter Plant type(1 - vegetable/ 2 - Fruit): ");
                int plantOption = sc.nextInt();
                System.out.print("Enter Plant Name: ");
                String plantName = sc.next();
                System.out.print("Enter growing duration: ");
                int growingDuration = sc.nextInt();
                System.out.print("Enter cropping interval: ");
                int croppingInterval = sc.nextInt();
                System.out.print("Enter life time: ");
                int lifeTime = sc.nextInt();

                switch(plantOption){
                    case 1:
                        System.out.print("Enter standard area per leaf: ");
                        float standard_area_per_leaf = sc.nextFloat();
                        System.out.print("Enter standard leaf thickness: ");
                        float thickness = sc.nextFloat();

                        Plant vegePlant = new Vegetable(plantName, growingDuration, croppingInterval, lifeTime,
                                 standard_area_per_leaf, thickness);
                        plantList.add(vegePlant);

                        break;
                    case 2:
                        System.out.print("Enter standard volume: ");
                        float standardVolume = sc.nextFloat();
                        System.out.print("Enter standard colour: ");
                        int standard_avg_colour = sc.nextInt();
                        System.out.print("Enter standard pH value: ");
                        float standard_pH = sc.nextFloat();
                        
                        Plant fruitPlant = new Fruit(plantName, growingDuration, croppingInterval, lifeTime,
                                 standardVolume, standard_avg_colour,standard_pH);
                        plantList.add(fruitPlant);
                        break;
                    default:
                        System.out.print("Please enter correct plant type");
                }
        }
        }catch(Exception e){
            System.out.println("Invalid input, Please check your input....");
        }
        
        return plantList;
        
    }
    
    
}
