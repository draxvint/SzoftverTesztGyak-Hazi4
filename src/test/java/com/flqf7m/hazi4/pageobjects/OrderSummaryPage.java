package com.flqf7m.hazi4.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderSummaryPage {

    private final WebDriver browser;

    By confirmButton = By.cssSelector("#cart_navigation > button");
    By successAlert = By.cssSelector("#center_column > p.alert.alert-success");



    public OrderSummaryPage(WebDriver browser) {
        this.browser = browser;
    }


    public void confirm(){
        browser.findElement(confirmButton).click();
    }
}
