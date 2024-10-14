import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Search  extends Base{

    WebDriver driver;
    @AfterMethod
    public void tearDown() {

        driver.quit();
    }

    @BeforeMethod
    public void setup(){


    driver = initializeBrowserAndOpenApplicationURL("edge");

    }

    @Test(description = "search valid product")
    public void verifySearchWithValidProduct(){

    driver.findElement(By.name("search")).sendKeys("HP");
    driver.findElement(By.xpath("//button[contains(@class,'btn-default')]")).click();//div[@id='search']/descendant::button
        Assert.assertTrue(driver.findElement(By.linkText("HP LP3065")).isDisplayed());

    }

    @Test(description = "search valid product",dependsOnMethods = "verifySearchWithValidProduct")
    public void verifySearchWithInvalidProduct(){

        driver.findElement(By.name("search")).sendKeys("Honda");
        driver.findElement(By.xpath("//button[contains(@class,'btn-default')]")).click();//div[@id='search']/descendant::button
        String actualSearchMessage = driver.findElement(By.xpath("//div[@id='content']/p[2]")).getText();
        Assert.assertEquals(actualSearchMessage,"There is no product that matches the search criteria.","Product does not exist");//div[@id='content']/h2/following-sibling::p

    }

    @Test(description = "search valid product",dependsOnMethods = "verifySearchWithValidProduct")
    public void verifySearchWithoutAnyProduct(){

        driver.findElement(By.name("search")).sendKeys("");
        driver.findElement(By.xpath("//button[contains(@class,'btn-default')]")).click();//div[@id='search']/descendant::button
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        String actualSearchMessage = driver.findElement(By.xpath("//div[@id='content']/p[2]")).getText();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        Assert.assertEquals(actualSearchMessage,"There is no product that matches the search criteria.","Search the empty field");//div[@id='content']/h2/following-sibling::p

    }


}
