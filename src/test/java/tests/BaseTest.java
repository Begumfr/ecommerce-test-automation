package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.ConfigReader;
import utils.Driver;

public class BaseTest {
    @BeforeMethod
    public void setUp(){
        Driver.getDriver().get(ConfigReader.getProperty("url"));

    }
    @AfterMethod
    public void tearDown(){
        Driver.quitDriver();
    }

}
