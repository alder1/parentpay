package step_definition;

import DriverInstance.driverInstance;
import Pages.loginPage;
import Pages.logoutPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class logoutTest extends driverInstance {

    loginPage lp= new loginPage(driver);
    logoutPage lop= new logoutPage(driver);

    @Given("^I successfully login to PPay$")
    public void i_successfully_login_to_PPay() throws Throwable {
        lp.clickLogin();
        lp.dologin("alder1.amu@gmail.com","angel2010");
    }

    @When("^I click on the logout button$")
    public void i_click_on_the_logout_button() throws Throwable {
        lop.Logout();
    }

    @Then("^I am able to logout successfully$")
    public void i_am_able_to_logout_successfully() throws Throwable {
        Assert.assertTrue(lop.verifyLogout());
    }

}
