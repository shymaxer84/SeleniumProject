import com.google.common.annotations.VisibleForTesting;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestNGProjectLogin {

@Test(description = "Login")
    public void createTestNGLogin() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver() ;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//Global wait instead Thread.sleep(10000);
        driver.get("https://tutorialsninja.com/demo/");
        driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
        Thread.sleep(Duration.ofMillis(3000));
        driver.findElement(By.linkText("Login")).click();
        Thread.sleep(Duration.ofMillis(3000));
        driver.findElement(By.id("input-email")).sendKeys("Kaufmandima@gmail.com");
        Thread.sleep(Duration.ofMillis(3000));
        driver.findElement(By.id("input-password")).sendKeys("12345");
        Thread.sleep(Duration.ofMillis(3000));
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
        Thread.sleep(Duration.ofMillis(3000));
        driver.findElement(By.linkText("Login")).click();
        Thread.sleep(Duration.ofMillis(3000));
        driver.findElement(By.id("input-email")).sendKeys("Kaufmandima@gmail.com");
        Thread.sleep(Duration.ofMillis(3000));
        driver.findElement(By.id("input-password")).sendKeys("123456");
        Thread.sleep(Duration.ofMillis(3000));
        driver.findElement(By.xpath("//input[@value='Login']")).click();
//        Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText().contains("Warning: No match for E-Mail Address and/or Password."));
        driver.close();
    }
}
