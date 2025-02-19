package onboardlearning.apivalidation;

public class EmployeeIds {
    private int id;

    public EmployeeIds(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "EmployeeIds{" +
                "id=" + id +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
