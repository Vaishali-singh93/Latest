package leet;

public class TestDLeet {

    public static int[] productExceptSelf(int[] nums) {
      int n = nums.length;
      int[] answer = new int[n];
      for(int i=0;i<n;i++) {
          int fact =1;
          for (int j = 0; j < n ; j++) {
             if (j!=i){
                 fact*=nums[j];
             }
          }
          answer[i] = fact;
      }

        return answer;
    }

    public static int lengthOfLastWord(String s) {
        String[] str=s.split(" ");
        String newstring= str[str.length-1].toString();
        int l= newstring.length();
        return l;
    }

    public static String longestCommonPrefix(String[] strs) {
        int len=strs[0].length();
        String pre = strs[0];
        for (String str : strs) {
            if (len > str.length()) {
                len = str.length();
                pre = str;
            }
        }
        int count=0;
        int j = len;
        String sub="";
        while (j>0) {
            for (int i = 0; i < strs.length; i++) {
                sub=pre.substring(0,j);
                if (strs[i].startsWith(sub)) {
                    count++;
                }
            }
            if(count==strs.length){
                return sub;
            }
            count=0;
            j--;
        }
        return "";
    }

    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
       char[] b = magazine.toCharArray();
       int len=ransomNote.length();
       int count=0;
       for(int i=0;i<b.length;i++){
           if(ransomNote.indexOf(b[i])>=0) {
               ransomNote = ransomNote.replaceFirst(Character.toString(b[i]),"");
               count++;
           }
       }
        return count == len;
    }

//    public static boolean isPalindrome(String s) {
//       String str = s.replaceAll("[^a-zA-Z0-9]","");
//       char[] c = str.toCharArray();
//       char[] palin = new char[c.length];
//       for(int i=0,j=c.length-1;i<c.length;i++,j--) {
//           palin[j]=c[i];
//        }
//       return str.equalsIgnoreCase(String.valueOf(palin));
//
//    }

//    public static boolean isSubsequence(String s, String t) {
//        int len;
//        int index, count = 0;
//        for (int i = 0; i < s.length(); i++) {
//            len=t.length();
//            index = t.indexOf(s.charAt(i));
//            if (index>-1) {
//                t=t.substring(index+1,len);
//                count++;
//            }
//        }
//        return count==s.length();
//    }
     public static boolean isIsomorphic(String s, String t) {
         int[] indexS = new int[200]; // Stores index of characters in string s
         int[] indexT = new int[200]; // Stores index of characters in string t

         // Get the length of both strings
         int len = s.length();

         // If the lengths of the two strings are different, they can't be isomorphic
         if(len != t.length()) {
             return false;
         }


         // Iterate through each character of the strings
         for(int i = 0; i < len; i++) {
             // Check if the index of the current character in string s
             // is different from the index of the corresponding character in string t
             if(indexS[s.charAt(i)] != indexT[t.charAt(i)]) {
                 return false; // If different, strings are not isomorphic
             }

             // Update the indices of characters in both strings
             indexS[s.charAt(i)] = i + 1; // updating index of current character
             indexT[t.charAt(i)] = i + 1; // updating index of current character
         }

         // If the loop completes without returning false, strings are isomorphic
         return true;
     }

    public static boolean wordPattern(String pattern, String s) {
        if(pattern.length()!=s.split(" ").length)
            return false;// Stores index of characters in string s
        String[] str = s.split(" ");
        for(int i=0;i<str.length;i++) {
            String tr=Character.toString(pattern.charAt(i)).concat(str[i]);
            for (int j=i+1;j<pattern.length();j++){
                String tr2=Character.toString(pattern.charAt(j)).concat(str[j]);
                if(tr.charAt(0)==tr2.charAt(0) && !tr.substring(1).equals(tr2.substring(1)))
                    return false;
                else if (!(tr.charAt(0)==tr2.charAt(0)) && tr.substring(1).equals(tr2.substring(1))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        int[] nums = {1,2,3,4};
//        System.out.println(java.util.Arrays.toString(productExceptSelf(nums)));
//        String str= "a    ";
//        System.out.println(lengthOfLastWord(str));
//        String[] str1 = {"flower","flow","flight"};
//        String[] str = {"dog","racecar","carp"};
//        System.out.println(longestCommonPrefix(str1));
 //       System.out.println("found  :"+strStr("sadbutsad","sad"));

//        System.out.println(canConstruct("a","b"));
//        String palin = "A man, a plan, a canal: Panama";
//        System.out.println(isPalindrome(palin));
//        System.out.println(isSubsequence("aaaa","bbaaa"));
 //       System.out.println(isIsomorphic("egg","ads"));
 //       System.out.println(wordPattern("abca","dog cat cat fish"));
    }
}
