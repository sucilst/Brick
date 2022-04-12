package Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class RegisterPages extends PageObject {
    @FindBy(id = "firstName")
    WebElement FIRSTNAME_TEXT;

    @FindBy(id = "lastName")
    WebElement LASTNAME_TEXT;

    @FindBy(id = "email")
    WebElement EMAIL_TEXT;

    @FindBy(id = "phoneNumber")
    WebElement PHONENUMBER_TEXT;

    @FindBy(id = "address")
    WebElement ADDRESS_TEXT;

    @FindBy(id = "password")
    WebElement PASSWORD_TEXT;

    @FindBy(id = "confirm_password")
    WebElement CONFIRMPASSWORD_TEXT;

    @FindBy(name = "register")
    WebElement REGISTER_BUTTON;

    @FindBy(id = "swal2-content")
    WebElement REGISTER_SUCCESS;

    static String email;

    public int createRandom(){
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(1000);
    }

    public void registerUser(){
        email = "datatesting"+createRandom()+"@gmail.com";
        FIRSTNAME_TEXT.sendKeys("Data");
        LASTNAME_TEXT.sendKeys("Testing");
        EMAIL_TEXT.sendKeys(email);
        PHONENUMBER_TEXT.sendKeys("+628973788233");
        ADDRESS_TEXT.sendKeys("Alamat Palsu");
        PASSWORD_TEXT.sendKeys("!DataTesting.23");
        CONFIRMPASSWORD_TEXT.sendKeys("!DataTesting.23");
    }

    public void clickRegisterButton(){
        REGISTER_BUTTON.click();
    }

    public void registerSuccess(){
        Assert.assertEquals("Check your email to confirm your registration",REGISTER_SUCCESS.getText());
    }
}
