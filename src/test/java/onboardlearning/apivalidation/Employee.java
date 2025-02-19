package onboardlearning.apivalidation;

import java.util.List;

public class Employee {
    public Employee(List<EmployeeDetails> employeeDetails) {
        this.employeeDetails = employeeDetails;
    }

    public List<EmployeeDetails> getEmployeeDetails() {
        return employeeDetails;
    }

    public void setEmployeeDetails(List<EmployeeDetails> employeeDetails) {
        this.employeeDetails = employeeDetails;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeDetails=" + employeeDetails +
                '}';
    }

    private List<EmployeeDetails> employeeDetails;
}
