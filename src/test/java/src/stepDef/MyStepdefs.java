package src.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    @When("you are dummy")
    public void youAreDummy() {
        
    }

    @Given("I am dummy")
    public void iAmDummy() {
        
    }

    @Then("She is Dummy")
    public void sheIsDummy() {
    }

    @When("you are <String> dummy")
    public void youAreStringDummy(String ele) {
    }

    @Given("I am on the same store")
    public void iAmOnTheSameStore() {

    }

    @When("I add a product {string} to the cart")
    public void iAddAProductToTheCart(String productName) {
    }




}
