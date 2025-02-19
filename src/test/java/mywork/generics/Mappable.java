package mywork.generics;

public interface Mappable {
    void render();
    static double changeToLocation(double location) {
        System.out.println("Print location: "+location );
        return location;
    }
}

abstract class Point implements Mappable {
    public Point(double location) {
        this.location = Mappable.changeToLocation(location);
    }

    private double location;
    @Override
    public void render() {
        System.out.println("Render--"+this+"As POINT--"+location());
    }

    private double location() {
        return location;
    }
}

abstract class Line implements Mappable {
    public Line(double location) {
        this.location = Mappable.changeToLocation(location);
    }

    private final double location;
    @Override
    public void render() {
        System.out.println("Render--"+this+"As Line--"+location());
    }

    private double location() {
        return location;
    }

}
