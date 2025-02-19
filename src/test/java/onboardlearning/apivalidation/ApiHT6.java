package onboardlearning.apivalidation;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;

public class ApiHT6 {
    String location = File.separator+"src" + File.separator + "test" + File.separator + "java" + File.separator + "onboardlearning"
            + File.separator + "apivalidation"+File.separator;
    String request;

    @BeforeClass
    public void initialize() {
        RestAssured.baseURI = "https://your-domain.atlassian.net";
    }

    @Test
    public void createDefect() throws IOException {
        request = new String(Files.readAllBytes(Paths.get(System.getProperty("user.dir")+location+"create.json")));
        String res= given()
                .contentType(ContentType.JSON)
                .body(request).when().post("/rest/api/3/issue").then().assertThat().statusCode(201).extract().body().asString();
        System.out.println(res);
    }

    @Test
    public void updateDefect() throws IOException {
        request = new String(Files.readAllBytes(Paths.get(System.getProperty("user.dir")
                +location+"update.json")));
        String res = given()
                .contentType(ContentType.JSON)
                .body(request).when().put("/rest/api/3/issue/1010").then().assertThat().statusCode(200).extract().body().asString();
        System.out.println(res);
    }

    @Test
    public void searchDefect()  {
        String res = given()
                .when().get("/rest/api/3/issue/1010").then().assertThat().statusCode(200).extract().body().asString();
        System.out.println(res);
    }

    @Test
    public void attachDefect()  {
        File file = new File(System.getProperty("user.dir")+location+"test.png");
        String res = given()
                .contentType(ContentType.JSON).multiPart(file)
                .when().post("/rest/api/3/issue/upload").then().assertThat().statusCode(200).extract().body().asString();
        System.out.println(res);
    }

    @Test
    public void deleteDefect()  {
        String res = given()
                .when().delete("/rest/api/3/issue/1010").then().assertThat().statusCode(200).extract().body().asString();
        System.out.println(res);
    }
}
