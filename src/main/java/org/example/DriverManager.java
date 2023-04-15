package org.example;

import org.openqa.selenium.WebDriver;

public class DriverManager {
    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    // driver là biến cục bộ
    public WebDriver getDriver(){
        return driver.get();
    }
}
