package onboardlearning.collections;

import java.util.*;


public class ArrayListHomeTask1 {

    public static void findNumber(int line,int index ,ArrayList<ArrayList<Integer>> arr){
        arr = addList(arr);
        ArrayList<Integer> list = new ArrayList<>();

       if(arr.size()>line) {
           list.addAll(arr.get(line));

           if (index<list.size()) {
               System.out.println(list.get(index));
           } else System.out.println("ERROR");
       }
        else System.out.println("ERROR");
    }

    public static void fun(int line,int index ,ArrayList<ArrayList<Integer>> arr){
        List<Integer> v = new ArrayList<>();
        v.add(2);
        v.add(5);
        v.add(6);



    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
//        ArrayListHomeTask1.findNumber(8,2,arr);
        ArrayListHomeTask1.fun(8,2,arr);
    }

    public static ArrayList<ArrayList<Integer>> addList(ArrayList<ArrayList<Integer>> arr) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(23);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(65);
        list2.add(13);
        list2.add(90);
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(9);
        list3.add(15);
        list3.add(89);
        list3.add(47);
        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(62);
        list4.add(33);
        list4.add(11);
        list4.add(76);
        list4.add(94);
        ArrayList<Integer> list5 = new ArrayList<>();
        list5.add(81);
        list5.add(53);
        arr.add(list1);
        arr.add(list2);
        arr.add(list3);
        arr.add(list4);
        arr.add(list5);

        return arr;
    }
}
