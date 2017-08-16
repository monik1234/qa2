package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage {

    @FindBy(xpath = "//div[contains(@class,'summary')]")
    private WebElement summarySearch;

    private WebDriver drivery;

    public SearchResultsPage(WebDriver driver) {
        this.drivery = driver;
        PageFactory.initElements(driver, this);

        }

    public String getSummaryText() {
        return summarySearch.getText();
    }
}

