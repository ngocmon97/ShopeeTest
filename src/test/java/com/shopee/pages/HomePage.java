package com.shopee.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver){
        super(driver);
    }

    // region INIT ELEMENT
//    @FindBy(xpath = "//div[@id='topActionSwitchLang']")
//    WebElement btnChangeLanguage;

    // endregion
    public void sleep(int second){
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void gotoDashboard(){

    }


    /**
     * ham doi ngon ngu
     * @param language
     */
    public void changeLanguae(String language){
        WebElement btnChangeLanguage = webDriver.findElement(By.xpath("//div[@id='topActionSwitchLang']"));
        clickElement(btnChangeLanguage);
        sleep(1);

        String xpath = "//div[@data-lang='%s']";
        String lblXpath = String.format(xpath, language);
        webDriver.findElement(By.xpath(lblXpath)).click();
    }

    /**
     * ham tim kiem
     * @param value
     */
    public void searchItem(String value){
        WebElement txtSearchItem = webDriver.findElement(By.xpath("//input[@type='search']"));
        txtSearchItem.sendKeys(value);
        WebElement btnSearch = webDriver.findElement(By.xpath("//button[contains(@class,'search-box')]"));
        clickElement(btnSearch);
    }
}
