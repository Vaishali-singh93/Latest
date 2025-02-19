package onboardlearning.collections;

import java.util.*;

public class HM6 {

    private static void listNameInDescendingOrder(LinkedList<EmployeeHM6> list) {
//        list.sort((o1, o2) -> o2.getFirstname().compareTo(o1.getFirstname()));
//        System.out.println(list);
        Collections.sort(list,Comparator.comparing(EmployeeHM6::getAge).reversed());
        list.forEach(a-> System.out.println(a.getAge()));


    }

    private static void HashSetOrder(HashSet<StudentDetails> set) {
        System.out.println(set.stream().filter(a->!a.getSection().contains("maths")).count());

    }

    private static void LinkedHashSetOrder(HashSet<StudentDetails> set) {
       LinkedHashSet<StudentDetails> link = new LinkedHashSet<>(set);
       link.stream().filter(a->a.getRollNo()>10).forEach(a-> System.out.println(a.getRollNo()));
    }

    private static void TreeHashSetOrder() {
        NavigableSet<Integer> navi = new TreeSet<>();
        navi.add(23);
        navi.add(88);
        navi.add(12);
        navi.add(73);
        System.out.println(navi.descendingSet());
    }

    public static void main(String[] args) {
        LinkedList<EmployeeHM6> list = new LinkedList<>();
        list.add(new EmployeeHM6("vaishali","singh",32));
        list.add(new EmployeeHM6("shefali","singh",36));
        list.add(new EmployeeHM6("suraj","Roy",30));
        list.add(new EmployeeHM6("Amita","Bhadouria",57));
        HM6.listNameInDescendingOrder(list);
        LinkedHashMap<EmployeeHM6,Integer> map = new LinkedHashMap<>();
        map.put(new EmployeeHM6("vaishali","singh",32),10);
        map.put(new EmployeeHM6("Amita","Bhadouria",32),66);
        map.put(new EmployeeHM6("suraj","Roy",32),20);
        map.put(new EmployeeHM6("shefali","singh",32),89);
        map.entrySet().stream().filter(a->a.getValue()>20).
                forEach(a-> System.out.println(a.getKey().getFirstname()));
        HashSet<StudentDetails> set = new HashSet<>();
        set.add(new StudentDetails("vaishali","maths",34));
        set.add(new StudentDetails("shefali","science",2));
        set.add(new StudentDetails("suraj","commerce",50));
        set.add(new StudentDetails("kiran","Physics",41));
        HM6.HashSetOrder(set);
        HM6.LinkedHashSetOrder(set);
        HM6.TreeHashSetOrder();
    }
}
