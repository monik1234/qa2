package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Header extends BasePage {

   @FindBy (xpath ="//img[contains(@class,'logo')]")
    private WebElement logo;

   @FindBy (xpath = "//a[contains(@class,'dropdown-toggle')]")
    private WebElement accountDropDown;

   public Header(WebDriver driver) {
       super(driver);
   }

   public HomePage clickLogo(){
       waitForElementToBeVisible(logo);
       logo.click();
       return new HomePage(driver);

   }






}
