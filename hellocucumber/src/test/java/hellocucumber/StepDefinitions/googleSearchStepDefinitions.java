package hellocucumber.StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class googleSearchStepDefinitions {

    WebDriver driver;
    String pathToChromeDriver= "C:\\Users\\Denis\\Documents\\DHBW\\3. Semester\\Software Engineering\\dev\\chromedriver_win321\\chromedriver.exe";

    @Given("^I open the Chrome Browser and go to \"([^\"]*)\"$")
    public void iOpenTheChromeBrowserAndGoTo(String url) throws Throwable {
        System.setProperty("webdriver.chrome.driver",pathToChromeDriver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    @When("^I write \"([^\"]*)\" into the search bar$")
    public void iWriteIntoTheSearchBar(String keyword) throws Throwable {
        driver.findElement(By.className("gsfi")).sendKeys(keyword);
        Thread.sleep(1000);
    }

    @And("^I klick on the serach button$")
    public void iKlickOnTheSerachButton() throws Throwable {
        driver.findElement(By.className("sbqs_c")).click();
    }

    @Then("^the page title should be set correctly$")
    public void thePageTitleShouldBeSetCorrectly() throws Throwable {
        assertEquals("katzenbabys - Google-Suche", driver.getTitle());
    }

}
