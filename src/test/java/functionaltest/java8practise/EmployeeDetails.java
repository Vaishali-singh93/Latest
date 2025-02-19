package functionaltest.java8practise;

public class EmployeeDetails {
    private String name;
    private long account;
    private double salary;

    public EmployeeDetails(String name,long account,double salary){
        this.name=name;
        this.account=account;
        this.salary=salary;
    }

    public void setName(String name) {
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setAccount(long account) {
        this.account = account;
    }

    public long getAccount() {
        return account;
    }


}
