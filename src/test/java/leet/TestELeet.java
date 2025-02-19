package leet;

public class TestELeet {

    public static boolean isAnagram(String s, String t) {
        if(!(s.length()==t.length()))
            return false;
        for(int i=0;i<s.length();i++){
            t=t.replaceFirst(Character.toString(s.charAt(i)),"");
        }
        return t.isEmpty();
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] test = new int[2];
        int a=0,b=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    a=i;
                    b=j;
                    break;
                }
            }
        }

        test[0]=a;
        test[1]=b;
        return test;
    }

    public static boolean isHappy(int n) {
        int sum=0;
        int dig;
        while (n>0) {
            while (n > 0) {
                dig = n % 10;
                sum += dig * dig;
                n = n / 10;
            }
            if(sum==1)
                return true;
            if(sum<=4)
                return false;
            n=sum;
            sum=0;
        }
        return false;
       }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j] && j-i<=k)
                    return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
      //  System.out.println(isAnagram("rat","cat"));
//       int[] a = {3,3};
//       System.out.println(Arrays.toString(twoSum(a,6)));
//        System.out.println(isHappy(1111111));
        System.out.println(containsNearbyDuplicate(new int[]{1,2,3,1,2,3},2));
    }

}
