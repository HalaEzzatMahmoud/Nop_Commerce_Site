package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegistrationPage extends PageBase {
    public UserRegistrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="gender-male")
    WebElement genderRdoBtn;

    @FindBy(id="FirstName")
    WebElement firstNameTxt;

    @FindBy(id="LastName")
    WebElement lastNameTxt;

    @FindBy(id="Email")
    WebElement emailTxt;

    @FindBy(id="Company")
    WebElement companyNameTxt;

    @FindBy(id="Password")
    WebElement passwordTxt;

    @FindBy(id="ConfirmPassword")
    WebElement confirmPassword;

    @FindBy(id="register-button")
    WebElement registerBtn;

    public void userRegisterationInfo(String firstName,String lastName, String email,String companyName,String password){

        genderRdoBtn.click();
        firstNameTxt.sendKeys(firstName);
        lastNameTxt.sendKeys(lastName);
        emailTxt.sendKeys(email);
        companyNameTxt.sendKeys(companyName);
        passwordTxt.sendKeys(password);
        confirmPassword.sendKeys(password);
        registerBtn.click();

    }

}
