package onboardlearning.collections;

import java.util.*;

public class BookHM3 {

    private static void findName(HashMap<String,Integer> map,String name) {
        boolean flag = false;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getKey().equalsIgnoreCase(name)){
                System.out.println(entry.getValue());
                flag=true;
                break;
            }
        }
        if(!flag) System.out.println("Not Found");
    }
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("uncle sam",99912222);
        map.put("tom",12345678);
        map.put("harry",12299933);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        String name = sc.nextLine();
        BookHM3.findName(map,name);
    }

}
