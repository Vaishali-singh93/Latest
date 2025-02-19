package mywork.polymorph;

public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Car engine started");
    }

    public void drive(){
        System.out.println("car started running");
    }

    protected void runEngine() {
        System.out.println("Engine runs");
    }



    public static Car getCarDescription(String description) {
      return   switch (description.toLowerCase()) {
          case "gas" -> new GasPoweredCar(description);
          case "electric" -> new GasPoweredCar(description);
          case "hybrid" -> new GasPoweredCar(description);
          default -> new Car(description);

      };
    }

}

class GasPoweredCar extends Car {


    public GasPoweredCar(String description) {
        super(description);
    }


}
