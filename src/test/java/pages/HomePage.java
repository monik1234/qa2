package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

    @FindBy (xpath = "//span[contains(@class,'select2-chosen')]")
    private WebElement localionLabel;

    @FindBy (xpath = "//*[@id='select2-drop']/div/input")
    private WebElement locationInput;

    @FindBy (name ="checkin")
    private WebElement checkinDateInput;

    @FindBy (name = "checkout")
    private WebElement checkoutDateInput;

    @FindBy (id = "adults")
    private WebElement adultsNumber;

    @FindBy (id = "child")
    private WebElement childsNumber;

    @FindBy (className = "btn-block")
    private WebElement searchButton;

    @FindBy (xpath ="//h2[text()='Featured Hotels']")
    private WebElement homePageHeader;

    public HomePage(WebDriver driver) {
        super(driver);}

    public SearchResultsPage fillAllAndClick(String location, String checkinDate, String checkoutDate)  {
        localionLabel.click();
        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(locationInput));
        locationInput.sendKeys(location);

        new WebDriverWait(driver, 5);
        locationInput.sendKeys(Keys.ENTER);
        new WebDriverWait(driver, 2);


        checkinDateInput.clear();
        checkinDateInput.sendKeys(checkinDate);

        checkoutDateInput.clear();
        checkoutDateInput.sendKeys(checkoutDate);

        Select adultsNumber = new Select(driver.findElement(By.id("adults")));
        adultsNumber.selectByValue("4");

        Select childsNumber = new Select(driver.findElement(By.id("child")));
        childsNumber.selectByVisibleText("1");

        searchButton.click();

        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
        return searchResultsPage;

    }


}

