package onboardlearning.collections;

import java.util.*;

public class MapHM5 {

    public static void main(String[] args) {
//        boolean flag = false;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter name");
//        String name = sc.nextLine();
        TreeMap<String,Integer> m = new TreeMap<>();
        m.put("singh",1);
        m.put("test",9);
        m.put("shef",4);
        m.put("sur",10);
        System.out.println(m);
//        System.out.println("size of map"+m.size());
//        m.remove("sur");
//        ArrayList<String> keys = new ArrayList<>(m.keySet());
//        Collections.sort(keys);
//        keys.forEach(System.out::println);
//        m.entrySet().forEach(a-> System.out.println("after removal"+a));
//
//        for(Map.Entry<String,Integer> entry : m.entrySet()) {
//            if(entry.getKey().equalsIgnoreCase(name)){
//                System.out.println(entry.getValue());
//                flag=true;
//                break;
//            }
//        }
//        if(!flag) System.out.println("-1");
    }

}
