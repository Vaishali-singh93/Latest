package onboardlearning.apivalidation;

import java.util.List;

public class EmployeeAdded {
    private List<EmployeeIds> id;
    private String message;

    public EmployeeAdded(List<EmployeeIds> id, String message) {
        this.id = id;
        this.message = message;
    }

    public List<EmployeeIds> getId() {
        return id;
    }

    public void setId(List<EmployeeIds> id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "EmployeeAdded{" +
                "id=" + id +
                ", message='" + message + '\'' +
                '}';
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
