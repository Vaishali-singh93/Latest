package mywork.polymorph;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public abstract class ClassTestAbs {
    public static void fun() {

    }

    public static void main(String[] args) {
        fun();
        Comparator<String> comparator = Collections.reverseOrder();
        List<String> list = Arrays.asList("orange", "banana", "apple", "fig", "date");
        Collections.sort(list, comparator);

        int index = Collections.binarySearch(list, "apple", comparator);

        if (index >= 0) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found, could be inserted at index: " + -(index + 1));
        }



    }
}
