package onboardlearning.collections;

public class EmployeeHM6 {

    private String firstname;
    private String lastname;
    private int age;

    public EmployeeHM6(String firstname, String lastname, int age){
        super();
        this.firstname=firstname;
        this.lastname=lastname;
        this.age=age;
    }



    public String getFirstname(){
        return firstname;
    }
    public void setFirstname(String firstname){
        this.firstname=firstname;
    }
    public String getLastname(){
        return lastname;
    }
    public void setLastname(String lastname){
        this.lastname=lastname;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                '}';
    }
}
