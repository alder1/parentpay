package step_definition;

import DriverInstance.driverInstance;
import Pages.loginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class loginTest extends driverInstance {


    loginPage lp = new loginPage(driver);

    @Given("^I navigate to the landing page of PPay$")
    public void i_navigate_to_the_landing_page_of_PPay() throws Throwable {
        System.out.println("This step navigates to the login page");
    }

    @When("^I click on Login button$")
    public void i_click_on_Login_button() throws Throwable {
        lp.clickLogin();
    }

    @When("^I enter my valid email address/username & my Valid password$")
    public void i_enter_my_valid_email_address_username_my_Valid_password() throws Throwable {
        lp.dologin("alder1.amu@gmail.com", "angel2010");
    }

    @When("^I click on the Login button$")
    public void i_click_on_the_Login_button() throws Throwable {
        lp.loginBtn();

    }

    @When("^I click on Go to PPay$")
    public void i_click_on_Go_to_PPay() throws Throwable {
    lp.OpenPPay();
    }

    @Then("^I should login successfully$")
    public void i_should_login_successfully() throws Throwable {
        Assert.assertTrue(lp.AssertLogin());
    }

}
