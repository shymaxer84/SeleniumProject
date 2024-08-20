package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;


public class ToBookFlight {

    WebDriver driver = new ChromeDriver() ;
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @Test(description = "Go to the web page")
    public void navigateToHomepage() {


             WebDriverManager.chromedriver().setup();

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://www.issta.co.il/ ");

    }


    @Test(dependsOnMethods = "navigateToHomepage", description = "Search destination")
    public void searchFlights() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement tosearchDestination = driver.findElement(By.xpath("//input[@class='ng-field ng-field-autocomplete ng-field-destination']"));

        tosearchDestination.sendKeys("בודפשט, הונגריה");

        Thread.sleep(3000);
        WebElement targetElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='ng-list-autocomplete']/autocomplete-item[2]/li/a/i")));
        targetElement.click();
        Thread.sleep(3000);
        String actualDestination = tosearchDestination.getAttribute("value");
        String expectedDestination = "בודפשט, הונגריה";
        Assert.assertEquals(actualDestination, expectedDestination, "City and Country are correct");


    }



    @Test(dependsOnMethods = "searchFlights",description = "Choose the Date of the Flight")
    public void chooseDateOfFlight() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='ng-field ng-field-datepicker']")));
            String cMonthAndYear = driver.findElement(By.className("month-name")).getText();
           while (!cMonthAndYear.equals("דצמבר 2024"))
           {

               driver.findElement(By.xpath("//span[@class='next']")).click();
               Thread.sleep(3000);
                cMonthAndYear = driver.findElement(By.className("month-name")).getText();
           }
            driver.findElement(By.xpath("//span[@class='day-number' and text()='15']")).click();
             Thread.sleep(3000);
            driver.findElement(By.xpath("//span[@class='day-number' and text()='20']")).click();
            Thread.sleep(3000);

        Assert.assertEquals(cMonthAndYear, "דצמבר 2024", "Month and Year are correct");

    }

    @Test(dependsOnMethods = "chooseDateOfFlight", description = "How many passengers on the flight")
    public void choosePassengersOnFlight() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        WebElement passengerSpinner = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".ng-passenger-spinners")));
        passengerSpinner.click();


        WebElement addAdultButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@class='passenger-count ng-star-inserted'][1]//button[@class='ng-spinner-add']")));
        addAdultButton.click();
        Thread.sleep(1000);

        WebElement addChildButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@class='passenger-count ng-star-inserted'][2]//button[@class='ng-spinner-add']")));
        addChildButton.click();
        addChildButton.click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//button[@class='ng-btn ng-btn-primary ng-btn-form valid']")).click();
    }

    @Test(dependsOnMethods = "choosePassengersOnFlight", description = "Choose the deal")
    public void reviewFlightDetails() throws InterruptedException {

        Thread.sleep(3000);
        js.executeScript("window.scroll(0,1000)");
        Thread.sleep(3000);
        js.executeScript("window.scroll(0,2000)");
        Thread.sleep(3000);
        js.executeScript("window.scroll(0,2500)");
        Thread.sleep(3000);
        js.executeScript("window.scroll(0,2000)");
        Thread.sleep(3000);
        js.executeScript("window.scroll(0,1500)");
        Thread.sleep(3000);
        js.executeScript("window.scroll(0,0)");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//h2[@title='7Seasons Apartments Budapest']")).click();
    }
    //יש פה כנראה BUG כי זה לא רוצה לעשות SCROLL UP ו DOWN ו לכן גורם לי ללחוץ ולהמשים לדף האחרון,כאילו המערכת לא רואה בגלל שהעמוד לא מצליח לזוז
    @Test(dependsOnMethods = "reviewFlightDetails", description = "CheckoutPage")
    public void  navigateToCheckoutPage() throws InterruptedException {

        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,2000)");
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,3000)");
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,4600)");
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,2000)");
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,1500)");
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,0)");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

        try {

            driver.get("https://www.issta.co.il/dynamic-packages/details.aspx?hid=6615498&fid=130&sourceid=17&flightnumbers=152;535;532;151&fkey=152:U_535:U_532:U_151:U&fdate=15/12/24&tdate=20/12/24&isdomestic=false&dport=639540&rooms=1&adt1=3&chd1=2&chdr1a1=1&chdr1a2=1&code=BUD&dcode=TLV&seid=638597668461689988");

            WebElement rooms = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='#roomsComponent'][1]"))
            );
            rooms.click();
            WebElement roomOptionElement = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.room-option"))
            );

            String roomOptionName = roomOptionElement.getAttribute("data-name");
            System.out.println("Room option name: " + roomOptionName);
            Assert.assertEquals(roomOptionName,"2 Bedrooms Room","Deal is correct");

            if (roomOptionName.contains("2 Bedrooms Room")) {

                WebElement orderButton = wait.until(
                        ExpectedConditions.elementToBeClickable(By.xpath("//li[@class='ancor-item'][4]"))
                );
                js.executeScript("arguments[0].scrollIntoView(true);", orderButton);
                orderButton.click();

            } else {
                System.out.println("Room option does not contain '2 Bedrooms Room'.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


            driver.quit();



    }



}


