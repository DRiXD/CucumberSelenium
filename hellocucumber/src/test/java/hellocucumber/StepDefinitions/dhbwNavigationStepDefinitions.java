package hellocucumber.StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dhbwNavigationStepDefinitions {

    private String pathToChromeDriver= "..\\hellocucumber\\driver\\chromedriver.exe";
    private WebDriver driver;

    @Given("^I open the Chrome Browser and go to the Page \"([^\"]*)\"$")
    public void iOpenTheChromeBrowserAndGoToThePage(String url) throws Throwable {
        System.setProperty("webdriver.chrome.driver",pathToChromeDriver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    @When("^I click on the navigation menu button$")
    public void iClickOnTheNavigationMenuButton() throws Throwable {

        driver.findElement(By.id("show-menu")).click();
        Thread.sleep(1000);
    }

    @Then("^The navigation menu should scroll down$")
    public void theNavigationMenuShouldScrollDown() throws Throwable {
        driver.findElement(By.className("fixed"));
    }
}
