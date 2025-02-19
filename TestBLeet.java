package leet;

public class TestBLeet extends TestA {
    static int var;
    public TestBLeet(){
     var = 30;
    }

    public static int removeElement(int[] nums, int val) {
        int [] ar = new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                ar[j]=nums[i];
                j++;
            }
        }
        System.out.println(java.util.Arrays.toString(ar));
        return j;
    }

    public static void func() {
        String s = "test";
        java.util.ArrayList<String> list= new java.util.ArrayList<>();
        list.add("2");
        list.add("6");
        list.add("9");
        list.remove(2);
        list.remove("6");
        java.util.Collections.addAll(list,s);
        System.out.println(list);
    }

    public void testParentChild() {
        System.out.println("in child");
    }

    public static int removeDuplicates(int[] nums) {
        int j=1;
        for (int i=1;i<nums.length;i++){
               if(nums[i]!=nums[i-1]){
                   nums[j]=nums[i];
                   j++;
           }
        }
        int t=j;
        for(;t<nums.length;t++){
            nums[t]=0;
        }
        System.out.println(java.util.Arrays.toString(nums));
     return j;

    }

    public static int removeDuplicates2(int[] nums) {
        java.util.Arrays.sort(nums);
        System.out.println(java.util.Arrays.toString(nums));
       int j=1;
       for(int i=1;i<nums.length;i++) {
           if (nums[i] != nums[i - 1]) {
               j++;
           }
       }

       return j;
    }

    public static int majorityElement(int[] nums) {
        java.util.Arrays.sort(nums);
        int c=1;int max=0;int num=0;
        if (nums.length==1) {
            num=nums[nums.length-1];
        }
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == nums[i + 1]) {
                    c++;
                    if(c>max){
                        max=c;
                        num=nums[i];
                    }
                } if (nums[i] != nums[i + 1]) {
                    c = 1;
                }
            }
        return num;
    }

    public static void rotate(int[] nums, int k) {
        int len=nums.length-1;
        int s=k-1;
        int [] n = new int[k];
        for(int i=0;i<k;i++){
           n[s] = nums[len-(i)];
           nums[len]=nums[len-(s+1)];
           nums[len-(s+1)]=nums[i];
           nums[i]=n[s];
           s--;
        }
        System.out.println(java.util.Arrays.toString(n));
        System.out.println(java.util.Arrays.toString(nums));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length+nums2.length;
        int [] arr = new int[len];
        System.arraycopy(nums1,0,arr,0,nums1.length);
        System.arraycopy(nums2,0,arr,len-nums2.length,nums2.length);
 //          arr= ArrayUtils.addAll(nums1,nums2);
           java.util.Arrays.sort(arr);
           double mid = (nums1.length+nums2.length)/2;
        System.out.println(mid);

        System.out.println(java.util.Arrays.toString(arr));
        return mid;

    }

    public static int numUniqueEmails(String[] emails) {
        int count = 0;
        int len = emails.length;

      for (int i = 0;i<emails.length;i++) {
         if(emails[i].contains("."));
      }

      return count;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,1,1,2,2,3,3,1};
//        int[] arr2 = {2};
//        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
//        System.out.println(removeElement(arr,2));
        System.out.println(removeDuplicates2(arr));
//        System.out.println(majorityElement(arr));
//        TestA ob = new functionaltest.TestB();
//        ob.testParentChild();
//        func();
//        rotate(arr,3);
//        findMedianSortedArrays(arr,arr2);
//        numUniqueEmails(emails);
    }

}
