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

public class TestNGProjectRegister extends Utilities {


    @BeforeMethod
    public void setup() {
        String browserName="edge";
        initializeBrowserAndOpenApplicationURL(browserName);
        driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click(); //span[text()='My Account']
        driver.findElement(By.linkText("Register")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test(description = "Register")
    public void Register() {
        driver.findElement(By.id("input-firstname")).sendKeys("Dima");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("input-lastname")).sendKeys("Kauf");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("input-email")).sendKeys(Utilities.generateEmailWithTimeStamp() + "@gmail.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("input-telephone")).sendKeys("456218");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("input-password")).sendKeys("1234567");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.findElement(By.id("input-confirm")).sendKeys("1234567");
        driver.findElement(By.xpath("//input[@name='newsletter'][@value='1']")).click();
        driver.findElement(By.name("agree")).click();
        driver.findElement(By.xpath("//input[@value='Continue']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        String actualSuccessHeading = driver.findElement(By.xpath("//div[@id='content']/h1")).getText();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        Assert.assertEquals(actualSuccessHeading, "Your Account Has Been Created!", "Account Success page is not displayed");


    }

    @Test(dependsOnMethods = "Register", description = "Register")
    public void verifyRegisterInvalid() {
        driver.findElement(By.id("input-firstname")).sendKeys("Dima");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("input-lastname")).sendKeys("Kauf");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("input-email")).sendKeys("kaufmandima@gmail.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("input-telephone")).sendKeys("0187525");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("input-password")).sendKeys("1234567");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("input-confirm")).sendKeys("1234567");
        driver.findElement(By.xpath("//input[@name='newsletter'][@value='1']")).click();
        driver.findElement(By.name("agree")).click();
        driver.findElement(By.xpath("//input[@value='Continue']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        String actualEmailWarning = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']/i")).getText();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        Assert.assertEquals(actualEmailWarning, "Warning: E-Mail Address is already registered!", "Your email is already registered ");

    }

    @Test(dependsOnMethods = "verifyRegisterInvalid", description = "Register")
    public void verifyRegisterAccountWithoutFillingAnyDetails() {
        driver.findElement(By.xpath("//input[@value='Continue']")).click();
        String policyWarning = driver.findElement(By.xpath("//div[contains(@class,'alert alert-danger alert-dismissible')]")).getText();
        Assert.assertEquals(policyWarning, "Warning: You must agree to the Privacy Policy!");
        String actualFirstNameWarning = driver.findElement(By.xpath("//input[@id='input-firstname']/following-sibling::div")).getText();
        Assert.assertEquals(actualFirstNameWarning, "First Name must be between 1 and 32 characters!", "First Name Warning message is not displayed");
        String actualLastNameWarning = driver.findElement(By.xpath("//input[@id='input-lastname']/following-sibling::div")).getText();
        Assert.assertEquals(actualLastNameWarning, "Last Name must be between 1 and 32 characters!", "Last Name Warning message is not displayed");
        String actualEmailWarning = driver.findElement(By.xpath("//input[@id='input-email']/following-sibling::div")).getText();
        Assert.assertEquals(actualEmailWarning, "E-Mail Address does not appear to be valid!", "Write email address ");
        String actualPhoneWarning = driver.findElement(By.xpath("//input[@id='input-telephone']/following-sibling::div")).getText();
        Assert.assertEquals(actualPhoneWarning, "Telephone must be between 3 and 32 characters!", "Phone Warning");
        String actualPasswordWarning = driver.findElement(By.xpath("//input[@id='input-password']/following-sibling::div")).getText();
        Assert.assertEquals(actualPasswordWarning, "Password must be between 4 and 20 characters!", "Password Warning");


    }


    @AfterMethod
    public void tearDown() {

        driver.quit();
    }


}
