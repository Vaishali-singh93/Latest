package mywork.collection;

import java.util.*;

public class TestSet {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,5,8));

        Set<Integer> set = new HashSet<>(list);
        for(var s: set)
            System.out.println(s);
    }
}
