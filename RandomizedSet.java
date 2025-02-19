package leet;

import java.util.ArrayList;
import java.util.Random;

public class RandomizedSet {
    ArrayList<Integer> list = new ArrayList<>();

    public RandomizedSet() {

    }

    public boolean insert(int val) {

        if(list.stream().anyMatch(a->a.equals(val))){
            return false;
        } else {
            list.add(val);
            return true;
        }
    }

    public boolean remove(int val) {

        if(list.stream().anyMatch(a->a.equals(val))){
            list.removeIf((a->a.equals(val)));
            return true;
        }
        else {
            return false;
        }

    }

    public int getRandom() {
        Random rm = new Random();
        int i = rm.nextInt(list.size()-1);
        return list.get(i);
    }

    public static void main(String[] args) {
        RandomizedSet set1 = new RandomizedSet();
        System.out.println(set1.insert(2));
        System.out.println(set1.insert(7));
        System.out.println(set1.insert(2));
        System.out.println(set1.insert(9));
        System.out.println(set1.insert(4));
        System.out.println(set1.remove(2));
        System.out.println(set1.getRandom());

    }

}
