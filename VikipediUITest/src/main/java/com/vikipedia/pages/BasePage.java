package com.vikipedia.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class BasePage extends WebDriverHelper{
    private By searchBoxBy = By.name("search");

    public BasePage(WebDriver webDriver) {
        super(webDriver);
    }
    public SearchPage search(String keyword) {
        webDriver.findElement(searchBoxBy).sendKeys(keyword + Keys.ENTER);
        return new SearchPage(webDriver);
    }
    public void enterSearchKeyword(String keyword) {
        webDriver.findElement(searchBoxBy).sendKeys(keyword);
    }
}
