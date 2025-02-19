package functionaltest.seleniumtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.HasDevTools;
import org.openqa.selenium.devtools.v85.log.Log;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

@Listeners
public class SeleniumExercise extends BaseTest {


   public WebDriver driver;
    @BeforeMethod
    public void initializes(){
       System.setProperty("webdriver.chrome.driver","C:\\Users\\Vaishali_Singh\\Downloads\\chromedriverUsage\\chromedriver.exe");
       driver=new ChromeDriver();
    }



   /*
   Launching url and validating error message
    */
    @Test(priority = 1)
    public void validateErrorMessage(){
        driver.get(getData().get("url"));
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@id='nav-signin-tooltip']//span[@class='nav-action-inner']")).click();
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("123456789");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        String msg=driver.findElement(By.xpath("//div[@class='a-box-inner a-alert-container']//h4[@class='a-alert-heading']")).getText();
        Assert.assertEquals("Incorrect phone number",msg);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @Test(priority = 1)
    public void clickLink() throws InterruptedException {
//        driver.switchTo().newWindow(WindowType.TAB);

        DevTools ts = ((HasDevTools)driver).getDevTools();
        ts.createSession();
        ts.send(Log.enable());

        ts.addListener(Log.entryAdded(),logEntry -> {
            System.out.println("log-------"+logEntry.getText());
            System.out.println("level-------"+logEntry.getLevel());
        });

        driver.get("https://rahulshettyacademy.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement els = driver.findElement(with(By.xpath("//a[contains(@href, 'sign_up')][text()='Register']")).
                straightLeftOf(By.xpath("//a[contains(@href, 'sign_in')][text()='Login']")));
        els.click();

    }

    @AfterMethod
    public void testing(){ driver.quit();

    }

//    @Test
//    public void findInList(){
//
//        driver.get(getData().get("https://www.inmotionhosting.com/"));
//        driver.manage().window().maximize();
//        driver.findElement(By.xpath("//div[@class='nav-left']//a[@id='nav-hamburger-menu']//i")).click();
//        driver.findElement(By.xpath("//a[@class='hmenu-item']//div[text()='Echo & Alexa']")).click();
//        List<WebElement> list = driver.findElements(By.xpath("//div[@id='hmenu-content']//a[contains(text(),'Echo')]"));
//        for(WebElement m:list){
//            if(m.getText().equalsIgnoreCase("Echo Show 5")){
//                m.click();
//                driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//                break;
//            }
//        }
//
//
//    }
//
//    @Test
//    public void sendKeys(){
//        driver.get(getData().get("url2"));
//        driver.manage().window().maximize();
//        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("bhadouria1708@gmail.com");
//        driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Amita@1708");
//        driver.findElement(By.xpath("//button[@name='login']")).click();
//        driver.findElement(By.xpath("//button[@name='submit[Continue12]']")).click();
//
//    }

    @AfterMethod
    public void closeInstances(){
       driver.quit();
    }

}
