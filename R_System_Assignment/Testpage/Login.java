package Testpage;


import org.testng.annotations.Test;

import Base.BaseTest;


public class Login extends BaseTest {
    @Test
    public void ValidCredentialsLogIn() {
        RepoPage.LoginPage loginPage = new RepoPage.LoginPage(driver);

        loginPage.clickLoginLink();
        loginPage.enterUsername("Abhishek123");
        loginPage.enterPassword("abc123");
        loginPage.clickLoginButton();

        // Handle alert and print message
        String alertText = loginPage.handleAlert();
        System.out.println("Alert Message: " + alertText);
    }
}
 