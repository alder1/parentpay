package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logoutPage {
    WebDriver driver;
    public logoutPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='cmdLogout']")
    private WebElement LogOut;

    @FindBy(id = "main-login-button")
    private WebElement LoginButton;

    public void Logout(){
        LogOut.click();
    }

    public boolean verifyLogout(){
        return LoginButton.isDisplayed();
    }
}
