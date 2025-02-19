package onboardlearning.collections.lambdajava8;

import functionaltest.java8practise.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class HM1 {

    public static void stringIsPalindrome(){
        System.out.println("--Exercise1:Check if a given string is a palindrome");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String text = sc.nextLine();

        List<Character> list = text.chars().mapToObj(a -> (char) a).collect(Collectors.toList());
        Collections.reverse(list);
        String text2 = list.stream().map(String::valueOf).collect(Collectors.joining());
        if(text2.equalsIgnoreCase(text))
            System.out.println("palindrome");
        else System.out.println("not palindrome");
    }

    public static void secondBiggestNumber(){
        System.out.println("--Exercise2:Find the 2nd biggest number in the given list of numbers");
        List<Integer> list = Arrays.asList(23,98,56,90,100,56,98);
        System.out.println(list.stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst());
    }

    public static void rotationString(){
        System.out.println("---Exercise3:write a program to check if two strings are rotations of each other.---"+'\n');
        String str="acda";
        List<String> list = new ArrayList<>();
        list.add("aacd");
        list.add("acdanjh");
        list.add("tyst");
        for(String s:list)
            concatinate(s)  ;
        list.stream().filter(p->p.length()==str.length()&& concatinate(p).contains(str)).forEach((p)->System.out.println("rotation string from list are:"+p));

    }

    public static String concatinate(String str){
        return str.concat(str);
    }

    public static void runnableTes(){
        System.out.println("---Exercise4:Use Runnable interface to start a new thread and print numbers from.---"+'\n');
        List<Integer> list = Arrays.asList(3,8,0,9);
        Thread th = new Thread(()->System.out.println(list));
        th.run();

    }

    public static void sortList(){
        System.out.println("---Exercise5:Use Comparator interface to sort given list of numbers in reverse order---"+'\n');
        List<Integer> list = Arrays.asList(23,98,56,90,100,56,98);
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

    }

    public static void sortNamesOfEmployees(){
        System.out.println("---Exercise6 and Exercise 11:Use Comparator interface to sort given list of Employees in the alphabetic order of their name---"+'\n');
        List<Employee> people = Arrays.asList(
                new Employee("Shefali", "Gupta", 29),
                new Employee("Sudhir", "Singh", 63),
                new Employee("Amita", "Trivedi", 60),
                new Employee("Lata", "Bhadouria", 85));
        System.out.println("List of Employees in the alphabetic order of their name");
        people.stream().sorted(Comparator.comparing(Employee::getFirstname)).forEach(System.out::println);
        System.out.println("Exercise 11: using collection sort for comparison problem 11");
        Collections.sort(people,Comparator.comparing(Employee::getFirstname).reversed());
        people.forEach(System.out::println);


    }


    public static void reverseOrder(){
        System.out.println("---Exercise7:Create a TreeSet that sorts the given set of numbers in reverse order---"+'\n');
        Set<Integer> set = new TreeSet<>();
        for(int i =0;i<7;i++){
            int randomNumber = new Random().nextInt(100);
            set.add(randomNumber);
        }
        System.out.println("before reverse order");
        set.forEach(System.out::println);
        System.out.println("set after reverse order");
        set.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }


    public static void employeeNamesreverseOrder(){
        System.out.println("---Exercise8:TreeSet that sorts the given set of Employees in the alphabetic order of their name---"+'\n');
        Set<String> set = new TreeSet<>(Comparator.reverseOrder());
        set.add("hulk");
        set.add("Iron Man");
        set.add("Captain America");
        set.add("thor");
        System.out.println("set after reverse order");
        set.forEach(System.out::println);
    }


    public static void valuesInDescendingOrder(){
        System.out.println("---Exercise9:TreeMap that sorts the given set of values in descending order---"+'\n');
        Map<Integer,String> map = new TreeMap<>(Comparator.reverseOrder());
        map.put(1,"wish");
        map.put(9,"clean");
        map.put(3,"test");
        System.out.println(map);
    }


    public static void employeesInDescendingOrder(){
        System.out.println("---Exercise10:TreeMap that sorts the given set of employees in descending order of their name---"+'\n');
        Map<Employee,Integer> map = new TreeMap<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.getFirstname().compareTo(o1.getFirstname());
            }
        });
        map.put( new Employee("Shefali", "Gupta", 29),9);
        map.put(new Employee("Sudhir", "Singh", 63),1);
        map.put(new Employee("Amita", "Trivedi", 60),8);
        map.put(new Employee("Lata", "Bhadouria", 85),7);
        map.forEach((k,v)->
                System.out.println(k.getFirstname() + " " + k.getLastname() + " " + k.getAge()));



    }

    public static void main(String[] args) {
        HM1.stringIsPalindrome();
        HM1.secondBiggestNumber();
        HM1.rotationString();
        HM1.runnableTes();
        HM1.sortList();
        HM1.sortNamesOfEmployees();
        HM1.reverseOrder();
        HM1.employeeNamesreverseOrder();
        HM1.valuesInDescendingOrder();
        HM1.employeesInDescendingOrder();
    }


}
