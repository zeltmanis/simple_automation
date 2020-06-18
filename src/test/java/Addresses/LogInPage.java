package Addresses;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage {
  WebDriver driver;
  WebDriverWait wait;

  public LogInPage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
    this.wait = new WebDriverWait(this.driver, 30);
  }

  private static final String HOME = "//*[@data-test='home']";
    private static final String SIGN_IN = "//*[@data-test='sign-in']";
    private static final String ADDRESSES ="//*[@data-test='addresses']";

  @FindBy(xpath = HOME)
    WebElement home;

    @FindBy(xpath = SIGN_IN)
    private WebElement sign_in;

    @FindBy(xpath = ADDRESSES)
    private WebElement addresses;

  public void clickHome() {
    this.wait.until(ExpectedConditions.elementToBeClickable(By.xpath(HOME)));
        this.home.click();
    }

    public void clickSignIn() {
      this.wait.until(ExpectedConditions.elementToBeClickable(By.xpath(SIGN_IN)));
        this.sign_in.click();
    }

    public void clickAddresses(){
      this.wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ADDRESSES)));
    this.addresses.click();
    }
}
