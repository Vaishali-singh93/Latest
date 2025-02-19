package mywork.generics;

public class Park extends Point {
    private String name;

    public Park(double location,String name) {
        super(location);
        this.name=name;
    }

    @Override
    public String toString() {
        return "Park{" +
                "National Park='" + name + '\'' +
                "} " ;
    }
}
