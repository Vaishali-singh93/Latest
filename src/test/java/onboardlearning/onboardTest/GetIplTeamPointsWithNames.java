package onboardlearning.onboardTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static onboardlearning.onboardTest.Locators.pointsPath;
import static onboardlearning.onboardTest.Locators.team;

public class GetIplTeamPointsWithNames {

    WebDriver driver;
    String launchUrl = "https://www.iplt20.com/points-table/men/2023";
    String pageTitle = "IPL 2024 Points Table | Mens Team Standings and Rankings";
   LinkedHashMap<String,Integer> teamsPoints = new LinkedHashMap<>();


    @BeforeMethod   
    public void setup() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Vaishali_Singh\\Downloads\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void printIplTeamPoints() {
        driver.get(launchUrl);
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertEquals(driver.getTitle(),pageTitle);

        List<WebElement> teamList = driver.findElements(By.xpath(team));
        List<WebElement> pointList = driver.findElements(By.xpath(team+pointsPath));

        for(int i = 0; i<teamList.size();i++) {
            teamsPoints.put(teamList.get(i).getText(),Integer.parseInt(pointList.get(i).getText()));
        }

        teamsPoints.entrySet().stream()
                .forEach(entry -> System.out.println("team: " + entry.getKey() + ", point: " + entry.getValue()));

        Map<Integer, String> pointsTeamsMap = teamsPoints.entrySet().stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.joining(", "))));

        pointsTeamsMap.forEach((points, teams) -> System.out.println(teams + "---" + points));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
