package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginUtils {

    @FindBy(xpath = "//button[text()='Login']")
    private WebElement loginButton;

    public static String TEST_USERNAME = "user@phptravels.com";
    public static String TEST_PASSWORD = "demouser";

    }


