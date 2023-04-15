package com.shopee.base;

import com.shopee.pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.sql.Driver;
import java.sql.DriverManager;

public class BaseTest {
    WebDriver driver;

    HomePage homePage;
    public WebDriver getDriver(){
        return driver;
    }

    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @AfterClass
    public void initDriver() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();
    }
}
