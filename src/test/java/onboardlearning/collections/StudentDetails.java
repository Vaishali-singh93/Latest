package onboardlearning.collections;

public class StudentDetails {
    private String name;
    private String section;
    private double rollNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public double getRollNo() {
        return rollNo;
    }

    public void setRollNo(double rollNo) {
        this.rollNo = rollNo;
    }

    public StudentDetails(String name, String section, double rollNo){
        this.name=name;
        this.section=section;
        this.rollNo=rollNo;
    }



}
