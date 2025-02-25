import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testValidLogin() {
        // Positive Scenario: Valid login
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("loginButton"));

        usernameField.sendKeys("validUser");
        passwordField.sendKeys("validPassword");
        loginButton.click();

        // Verify redirection to home page
        Assert.assertEquals(driver.getCurrentUrl(), "http://example.com/home");
    }

    @Test
    public void testInvalidLogin() {
        // Negative Scenario: Invalid login
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("loginButton"));

        usernameField.sendKeys("invalidUser");
        passwordField.sendKeys("invalidPassword");
        loginButton.click();

        // Verify error message
        WebElement errorMessage = driver.findElement(By.id("errorMessage"));
        Assert.assertTrue(errorMessage.isDisplayed());
    }

    @Test
    public void testBoundaryValues() {
        // Boundary Value Testing: Username and password with 50 characters
        String fiftyCharString = "a".repeat(50);

        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("loginButton"));

        usernameField.sendKeys(fiftyCharString);
        passwordField.sendKeys(fiftyCharString);
        loginButton.click();

        // Verify redirection to home page or error message
        // Assuming valid credentials for boundary values
        Assert.assertEquals(driver.getCurrentUrl(), "http://example.com/home");
    }

    @Test
    public void testDomainTesting() {
        // Domain Testing: Valid and invalid inputs
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("loginButton"));

        // Valid input
        usernameField.sendKeys("validUser");
        passwordField.sendKeys("validPassword");
        loginButton.click();
        Assert.assertEquals(driver.getCurrentUrl(), "http://example.com/home");

        // Invalid input
        driver.navigate().back();
        usernameField = driver.findElement(By.id("username"));
        passwordField = driver.findElement(By.id("password"));
        loginButton = driver.findElement(By.id("loginButton"));

        usernameField.sendKeys("invalidUser");
        passwordField.sendKeys("invalidPassword");
        loginButton.click();
        WebElement errorMessage = driver.findElement(By.id("errorMessage"));
        Assert.assertTrue(errorMessage.isDisplayed());
    }

    @Test
    public void testEquivalentPartitioning() {
        // Equivalent Partitioning: Valid and invalid partitions
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("loginButton"));

        // Valid input
        usernameField.sendKeys("validUser");
        passwordField.sendKeys("validPassword");
        loginButton.click();
        Assert.assertEquals(driver.getCurrentUrl(), "http://example.com/home");

        // Invalid input
        driver.navigate().back();
        usernameField = driver.findElement(By.id("username"));
        passwordField = driver.findElement(By.id("password"));
        loginButton = driver.findElement(By.id("loginButton"));

        usernameField.sendKeys("invalidUser");
        passwordField.sendKeys("invalidPassword");
        loginButton.click();
        WebElement errorMessage = driver.findElement(By.id("errorMessage"));
        Assert.assertTrue(errorMessage.isDisplayed