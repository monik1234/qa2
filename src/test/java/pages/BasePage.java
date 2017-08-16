package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driverx) {
        this.driver = driverx;
        PageFactory.initElements(driverx, this);
        wait = new WebDriverWait(driver, 10);
    }

        public void waitForElementToBeVisible(WebElement element) {
            wait.until(ExpectedConditions.visibilityOf(element));
        }

        public void waitForURLToContain(String partialURL) {
            wait.until(ExpectedConditions.urlContains(partialURL));
    }

}


