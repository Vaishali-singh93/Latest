package mywork;

import leet.Trial2;

import java.util.HashMap;
import java.util.Map;

public class Trial extends Trial2 {
    public static void bar(int value){

        switch (value){
            case 1,2,3 -> System.out.println("case1");
            default -> {
                System.out.println("no match");}
        }
    }

    public static void checkMap() {
        Map<String,String> m = new HashMap<>();
        m.put("he","wo");
        m.computeIfPresent("he",(k,v)->"tel");
        System.out.println(m);
    }

    public static void main(String[] args) {
//        Trial2 ob = new Trial2();
//       ob.fun1();
//       System.err.println("test");
//       String st = "singh";
//       String tes = "Vaishali";
//        System.out.println("in"+tes.lastIndexOf('a'));
//       System.out.println(StringUtils.remove(st,"singh"));
//        List<Character> list = st.chars().mapToObj(a->(char)a).collect(Collectors.toList());
//        System.out.println(list);
//        if(list.get(0)==' '){
//            System.out.println("null value");
//        }


//bar(2);
        checkMap();

    }

}
