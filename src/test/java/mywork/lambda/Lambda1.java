package mywork.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Lambda1 {
    public static void main(String[] args) {
        String sentence = "My name is vaishali and i am from Lucknow";
        Consumer<String> con = (String s) -> {
            Arrays.asList(s.split(" ")).forEach(System.out::println);
        };

        Function<String, StringBuilder> fun = (String s) -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(s.charAt(i));
                }
            }
            return returnVal;
        };
    // System.out.println(funInterface("1234567890",fun));
    getSentence(sentence,con);
        Supplier<String> s = () -> "i love java";
        System.out.println(s.get());

//        Random r = new Random();
//        char c = (char)r.nextInt((int)'A',(int)'F');

        List<String> list = new ArrayList<>(Arrays.asList("vaishali","Anna","siya","Bob","veer"));

        list.replaceAll(String::toUpperCase);
        list.forEach(System.out::println);
        list.forEach(a -> System.out.println(a + " "  + "."+" "+new StringBuilder(a).reverse()));

    }



    public static String funInterface(String s,Function<String,String> fun){
       return fun.apply(s);
    }

    public static void getSentence(String s,Consumer<String> con){
          con.accept(s);
    }


}
