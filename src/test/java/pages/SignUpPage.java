package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage extends BasePage {


    @FindBy(name = "firstname")
    private WebElement firstname;

    @FindBy(name = "lastname")
    private WebElement lastname;

    @FindBy(name = "phone")
    private WebElement phone;

    @FindBy(name = "email")
    private WebElement email;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(name = "confirmpassword")
    private WebElement confirmpassword;

    @FindBy(className = "signupbtn")
    private WebElement signupbutton;

    @FindBy(className = "alert-danger")
    private WebElement errormessage;

    @FindBy (xpath = "//div[@class='panel-heading']")
    private WebElement signUpHeader;

    public SignUpPage(WebDriver driver) {
        super(driver);
    }


    public AccountPage signUpAs(String firstname, String lastname, String phone,
                         String email, String password, String confirmpassword) {

        fillInFirstName(firstname);
        fillInLastName(lastname);
        fillInPhone(phone);
        fillInEmail(email);
        fillInPassword(password);
        fillInConfirmPassword(confirmpassword);
        clickSignUp();

        AccountPage accountPage = new AccountPage(driver);
        return accountPage;

    }

    public void fillInFirstName(String firstName) {
        firstname.sendKeys(firstName);
    }

    public void fillInLastName(String lastName) {
        lastname.sendKeys(lastName);
    }

    public void fillInPhone(String phone) {
        this.phone.sendKeys(phone);
    }

    public void fillInEmail(String email) {
        this.email.sendKeys(email);
    }

    public void fillInPassword(String password) {
        this.password.sendKeys(password);
    }

    public void fillInConfirmPassword(String confirmpassword) {
        this.confirmpassword.sendKeys(confirmpassword);
    }

    public void clickSignUp() {
        signupbutton.click();
    }


    public String getErrorMessage() {
        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(errormessage));
        return errormessage.getText();


    }


    }




