import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTests extends BaseTest {
    @Test
    public void testValidLogin(){

        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("admin@yourstore.com");
        loginPage.enterPassword("admin");
        loginPage.clickLogin();
        System.out.println("Tite of the page is : " +driver.getTitle());

    }
}
