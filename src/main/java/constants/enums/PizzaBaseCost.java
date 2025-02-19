package constants.enums;

public enum PizzaBaseCost {

    STANDARD_BASE_COST(130.00),
    SOFT_BASE_COST(140.00);

    final double baseCost;

    PizzaBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public double getValue() {
        return baseCost;
    }
}

