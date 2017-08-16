package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.AccountPage;
import pages.SignUpPage;

import java.util.UUID;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SignUpTest {


    @Test
    public void canSignUpWithValidCredentials() throws InterruptedException {

        WebDriver driver = new FirefoxDriver();

        driver.get("http://phptravels.net/register");

        SignUpPage signUpPage = new SignUpPage(driver);

//        UUID uuid = UUID.randomUUID();
//        String s1 = uuid.toString();
//        String substring = s1.substring(0, 9);
//        String email = substring + "@yahoo.com";

        String email = UUID.randomUUID().toString().substring(0,9) + "@mailnesia.com";
       AccountPage accountPage = signUpPage.signUpAs("Dan", "Popescu",
               "0725635655",email,"123456", "123456");


        Thread.sleep(5000);


        assertThat(accountPage.getPageTitle(), containsString("Hi,"));

    }

    @Test
    public void cannotSignUpWithNoData() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();

        driver.get("http://www.phptravels.net/register");

        SignUpPage signUpPage = new SignUpPage(driver);

        signUpPage.clickSignUp();

        assertThat(signUpPage.getErrorMessage(), containsString("The Email field is required."));

        driver.quit();
    }
}


