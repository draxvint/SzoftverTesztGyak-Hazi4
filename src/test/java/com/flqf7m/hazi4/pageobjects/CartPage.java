package com.flqf7m.hazi4.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {

    private final WebDriver browser;

    By productQuantityInput = By.cssSelector(".cart_quantity_input.form-control");
    By proceedToCheckoutButton = By.cssSelector(".standard-checkout");




    public CartPage(WebDriver browser) {
        this.browser = browser;
    }

    public void setQuantityToTwo(){
        browser.findElement(productQuantityInput).clear();
        browser.findElement(productQuantityInput).sendKeys("2");
    }

    public AddressPage proceedToCheckout(){
        browser.findElement(proceedToCheckoutButton).click();
        return new AddressPage(browser);
    }

}
