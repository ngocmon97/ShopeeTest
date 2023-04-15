package com.shopee.base;

import org.example.WebUI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasePage extends WebUI {


    protected WebDriver webDriver;
    public BasePage(WebDriver driver){
        webDriver = driver;
    }

    /**
     * hàm click tắt quảng cáo
     */
    @FindBy(xpath = "//div[@class='shopee-searchbar']")
    WebElement btnSearchbar;
    public void closePopup() {
        clickElement(btnSearchbar);
    }


}
