package functionaltest.behaviordrivenframework;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class StepDefinition {

   WebDriver driver=null;
    @Given("Facebook login site")
    public void facebook_login_site() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Vaishali_Singh\\Downloads\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
    }

    @When("^I fill \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_fill_bhadouria1708_gmail_com_and_amita(String username,String password) {
       driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(password);
    }

    @When("Click on login")
    public void click_on_login() {
        driver.findElement(By.xpath("//button[@name='login']")).click();
    }

    @Then("I Successfully Login")
    public void i_successfully_login() {
        System.out.println("login");
    }
}
