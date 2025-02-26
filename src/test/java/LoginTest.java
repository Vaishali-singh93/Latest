import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testValidLogin() {
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("loginButton"));

        usernameField.sendKeys("validUser");
        passwordField.sendKeys("validPassword123");
        loginButton.click();

        // Assuming successful login redirects to a dashboard page
        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
    }

    @Test
    public void testInvalidLogin() {
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("loginButton"));

        usernameField.sendKeys("invalidUser");
        passwordField.sendKeys("invalidPassword");
        loginButton.click();

        WebElement errorMessage = driver.findElement(By.id("errorMessage"));
        Assert.assertTrue(errorMessage.isDisplayed());
    }

    @Test
    public void testEmptyUsername() {
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("loginButton"));

        usernameField.sendKeys("");
        passwordField.sendKeys("validPassword123");
        loginButton.click();

        WebElement errorMessage = driver.findElement(By.id("errorMessage"));
        Assert.assertTrue(errorMessage.isDisplayed());
    }

    @Test
    public void testEmptyPassword() {
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("loginButton"));

        usernameField.sendKeys("validUser");
        passwordField.sendKeys("");
        loginButton.click();

        WebElement errorMessage = driver.findElement(By.id("errorMessage"));
        Assert.assertTrue(errorMessage.isDisplayed());
    }

    @Test
    public void testBoundaryValues() {
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("loginButton"));

        // Test minimum boundary values
        usernameField.sendKeys("user1");
        passwordField.sendKeys("pass1234");
        loginButton.click();
        WebElement errorMessage = driver.findElement(By.id("errorMessage"));
        Assert.assertTrue(errorMessage.isDisplayed());

        // Test maximum boundary values
        usernameField.clear();
        passwordField.clear();
        usernameField.sendKeys("user1234567890123");
        passwordField.sendKeys("password123456789012");
        loginButton.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
    }

    @Test
    public void testEquivalentPartitioning() {
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("loginButton"));

        // Test valid partition
        usernameField.sendKeys("validUser");
        passwordField.sendKeys("validPassword123");
        loginButton.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));

        // Test invalid partition
        usernameField.clear();
        passwordField.clear();
        usernameField.sendKeys("invalidUser");
        passwordField.sendKeys("invalidPassword");
        loginButton.click();
        WebElement errorMessage = driver.findElement(By.id("errorMessage"));
        Assert.assertTrue(errorMessage.isDisplayed());
    }
}
