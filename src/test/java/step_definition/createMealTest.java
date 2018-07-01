package step_definition;

import DriverInstance.driverInstance;
import Pages.createMealPage;
import Pages.loginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class createMealTest extends driverInstance {

    loginPage lp = new loginPage(driver);
    createMealPage cmp= new createMealPage(driver);

    @Given("^I login successfully to PPay$")
    public void i_login_successfully_to_PPay() throws Throwable {
        lp.clickLogin();
        lp.dologin("alder1.amu@gmail.com","angel2010");
    }

    @When("^I click on pay for meal$")
    public void i_click_on_pay_for_meal() throws Throwable {
    cmp.PayForMeal();

    }

    @When("^I enter the amount i would like to pay$")
    public void i_enter_the_amount_i_would_like_to_pay() throws Throwable {
    cmp.Amount();

    }

    @When("^I click on add to basket$")
    public void i_click_on_add_to_basket() throws Throwable {
    cmp.Basket();
    }

    @When("^I click on view basket and pay$")
    public void i_click_on_view_basket_and_pay() throws Throwable {
    cmp.View();
    cmp.PayNow();
    }

    @When("^I click on other payment method$")
    public void i_click_on_other_payment_method() throws Throwable {

    }

    @Then("^The secure checkout page should be displayed$")
    public void the_secure_checkout_page_should_be_displayed() throws Throwable {
        Assert.assertTrue(cmp.verifysecureCheckout());

    }
}
