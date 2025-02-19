package functionaltest.javacollections;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class SetImplementation {

    @Test
    public void setTest(){
        Set<String> names = new HashSet<>();
        names.add("Raj");
        names.add("Amit");
        names.add("Raj");
        names.add("Sumit");
        System.out.println(names);

        Set<Integer> values = new HashSet<>();
        values.add(1);
        values.add(4);
        values.add(9);
        values.add(16);
        values.add(88);
        System.out.println("value to check "+values.iterator().next());
        System.out.println( find(values.iterator().next(),(a)->a<10));


    }

    static boolean find(int number, Predicate<Integer> s){
        if(s.test(number)){
            return true;
        }
        else
            return false;
    }

}
