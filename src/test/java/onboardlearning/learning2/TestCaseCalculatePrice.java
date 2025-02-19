
package onboardlearning.learning2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCaseCalculatePrice extends EachFlowersCost {
    int totalCost;

    @Test(description = "Calculate the cost of banquet")
    @Parameters({"roses","lillys","jasmines"})
    public void bouquetCost(int rose,int lilly,int jasmines){
        totalCost = totalJasminesCost(jasmines)+totalLillysCost(lilly)+totalRosesCost(rose);
        System.out.println("Total Bouquet Cost with all flowers is : "+"$"+ totalCost);
    }

}
