package onboardlearning.Java;

import java.util.Scanner;

public class HomeTask2 {

    public static void printName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any name");
        String name = sc.nextLine();
        System.out.println("Entered name by user is :" +name);
    }

    public static void calculator() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers for operation");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Enter any operation number\n 1 for Add \n 2 for Subtract \n 3 for division " +
                "\n 4 multiply \n 5 for Remainder \n 6 for Percentage");
        int operation = sc.nextInt();

        switch (operation) {
            case 1 :
                System.out.println("sum of number: "+(num1+num2));
                break;
            case 2:
                System.out.println("subtraction of number :" +(num1-num2));
                break;
            case 3:
                System.out.println("division of number is:"+(num1/num2));
                break;
            case 4:
                System.out.println("multiplication of number is:"+(num1*num2));
                break;
            case 5:
                System.out.println("Remainder of number:"+(num1%num2));
                break;
            case 6:
                System.out.println("% of number:"+((num1/num2)*100));
                break;
            default:
                System.out.println("Please choose from given option");
        }
    }

    public static void main(String[] args) {
        HomeTask2.printName();
        HomeTask2.calculator();

    }
}
