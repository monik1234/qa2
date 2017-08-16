package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {

    @FindBy(xpath = "//h3[contains(@class,'RTL')]")
    private WebElement helloMessage;

    private WebDriver drivery;

    public AccountPage(WebDriver driverIn) {
        this.drivery = driverIn;
        PageFactory.initElements(driverIn, this);
    }

    public String getPageTitle() {
        return helloMessage.getText();
    }
}

