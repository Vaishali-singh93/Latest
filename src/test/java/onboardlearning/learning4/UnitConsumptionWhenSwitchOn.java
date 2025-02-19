package onboardlearning.learning4;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.*;

public class UnitConsumptionWhenSwitchOn {
    int totalUnit;
    TotalAppliances object = new TotalAppliances();

   @BeforeMethod
   @Parameters({"fanUnit","tvUnit","lightUnit","laptopUnit"})
   public void beforeTest(int fanUnit,int tvUnit,int lightUnit,int laptopUnit){
       object.setFan(fanUnit);
       object.setLaptop(laptopUnit);
       object.setTelevision(tvUnit);
       object.setLight(lightUnit);
   }

    @Test
    public void totalUnitConsumption(){
       totalUnit = object.getFan()+object.getLaptop()+ object.getLight()+ object.getTelevision();
       System.out.println("total unit of appliances when switch on is: " +totalUnit);
    }

    @Test
    public void sortDevicesBasedOnConsumption() {
        List<Integer> list = Arrays.asList(object.getFan(), object.getLaptop(),
                object.getTelevision(),object.getLight());
        Collections.sort(list);
        System.out.println("appliances sort based on unit consumption: " +list);
    }
}
