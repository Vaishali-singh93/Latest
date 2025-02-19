package onboardlearning.apivalidation;

import io.restassured.RestAssured;
import io.restassured.response.ResponseBodyExtractionOptions;
import io.restassured.response.ValidatableResponse;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;

import org.hamcrest.Matchers;

public class ApiHT5 {

    ArrayList<EmployeeDetails> list;
    @BeforeClass
    public void data() {
        RestAssured.baseURI = "https://domain/employee";
        list.add(new EmployeeDetails("vish",23,500));
        list.add(new EmployeeDetails("she",44,70000));
        list.add(new EmployeeDetails("sur",31,2200));
        list.add(new EmployeeDetails("kir",38,6000));
    }

    @Test
    public void getEmpListSize() {
        given().when().get("/all").then().assertThat().
                statusCode(200).body("size()",is(list.size()));
    }

    @Test
    public void createEmployee() {
        Employee em = new Employee(list);
        EmployeeAdded res = given().body(em).when().post("/employees").then().assertThat().
                statusCode(200).extract().body().as(EmployeeAdded.class);
        Assert.assertEquals(res.getMessage(),"Employee successfully created");
        Assert.assertEquals(res.getId().size(),list.size()+1);
    }

    @Test
    public void updateEmployee() {
        list.get(0).setSalary(600);
        list.get(0).setAge(32);
        Employee em = new Employee(list);
        EmployeeAdded res = given().body(em).when().put("/employees/1").then().assertThat().
                statusCode(200).extract().body().as(EmployeeAdded.class);
        Assert.assertEquals(res.getMessage(),"Employee successfully updated");
        Assert.assertEquals(res.getId().size(),list.size()+1);
    }

    @Test
    public void deleteEmployee() {
        given().when().delete("/employees/1").then().assertThat().
                statusCode(200).body("size()",is(list.size()-1));
    }
}
