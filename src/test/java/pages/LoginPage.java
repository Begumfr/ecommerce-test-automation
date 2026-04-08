package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    WebDriver driver;

    By signupLoginButton = By.cssSelector("a[href='/login']");
    By emailInput = By.cssSelector("input[data-qa='login-email']");
    By passwordInput = By.cssSelector("input[data-qa='login-password']");
    By loginButton = By.cssSelector("button[data-qa='login-button']");
    By loggedInUserText = By.xpath("//a[contains(text(),'Logged in as')]");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSignUpLogin() {
        click(signupLoginButton);
    }

    public void enterEmail(String email) {
        type(emailInput, email);
    }

    public void enterPassword(String password) {
        type(passwordInput, password);
    }

    public void clickLoginButton() {
        click(loginButton);
    }

    public String getLoggedInUserText() {
        return waitForVisibility(loggedInUserText).getText();
    }

    public boolean isLoggedInUserTextDisplayed() {
        return isDisplayed(loggedInUserText);
    }
}