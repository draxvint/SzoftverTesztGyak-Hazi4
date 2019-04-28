package com.flqf7m.hazi4.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
    private final WebDriver browser;
    private final String homeUrl = "http://automationpractice.com/";

    By signInButtonLocator = By.cssSelector("a.login");
    By myAccountButtonLocator = By.cssSelector("a.account");
    By contactUsButtonLocator = By.linkText("Contact us");
    By successFieldLocator = By.cssSelector("p.alert-success");
    By addDressToCartButton = By.cssSelector("#homefeatured > li.ajax_block_product.col-xs-12.col-sm-4.col-md-3.last-in-line.first-item-of-tablet-line.last-item-of-mobile-line > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default");
    By proceedToCheckoutButton = By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a");

    public HomePage(WebDriver browser) {
        this.browser = browser;
    }

    public LoginPage signIn() {
    	browser.get(homeUrl);
    	browser.findElement(signInButtonLocator).click();
        return new LoginPage(browser);
    }
    
    public ContactUsPage openContactUsPage() {
    	browser.get(homeUrl);
    	browser.findElement(contactUsButtonLocator).click();
        return new ContactUsPage(browser);
    }
    
    public boolean isSignedIn() {
    	WebElement myAccountButton = browser.findElement(myAccountButtonLocator);
        (new WebDriverWait(browser, 5)).until(ExpectedConditions.elementToBeClickable(myAccountButton));

        return myAccountButton.getText().equals("David Polynar");
    }
    
    public boolean isMessageSuccessfullySent() {
        WebElement successField = browser.findElement(successFieldLocator);
        (new WebDriverWait(browser, 5)).until(ExpectedConditions.visibilityOf(successField));

        return successField.getText().equals("Your message has been successfully sent to our team.");
    }

    public CartPage addDressToCart(){
        browser.findElement(addDressToCartButton).click();
        browser.findElement(proceedToCheckoutButton).click();
        return new CartPage(browser);
    }
}
