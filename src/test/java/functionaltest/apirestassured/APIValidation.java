package functionaltest.apirestassured;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;


import static io.restassured.RestAssured.given;

public class APIValidation {

    @Test
    public void validatePostApi(){
        String responsePost = given().log().all().body("{\"name\":\"test\",\"salary\":\"123\",\"age\":\"23\"}")
                .when().post("http://dummy.restapiexample.com/api/v1/create").then().extract().body().asString();
        System.out.println(responsePost);
        JsonPath j = new JsonPath(responsePost);
        String asr = j.getJsonObject("name");
        System.out.println(asr);


    }

    @Test
    public void testingMet(){
        String tes= "var23ui";
        System.out.print(Integer.getInteger(tes));
        RequestSpecification spec = new RequestSpecBuilder().setBaseUri("test").build();
        given().spec(spec).when().body("test").post().then().assertThat().statusCode(200);

    }

    @Test
    public void validateGetApi(){
       String responseGet= given().log().all().get("http://ergast.com/api/f1/2018/last.json").then().extract().body().asString();
        //org.testng.Assert.assertEquals(responseGet.getStatusCode(),200);
        System.out.println(responseGet);
        JsonPath path = new JsonPath(responseGet);
        System.out.println(path.getString("MRData.RaceTable.Races[0].round"));
    }
}
