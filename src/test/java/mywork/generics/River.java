package mywork.generics;

public class River extends Line {
    private final String name;
    public River(double location,String name) {
        super(location);
        this.name=name;
    }

    @Override
    public String toString() {
        return "River{" +
                "River='" + name + '\'' +
                "} " ;
    }

}
