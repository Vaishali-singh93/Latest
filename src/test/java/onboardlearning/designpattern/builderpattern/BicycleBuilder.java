package onboardlearning.designpattern.builderpattern;

public class BicycleBuilder {
    boolean doubleStands;
    boolean doubleSeats;
    boolean carrier;
    boolean gears;

    public BicycleBuilder addGears() {
        this.gears=true;
        return this;
    }

    public BicycleBuilder addDoubleStands() {
        this.doubleStands=true;
        return this;
    }

    public BicycleBuilder addDoubleSeats() {
        this.doubleSeats=true;
        return this;
    }

    public BicycleBuilder addCarrier() {
        this.carrier=true;
        return this;
    }

    public Bicycle build() {
        return new Bicycle(this);
    }
}
