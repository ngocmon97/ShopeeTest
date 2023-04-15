package com.shopee.testcases;

import com.shopee.base.BaseTest;
import com.shopee.pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PbngocTest extends BaseTest {
    @BeforeClass
    public void init(){
        // chạy trước
        var driver =  getDriver();
        homePage = new HomePage(driver);
    }
    HomePage homePage;

    @Test(priority = 1)
    public void test1(){
        getDriver().navigate().to("https://shopee.vn/");
        homePage.sleep(4);
    }


}
