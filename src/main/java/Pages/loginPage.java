package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
    WebDriver driver;

    public loginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//*[@id='main-login-button']")
    private WebElement LoginButton;

    @FindBy(id = "email")
    private WebElement EmailOrUsername;

    @FindBy(id = "password")
    private WebElement Password;

    @FindBy(xpath = "//*[@id='loginPanel']/div/form/fieldset/div[2]/button")
    private WebElement Login2;

    @FindBy(id = "body_btnContinue")
    private WebElement GotoPPay;

    @FindBy(xpath = "//*[@id='loginPanel']/div/form/fieldset/div[2]/button")
    private WebElement ConfirmLogin;

    public void clickLogin() throws InterruptedException {
        Thread.sleep(2000);
        LoginButton.click();
    }

    public void dologin(String myemail, String myPassword) throws InterruptedException {
        //cookie.click();

        Thread.sleep(2000);
        EmailOrUsername.sendKeys(myemail);
        Password.sendKeys(myPassword);
        Login2.click();
        GotoPPay.click();
    }

    public void loginBtn() {
        Login2.click();
    }

    public void OpenPPay(){GotoPPay.click();}

    public boolean AssertLogin(){
        return ConfirmLogin.isDisplayed();

    }

    public void pTest(){
        System.out.println("test, test");
    }
}
