package onboardlearning.learning1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class PizzaOrder extends PizzaCostCalculate {

    PizzaToppings toppings = new PizzaToppings();
    PizzaBase base = new PizzaBase();
    List<Integer> listOfToppings;

    @Test
    @Parameters({"toppingsCost","baseCost"})
    public void totalCostOfPizza(int cost,long baseCost) {
        toppings.setCornToppingsCost(cost);
        toppings.setBlackOlivesToppingsCost(cost);
        toppings.setMushroomToppingsCost(cost);
        toppings.setOnionToppingsCost(cost);
        base.setStandardPizzaBaseCost(baseCost);

        listOfToppings= Arrays.asList(
                toppings.getCornToppingsCost(),toppings.getBlackOlivesToppingsCost(),toppings.getMushroomToppingsCost()
                ,toppings.getOnionToppingsCost());

        System.out.println("cost of pizza: " + pizzaToppingsCost(listOfToppings, base.getStandardPizzaBaseCost()));
    }
}
