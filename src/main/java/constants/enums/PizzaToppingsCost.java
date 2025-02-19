package constants.enums;

public enum PizzaToppingsCost {
    TOMATO_COST(35),
    CORN_COST(35),
    MUSHROOM_COST(35),
    ONION_COST(25),
    BLACK_OLIVES_COST(40),
    JALAPENO_COST(50);

    final int toppingsCost;

    PizzaToppingsCost(int toppingsCost) {
        this.toppingsCost = toppingsCost;
    }

    public int getValue() {
        return toppingsCost;
    }
}
