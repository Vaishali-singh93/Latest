package mywork.udemy.interfacechallenge;

import java.util.Arrays;
import java.util.List;

public class Player implements ISaveable{
    private String name;
    private String weapon;
    private int hitpoints;
    private int strength;

    public Player(String name,int hitpoints, int strength) {
        this.name = name;
        this.weapon = "Sword";
        this.hitpoints = hitpoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        return  Arrays.asList(getName(),getWeapon(), String.valueOf(getHitpoints()),String.valueOf(getStrength()));
    }

    @Override
    public void read(List<String> list) {
        if(!list.isEmpty()) {
            System.out.println(list.toString());
        }

    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                ", hitpoints=" + hitpoints +
                ", strength=" + strength +
                '}';
    }
}
