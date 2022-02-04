package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoSteps1 {

    @Given("demo line one")
    public void demo_line_one() {
        System.out.println("P1");
    }
    @When("demo line two")
    public void demo_line_two() {

        System.out.println("P2");

    }
    @Then("demo line three")
    public void demo_line_three() {

        System.out.println("P3");

    }


}
