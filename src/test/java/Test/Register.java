package Test;

import Steps.RegisterSteps;
import cucumber.api.java.en.*;
import net.thucydides.core.annotations.Steps;

public class Register {
    @Steps
    RegisterSteps registerSteps;

    @Given("User open the Register page")
    public void userOpenTheRegisPage() {
        registerSteps.UserOpenPage();
    }

    @When("Do Register")
    public void doRegister() {
        registerSteps.registerUser();
    }

    @And("Click Register")
    public void clickRegister() {
        registerSteps.clickButtonRegister();
    }

    @Then("Register Successfully")
    public void registerSuccess() {
        registerSteps.registerSuccess();
    }
}
