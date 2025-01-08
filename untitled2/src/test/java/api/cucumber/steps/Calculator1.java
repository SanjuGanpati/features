package api.cucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Calculator1 {
    @Given("Given I have entered {string} into the calculator")
    public void givenIHaveEnteredIntoTheCalculator(String arg0) {
        System.out.println("givenIHaveEnteredIntoTheCalculator");
    }

    @And("I have entered {int} into the calculator")
    public void iHaveEnteredIntoTheCalculator(int arg0) {
        System.out.println("iHaveEnteredIntoTheCalculator");
    }

    @When("I press add")
    public void iPressAdd() {
        System.out.println("iPressAdd");
    }

    @Then("the result should be {int} on the screen")
    public void theResultShouldBeOnTheScreen(int arg0) {
        System.out.println("theResultShouldBeOnTheScreen");
    }

    @Given("I have entered {} in the calculator")
    public void iHaveEnteredInTheCalculator(String arg0) {
        System.out.println("iHaveEnteredInTheCalculator");
    }
}
