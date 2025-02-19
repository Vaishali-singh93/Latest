package functionaltest.java8practise;

import org.testng.annotations.Test;

public class ConstructorReferenceExercise {

    @Test(description = "Constructor reference Validations")
    public void constructorReferenceValidations(){

        System.out.println("Exercise1: Write a program get the details of Employee Object , such as name,account,salary , \n" +
                "where Employee class has parameterized constructor using constructor reference"+'\n');

        Employees empDetails   = EmployeeDetails::new;

     System.out.println(empDetails.test("vaishali",14524543,230000.98).getName());
     System.out.println(empDetails.test("vaishali",14524543,230000.98).getSalary());
    }

    interface Employees{
        EmployeeDetails test(String name,long account,double salary);
    }

}
