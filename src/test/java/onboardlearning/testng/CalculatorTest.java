package onboardlearning.testng;


public class CalculatorTest {

    public static int addNumber(int a, int b) {
        return a+b;
    }

    public static int multiply(int a, int b) {
        return a*b;
    }

    public static int subNumber(int a, int b) {
        return a-b;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a/b;
    }
}
