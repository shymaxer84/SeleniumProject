import com.tutorialsninja.qa.pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Properties;

public class TestNGProjectRegister extends Utilities {

HomePage homePage=new HomePage(driver);
    @BeforeMethod
    public void setup() {
        loadPropertiesFile();
//        String browserName="edge";
        initializeBrowserAndOpenApplicationURL(prop.getProperty("browserName"));
//        driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click(); //span[text()='My Account']
        homePage.clickOnMyAccount();
//        driver.findElement(By.linkText("Register")).click();
        homePage.selectLoginOption();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utilities.IMPLICIT_WAIT_TIME));
    }

    @Test(description = "Register")
    public void Register() {
        driver.findElement(By.id("input-firstname")).sendKeys("Dima");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utilities.IMPLICIT_WAIT_TIME));
        driver.findElement(By.id("input-lastname")).sendKeys("Kauf");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utilities.IMPLICIT_WAIT_TIME));
        driver.findElement(By.id("input-email")).sendKeys(Utilities.generateEmailWithTimeStamp() + "@gmail.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utilities.IMPLICIT_WAIT_TIME));
        driver.findElement(By.id("input-telephone")).sendKeys("456218");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utilities.IMPLICIT_WAIT_TIME));
        driver.findElement(By.id("input-password")).sendKeys("1234567");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utilities.IMPLICIT_WAIT_TIME));
        driver.findElement(By.id("input-confirm")).sendKeys("1234567");
        driver.findElement(By.xpath("//input[@name='newsletter'][@value='1']")).click();
        driver.findElement(By.name("agree")).click();
        driver.findElement(By.xpath("//input[@value='Continue']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utilities.IMPLICIT_WAIT_TIME));
        String actualSuccessHeading = driver.findElement(By.xpath("//div[@id='content']/h1")).getText();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utilities.IMPLICIT_WAIT_TIME));
        Assert.assertEquals(actualSuccessHeading, "Your Account Has Been Created!", "Account Success page is not displayed");


    }

    @Test(dependsOnMethods = "Register", description = "Register")
    public void verifyRegisterInvalid() {
        driver.findElement(By.id("input-firstname")).sendKeys("Dima");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utilities.IMPLICIT_WAIT_TIME));
        driver.findElement(By.id("input-lastname")).sendKeys("Kauf");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utilities.IMPLICIT_WAIT_TIME));
        driver.findElement(By.id("input-email")).sendKeys("kaufmandima@gmail.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utilities.IMPLICIT_WAIT_TIME));
        driver.findElement(By.id("input-telephone")).sendKeys("0187525");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utilities.IMPLICIT_WAIT_TIME));
        driver.findElement(By.id("input-password")).sendKeys("1234567");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utilities.IMPLICIT_WAIT_TIME));
        driver.findElement(By.id("input-confirm")).sendKeys("1234567");
        driver.findElement(By.xpath("//input[@name='newsletter'][@value='1']")).click();
        driver.findElement(By.name("agree")).click();
        driver.findElement(By.xpath("//input[@value='Continue']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utilities.IMPLICIT_WAIT_TIME));
        String actualEmailWarning = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utilities.IMPLICIT_WAIT_TIME));
        Assert.assertEquals(actualEmailWarning, "exceptedMessage", "Your email is already registered ");


    }

    @Test(dependsOnMethods = "verifyRegisterInvalid", description = "Register")
    public void verifyRegisterAccountWithoutFillingAnyDetails() {
        driver.findElement(By.xpath("//input[@value='Continue']")).click();
        String policyWarning = driver.findElement(By.xpath("//div[contains(@class,'alert alert-danger alert-dismissible')]")).getText();
        Assert.assertEquals(policyWarning, dataprop.getProperty("exceptedPolicyWarning"));
        String actualFirstNameWarning = driver.findElement(By.xpath("//input[@id='input-firstname']/following-sibling::div")).getText();
        Assert.assertEquals(actualFirstNameWarning, dataprop.getProperty("exceptedFirstName"), "First Name Warning message is not displayed");
        String actualLastNameWarning = driver.findElement(By.xpath("//input[@id='input-lastname']/following-sibling::div")).getText();
        Assert.assertEquals(actualLastNameWarning, dataprop.getProperty("exceptedLastName"), "Last Name Warning message is not displayed");
        String actualEmailWarning = driver.findElement(By.xpath("//input[@id='input-email']/following-sibling::div")).getText();
        Assert.assertEquals(actualEmailWarning, dataprop.getProperty("exceptedEmail"), "Write email address ");
        String actualPhoneWarning = driver.findElement(By.xpath("//input[@id='input-telephone']/following-sibling::div")).getText();
        Assert.assertEquals(actualPhoneWarning, dataprop.getProperty("exceptedPhoneNumber"), "Phone Warning");
        String actualPasswordWarning = driver.findElement(By.xpath("//input[@id='input-password']/following-sibling::div")).getText();
        Assert.assertEquals(actualPasswordWarning, dataprop.getProperty("exceptedPassword"), "Password Warning");


    }


    @AfterMethod
    public void tearDown() {

        driver.quit();
    }


}
