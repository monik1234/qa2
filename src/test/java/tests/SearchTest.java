package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.SearchPage;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class SearchTest {

    @Test
    public void canSearchWithResults() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();

        driver.get("http://www.phptravels.net/blog");

        SearchPage searchPage = new SearchPage(driver);

        searchPage.fillAndClickSearch("canvas");

        Thread.sleep(1000);

        assertThat(searchPage.getPageHeader(), containsString("South Africa"));
    }

}
