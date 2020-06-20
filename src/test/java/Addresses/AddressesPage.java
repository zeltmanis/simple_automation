package Addresses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertTrue;

public class AddressesPage {

    WebDriver driver;
    WebDriverWait wait;

    public AddressesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(this.driver, 30);
    }

    private static final String NEW_ADDRESS = "//*[@data-test='create']";

    @FindBy(xpath = NEW_ADDRESS)
    private WebElement new_address;

    public void  getNewAddressButton(){
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NEW_ADDRESS)));
        assertTrue(checkNewAddress().isDisplayed());
    }

    public WebElement checkNewAddress(){
        return new_address;
    }

    public void clickNewAddress(){
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NEW_ADDRESS)));
        new_address.click();
    }
}
