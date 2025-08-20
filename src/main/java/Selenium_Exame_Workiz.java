import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Selenium_Exame_Workiz {

    WebDriver driver = new ChromeDriver();

    @Test(description = "Login")
    public void createTestNGLogin() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//Global wait instead Thread.sleep(10000);
        driver.get("https://homeassessment.tests.workiz.com/login/");
        Thread.sleep(Duration.ofMillis(3000));
        driver.findElement(By.id("email")).sendKeys("MobileTesting@workiz.com");
        Thread.sleep(Duration.ofMillis(3000));
        driver.findElement(By.id("password")).sendKeys("MobileTesting");
        Thread.sleep(Duration.ofMillis(3000));
        driver.findElement(By.xpath("//a[@class='button _loginBtn signSubmit']")).click();
        Thread.sleep(Duration.ofMillis(3000));
    }

    @Test(dependsOnMethods = "createTestNGLogin", description = "Navigate to the ClientsPage")
    public void navigateToClients() throws InterruptedException {

        driver.findElement(By.xpath("//div[@class='nodeMenu-module__bigWrapper___26zSv'][4]")).click();
        Thread.sleep(Duration.ofMillis(3000));

    }

    @Test(dependsOnMethods = "navigateToClients", description = "Search at Timothy Clarke")
    public void searchPerson() throws InterruptedException {

        WebElement name = driver.findElement(By.xpath("//input[@name='searchString']"));
        name.sendKeys("Timothy Clarke");
        name.click();
        Thread.sleep(Duration.ofMillis(3000));
        driver.findElement(By.xpath("//div[@class='rt-tr -odd']")).click();
        Thread.sleep(Duration.ofMillis(3000));

    }
    @Test(dependsOnMethods = "searchPerson", description = "choose date to the next day")
    public void createScheduale() throws InterruptedException {

        driver.findElement(By.xpath("//button[@class='button  iFfWBzvt7RjPTzzA73jT '][1]")).click();
        Thread.sleep(Duration.ofMillis(3000));
        driver.findElement(By.xpath("//li[@id='create_lead']/a[@data-test-id='components_dialogs_popMenu_a']")).click();
        Thread.sleep(Duration.ofMillis(3000));
        driver.findElement(By.xpath("//input[@id='job_date']")).click();
        Thread.sleep(Duration.ofMillis(3000));
        driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--thu' and text()='10']")).click();
        driver.findElement(By.xpath("//button[@class='button newJob-module__createBtn___15l3R iFfWBzvt7RjPTzzA73jT ']")).click();


    }
}
