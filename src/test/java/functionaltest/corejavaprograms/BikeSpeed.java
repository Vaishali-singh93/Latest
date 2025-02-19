package functionaltest.corejavaprograms;

public class BikeSpeed implements Gear{
    int teethInDrivenGear;
    int teethInDrivingGear;
    double speedRatio;
    int repairCost;
    public BikeSpeed(int teethInDrivenGear,int teethInDrivingGear){

        this.teethInDrivenGear=  teethInDrivenGear;
      this.teethInDrivingGear=teethInDrivingGear;
    }
    @Override
    public void gearRpm() {
        speedRatio = teethInDrivenGear/teethInDrivingGear;
        System.out.println("Bike gear speed ratio is "+speedRatio);
    }

    public void repairCost(){
        repairCost = (int) (speedRatio*20);
        System.out.println("Bike Repair Coast is " + repairCost);
    }
}
