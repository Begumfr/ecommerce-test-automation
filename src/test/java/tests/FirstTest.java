package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstTest {

    @Test
    public void loginTest(){
        String username="begum";
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com");
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

         driver.findElement(By.cssSelector("a[href='/login']")).click();

        WebElement mailAddress = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[data-qa='login-email']")));
        mailAddress.sendKeys("begumferhan@gmail.com");
        WebElement password= driver.findElement(By.cssSelector("input[data-qa='login-password']"));
        password.sendKeys("130301003");
        WebElement loginbutton= driver.findElement(By.cssSelector("button[data-qa='login-button']"));
        loginbutton.click();




        WebElement loginUser = driver.findElement(By.xpath("//a[contains(text(),'Logged in as')]"));

        String text= loginUser.getText();

        Assert.assertTrue(loginUser.isDisplayed());
        Assert.assertTrue(text.contains(username));

driver.quit();




    }


}
