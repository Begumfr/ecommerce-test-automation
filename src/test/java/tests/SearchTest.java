package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductPage;
import utils.Driver;

public class SearchTest extends BaseTest{

    @Test
    public void searchTest(){


        ProductPage productsPage = new ProductPage(Driver.getDriver());

        productsPage.clickProducts();
        productsPage.searchProduct("tshirt");

        Assert.assertTrue(productsPage.isSearchTextDisplayed());

Driver.quitDriver();
    }

}
