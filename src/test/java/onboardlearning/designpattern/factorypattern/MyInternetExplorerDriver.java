package onboardlearning.designpattern.factorypattern;

import org.openqa.selenium.ie.InternetExplorerDriver;
import static onboardlearning.behaviourderiven.BaseTest.driver;

public class MyInternetExplorerDriver implements WebDriverCapabilities {
    @Override
    public void getDriver() {
        System.out.println("start IE browser");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Vaishali_Singh\\Downloads\\IEDriverServer.exe");
        driver=new InternetExplorerDriver();
        System.out.println("initialized IE browser");
        driver.quit();
    }
}
