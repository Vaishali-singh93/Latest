package functionaltest.lambdapractise;

import org.testng.annotations.Test;

import java.util.*;
import java.util.concurrent.locks.Condition;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaExercise1 {

    @Test
    public void executeCase() {
        List<Person> people = Arrays.asList(
                new Person("Shefali", "Gupta", 29),
                new Person("Sudhir", "Singh", 63),
                new Person("Amita", "Trivedi", 60),
                new Person("Lata", "Bhadouria", 85));


        //Sort List by last name
        //Create method that prints all elements in the list
        Collections.sort(people, (o1, o2) -> o1.getLastname().compareTo(o2.getLastname()));
        System.out.println("Sort List by last name");
        printCondition(people,p->true,p->System.out.println(p));
        System.out.println("prints all people that have last name beginning with b");
        printCondition(people, p -> p.getLastname().startsWith("B"),p->System.out.println(p.getLastname()));

    }

    public static void printCondition(List<Person> people, Predicate<Person> pre, Consumer<Person> con) {
        for (Person p : people){
            if(pre.test(p)){
                con.accept(p);
            }
        }

    }



}



