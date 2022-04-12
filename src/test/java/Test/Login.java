package Test;

import Steps.LoginSteps;
import cucumber.api.java.en.*;
import net.thucydides.core.annotations.Steps;

public class Login {
    @Steps
    LoginSteps loginSteps;

    @Given("User open the Login page")
    public void userOpenTheLoginPage() {
        loginSteps.clickButtonLogin();
    }

    @When("Do Login")
    public void doLogin() {
        loginSteps.doLogin();
    }

    @And("Click Login")
    public void clickLogin() {
        loginSteps.loginSuccess();
    }

    @Then("Login Successfully")
    public void loginSuccess() {
        loginSteps.validasiLoginSuccess();
    }
}
