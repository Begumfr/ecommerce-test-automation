package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Driver;

public class ProductPage extends BasePage {

    WebDriver driver;

    By productsButton = By.cssSelector("a[href='/products']");
    By searchInput = By.id("search_product");
    By searchButton = By.id("submit_search");
    By searchedText = By.xpath("//h2[contains(text(),'Searched Products')]");
    By productsList = By.xpath("//div[@class='productinfo text-center']");

    public ProductPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickProducts(){
        click(productsButton);
    }

    public void searchProduct(String product){
        type(searchInput, product);
        click(searchButton);
    }

    public boolean isSearchTextDisplayed(){
        return isDisplayed(searchedText);
    }

    public boolean areProductsDisplayed(){
        return Driver.getDriver().findElements(productsList).size() > 0;
    }
}