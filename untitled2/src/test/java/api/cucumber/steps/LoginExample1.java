package api.cucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginExample1 {
    @Given("user on the Home page")
    public void userOnTheHomePage() {
        System.out.println("userOnTheHomePage");
    }

    @When("User Navigate to Login Page")
    public void userNavigateToLoginPage() {
        System.out.println("userNavigateToLoginPage");
    }

    @And("User enters {} and {}")
    public void userEntersAnd(String arg0, String arg1) {
    }

    @Then("Message displayed Login Successfully")
    public void messageDisplayedLoginSuccessfully() {
        System.out.println("messageDisplayedLoginSuccessfully");
    }

}
