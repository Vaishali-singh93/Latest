package mywork.inheritancew;

public class Worker {
    private String name;
    private String dob;
    private String endDate;


    public Worker(String name, String dob) {
        this.name = name;
        this.dob = dob;
    }

    public int getAge(){
       int currentYear = 2025;
       return (currentYear-Integer.parseInt(dob));
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }


    public void terminate(String endDate) {
        this.endDate=endDate;
    }

}
