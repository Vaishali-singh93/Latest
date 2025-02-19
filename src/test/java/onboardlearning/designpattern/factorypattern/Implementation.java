package onboardlearning.designpattern.factorypattern;

import java.util.Scanner;

public class Implementation {
    public static void main(String[] args) {
        Factory factory = null;
        String driverType;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter type of driver to initialize like chrome , firefox ,internerexplorer or add capability after browser name");
        driverType = sc.nextLine();
        System.out.println("vale--" +driverType);
        if(driverType.equals("null")) {
            System.out.println("driver cannot be null");
        }
        else if(!driverType.contains("capability")){
           factory  = new DriverFactory();
        } else {
            factory = new CapabilityFactory();
        }
        GetFactory get = new GetFactory(factory);
        get.getBrowser(driverType);
    }
}
