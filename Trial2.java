package leet;

import java.util.Arrays;
import java.util.HashMap;

public class Trial2 {

    public static void fun(){
        for(float i=7.5f;i<10;i+=.25f){
            System.out.println("test");
        }
    }

    public static boolean isPrimeNumber(int number){
        if(number<=2)
            return (number==2);
        for(int i=2;i<=number/2;i++){
            if(number%i==0){
                return false;
            }
        }
       return true;
    }

    public static void fetchString(String str){
        String test = "Vaishali";
        int len = test.length();
        String extract = "";
        System.out.println(str.indexOf("Vaishali"));
        int index = str.indexOf("Vaishali");
        if(index!=-1) {
            for(int i = 0;i<len;i++){
                extract+=str.charAt(index);
                index++;

            }
        }
        System.out.println("variable is "+extract);
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int totalG=0;
        int totalC =0;
        for(int g:gas)
            totalG+=g;
        for (int c : cost)
            totalC+=c;
        if(totalG<totalC)
            return -1;
        int currentGas = 0;
        int startIndex = 0;
        for(int i=0;i<gas.length;i++) {
            currentGas+=gas[i]-cost[i];
            if(currentGas<0){
                currentGas=0;
                startIndex=i+1;
            }
        }
       return  startIndex;
    }

    public static int candy(int[] ratings) {
        int n = ratings.length;
        int[] candies = new int[n];
        Arrays.fill(candies, 1);

        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        System.out.println(Arrays.toString(candies));


        int totalCandies = 0;
        for (int candy : candies) {
            totalCandies += candy;
        }

        return totalCandies;
    }

    public static int romanToInt(String s) {
       int sum = 0;
       HashMap<Character,Integer> m = new HashMap<>();
        m.put('I',1);
        m.put('V',5);
        m.put('X',10);
        m.put('L',50);
        m.put('C',100);
        m.put('D',500);
        m.put('M',1000);
        for(int i=0;i < s.length();i++) {
            if(i<s.length()-1 && m.get(s.charAt(i)) < m.get(s.charAt(i+1))){
                sum-=m.get(s.charAt(i));
            } else {
                sum+=m.get(s.charAt(i));
            }
        }
  return sum;
 }


 public static int trap(int[] height) {

   return 2;

 }

//    public String intToRoman(int num) {
//
//
//    }

    public static void main(String[] args) {
//        int[] ratings = {2,4,6,7,3,2,2};
//        int[] gas = {2,3,4};
//        int[] cost = {3,4,3};
//        int sum=0;
//        int count=0;
//      for(int i=3;i<1000;i++){
//          if(i%3==0 && i%5==0){
//              System.out.println("num"+i);
//              sum+=i;
//              count++;
//              if(count==5)
//                  break;
//          }
//      }
//        System.out.println("total"+sum);
//        String str = "My name is Vaishali Singh";
//        fetchString(str);
//        System.out.println(canCompleteCircuit(gas,cost));
//        System.out.println(candy(ratings));
        System.out.println(romanToInt("MCMXCIV"));
    }
}
