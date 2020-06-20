package Addresses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertTrue;

public class NewProfile {



    WebDriver driver;
    WebDriverWait wait;

    public NewProfile(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(this.driver, 30);
    }

    private static final String FIRST_NAME = "//*[contains(@class,'') and text()='First name']";
    private static final String FIRST_NAME_INPUT = "//*[@id='address_first_name']";
    private static final String LAST_NAME_INPUT = "//*[@id='address_last_name']";



    @FindBy(xpath = FIRST_NAME)
    WebElement first_name;

    @FindBy(xpath = FIRST_NAME_INPUT)
    WebElement first_name_input;

    @FindBy(xpath = LAST_NAME_INPUT)
    WebElement last_name_input;

    public void  getFirstName(){
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(FIRST_NAME)));
        assertTrue(checkFirstName().isDisplayed());
    }

    public WebElement checkFirstName(){
        return first_name;
    }

    public void enterFirstName() {
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(FIRST_NAME_INPUT)));
        first_name_input.sendKeys("Mike");
    }

    public void enterLastName() {
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LAST_NAME_INPUT)));
        last_name_input.sendKeys("Johnson");
    }

}
