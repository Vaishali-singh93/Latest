package work;

import java.util.ArrayList;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Test234 {

    public static void main(String[] args) {
        List<Integer> in = new ArrayList<>(List.of(3,2,7,4,9,20,1));
        NavigableSet<Integer> set = new TreeSet<>();
        set.add(3);
        set.add(1);
        set.add(20);
        set.add(9);
//        System.out.println(set.first());
//        System.out.println(set.last());
//        System.out.println("-".repeat(20));
//        System.out.println(set.pollFirst());
//        System.out.println(set.pollLast());
//        System.out.println(set.ceiling(4));
//        System.out.println(set.higher(4));
        NavigableSet<Integer> trys = set.descendingSet();
        trys.forEach(System.out::println);
        Integer df = set.pollLast();
        System.out.println("removed");
        set.forEach(System.out::println);

        System.out.println("+".repeat(20));
        var cs = set.headSet(3);
        cs.forEach(System.out::println);

        System.out.println("+".repeat(20));
        var ts = set.tailSet(3  );
        ts.forEach(System.out::println);
//        int s = in.getFirst();
//        int f = in.getLast();
//        System.out.println(s);
//        System.out.println(f);

    }


}
