package onboardlearning.testng;

import org.junit.After;
import org.junit.Before;
import org.testng.Assert;
import org.testng.annotations.Test;


import static onboardlearning.testng.CalculatorTest.*;

public class NumberCalculation {


    @Before
    public void start() {
        System.out.println("start execution");
    }

    @Test(dataProvider = "getData",dataProviderClass = onboardlearning.testng.DataProviderNumbers.class)
    public void add(int a, int b) {
       Assert.assertEquals(20,addNumber(a,b));
    }

    @Test(groups = {"smoke"})
    public void subtract() {
        Assert.assertEquals(10,subNumber(20,10));
    }

    @Test
    public void multiplyNumber() {
        Assert.assertEquals(30,multiply(6,5));
    }

    @Test(groups = {"regression"})
    public void divideNumber() {
        Assert.assertEquals(2,divide(8,4));
    }

//    @Test
//    public void divideNumberByZero() {
//        calculate.div(8,0);
//    }
//
//    @Test
//    public void addNumberNotEqual() {
//        Assert.assertEquals(90,calculate.sum(10,10));
//    }
//
//    @Test
//    public void subtractNumbarFailureCase() {
//        Assert.assertEquals(1,calculate.sub(20,10));
//    }
//
//    @Test
//    public void multiplyNumberFailure() {
//        Assert.assertEquals(-30,calculate.mult(6,5));
//    }

    @After
    public void stop() {
        System.out.println("execution ends");
    }
}
