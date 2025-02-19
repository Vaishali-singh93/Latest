package onboardlearning.behaviourderiven;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.By.xpath;

public class RegisterUserPage {
    WebDriver driver;
    @FindBy(xpath = "//input[@id='form.firstName']")
    private WebElement firstname;

    @FindBy(xpath = "//input[@id='form.lastName']")
    private WebElement lastname;

    @FindBy(xpath = "//input[@id='form.emailAddress']")
    private WebElement email;

    @FindBy(xpath = "//input[@id='form.password']")
    private WebElement password;

    @FindBy(xpath = "//button[@type='submit' and contains(text(),'Register')]")
    private WebElement registorButton;


    public RegisterUserPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void enterFirstName(String firstName) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].scrollIntoView();",firstname);
        firstname.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].scrollIntoView();",lastname);
        lastname.sendKeys(lastName);
    }

    public void enterEmail(String emailAddress) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].scrollIntoView();",email);
        email.sendKeys(emailAddress);
    }

    public void enterPassword(String pwd) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].scrollIntoView();",password);
        password.sendKeys(pwd);
    }

    public void clickRegisterButton() {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].scrollIntoView();",registorButton);
        registorButton.click();
    }
}
