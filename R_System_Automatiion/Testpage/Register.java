package Testpage;

import org.testng.annotations.Test;

import Base.BaseTest;
import RepoPage.RegisterPage;

public class Register extends BaseTest {
    @Test
    public void ValidCredentialsRegisterPage() {
        RegisterPage registerPage = new RegisterPage(driver);

        registerPage.clickRegisterLink();
        registerPage.enterUsername("Abhishek1234");
        registerPage.enterPassword("abc1234");
        registerPage.clickRegisterButton();
        
        // Handle alert and print message
        String alertText = registerPage.handleAlert();
        System.out.println("Alert Message: " + alertText);
    }
}
