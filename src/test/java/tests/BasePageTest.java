package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePageTest {
    WebDriver driver;

    @Before
    public void baseSetUp() {
        driver = new FirefoxDriver();

    }


    @After
    public void baseTearDown() {
        driver.quit ();
    }


}
