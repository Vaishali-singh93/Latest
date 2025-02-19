package onboardlearning.designpattern.factorypattern;

import org.openqa.selenium.firefox.FirefoxDriver;

import static onboardlearning.behaviourderiven.BaseTest.driver;

public class MyFirefoxDriver implements WebDriverCapabilities {
    public void getDriver() {
        System.out.println("start firefox driver");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Vaishali_Singh\\Downloads\\geckodriver.exe");
        driver=new FirefoxDriver();
        System.out.println("initialized firefox driver");
        driver.quit();
    }
}
