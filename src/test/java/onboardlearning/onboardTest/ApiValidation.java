package onboardlearning.onboardTest;

import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;

public class ApiValidation {

    @Test
    public void getResponse()  {
        io.restassured.RestAssured.baseURI = "https://domain.swagger67/v2/123";
        RestAssuredDesResponse response = given().log().all().when()
                .get().as(RestAssuredDesResponse.class);
        System.out.println(response.getDetails());
    }

}
