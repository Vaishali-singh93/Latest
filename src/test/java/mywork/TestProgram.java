package mywork;

import java.util.Arrays;
import java.util.Random;

public class TestProgram {
    public void fun1(int[] arr) {
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j< arr.length;j++){
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        Arrays.stream(arr).forEach(System.out::println);
        System.out.println("second highest is "+arr[1]);
    }

    public void fun2(String str) {
//        String num = str.replaceAll("[^0-9]","");
//        System.out.println(num);
        String[] split = str.split("[1-9]+") ;
        System.out.println(split[0]);
        System.out.println(split[1]);
    }

    public void fun3(int[] nums1, int m, int[] nums2, int n) {
       int length = n+m;
       int j=0;
       for(int i=0;i<length;i++){
           if(nums1[i]==0 && j<nums2.length){
               nums1[i]=nums2[j];
               j++;
           }
       }
       Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }

    public int removeElement(int[] nums, int val) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                nums[i]= 0;
            }
        }
        return nums.length;
    }

    public static void reverseOrderArray() {
        Random m = new Random();
        int temp=0;
        int[] ar = new int[5];
        for(int i=0;i<ar.length;i++){
            ar[i] = m.nextInt(60);
        }
        Arrays.sort(ar);
        System.out.println("Created array "+Arrays.toString(ar));
        System.out.println("-".repeat(10));

        for(int i=0,j= ar.length-1;i<ar.length/2;i++,j--){
            temp = ar[i];
            ar[i]=ar[j];
            ar[j]=temp;
        }
        System.out.println("Reversed Array "+Arrays.toString(ar));
    }

    public static void main(String[] args) {
//        TestProgram ob1=new TestProgram();
//        int[] arr = {0, 8, 4, 1, 4, 7, 2, 5};
        //ob1.fun1(arr);
 //       String str = "vaishalisinghbhadouria719";
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        //ob1.fun3(nums1,3,nums2,3);
        int[] nums = {0,1,2,2,3,0,4,2};
        //System.out.println(ob1.removeElement(nums,2));
        reverseOrderArray();


    }
}
