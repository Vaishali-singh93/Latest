package mywork.udemy.interfacechallenge;

import java.util.Arrays;
import java.util.List;

public class Monster implements ISaveable{
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public String getName() {
        return name;
    }

    @Override
    public List<String> write() {
       return Arrays.asList(getName(), String.valueOf(getHitPoints()),String.valueOf(getStrength()));
    }

    @Override
    public void read(List<String> list) {
        if(!list.isEmpty()) {
            String str = list.toString();
            System.out.println(str);
        }
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }

}
