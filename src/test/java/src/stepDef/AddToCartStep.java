package src.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static base.Base.driver;

public class AddToCartStep {
   private WebDriver driver;

    @Given("I'm on the home page and navigate to the Store page by pressing {string} menu option")
    public void iMOnTheHomePageAndNavigateToTheStorePageByPressingMenuOption(String arg0) {
    }

    @When("I click {string} button next to the product {string}")
    public void iClickButtonNextToTheProduct(String arg0, String arg1) {
    }

    @Then("the {string} button changes and a tick mark is shown on it")
    public void theButtonChangesAndATickMarkIsShownOnIt(String arg0) {
    }

    @Then("{string} link is shown")
    public void linkIsShown(String arg0) {
    }

    @When("I click on the {string} link")
    public void iClickOnTheLink(String arg0) {
    }

    @Then("I am navigated to the cart page")
    public void iAmNavigatedToTheCartPage() {
    }

    @When("I fetch the product name and quantity")
    public void iFetchTheProductNameAndQuantity() {
    }

    @Then("the product name is {string}")
    public void theProductNameIs(String arg0) {
    }

    @And("the product quantity is {int}")
    public void theProductQuantityIs(int arg0) {
    }

    @Given("I'm on the home page")
    public void iMOnTheHomePage() {


    }

    @And("I navigate to the Store page by pressing {string} menu option")
    public void iNavigateToTheStorePageByPressingMenuOption(String arg0) {
    }

    @Given("I'm on the store page")
    public void iMOnTheStorePage() {
        
    }

    @When("I add a {string} to the cart")
    public void iAddAToTheCart(String arg0) throws InterruptedException {
     By addToCartBtn = By.xpath("//a[@aria-label='Add “Blue Shoes” to your cart']");
     driver.findElement(addToCartBtn).click();
     By viewCartLink=By.xpath("//a[@title='View cart']");
     Thread.sleep(3000);
     driver.findElement(viewCartLink).click();
    }
    @Then("I see {int} {string} in the cart")
    public void iSeeInTheCart(Integer quantity, String product) {
     By productName=By.xpath("//a[text()='Blue Shoes']");
     String actualProduct=driver.findElement(productName).getText();
     Assert.assertEquals(product,actualProduct);

 }


}
