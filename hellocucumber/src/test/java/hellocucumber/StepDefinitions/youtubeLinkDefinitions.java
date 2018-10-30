package hellocucumber.StepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class youtubeLinkDefinitions {

    private String pathToChromeDriver= "..\\hellocucumber\\driver\\chromedriver.exe";
    private WebDriver driver;


    @Given("^I open the Chrome Browser$")
    public void iOpenTheChromeBrowserAndGoToTheDHBWPage() throws Throwable {
        System.setProperty("webdriver.chrome.driver",pathToChromeDriver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @When("^I go to the DHBW Page \"([^\"]*)\" and read the Address$")
    public void iGoToTheDHBWPageAndReadTheAddress(String url) throws Throwable {
        driver.get(url);
    }

    @Then("^The Name should be \"([^\"]*)\"$")
    public void theNameShouldBe(String name) throws Throwable {
        assertEquals(name, driver.findElement(By.className("org")).getText());
    }

    @And("^The Street should be \"([^\"]*)\"$")
    public void theStreetShouldBe(String street) throws Throwable {
        assertEquals(street, driver.findElement(By.className("street-address")).getText());
    }

    @And("^The Postal Code should be \"([^\"]*)\"$")
    public void thePostalCodeShouldBe(String postalCode) throws Throwable {
        assertEquals(postalCode, driver.findElement(By.className("postal-code")).getText());
    }

    @And("^The City should be \"([^\"]*)\"$")
    public void theCityShouldBe(String city) throws Throwable {
        assertEquals(city, driver.findElement(By.className("locality")).getText());
    }
}
