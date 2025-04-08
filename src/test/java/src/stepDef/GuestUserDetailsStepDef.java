package src.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;

public class GuestUserDetailsStepDef {
    private WebDriver driver;
    @Given("I'm a guest user")
    public void iMAGuestUser() {
    }

    @And("I have a product in the cart")
    public void iHaveAProductInTheCart() throws InterruptedException {
        By addToCartBtn = By.xpath("//a[@aria-label='Add “Blue Shoes” to your cart']");
        driver.findElement(addToCartBtn).click();
        By viewCartLink=By.xpath("//a[@title='View cart']");
        Thread.sleep(3000);
        driver.findElement(viewCartLink).click();
    }

    @And("I'm on the Checkout page")
    public void iMOnTheCheckoutPage() {
        By proceedToCart=By.xpath("//a[@class='checkout-button button alt wc-forward']");
        driver.findElement(proceedToCart).click();
        By placeOrder=By.id("place_order");
        driver.findElement(placeOrder).click();

    }

    @When("I provide billing details")
    public void iProvideBillingDetails(List<Map<String,String>> billingDetails) {
        By billingfirstName=By.id("billing_first_name");
        By billinglastName=By.id("billing_last_name");
        By companyName=By.id("billing_company");
        By country=By.id("select2-billing_country-container");
        By billingAddress=By.id("billing_address_1");
        By billingCity=By.id("billing_city");
        By billingState=By.id("select2-billing_state-container");
        By zipCode=By.id("billing_postcode");
        By phoneNumber=By.id("billing_phone");
        By emailAddress=By.id("billing_email");
        driver.findElement(billingfirstName).clear();
        driver.findElement(billingfirstName).sendKeys(billingDetails.get(0).get("firstname"));
        driver.findElement(billinglastName).clear();
        driver.findElement(billinglastName).sendKeys(billingDetails.get(0).get("lastname"));
    }

    @And("I place an order")
    public void iPlaceAnOrder() {
    }

    @Then("the order should be placed successfully")
    public void theOrderShouldBePlacedSuccessfully() {
    }
}
