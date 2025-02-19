package leet;

import java.util.Arrays;
import java.util.Comparator;

public class TestCLeet {

    public static void rotate(int[] nums, int k) {
//        int len = nums.length-1;
//        int temp=0;
//        k = k % nums.length;
//        System.out.println(k);
//
//        while (k>0) {
//            for (int i = len;i>0; i--) {
//               temp=nums[i-1] ;
//               nums[i-1]=nums[i];
//               nums[i]=temp;
//            }
//            k--;
//        }
//
//        System.out.println(Arrays.toString(nums));

        k = k % nums.length;
        System.out.println(k);
        if (k != 0) {
            int[] temp = new int[nums.length];
            System.arraycopy(nums, nums.length - k, temp, 0, k);
            System.arraycopy(nums, 0, temp, k, nums.length - k);
            System.arraycopy(temp, 0, nums, 0, temp.length);
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void fun(int age){
        if(age>21){
            return;
        }
        System.out.println("test");
    }

    public static int maxProfit(int[] prices) {
        int buy=prices[0];
        int profit=0;
        int sum=0;
        for(int i=1;i<prices.length;i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else if (prices[i]-buy>profit) {
                profit=prices[i]-buy;
                sum+=profit;
                buy=prices[i];
                profit=0;

            }
        }
            return sum;
    }

    public static boolean canJump(int[] nums) {

        int goal = nums.length-1;
        for(int i = nums.length-1; i >= 0; i --) {
            if(i+nums[i]>=goal)
                goal=i;
        }

        if(goal==0){
            return true;}
        else {return false;}
    }

    public static int minJump(int[] nums) {
        int jump=0;
        int times=0;
        int covered=0;
        for(int i=0;i<nums.length-1;i++){
            jump=Math.max(jump,i+nums[i]);
            if(jump>=nums.length-1){
                ++times;
                break;
            }
            if(i==covered){
                ++times;
                covered=jump;
            }
        }
        return times;
    }

    public static int hIndex(int[] citations) {

        Integer[] ar1 = Arrays.stream(citations).boxed().toArray(Integer[]::new);
        Arrays.sort(ar1, Comparator.reverseOrder());
        citations=Arrays.stream(ar1).mapToInt(Integer::intValue).toArray();
//        Arrays.sort(citations);
//        ArrayUtils.reverse(citations);
        int h=0;

        for(int i=0,j=1;i<citations.length;i++,j++){
            if(citations[i]>=j){
                h=j;
            }
        }
     return h;
    }

    public static void main(String[] args) {
        int[] arr = {3,0,6,1,5};
        int[] arr1 = {2,3,1,1,4};
        int[] arr2 = {3,2,1,0,4};
        int[] arr3 = {2,5,0,0};
//        Scanner s = new Scanner(System.in);
//        System.out.println("provide the number for rotation");
//        int typeRotation = s.nextInt();
//        rotate(arr, typeRotation);
//        fun(2);
//        System.out.println("profit of the day "+maxProfit(arr));
//        System.out.println("can user jump:"+canJump(arr));
//        System.out.println("times user jumped is "+minJump(arr2));
//        System.out.println("H index is "+hIndex(arr));

    }
}
