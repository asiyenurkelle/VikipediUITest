package com.vikipedia.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage extends BasePage{
    private By resultTextBy = By.className("searchmatch");
    public SearchPage(WebDriver webDriver) {
        super(webDriver);
    }
    public String getResultText() {
        return webDriver.findElement(resultTextBy).getText();
    }
}
