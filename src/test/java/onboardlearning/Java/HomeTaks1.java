package onboardlearning.Java;

public class HomeTaks1 {

    public static double printTotalApples(double danielAppleCount, double amberAppleCount) {
        return danielAppleCount+amberAppleCount ;
    }

    public static void main(String[] args) {
        System.out.println("Total Apples:"+(int)(HomeTaks1.printTotalApples(3,2)));
        System.out.println("total apples"+(HomeTaks1.printTotalApples(3.5,2.5)));

    }
}
