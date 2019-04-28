package com.flqf7m.hazi4.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaymentPage {

    private final WebDriver browser;

    By totalPrice = By.cssSelector("#total_price");
    By payByCheque = By.cssSelector("#HOOK_PAYMENT a.cheque");
    By successAlert = By.cssSelector("#center_column > p.alert.alert-success");



    public PaymentPage(WebDriver browser) {
        this.browser = browser;
    }


    public OrderSummaryPage payByCheque(){
        browser.findElement(payByCheque).click();
        return new OrderSummaryPage(browser);
    }

    public String getTotalPrice(){
        return browser.findElement(totalPrice).getText();
    }
}
