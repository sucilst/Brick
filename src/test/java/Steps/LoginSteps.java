package Steps;

import Pages.LoginPages;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginSteps extends ScenarioSteps {
    LoginPages loginPages;

    public void clickButtonLogin(){
        loginPages.clickLoginButton();
    }

    public void doLogin(){
        loginPages.doLogin();
    }

    public void loginSuccess(){
        loginPages.loginSuccess();
    }

    public void validasiLoginSuccess(){
        loginPages.validasiLogin();
    }
}
