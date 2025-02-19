package onboardlearning.designpattern.builderpattern;

public class Bicycle {
    public Bicycle(BicycleBuilder obj) {
        this.gears = obj.gears;
        this.doubleStands = obj.doubleStands;
        this.doubleSeats = obj.doubleSeats;
        this.carrier = obj.carrier;
    }



    public boolean getGears() {
        return gears;
    }

    public boolean getDoubleStands() {
        return doubleStands;
    }

    public boolean getDoubleSeats() {
        return doubleSeats;
    }

    public boolean getCarrier() {
        return carrier;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "gears=" + gears +
                ", doubleStands=" + doubleStands +
                ", doubleSeats=" + doubleSeats +
                ", carrier=" + carrier +
                '}';
    }

    private final boolean doubleStands;
    private final boolean doubleSeats;
    private final boolean carrier;
    private final boolean gears;
}
