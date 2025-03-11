package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.UserRegistrationPage;

public class UserRegistrationTest extends TestBase {

    HomePage homeObject;

    UserRegistrationPage userRegistrationObject;

    @Test
    public void userRegistratSuccessfully(){
        homeObject = new HomePage(driver);
        homeObject.registerClickBtn();
        userRegistrationObject = new UserRegistrationPage(driver);
        userRegistrationObject.userRegisterationInfo("Hala","Ezzat","Halla@gmail.com","Vois","542002H@la");
    }

}
