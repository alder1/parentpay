package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createMealPage {
    WebDriver driver;
    public createMealPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "body_body_lvConsumerAreas_btnPayForMeals_0")
    private WebElement payForMeal;

    //
    @FindBy(id = "edit-amount")
    private WebElement amount;

    @FindBy(id = "basket-add")
    private WebElement addToBasket;

    @FindBy(xpath = "html/body/form/div[3]/div/div[2]/div[6]/div/div/div/div[2]/p[2]/a" )
    private WebElement viewBasket;

    @FindBy(id = "body_body_PayNow")
    private WebElement payNow;

    @FindBy(xpath = "html/body/div[1]/div/h1")
    private WebElement secureCheckout;

    @FindBy(id = "c_btnCancel")
    private WebElement cancel;

    @FindBy(xpath = "html/body/form/div[3]/div/div[2]/div[6]/div[1]/div/div/h1")
    private WebElement basket;

    @FindBy(xpath = "//*[@id='cmdLogout']")
    private WebElement logOut;

    public void basket(String myAmount) {
    }

      public void PayForMeal() {
          payForMeal.click();
      }
      public void Amount() {
          amount.sendKeys("2.50");

      }
      public void Basket() {
          addToBasket.click();
      }
      public void View() {
          viewBasket.click();
      }
      public void PayNow(){
        payNow.click();

        secureCheckout.isDisplayed();

    }

    public boolean verifysecureCheckout() {
        return secureCheckout.isDisplayed();}
    }

    //public boolean AssertsecureCheckout() {




