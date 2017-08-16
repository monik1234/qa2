package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {

    @FindBy(name = "s")
    private WebElement searchInput;

    @FindBy(xpath = "//span[contains(@class,'input-group-btn')]/button")
    private WebElement searchButton;

    @FindBy(xpath = "//h3")
    private WebElement header;

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void fillInSearchField(String search) {
        searchInput.sendKeys(search);
    }

    public void clickSearch() {
        searchButton.click();
    }

    public void fillAndClickSearch(String search) {
        fillInSearchField(search);
        clickSearch();
    }

    public String getPageHeader() {
        return header.getText();
    }

}



