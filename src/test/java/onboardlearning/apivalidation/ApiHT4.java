package onboardlearning.apivalidation;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Optional;

import static io.restassured.RestAssured.given;

public class ApiHT4 {
    String key = "68deab5939348ae8cf08fff40892b8cd";

    @Test
    public void validateResponse() {
        int a = 999999999;
        JsonPath res = given().when().get("http://api.openweathermap.org/data/2.5/weather?q=hyderabad&appid=" + key).then()
                .statusCode(200).extract().body().jsonPath();
        Assert.assertEquals(res.get("weather[0].main"),"Clouds");

    }

    @Test
    public void validateGetResponse() {
        JsonPath res = given().when().get("https://api.openweathermap.org/data/2.5/weather?lat=17.387140&lon=78.491684&appid=" + key).then()
                .statusCode(200).extract().body().jsonPath();
        Assert.assertEquals(res.get("name"),"Hyderabad");
        Assert.assertEquals(res.get("sys.country"),"IN");
        Assert.assertEquals(res.get("main.temp_min").toString(), "306.4");
        Assert.assertEquals(res.get("main.temp").toString(), "306.4");
    }
}
