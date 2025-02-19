package mywork;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Team1 {

    public static int highScorePosition(int score) {
        if(score>=1000){
            return 1;
        } else if(score>=500){
            return 2;
        } else if (score>=100) {
            return 3;
        }
        return 4;
    }

    public static long kilo(double kg) {
        long miles = (long) (kg * 1.609344);
        return miles;
    }

    public static String getDurationString(int seconds) {
        if(seconds<0) {
            return "Invalid time";
        }
          int minute = seconds%3600;


        return "";
    }
    public static String getDurationString(int minutes , int seconds) {
        if(seconds<0 || minutes<0 || seconds>59){
            return "Invalid time";
        }
        int min = seconds/60;
        int hrs = minutes/60;
        int remainMin = seconds%60;

        return "";
    }

    public static void regularExpress() {
        String str = "(002) 678-8776";
        str.replace("\\([0-9]{3}\\)","111");
        System.out.println(str);
    }

    public static void checkNumberOfCharacterRepeated() {
        String str = "Vaishalisingh";
        Map<Character,Long> m = new HashMap<>();
        List<Character> list = str.chars().mapToObj(a->(char)a).toList();
        m = list.stream().collect(
                Collectors.groupingBy(Function.identity(),
                        Collectors.counting()));



    }
    public static void testList() {
        List<Integer> l = List.of(4,6,7,3,2,9);

    }

    public static void main(String[] args) {
//        System.out.println(highScorePosition(1500));
//        System.out.println(highScorePosition(1000));
//        System.out.println(highScorePosition(500));
//        System.out.println(highScorePosition(100));
//        System.out.println(highScorePosition(25));
//        System.out.println(kilo(1.5));
//        regularExpress();
//        checkNumberOfCharacterRepeated();
//        testList();

    }
    

}
