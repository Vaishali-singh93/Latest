package onboardlearning.behaviourderiven;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    public static org.openqa.selenium.WebDriver driver;

    @Before
    public void initialize() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Vaishali_Singh\\Downloads\\chromedriver-win64\\chromedriver.exe");
        driver=new org.openqa.selenium.chrome.ChromeDriver();
    }

    @After
    public void closeDriver() {
        driver.quit();
    }

    public static void launchUrl(String url) {
        driver.get(url);
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(5, java.util.concurrent.TimeUnit.SECONDS);
    }

    public static  WebDriver getDriver() {
        return driver;
    }
}
