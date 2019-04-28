package com.flqf7m.hazi4.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShippingPage {

    private final WebDriver browser;

    By termOfService = By.cssSelector("#cgv");
    By proceedToCheckoutButton = By.cssSelector(".standard-checkout");




    public ShippingPage(WebDriver browser) {
        this.browser = browser;
    }


    public void checkTerms(){
        if ( !browser.findElement(termOfService).isSelected() )
        {
            browser.findElement(termOfService).click();
        }
    }

    public PaymentPage proceedToCheckout(){
        browser.findElement(proceedToCheckoutButton).click();
        return new PaymentPage(browser);
    }

}
