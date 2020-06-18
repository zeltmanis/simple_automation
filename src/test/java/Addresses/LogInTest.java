package Addresses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class LogInTest {

    private static final WebDriver driver = new ChromeDriver();

    @Before
    public void setUp()throws Exception {

        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test
    public void logIn() throws InterruptedException {
        driver.get(Utils.BASE_URL);
        LogInPage logInPage = new LogInPage(driver);
        SignInPage signinpage = new SignInPage(driver);
        AddressesPage addressesPage = new AddressesPage(driver);
        logInPage.clickSignIn();
        signinpage.enterEmail();
        signinpage.enterPassword();
        signinpage.clickSignInButton();
        logInPage.clickAddresses();
        Thread.sleep(2000);
        addressesPage.checkNewAddress();
    }

    @After
    public void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
