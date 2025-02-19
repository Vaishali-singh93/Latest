package mywork.collection;

import java.util.*;

public class MainSet {
    public static void main(String[] args) {
//        Set<Task> tasks = TaskData.getTasks("all");
//        sortAndPrint("task assigned",tasks,null);
        Comparator<Task> c = Comparator.comparing(Task::getPriority);
        Set<Task> tasks1 = TaskData.getTasks("all");
        Set<Task> tasks2 = TaskData.getTasks("suraj");
        sortAndPrint("task assigned",tasks2,c);
        sortAndPrint("task assigned",getDifference(tasks1,tasks2),c);
    }

    public static void sortAndPrint(String header, Collection<Task> task, Comparator<Task> comp){
        System.out.println(header);
        System.out.println("-".repeat(30));
        List<Task> list = new ArrayList<>(task);
        list.sort(comp);
        list.forEach(System.out::println);
    }

    public static Set<Task> getUnion(Set<Task> s1,Set<Task> s2) {
        Set<Task> union = new HashSet<>();
        union.addAll(s1);
        union.addAll(s2);
        return union;
    }

    public static Set<Task> getIntersect(Set<Task> s1,Set<Task> s2) {
        Set<Task> intersect = new HashSet<>(s1);
        intersect.retainAll(s2);
        return intersect;

    }

    public static Set<Task> getDifference(Set<Task> s1,Set<Task> s2) {
        Set<Task> differ = new HashSet<>(s1);
        differ.removeAll(s2);
        return differ;
    }


}
