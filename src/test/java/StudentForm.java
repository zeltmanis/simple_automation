import com.google.common.annotations.VisibleForTesting;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class StudentForm {

    public static WebDriver driver;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        driver.navigate().to("http://zeltmanis-001-site1.dtempurl.com");

    }

    @Test
    public void openStudentRegFoirm() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 10);

        //Open Student Registration Form tab

        WebElement StudentRegForm = driver.findElement(By.xpath("//*[@id='ctl01']/div[3]/div/div[2]/ul/li[4]"));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='ctl01']/div[3]/div/div[2]/ul/li[4]")));
        StudentRegForm.click();
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@id='wrapper']/div/div/section/header/div/h1"), "Student Registration"));

        Thread.sleep(2000);
        //Enters First Name
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='wrapper']/div/div/section/div[1]/div/div[1]/div/input")));
        WebElement EnterName = driver.findElement((By.xpath("//*[@id='wrapper']/div/div/section/div[1]/div/div[1]/div/input")));
        EnterName.sendKeys("Jhonny");

        Thread.sleep(2000);
        //Enter Last Name
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='wrapper']/div/div/section/div[1]/div/div[2]/div/input")));
        WebElement EnterLastName = driver.findElement((By.xpath("//*[@id='wrapper']/div/div/section/div[1]/div/div[2]/div/input")));
        EnterLastName.sendKeys("Bravo");

        Thread.sleep(2000);
        //Enter Phone
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='wrapper']/div/div/section/div[4]/div[1]/div/input")));
        WebElement EnterPhone = driver.findElement((By.xpath("//*[@id='wrapper']/div/div/section/div[4]/div[1]/div/input")));
        EnterPhone.sendKeys("29123456");
        Thread.sleep(2000);


    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
