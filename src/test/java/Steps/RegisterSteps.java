package Steps;

import Pages.RegisterPages;
import net.thucydides.core.steps.ScenarioSteps;

public class RegisterSteps extends ScenarioSteps {
    RegisterPages registerPages;

    public void UserOpenPage(){
        registerPages.open();
    }

    public void registerUser(){
        registerPages.registerUser();
    }

    public void clickButtonRegister(){
        registerPages.clickRegisterButton();
    }

    public void registerSuccess(){
        registerPages.registerSuccess();
    }

}
