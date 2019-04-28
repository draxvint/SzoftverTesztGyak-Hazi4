package com.flqf7m.hazi4.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddressPage {

    private final WebDriver browser;

    By addressesAreEquals = By.cssSelector("#addressesAreEquals");
    By addressDeliverySelector = By.cssSelector("#id_address_delivery");
    By proceedToCheckoutButton = By.cssSelector(".standard-checkout");



    public AddressPage(WebDriver browser) {
        this.browser = browser;
    }

    public boolean useTheDeliveryIsChecked(){
        return browser.findElement(addressesAreEquals).isSelected();
    }

    public void selectAnotherAddress(){

        Select dropdown = new Select(browser.findElement(addressDeliverySelector));
        dropdown.selectByVisibleText("My address 2");
    }

    public ShippingPage proceedToCheckout(){
        browser.findElement(proceedToCheckoutButton).click();
        return new ShippingPage(browser);
    }

}
