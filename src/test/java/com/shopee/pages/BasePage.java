package com.shopee.pages;

import org.example.WebUI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage  {
    protected WebDriver webDriver;
    public BasePage(WebDriver driver){
        webDriver = driver;
    }


    /**
     * Hàm click element
     */
    public void clickElement(Object object) {
        WebElement element;
        element = (WebElement) object;
        element.click();
    }


}
