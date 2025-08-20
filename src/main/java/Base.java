import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Base {

    WebDriver driver;
    public Properties prop;
    public Properties dataprop;
    public void loadPropertiesFile()  {

         prop = new Properties();
        File propFile = new File( "src/main/java/com/tutorialsninja/qa/config/config.properties");
        dataprop = new Properties();
        File dataFile = new File("src/main/java/com/tutorialsninja/qa/testdata/testdata.properties");


        try{
            FileInputStream files = new FileInputStream(propFile);
            prop.load(files);
            FileInputStream dataFiles = new FileInputStream(dataFile);
            dataprop.load(dataFiles);
        }catch (Throwable e){

           e.printStackTrace();
        }


    }

    public WebDriver initializeBrowserAndOpenApplicationURL(String browserName) {


        if (browserName.equals("chrome")) {
            driver = new ChromeDriver();

        } else if (browserName.equals("firefox")) {
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("edge")) {//it's doen't matter capital or lower name
            driver = new EdgeDriver();

        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utilities.IMPLICIT_WAIT_TIME));//Global wait instead Thread.sleep(10000);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Utilities.PAGE_WAIT_TIME));
        driver.get(prop.getProperty("url"));
        return driver;

    }


}

