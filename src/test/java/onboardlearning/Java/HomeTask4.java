package onboardlearning.Java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class HomeTask4 {

    public static void findMissingNumber(int number) {
        int[] arr = new int[100];
        int len;
        //fill array
        for(int i=0;i<100;i++){
            arr[i]=i+1;
        }

        Arrays.sort(arr);
        len = arr.length/2;

        if(arr[len]>number){
            for(int j=0;j<arr.length/2;j++){
                if(arr[j]==number)
                    System.out.println("number found at "+j +"position");
            }
        }
        else {
            for(int j=len;j<arr.length;j++){
                if(arr[j]==number)
                    System.out.println("number found at "+j +"position");
            }
        }
    }

    public static void findBiggestAndSmallestNumberInArray() {
        int[] arr = {67,100,23,89,300,13,2,150};
        Arrays.sort(arr);
        System.out.println("smallest number " +arr[0]);
        System.out.println("biggest number " +arr[arr.length-1]);

    }

    public static void findDuplicateCharacterFromString(String str) {
        List<Character> list = str.chars().mapToObj(a -> (char) a).collect(Collectors.toList());
        list.stream().
                filter(i -> Collections.frequency(list, i) > 1)
                .collect(Collectors.toSet()).forEach(System.out::println);
    }

    public static void checkIfStringIsRotationOrNot(String str1,String str2) {
        String s;
        s=str1+str1;
        char[] sub = str2.toCharArray();
        char[] parentStr = s.toCharArray();
        int j;
        if(str1.toCharArray().length==sub.length) {
            for (int i=0;i<parentStr.length;i++) {
                if(sub[0]==parentStr[i] && s.regionMatches(i,str2,0,sub.length) ){
                        System.out.println("strings are rotations of each other ");
                        break;
                } else if(sub[0]==parentStr[i] && !s.regionMatches(i,str2,0,sub.length)) {
                    System.out.println("strings are not rotations of each other ");
                    break;
                }
            }

        }
        else {
            System.out.println("Strings are not of same length");
        }

    }


    public static void main(String[] args) {
        HomeTask4.findMissingNumber(21);
        HomeTask4.findBiggestAndSmallestNumberInArray();
        HomeTask4.findDuplicateCharacterFromString("vaihsalisingh");
        HomeTask4.checkIfStringIsRotationOrNot("ABCD","ACBD");

    }
}
