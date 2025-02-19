package mywork;

import java.util.*;

public class TrialP {
    public static void inputThenPrintSumAndAverage() {
        int number;
        int sum=0;
        long avg = 0;
        int counter=1;
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Enter number or any non int to exit");
            String s = sc.nextLine();
            try{
                number=Integer.parseInt(s);
                sum+=number;
                avg=sum/counter;
                counter++;
            } catch(NumberFormatException e){
                System.out.println("number not int exit");
                break;
            }
        }
        System.out.println("\"SUM = "+sum+" "+"AVG = "+avg+"\"");
    }

    public static void ggg() {
        List<Integer> list = Arrays.asList(67,9,245,6,90,23);
        list.sort(Comparator.reverseOrder());
       list.forEach(System.out::println);
       StringBuffer str = new StringBuffer("vaishali");
        System.out.println(str.reverse());
    }
    public static void main(String[] args) {
        //inputThenPrintSumAndAverage();
 //       ggg();
        String h = "var";
        System.out.println("\""+h+"\"");

    }
}
