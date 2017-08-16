package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.HomePage;
import pages.SearchResultsPage;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;


public class HomePageTest {

   @Test
   public void canSearchHotelsAfterCity() {


        WebDriver driver = new FirefoxDriver();

        driver.get("http://www.phptravels.net/");

        HomePage homePage = new HomePage(driver);

       SearchResultsPage searchResultsPage =  homePage.fillAllAndClick("Paris","17/08/2017", "26/08/2017");


        assertThat(searchResultsPage.getSummaryText(), containsString("Summary"));

       }

    }
