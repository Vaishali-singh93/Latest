package mywork.inheritancew;

public class MainClass {
    public static void main(String[] args) {
//        Employee em = new Employee("Tim","1990",8879,"2023");
//        System.out.println(em);
//        System.out.println("age is"+em.getAge());
//        System.out.println(em.collectPay());

        String s = """
                List is :
                \u2022 first
                \u2022 second
                """;
        int age = 79;
        System.out.printf("age is %d %n", age);
        String test= "Hello world";
        System.out.println("substring"+test.substring(2));
        StringBuilder b = new StringBuilder("hello world");
        System.out.println(b.reverse());
    }




}
