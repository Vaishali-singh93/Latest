package onboardlearning.apivalidation;

import io.restassured.RestAssured;
import io.restassured.internal.path.json.JSONAssertion;
import io.restassured.response.ResponseBodyExtractionOptions;
import org.apache.logging.log4j.core.util.FileUtils;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import io.restassured.response.Response;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class ApiHT2 {
    LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
    @BeforeMethod
    public void before() {
        map.put("https://jsonplaceholder.typicode.com/users",10);
        map.put("https://jsonplaceholder.typicode.com/posts",100);
        map.put("https://jsonplaceholder.typicode.com/comments",500);
        map.put("https://jsonplaceholder.typicode.com/albums",100);
        map.put("https://jsonplaceholder.typicode.com/photos",5000);
        map.put("https://jsonplaceholder.typicode.com/todos",200);
    }

    @Test
    public void getValidateResponse() {
        for(Map.Entry<String,Integer> m : map.entrySet()) {
            given().when().
                    get(m.getKey())
                    .then().assertThat().statusCode(200)
                    .body("size()",is(m.getValue()));
        }
    }

    @Test
    public void putValidateResponse() throws IOException {
         String location = File.separator+"src" + File.separator + "test" + File.separator + "java" + File.separator + "onboardlearning"
                 + File.separator + "apivalidation"+File.separator;

        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/users/";
        String request = new String(Files.readAllBytes(Paths.get(System.getProperty("user.dir")+location+"Users.json")));
        String response = given().log().all().body(request).when()
                .put("id=5")
                .then().assertThat().statusCode(200)
                .extract().asString();
        System.out.println(response);
    }

    @Test
    public void deleteValidateResponse() throws IOException {
        String location = File.separator+"src" + File.separator + "test" + File.separator + "java" + File.separator + "onboardlearning"
                + File.separator + "apivalidation"+File.separator;

        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/users/";
        String request = new String(Files.readAllBytes(Paths.get(System.getProperty("user.dir")+location+"Users.json")));
        String response = given().log().all().body(request).when()
                .delete("id=5")
                .then().assertThat().statusCode(200)
                .extract().asString();
        System.out.println(response);
    }

    @Test
    public void createValidateResponse() throws IOException {
        String location = File.separator+"src" + File.separator + "test" + File.separator + "java" + File.separator + "onboardlearning"
                + File.separator + "apivalidation"+File.separator;

        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/users";
        String request = new String(Files.readAllBytes(Paths.get(System.getProperty("user.dir")+location+"Users.json")));
        String response = given().log().all().body(request).when()
                .post()
                .then().assertThat().statusCode(201)
                .extract().asString();
        System.out.println(response);
    }
}
