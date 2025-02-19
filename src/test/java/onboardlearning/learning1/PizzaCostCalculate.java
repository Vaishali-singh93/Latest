package onboardlearning.learning1;


import java.util.List;

public class PizzaCostCalculate {
    public double pizzaToppingsCost(List<Integer> toppingsCost,double baseCost) {

        return baseCost+ toppingsCost.stream().reduce(0,Integer::sum);
    }
}
