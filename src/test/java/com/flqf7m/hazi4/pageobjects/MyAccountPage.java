package com.flqf7m.hazi4.pageobjects;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.ui.ExpectedConditions;
        import org.openqa.selenium.support.ui.WebDriverWait;

public class MyAccountPage {

    private final WebDriver browser;

    By homeButton = By.cssSelector("#center_column > ul > li > a");
    By payByCheque = By.cssSelector("#HOOK_PAYMENT a.cheque");
    By successAlert = By.cssSelector("#center_column > p.alert.alert-success");


    public MyAccountPage(WebDriver browser) {
        this.browser = browser;
    }


    public HomePage navigateToHome() {
        browser.findElement(homeButton).click();
        return new HomePage(browser);
    }
}
