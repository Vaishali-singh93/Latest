package leet;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class TestELeet1 {

    public static boolean isAnagram(String s, String t) {
        if (!(s.length() == t.length()))
            return false;
        for (int i = 0; i < s.length(); i++) {
            t = t.replaceFirst(Character.toString(s.charAt(i)), "");
        }
        return t.isEmpty();
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] test = new int[2];
        int a = 0, b = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    a = i;
                    b = j;
                    break;
                }
            }
        }

        test[0] = a;
        test[1] = b;
        return test;
    }

    public static boolean isHappy(int n) {
        int sum = 0;
        int dig;
        while (n > 0) {
            while (n > 0) {
                dig = n % 10;
                sum += dig * dig;
                n = n / 10;
            }
            if (sum == 1)
                return true;
            if (sum <= 4)
                return false;
            n = sum;
            sum = 0;
        }
        return false;
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && j - i <= k)
                    return true;
            }
        }
        return false;

    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums.length == 0) return result;

        int start = nums[0];
        for (int i = 1; i <= nums.length; i++) {
            if (i == nums.length || nums[i] != nums[i - 1] + 1) {
                if (start == nums[i - 1]) {
                    result.add(String.valueOf(start));
                } else {
                    result.add(start + "->" + nums[i - 1]);
                }
                if (i < nums.length) start = nums[i];
            }
        }
        return result;
    }

    public static boolean isValid(String s) {
//        int c = 0;
//        int m;
//        String[] a = new String[10];
//        for (int i = 0; i < s.length(); i++) {
//            if(s.charAt(i)==123) {
//                m = s.lastIndexOf(")");
//                if (m > -1 && a[m] != 125) {
//                    a[m] = m;
//                    c += 2;
//                }
//            }
//            if(s.charAt(i)==40) {
//                m = s.lastIndexOf(")");
//                if (m > -1 && a[m] != 41) {
//                    a[m] = m;
//                    c += 2;
//                }
//            }
//            if(s.charAt(i)==91) {
//                m = s.lastIndexOf(")");
//                if (m > -1 && a[m] != 93) {
//                    a[m] = m;
//                    c += 2;
//                }
//            }
//            if(s.charAt(i)==91){
//                int m = s.contains("]")?s.lastIndexOf("]"):0;
//                if((m-i)%2!=0 && m > 0 && m>i)
//                    c+=2;
//            }
//        }
//        return c == s.length();
        return false;

    }

    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // Move slow by 1 step
            fast = fast.next.next; // Move fast by 2 steps

            if (slow == fast) {
                return true; // Cycle detected
            }
        }
        return false; // No cycle detected

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1!=null && list2!=null){
            if(list1.val<list2.val){
                list1.next=mergeTwoLists(list1.next,list2);
                return list1;
            }
            else{
                list2.next=mergeTwoLists(list1,list2.next);
                return list2;
            }
        }
        if(list1==null)
            return list2;
        return list1;
    }

    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return 1 + Math.max(leftDepth, rightDepth);
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        // Base case: Both trees are null, they're the same
        if (p == null && q == null) {
            return true;
        }

        // If one is null and the other is not, they're not the same
        if (p == null || q == null) {
            return false;
        }

        // If the root values are not the same, trees are not the same
        if (p.val != q.val) {
            return false;
        }

        boolean a = isSameTree(p.left, q.left);
        boolean b = isSameTree(p.right, q.right);
        return  a && b;
    }

    public static TreeNode invertTree(TreeNode root) {
        TreeNode n;
        if(root==null)
            return null;
        n = root.right;
        root.right= root.left;
        root.left=n;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
    public static boolean isSymmetric(TreeNode root) {
        if(root==null){
            return false;
        }
        if(root.left!=null && root.right!=null)
        { boolean l = isSymmetric(root.left);
             boolean r = isSymmetric(root.right);}
        return false;
    }


    public static void main(String[] args) {
        //  System.out.println(isAnagram("rat","cat"));
//       int[] a = {3,3};
//       System.out.println(Arrays.toString(twoSum(a,6)));
//        System.out.println(isHappy(1111111));
        //       System.out.println(containsNearbyDuplicate(new int[]{1,2,3,1,2,3},2));
        //       summaryRanges(new int[]{0}).forEach(System.out::println);
//        System.out.println(isValid("([)]"));
//        ListNode head = new ListNode(3);
//        ListNode sec = new ListNode(2);
//        ListNode thi = new ListNode(0);
//        ListNode forth = new ListNode(-4);
//        System.out.println(mergeTwoLists(head,sec).val);
//        head.next = sec;
//        sec.next = head;
//        thi.next=forth;
//
//        // Optionally create a cycle for testing
//        forth.next = head;
////        System.out.println(hasCycle(head));
//        TreeNode root = new TreeNode(3);
//        root.left = new TreeNode(9);
//        root.right = new TreeNode(20);
//        root.right.left = new TreeNode(15);
//        root.right.right = new TreeNode(7);

        // Calculate maximum depth
        // Output the result
  //      System.out.println("Maximum Depth of the Binary Tree: " + maxDepth(root));
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(2);
        TreeNode l = p.left;
        TreeNode r = p.right;
        l.right = new TreeNode(3);
        r.right = new TreeNode(3);
       //231
        // Create second tree: [1,2,3]
//        TreeNode q = new TreeNode(1);
//        q.left = new TreeNode(2);
//        q.right = new TreeNode(3);
//        System.out.println(isSameTree(p,q));
//        System.out.println(invertTree(null));
        System.out.println(isSymmetric(p));
    }

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

    public static class TreeNode {
        int val; // Node value
        TreeNode left; // Left child
        TreeNode right; // Right child

        // Constructor to initialize the node
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
          this.left = left;
          this.right = right;
     }
    }
 }



