package com.vodqa.mobile.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private final WebDriver _driver;

    public LoginPage(WebDriver driver) {
        this._driver = driver;
        PageFactory.initElements(driver, this);
    }
}
