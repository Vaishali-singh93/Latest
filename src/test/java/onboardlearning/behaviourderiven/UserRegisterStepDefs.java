package onboardlearning.behaviourderiven;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


import java.util.concurrent.TimeUnit;

import static onboardlearning.behaviourderiven.BaseTest.getDriver;
import static onboardlearning.behaviourderiven.BaseTest.launchUrl;

public class UserRegisterStepDefs {


    RegisterUserPage registerUserPage;
    LoginPage loginPage;
    @Given("Navigate to online site link <url>")
    public void navigateToOnlineSiteLink(String url) {
        launchUrl(url);
    }

    @And("^user must provides lastname as \"([^\"]*)\"$")
    public void userMustProvidesLastnameAsLastname(String lastname) {
        registerUserPage = new RegisterUserPage(getDriver());
        registerUserPage.enterLastName(lastname);
    }

    @And("^user must provides active email as \"([^\"]*)\"$")
    public void userMustProvidesActiveEmailAsEmailaddress(String email) {
        registerUserPage.enterEmail(email);
    }

    @And("^user must provide password as \"([^\"]*)\"$")
    public void userMustProvidePasswordAsPassword(String password) {
        registerUserPage.enterPassword(password);
    }

    @And("^click on Register button$")
    public void clickOnRegisterButton() {
        registerUserPage.clickRegisterButton();
    }

    @When("^user provides firtsName as \"([^\"]*)\"$")
    public void userProvidesFirtsNameAsFirstname(String firstname) {
        registerUserPage.enterFirstName(firstname);
    }

    @When("^user must provide registered email as \"([^\"]*)\"$")
    public void userMustProvideRegisteredEmailAsEmailaddress(String emailaddress) {
        loginPage.enterEmail(emailaddress);
    }

    @And("^user must provide created password as \"([^\"]*)\"$")
    public void userMustProvideCreatedPasswordAsPassword(String password) {
        loginPage.enterPassword(password);
    }

    @And("click on Login button")
    public void clickOnLoginButton() {
        loginPage.clickOnLoginButton();
    }

    @Given("^Navigate to online site link \"([^\"]*)\"$")
    public void navigateToOnlineSiteLinkUrl(String url) {
        loginPage = new LoginPage(getDriver());
        launchUrl(url);
    }
}
