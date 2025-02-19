package functionaltest.corejavaprograms;

import org.testng.annotations.Test;

public class Run {

    @Test
    public void runCase(){
        CarSpeed speed = new CarSpeed(25.0F, 23.9f,25);
        speed.gearRpm();
        BikeSpeed speed1 = new Cycle(20,20, 10,90);
        /*
        method overriding
         */
        speed1.gearRpm();
        speed1.repairCost();
    }

}
