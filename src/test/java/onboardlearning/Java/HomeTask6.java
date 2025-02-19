package onboardlearning.Java;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import java.util.Arrays;

public class HomeTask6 {

    private static final Logger logger = Logger.getLogger(HomeTask6.class.getName());

    //task 1
    private static void maxSpan(int[] arr) {
        int span = 1;
        for(int i=1;i<arr.length-1;i++){
            span++;
        }
        System.out.println(span);
    }

    // task 2
    private static boolean canBalance(int[] arr) {
        int sum1 = 0,sum2 = 0;
        int len;
        if(arr.length%2!=0) {
            len = (arr.length / 2) + 1;
        }
        else len = arr.length/2;
        for (int i=0;i<len;i++){
            sum1+=arr[i];
        }
        for (int j=len;j< arr.length;j++){
            sum2+=arr[j];
        }
        if (sum1==sum2)
        return true;
        else return false;
    }

    //task 3
    private static int countClumps(int[] arr) {
        int count=0;
        boolean clump=false;
        logger.info("clump in an array is a series of 2 or more adjacent elements of the same value");
        for (int j=1;j<arr.length;j++) {
            if(arr[j]==arr[j-1]){
                if(!clump){
                    count++;
                    clump=true;
                }

            } else clump=false;
        }
        return count;

    }

   //task 4
    private static int maxMirror(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= 0; j--) {
                int count = 0;
                int m = i;
                int n = j;
                while (m < nums.length && n >= 0 && nums[m] == nums[n]) {
                    count++;
                    m++;
                    n--;
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }

    // task 5
    private static boolean linearIn(int[] outer,int[] inner) {
        int j=0;
        int count = 0;
        for(int i=0;i<outer.length;i++){
                while (j < inner.length && outer[i] == inner[j]) {
                    count++;
                    i++;
                    j++;
                }
        }
        return count == inner.length;


    }


    public static void main(String[] args) {
     int[] a = {1, 4};
     HomeTask6.maxSpan(a);
     int[] b = {2, 1, 1, 2, 1};
     System.out.println(HomeTask6.canBalance(b));
     int[] c = {1, 1, 1, 1, 1};
     System.out.println(HomeTask6.countClumps(c));
     int[] max = {1, 2, 1, 4};
     System.out.println(HomeTask6.maxMirror(max));
     int[] outer = {1, 2, 4, 4, 6};
     int[] inner = {2, 3, 4};
     System.out.println(HomeTask6.linearIn(outer,inner));
    }

}
