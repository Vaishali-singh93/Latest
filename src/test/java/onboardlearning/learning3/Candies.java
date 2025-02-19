package onboardlearning.learning3;

public class Candies implements GiftPackage{
    private String name;
    private int weight;

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Candies{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public Candies(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
}
