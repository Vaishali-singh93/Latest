package functionaltest.java8practise;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class PrimitiveInterfacesExercise {

    @Test(description = "Primitive Interface Validation")
    public void primitiveInterfaceValidations(){

        List<Integer> list= Arrays.asList(67,90,73,80,56,29);

        System.out.println('\n'+ "----------Write an IntPredicate to verify if the given number is a primenumber--------");
        IntPredicate predicate=(num)-> {
            if (num == 0 && num == 1)
                return false;
            else
                return IntStream.range(2,num).noneMatch(i->num%i==0);
        };
       list.stream().filter(p->predicate.test(p)).forEach(System.out::println);



       System.out.println('\n'+ "----------IntConsumer to print square of the given number--------");
        IntConsumer consumer=(num)-> {
            System.out.println(num*num);
        };
        list.stream().forEach(p->consumer.accept(p));


        System.out.println('\n'+ "----------Write a IntSupplier to give random int below 5000--------");
        IntSupplier supplier = ()-> new Random().nextInt(4999);
        System.out.println(supplier.getAsInt());
    }
}
