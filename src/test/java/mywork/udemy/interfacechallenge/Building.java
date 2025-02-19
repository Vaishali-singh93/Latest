package mywork.udemy.interfacechallenge;

public class Building implements Mappable{
    private String name1;
    private String usage;

    private String name;

    private String weapon;
    private int hitpoints;
    private int strength;

    public Building(String name, String usage) {
        this.name = name;
        this.usage = usage;
    }

    @Override
    public String label() {
        return "Sydney Town Hall";
    }

    @Override
    public String geometoryType() {
        return "POINT";
    }

    @Override
    public String iconType() {
        return "RED STAR";
    }

    @Override
    public String toJson() {
        return Mappable.super.toJson()+ """
                "name":"%s","usage":"%s"
                """.formatted(name,usage);
    }
}
