package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;
    @BeforeMethod
    public void setUP(){

        driver = new  ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://admin-demo.nopcommerce.com/login");
    }
    @AfterTest
    public void tearDown(){
    if(driver !=null)  {
    driver.quit();

    }
    }
}
