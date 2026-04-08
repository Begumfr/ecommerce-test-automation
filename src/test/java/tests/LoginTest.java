package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.Driver;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest(){
        String userName="begum";
        String email="begumferhan@gmail.com";
        String password="130301003";

      LoginPage loginPage=new LoginPage(Driver.getDriver());

        loginPage.clickSignUpLogin();
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();

        String actualText = loginPage.getLoggedInUserText();

        Assert.assertTrue(loginPage.isLoggedInUserTextDisplayed());
        Assert.assertTrue(actualText.toLowerCase().contains(userName.toLowerCase()));





    }





}
