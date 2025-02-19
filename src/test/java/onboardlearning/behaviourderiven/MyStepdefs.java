package onboardlearning.behaviourderiven;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import onboardlearning.behaviourderiven.Account;

public class MyStepdefs {
    private Account account;
    @Given("I have a balance of ${int} in my account")
    public void iHaveABalanceOf$InMyAccount(int amount) {
        account=new Account(amount);
        System.out.println("balance of account"+account.getBalance());
    }

    @When("I request ${int}")
    public void iRequest$(int amount) {
       account.requestAmount(amount);
    }

    @Then("${int} should be dispensed")
    public void $ShouldBeDispensed(int amount) {
        System.out.println("amount dispensed:"+account.amountDispensed(amount));
        System.out.println("account balance"+account.getBalance());

    }

}
