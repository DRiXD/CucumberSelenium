package hellocucumber.StepDefinitions;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hellocucumber.Calculator;

import static org.junit.Assert.assertEquals;

public class calculatorStepDefinitions {

    private Calculator calc = new Calculator();
    private int firstNumber;
    private int secondNumber;

    @Given("^I type in (\\d+)$")
    public void iTypeIn(int first){
        firstNumber=first;
    }

    @When("^I add the number (\\d+)$")
    public void iAddTheNumber(int second) {
        secondNumber=second;
    }

    @Then("^The Calculator should add and return (\\d+)$")
    public void theCalculatorShouldAddAndReturn(int sum) {
        assertEquals(sum, calc.add(firstNumber,secondNumber));
    }


    @When("^I type in the number \"([^\"]*)\"$")
    public void iTypeInTheNumber(int second) {
        secondNumber=second;
    }

    @Then("^The Calculator should multiplicate and return \"([^\"]*)\"$")
    public void theCalculatorShouldReturn(int answer) throws Throwable {
        assertEquals(answer, calc.multiplicate(firstNumber,secondNumber));
    }
}
