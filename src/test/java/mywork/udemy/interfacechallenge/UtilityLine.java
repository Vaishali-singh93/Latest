package mywork.udemy.interfacechallenge;

enum Marker {
    GREENDOT,TRIANGLE
}

public class UtilityLine implements Mappable{
    private String name;
    private String utility;

    public UtilityLine(String name, String utility) {
        this.name = name;
        this.utility = utility;
    }

    @Override
    public String label() {
        return "College fibre Optics";
    }

    @Override
    public String geometoryType() {
        return "LINE";
    }

    @Override
    public String iconType() {
        return Marker.GREENDOT.toString();
    }

    @Override
    public String toJson() {
        return Mappable.super.toJson()+ """
                "name":"%s","utility":"%s"
                """.formatted(name,utility);
    }
}
