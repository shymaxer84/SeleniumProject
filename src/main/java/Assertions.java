
import com.sun.source.tree.IfTree;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class Assertions {

    @Test
    public void simpleAssertions()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver() ;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//Global wait instead Thread.sleep(10000);
        driver.get("https://tutorialsninja.com/demo/");

        String ActualTitle = driver.getTitle();
        String ExpectedTitle = "Your Store";
        Assert.assertEquals(ActualTitle,ExpectedTitle);

    }
    @Test
    public void notEquals()
    {
        String name1 ="Yana";
        String name2 ="Dana";
        Assert.assertNotEquals(name1,name2);
    }
    @Test
    public void assertTrue()
    {
        String str ="My name is Dmitry";
        Assert.assertTrue(str.contains("My"));

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//Global wait instead Thread.sleep(10000);
        driver.get("https://tutorialsninja.com/demo/");
        driver.findElement(By.name("search")).sendKeys("HP", Keys.ENTER);
        Assert.assertTrue(driver.findElement(By.linkText("HP LP3065")).isDisplayed());
        driver.quit();

    }
    @Test
    public void assertFalse()
    {
        String str ="My name is Dmitry";
        Assert.assertFalse(str.contains("my"));

    }
    @Test
    public void assertNotNull()
    {
        String str ="My name is Dmitry";
        Assert.assertNotNull(str);
        String str2 =null;
        Assert.assertNull(str2);

    }

    @Test
    public void assertFail() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//Global wait instead Thread.sleep(10000);
        driver.get("https://tutorialsninja.com/demo/");

        if(driver.findElement(By.linkText("MacBook")).isDisplayed())
        {
            Assert.fail("MacBook is displayed, hence failed");
        }
    }

    @Test
    public void softHardAssertions() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//Global wait instead Thread.sleep(10000);
        driver.get("https://tutorialsninja.com/demo/");

        SoftAssert softAssert = new SoftAssert();

        String ActualTitle = driver.getTitle();
        String ExpectedTitle = "Your ABC";//Your Store
       softAssert.assertEquals(ActualTitle,ExpectedTitle);

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://tutorialsninja.com/demo/";
        softAssert.assertEquals(actualURL,expectedURL);


        driver.findElement(By.name("search")).sendKeys("HP", Keys.ENTER);
        softAssert.assertTrue(driver.findElement(By.linkText("HP LP3065")).isDisplayed());
        driver.quit();
        softAssert.assertAll("ExpectedTitle is not equals");




    }

}

