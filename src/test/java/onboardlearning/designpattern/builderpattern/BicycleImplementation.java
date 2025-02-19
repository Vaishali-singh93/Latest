package onboardlearning.designpattern.builderpattern;

public class BicycleImplementation {

    public static void main(String[] args) {
        Bicycle newBicycle = new BicycleBuilder().addCarrier().addDoubleStands().build();
        System.out.println(newBicycle);

        Bicycle newBicycle2 = new BicycleBuilder().addGears().addDoubleStands().build();
        System.out.println(newBicycle2.getDoubleStands());
    }
}
