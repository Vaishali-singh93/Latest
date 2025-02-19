package onboardlearning.collections.lambdajava8;

import functionaltest.java8practise.Employee;
import org.testng.annotations.Test;

import java.util.function.Function;

public class ReferenceConsHT7 {

    @Test
    public void fun() {

        Function<String, Employee> test = name->new Employee(name, "Gupta", 29);
        Function<String, Employee> test2 = lastname->new Employee("firstname", lastname, 29);
        Function<Integer, Employee> test3 = age->new Employee("firstname", "lastname", age);
        System.out.println("firstname "+test.apply("vaishali").getFirstname());
        System.out.println("lastname "+test2.apply("singh").getFirstname());
        System.out.println("age "+test3.apply(32).getAge());
    }
}
