package onboardlearning.learning3;

public class Sweets implements GiftPackage{
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
        return "Sweets{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public Sweets(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

}
