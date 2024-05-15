import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Multiple_Windows {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver() ;
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//Global wait instead Thread.sleep(10000);
        driver.get("https://omayo.blogspot.com/");
//        driver.findElement(By.xpath("//button[@id='but2']")).click();
//        driver.findElement(By.tagName("input")).click();
//          driver.findElement(By.name("q")).sendKeys("musics");
//          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
//         driver.findElement(By.className("gsc-search-button")).click();
//         driver.findElement(By.xpath("//input[@onclick='launchConfirmation()']")).click();
         driver.findElement(By.linkText("compendiumdev")).click();

//        driver.findElement(By.linkText("Open a popup window")).click();
//        driver.findElement(By.xpath("//div[@class='example']")).getText();

//        driver.findElement(By.className("dropbtn")).click();
////        Thread.sleep(10000);
//
//        //wait only for Gmail
//        WebDriverWait wait  = new WebDriverWait(driver,Duration.ofSeconds(50));
//        WebElement gmailOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Gmail")));
////        driver.findElement(By.linkText("Gmail")).click();//We can use web element
//        gmailOption.click();

//        driver.close();
    }

}
