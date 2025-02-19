package functionaltest.javacollections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapImplementation {
    static Map<Character, Integer> m = new HashMap<>();


    public static void calculate(String stringText) {
        int count = 1;
        char[] text = stringText.toCharArray();
        for (int i = 0; i < text.length; i++) {
            for (int j = i + 1; j < text.length; j++) {
                if (text[i] == text[j]) {
                    count++;
                }
            }
            countAlpha(text[i], count);
            count = 1;
        }
        Collection<Integer> lis = m.values();
        int sum=0;
        for(var s: lis){
            sum+=s;
        }
        System.out.println(sum);
    }

    public static void countAlpha(char c, int counts) {
        if (!m.containsKey(c) && counts>1) {
            m.put(c, counts);
        }

    }

    public static void main(String[] args) {
  //      calculate("vaishalisinghbhadouria");
        interface Blue{
            void forget();
        }

        var strp = new Blue() {
            @Override
            public void forget() {
                System.out.println("in forget");
            }
        };

        strp.forget();
    }
}
