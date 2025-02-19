package onboardlearning.learning3;

public class Chocolate implements GiftPackage{
    private String name;
    private int weight;

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public Chocolate(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
}
