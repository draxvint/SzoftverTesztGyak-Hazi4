package com.flqf7m.hazi4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.nio.file.FileSystems;

import com.flqf7m.hazi4.pageobjects.MyAccountPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.flqf7m.hazi4.pageobjects.HomePage;
import com.flqf7m.hazi4.pageobjects.LoginPage;

public class OrderTest
{
    private WebDriver browser;

    @Before
    public void Before() {
        String driverPath = FileSystems.getDefault().getPath("src/test/resources/chromedriver").toString();
        System.setProperty("webdriver.chrome.driver", driverPath);

        ChromeOptions options = new ChromeOptions();
        browser = new ChromeDriver(options);
    }

    @Test
    public void loginWithValidCredentialsUsePOs(){
        HomePage homePage = new HomePage(browser);

        LoginPage loginPage = homePage.signIn();
        homePage = loginPage.loginAs("polynar.david@gmail.com", "test1234");
        assertTrue("The account logged in is not the expected one!", homePage.isSignedIn());
    }

    @Test
    public void navigateToHome(){
        MyAccountPage myAccountPage = new MyAccountPage(browser);
        myAccountPage.navigateToHome();
    }



    @After
    public void After() {
        browser.quit();
    }
}
