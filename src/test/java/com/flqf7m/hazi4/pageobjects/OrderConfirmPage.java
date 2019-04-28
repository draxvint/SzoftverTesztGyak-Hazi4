package com.flqf7m.hazi4.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderConfirmPage {

    private final WebDriver browser;

    By successAlert = By.cssSelector("#center_column > p.alert.alert-success");



    public OrderConfirmPage(WebDriver browser) {
        this.browser = browser;
    }


    public boolean isSuccess(){
       return browser.findElement(successAlert).isDisplayed();
    }
}
