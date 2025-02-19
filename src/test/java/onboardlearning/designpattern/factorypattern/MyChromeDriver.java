package onboardlearning.designpattern.factorypattern;

import org.openqa.selenium.chrome.ChromeDriver;

import static onboardlearning.behaviourderiven.BaseTest.driver;

public class MyChromeDriver implements WebDriverCapabilities{
    @Override
    public void getDriver() {
        System.out.println("start chrome driver");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Vaishali_Singh\\Downloads\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("initialized chrome driver");
        driver.quit();
    }
}
