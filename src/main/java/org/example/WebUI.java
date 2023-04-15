package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;
import java.sql.Driver;
import java.sql.DriverManager;

public class WebUI {

    WebDriver webDriver;


    /**
     * Hàm click element
     */
    public void clickElement(Object object) {
        WebElement element;
        element = (WebElement) object;
        element.click();
    }
}

