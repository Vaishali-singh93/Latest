package onboardlearning.apivalidation;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import org.hamcrest.Matchers;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static io.restassured.RestAssured.given;

public class ApiHT3 {

    String location = File.separator+"src" + File.separator + "test" + File.separator + "java" + File.separator + "onboardlearning"
            + File.separator + "apivalidation"+File.separator;

    @Test
    public void postPet() throws IOException {
        RestAssured.baseURI = "https://petstore.swagger.io/v2/pet";
        String request = new String(Files.readAllBytes(Paths.get(System.getProperty("user.dir")+location+"pet.json")));
        String response = given().contentType(ContentType.JSON).log().all().body(request).when()
                .post()
                .then().assertThat().statusCode(200)
                .extract().asString();
        System.out.println(response);
    }

    @Test
    public void getPet()  {
        RestAssured.baseURI = "https://petstore.swagger.io/v2/pet";
        given().contentType(ContentType.JSON).when()
                .get("/12347")
                .then().assertThat().statusCode(200)
                .body("category.'name'", Matchers.equalTo("dog"),
                        "status",Matchers.equalTo("pending"),
                        "name",Matchers.equalTo("snoopie"));
    }

    @Test
    public void getUsers() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
        JsonPath path = given().when()
                .get("/users")
                .then().assertThat().statusCode(200)
                .body("size()", greaterThan(3)).extract().body().jsonPath();

        List<String> list = path.getList("name");
        boolean flag = false;
        for(String n : list) {

            if(n.equalsIgnoreCase("Ervin Howell")){
                System.out.println("name found");
                flag=true;
                break;
            }
        } if(!flag) System.out.println("not found");
    }
}
