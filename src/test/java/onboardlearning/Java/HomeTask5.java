package onboardlearning.Java;

import org.apache.commons.lang3.StringUtils;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HomeTask5 {

    //task 1
    public static void caughtSpeeding(int speed, boolean isBirthday) {
        int ticket;
        if(speed<=60 && !isBirthday)
            ticket=0;
        else if(speed>=60 && speed<=80 && !isBirthday)
            ticket=1;
        else if(isBirthday) ticket=5;
        else ticket=2;

        switch (ticket) {
            case 0 :
                System.out.println("no ticket");
                break;
            case 1:
                System.out.println("small ticket");
                break;
            case 2:
                System.out.println("big ticket");
                break;
            case 5:
                System.out.println("Its your birthday your speed can be 5 higher");
                break;
            default:
                System.out.println("does not fall in any condition");
        }
    }

    //task 2
    public static void absoluteValueOfNumber(int n1,int n2,int absNum) {
        int num1 = Math.abs(n1);
        int num2 = Math.abs(n2);
        boolean flag=false;
        if((num1+num2)==absNum)
            flag= true;
        else if((num1-num2)==absNum)
            flag= true;
        else if((num2-num1)==absNum)
            flag= true;
        else if(num1==absNum || num2==absNum)
            flag= true;

        if(flag){
            System.out.println(flag);
        }
        else System.out.println(flag);
    }

    //task 3
    public static void party(int tea, int candy) {
        int party = 0;
        if(tea+candy==5)
            party=1;
        else if(tea == (2*candy) || candy == (2*tea))
            party= 2;
        else if(tea<5 || candy <5 )
            party= 0;

        switch(party) {
            case 0 :
                System.out.println("bad party");
                break;
            case 1:
                System.out.println("good party");
                break;
            case 2:
                System.out.println("great party");
                break;
            default:
                System.out.println("does not fall in any condition");
        }
    }

    //task 4
    public static void ticket(int a, int b, int c) {
        int ab = a + b;
        int bc = b + c;
        int ac = a + c;

        if (ab == 10 || bc == 10 || ac == 10) {
            System.out.println("result is :" +10);
        } else if (ab == bc + 10 || ab== ac + 10) {
            System.out.println("result is :" +5);
        } else {
            System.out.println("result is :" +0);
        }
    }

    //task 5
    public static void inOrder(int a, int b, int c,boolean flag) {
        if (b>a && c>b || !flag) {
            System.out.println("true");
        } else if (b<a && c>b || flag) {
            System.out.println("true");}
        else if (b>a && c<b || !flag) {
                System.out.println("false");
        }
    }

    //task 6
    public static void shareDigit(int num1, int num2) {
        int num1r=num1/10;
        int num1q = num1%10;
        int num2r=num2/10;
        int num2q = num2%10;

       if(num1r==num2r || num1r==num2q)
           System.out.println("true");
       else if (num1q==num2r ||num1q==num2q)
           System.out.println("true");
       else System.out.println("false");
    }

    //task 7
    public static int sumLimit(int num1, int num2) {
       int sum = num1+num2;
       if(String.valueOf(sum).length()>1)
           return num1;
       else return sum;
    }

    // task 8
    public static void withoutString(String base, String remove) {
        System.out.println(StringUtils.remove(base, remove));
    }

    // task 9
    public static void maxBlock(String text) {
        int block = 1;
        int maxOccur = 1;
        for (int i = 1; i < text.length(); i++) {
            if (text.charAt(i) == text.charAt(i - 1)) {
                block++;
            } else {
                block = 1;
            }
            if (block > maxOccur) {
                maxOccur = block;
            }
        }
        System.out.println("max occur"+maxOccur);
    }

    public static void sumNumbers(String text) {
     char[] a = text.toCharArray();
      int sum = 0;
     for(int i=0;i<a.length;i++) {
         if(!Character.isDigit(a[i])) {
             a[i]=' ';
         }
     }
     String s = new String(a);
     s=s.trim();
     String[] strNum = s.split("\\s");
     for (String t:strNum){
         sum+=Integer.parseInt(t);}
     System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter speed");
        int speed = sc.nextInt();
        System.out.println("Its your birthday ans in true or false");
        boolean isBirthday = sc.nextBoolean();
        HomeTask5.caughtSpeeding(speed,isBirthday);
        HomeTask5.absoluteValueOfNumber(-5,1,6);
        HomeTask5.party(6,10);
        HomeTask5.ticket(16,10,6);
        HomeTask5.inOrder(1,1,4,true);
        HomeTask5.shareDigit(12,31);
        System.out.println("sum is :"+HomeTask5.sumLimit(2,95));
        HomeTask5.withoutString("Hello There","e");
        HomeTask5.maxBlock("abbCCCddBBBxx");
        HomeTask5.sumNumbers("abc123xyz");
    }
}
