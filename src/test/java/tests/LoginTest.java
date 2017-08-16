package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.AccountPage;
import pages.LoginPage;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LoginTest {

    @Test
    public void canLoginWithValidCredentials() throws Exception {
        WebDriver driver = new FirefoxDriver();

        driver.get("http://www.phptravels.net/login");


        LoginPage loginPage = new LoginPage(driver);

//        loginPage.fillInUsername("user@phptravels.com");
//        loginPage.fillInPassword("demouser");
//        loginPage.clickLogin();

        AccountPage accountPageX = loginPage.loginAs("user@phptravels.com", "demouser");
        Thread.sleep(5000);


        assertThat(accountPageX.getPageTitle(), is("Hi, John Smith"));


        driver.quit();
    }

    @Test
    public void cannotLoginWithInvalidUsername() throws Exception {
        WebDriver driver = new FirefoxDriver();

        driver.get("http://www.phptravels.net/login");


        LoginPage loginPage = new LoginPage(driver);

        loginPage.fillInUsername("user@php.com");
        loginPage.fillInPassword("demouser");
        loginPage.clickLogin();


        Thread.sleep(5000);

        driver.quit();

    }

    @Test
    public void cannotLoginWithInvalidPassword() throws Exception {
        WebDriver driver = new FirefoxDriver();

        driver.get("http://www.phptravels.net/login");

        LoginPage loginPage = new LoginPage(driver);

        loginPage.fillInUsername("user@phptravels.com");
        loginPage.fillInPassword("1234");
        loginPage.clickLogin();

        Thread.sleep(5000);

        driver.quit();
    }

    @Test
    public void cannotLoginWithoutPassword() throws Exception {

        WebDriver driver = new FirefoxDriver();

        driver.get("http://www.phptravels.net/login");

        LoginPage loginPage = new LoginPage(driver);

        loginPage.fillInUsername("user@phptravels.com");
        loginPage.clickLogin();

        Thread.sleep(5000);

        driver.quit();


    }
}
