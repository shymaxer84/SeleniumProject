import com.google.common.annotations.VisibleForTesting;
import com.tutorialsninja.qa.pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestNGProjectLogin extends Base {

    HomePage homePage = new HomePage(driver);
    @BeforeMethod
    public void setup() {

        loadPropertiesFile();
//        String browserName="edge";
        initializeBrowserAndOpenApplicationURL(prop.getProperty("browserName"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utilities.IMPLICIT_WAIT_TIME));
    }
@Test(description = "Login")
    public void createTestNGLogin()  {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver() ;
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utilities.IMPLICIT_WAIT_TIME));//Global wait instead Thread.sleep(10000);
//        driver.get("https://tutorialsninja.com/demo/");
        driver.get(prop.getProperty(prop.getProperty("url")));
        homePage.clickOnMyAccount();
//        driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utilities.IMPLICIT_WAIT_TIME));
//        driver.findElement(By.linkText("Login")).click();
            homePage.selectLoginOption();




        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utilities.IMPLICIT_WAIT_TIME));
        driver.findElement(By.id("input-email")).sendKeys(prop.getProperty("validEmail"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utilities.IMPLICIT_WAIT_TIME));
        driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("validPassword"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utilities.IMPLICIT_WAIT_TIME));
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
//        Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText().contains("Warning: No match for E-Mail Address and/or Password."));
        driver.close();




    }
    @Test(dependsOnMethods = "createTestNGLogin")
    public void InvalidCredentials() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver() ;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//Global wait instead Thread.sleep(10000);
        driver.get("https://tutorialsninja.com/demo/");
        driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
        Thread.sleep(Utilities.IMPLICIT_WAIT_TIME);
        driver.findElement(By.linkText("Login")).click();
        Thread.sleep(Utilities.IMPLICIT_WAIT_TIME);
        driver.findElement(By.id("input-email")).sendKeys("Kaufmandima@gmail.com");
        Thread.sleep(Utilities.IMPLICIT_WAIT_TIME);
        driver.findElement(By.id("input-password")).sendKeys(dataprop.getProperty("invalidPassword"));
        Thread.sleep(Utilities.IMPLICIT_WAIT_TIME);
        driver.findElement(By.xpath("//input[@value='Login']")).click();
//        Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText().contains("Warning: No match for E-Mail Address and/or Password."));
        driver.close();
    }
}
