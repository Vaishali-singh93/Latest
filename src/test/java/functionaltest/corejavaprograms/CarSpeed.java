package functionaltest.corejavaprograms;

public class CarSpeed implements Gear{
    int speedOfDrivingGear;
    float drivingGearDia;
    float drivenGearDia;
    float rpm;
    public CarSpeed(float drivingGearDia,float drivenGearDia,int speedOfDrivingGear){
        this.drivenGearDia=drivenGearDia;
        this.drivingGearDia=drivingGearDia;
        this.speedOfDrivingGear=speedOfDrivingGear;
    }

    public void gearRpm() {
        rpm=(speedOfDrivingGear*drivingGearDia)/drivenGearDia;
        System.out.println("speed of car gear rotation is :" +(int)rpm);
    }


}
