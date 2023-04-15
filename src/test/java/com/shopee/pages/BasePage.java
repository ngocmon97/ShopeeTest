package com.shopee.pages;

import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver webDriver;
    public BasePage(WebDriver driver){
        webDriver = driver;
    }


}
