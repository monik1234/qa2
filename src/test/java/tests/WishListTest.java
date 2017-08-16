package tests;

import org.junit.Test;
import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;

import static pages.LoginUtils.TEST_PASSWORD;
import static pages.LoginUtils.TEST_USERNAME;

public class WishListTest extends BasePageTest {


    @Test
    public void canAddHotelToWishlist() {

        driver.get("http://www.phptravels.net/login");
        LoginPage loginPage = new LoginPage(driver);
        AccountPage accountPage = loginPage.loginAs(TEST_USERNAME, TEST_PASSWORD);
        HomePage homePage = accountPage.getH





    }
}
