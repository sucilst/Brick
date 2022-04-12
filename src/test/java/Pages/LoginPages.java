package Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class LoginPages extends PageObject {
    @FindBy(xpath = "/html/body/div[2]/div/div[3]/button[1]")
    WebElement OK_BUTTON;

    @FindBy(linkText = "Login")
    WebElement LOGIN_BUTTON;

    @FindBy(id = "your_email")
    WebElement EMAIL_TEXT;

    @FindBy(id = "password")
    WebElement PASSWORD_TEXT;

    @FindBy(name = "login")
    WebElement LOGIN;

    @FindBy(id = "swal2-title")
    WebElement LOGIN_SUCCESS;

    public void clickLoginButton(){
        OK_BUTTON.click();
        LOGIN_BUTTON.click();
    }

    public void doLogin(){
        EMAIL_TEXT.sendKeys(RegisterPages.email);
        PASSWORD_TEXT.sendKeys("!DataTesting.23");
    }

    public void loginSuccess(){
        LOGIN.click();
    }

    public void validasiLogin(){
        Assert.assertEquals("Success",LOGIN_SUCCESS.getText());
    }
}
