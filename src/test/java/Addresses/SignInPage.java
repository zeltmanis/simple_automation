package Addresses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage {

    WebDriver driver;
    WebDriverWait wait;

    public SignInPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(this.driver, 30);
    }

    private static final String EMAIL = "//*[@data-test='email']";
    private static final String PASSWORD = "//*[@data-test='password']";
    private static final String SIGN_IN_BUTTON = "//*[@data-test='submit']";

    @FindBy(xpath = EMAIL)
    private WebElement email;

    @FindBy(xpath = PASSWORD)
    private  WebElement password;

    @FindBy(xpath = SIGN_IN_BUTTON)
    private WebElement sign_in_button;

    public void enterEmail(){
        this.wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(EMAIL)));
        email.sendKeys("name@inbox.com");
    }

    public void enterPassword(){
        this.wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(PASSWORD)));
        password.sendKeys("test1234");
    }

    public void clickSignInButton(){
        this.wait.until(ExpectedConditions.elementToBeClickable(By.xpath(SIGN_IN_BUTTON)));
        sign_in_button.click();
    }
}





