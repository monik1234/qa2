package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{
    protected WebDriver driver;
    @FindBy(name = "username")
    private WebElement usernameInput;
    @FindBy(name = "password")
    private WebElement passwordInput;
    @FindBy(xpath = "//button[text()='Login']")
    private WebElement loginButton;
    @FindBy(xpath = "//div[contains(@class,'alert']")
    private WebElement errorMessage;

    public LoginPage (WebDriver driver) {
        super(driver);
    }

    public void fillInUsername(String username) {
        usernameInput.sendKeys(username);
    }

    public void fillInPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void clickLogin() {
        loginButton.click();
    }

    public String getErrorMessage() {
        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(errorMessage));
        return errorMessage.getText();
    }

    public AccountPage loginAs(String username, String password) {
        fillInUsername(username);
        fillInPassword(password);
        clickLogin();

        return new AccountPage(driver);
    }
}









