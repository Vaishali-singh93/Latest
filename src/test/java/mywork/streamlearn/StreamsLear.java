package mywork.streamlearn;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class StreamsLear {
    public static void main(String[] args) {
        Map<Character,int[]> map = new LinkedHashMap<>();
        int ind =1;
        for(char c : "BINGO".toCharArray()){
            int[] num = new int[15];
            int label = ind;
            Arrays.setAll(num,i->i + label);
            System.out.println(Arrays.toString(num));
            map.put(c,num);
            ind+=15;
        }

//        map.entrySet().stream().
//                map(q->q.getKey().toString()+q.getValue()[0]+ "-"+ q.getKey()+q.getValue()[q.getValue().length-1])
//                .forEach(System.out::println);
    }
}
