package basePlaywrights;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class PlaywrightBaseTest {

protected Playwright playwright;
protected Browser browser;
protected Page page;
    @BeforeMethod
    public  void setUP(){
         playwright = Playwright.create();
         browser =playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));
         page = browser.newPage();
//         page.navigate("https://www.google.com/");
    }
    @AfterTest
    public void tearDown(){
        if (browser != null){
            browser.close();
        }
        if (playwright != null){
            playwright.close();
        }

    }
}
