package org.example;

import com.sun.source.tree.IfTree;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

import javax.swing.text.html.HTML;
import java.time.Duration;
import java.util.Collection;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        Thread.sleep(Duration.ofMillis(3000));
//        driver.manage().window().fullscreen();
//        Thread.sleep(Duration.ofMillis(3000));
//        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
        driver.get("https://omayo.blogspot.com/");



//
//        Dimension dimension = new Dimension(200,400);
//        driver.manage().window().setSize(dimension);
//       String name= driver.getClass().getSimpleName();
//        System.out.println(name);




//        driver.findElement(By.id("alert1")).click();
//        driver.findElement(By.name("q"));
//        driver.findElement(By.className("dropbtn")).click();
//        driver.findElement(By.cssSelector("input[value='Login']")).click();
//        driver.findElement(By.xpath("//div[@id='main']/div[7]//input[@value='Login']")).click();

//        WebElement textField1 = (WebElement) driver.findElements(By.id("textbox1"));
//        textField1.clear();
//       textField1.sendKeys("Dmitry Kaufman");
//        textField1.clear();
//        textField1.sendKeys("Yana Kaufman");
//        String text = driver.findElement(By.id("pah")).getText();
//        System.out.println(text);
//        String buttonLabel = driver.findElement(By.name("samename")).getText();
//        System.out.println(buttonLabel);
//        String linkLable = driver.findElement(By.id("link1")).getText();
//        System.out.println(linkLable);
//        String pageTitle = driver.getTitle();
//        System.out.println(pageTitle);
//        String getURL = driver.getCurrentUrl();
//        System.out.println(getURL);;
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//        driver.findElement(By.id("link1")).click();
//        driver.findElement(By.linkText("Open a popup window")).click();
//        Thread.sleep(Duration.ofMillis(3000));
//       String buttonLable = driver.findElement(By.cssSelector("input[title='search'][type='submit']")).getAttribute("value");
//        System.out.println(buttonLable);
//        boolean buttonIsDisplayed = driver.findElement(By.id("hbutton")).isDisplayed();
//        if(buttonIsDisplayed)
//        {
//            System.out.println("Button got displayed on the page");
//        }else
//        {
//            System.out.println("Button is not displayed on the page");
//        }
//        boolean buttonIsEnableStatus = driver.findElement(By.id("but1")).isEnabled();
//        if(buttonIsEnableStatus )
//        {
//            System.out.println("Button Enable on the page");
//        }else
//        {
//            System.out.println("Button is not Enable on the page");
//        }
//        boolean buttonIsSelected = driver.findElement(By.id("checkbox1")).isSelected();
//        if(buttonIsSelected )
//        {
//            System.out.println("Button Selected on the page");
//        }else
//        {
//            System.out.println("Button is not Selected on the page");
//        }
//        Thread.sleep(Duration.ofMillis(3000));
//        driver.navigate().to("https://selenium143.blogspot.com/");
//        Thread.sleep(Duration.ofMillis(3000));
//        driver.navigate().back();
//        Thread.sleep(Duration.ofMillis(3000));
//        driver.navigate().forward();
//        Thread.sleep(Duration.ofMillis(3000));
//        driver.navigate().refresh();
//        Thread.sleep(Duration.ofMillis(3000));
//        driver.close();
//        driver.quit();
//       String getHtml = driver.getPageSource();
//        System.out.println(getHtml);
//        driver.findElement(By.id("input-email")).sendKeys("kaufmandima@gmail.com");
//        Thread.sleep(Duration.ofMillis(3000));
//        driver.findElement(By.id("input-password")).sendKeys("12345");
//        Thread.sleep(Duration.ofMillis(3000));
//        driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input")).click();
//        Thread.sleep(Duration.ofMillis(3000));
//        driver.findElement(By.cssSelector("#column-right > div > a:nth-child(13)")).click();
//        driver.findElement(By.id("input-password")).submit();
//       String textAreaFieldTagName= driver.findElement(By.id("ta1")).getTagName();
//        System.out.println(textAreaFieldTagName);
//       String cssValue= driver.findElement(By.id("blogsmenu")).getCssValue("font");
//        System.out.println(cssValue);
//        Dimension dimension = driver.findElement(By.id("but2")).getSize();
//        System.out.println(dimension.height);
//        System.out.println(dimension.width);
//       Point Location= driver.findElement(By.id("but2")).getLocation();
//        System.out.println(Location.x);
//        System.out.println(Location.y);
//        driver.quit();
//       Rectangle rectangle= driver.findElement(By.id("but2")).getRect();
//        System.out.println(rectangle.getHeight());
//        System.out.println(rectangle.getWidth());
//        System.out.println(rectangle.getX());
//        System.out.println(rectangle.getY());
//        Thread.sleep(Duration.ofMillis(3000));
//      WebElement loginButton= driver.findElement(By.xpath("//button[@value='Login']"));
//      String getText =loginButton.getText();
//        System.out.println(getText);
//        driver.quit();
//        WebElement option = driver.findElement(By.xpath("//select[@id='multiselect1']/option"));
//       String optionText= option.getText();
//        System.out.println(optionText);
//        driver.quit();
//        List<WebElement> options = driver.findElements(By.xpath("//select[@id='multiselect1']/option"));
//       for(WebElement element:options) {
//           System.out.println(element.getText());
//       }
//        driver.quit();


//        List<WebElement> hyperLinks = driver.findElements(By.xpath(" //div[@id='LinkList1']//a"));
//        for(WebElement element:hyperLinks ) {
//            element.click();
//           driver.navigate().back();
////            System.out.println(element.getText());
//        }
//        String path = " (//div[@id='LinkList1']//a)";
//        int numberOfLinks =hyperLinks.size();
//
//        for(int i=1;i<=numberOfLinks;i++)
//        {
//            String elementPath = path+"["+i+"]";
//            driver.findElement(By.xpath(elementPath )).click();
//            driver.navigate().back();
//            hyperLinks.add((WebElement) hyperLinks);
//            System.out.println(hyperLinks);
//            System.out.println("--------------------------");
//        }

//        List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
//        for (WebElement e :allLinks)
//        {
//            if (e.getAttribute("href")!=null)
//        {
//            System.out.println(e.getAttribute("href"));
//        }
//
//        }
//        driver.quit();

        List<WebElement> allInputFields = driver.findElements(By.tagName("input"));
        for (WebElement InputField:allInputFields)
        {
            System.out.println(InputField.getAttribute("type"));
        }

        driver.quit();
    }
}