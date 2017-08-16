package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class WishList extends BasePage {

    public WishList (WebDriver driver) {
        super(driver);
    }

    LoginPage loginPage = new LoginPage(driver);


}
