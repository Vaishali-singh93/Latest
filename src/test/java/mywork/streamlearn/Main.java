package mywork.streamlearn;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Course pymc= new Course("PYMC", "Python Masterclass");
        Course jmc= new Course("JMC", "Java Masterclass");

      var p =  Stream.generate(() -> Student.getRandomStudent(jmc, pymc)).anyMatch(s->s.getYearsSinceEnrolled()>7);
        System.out.println(p);




    }
}
