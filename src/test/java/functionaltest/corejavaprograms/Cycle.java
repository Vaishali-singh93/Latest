package functionaltest.corejavaprograms;

public class Cycle extends BikeSpeed{
    float repairCostCycle;
    float speedRatio;
    float driveWheelRadius;
    int crankLength;
    int teethInDrivenGear;
    int teethInDrivingGear;
    public Cycle(int teethInDrivenGear, int teethInDrivingGear,float driveWheelRadius,int crankLength) {
        super(teethInDrivenGear, teethInDrivingGear);
        this.crankLength=crankLength;
        this.driveWheelRadius=driveWheelRadius;
        this.teethInDrivenGear=teethInDrivenGear;
        this.teethInDrivingGear=teethInDrivingGear;
    }

    public void gearRpm() {

            speedRatio = (driveWheelRadius*crankLength)*(teethInDrivingGear/teethInDrivenGear);
            System.out.println("Cycle  speed ratio is "+speedRatio);


    }

    @Override
    public void repairCost(){
        repairCostCycle = (speedRatio*10);
        System.out.println("Cycle repair cost is "+repairCostCycle);

    }
}
