package com.vodqa.mobile.pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage {

    private final AppiumDriver _driver;

    public LoginPage(AppiumDriver driver) {
        this._driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    /*@AndroidFindBy(className = "UIAKeyboard")
    private AndroidElement keyboard;*/

    @AndroidFindBy(id = "username")
    private AndroidElement userNameElement;

    @AndroidFindBy(id = "password")
    private AndroidElement passwordElement;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"chainedView\"]")
    private AndroidElement loginElement;

    public boolean isDisplayed() {
        return loginElement.isDisplayed();
    }

    public void clearUserName() {
        userNameElement.clear();
    }

    public void clearPassword() {
        passwordElement.clear();
    }

    public void typeUserName(String name) {
        userNameElement.sendKeys(name);
    }

    public void typePassword(String password) {
        passwordElement.sendKeys(password);
    }

    public void tapOnLogin() {
        loginElement.click();
    }

    /*public void hideKeyboardIfVisible() {
        if (keyboard != null) {
            _driver.hideKeyboard();
        }
    }

    public void login (String name, String password) {
        hideKeyboardIfVisible();
        typeUserName(name);
        typePassword(password);
        tapOnLogin();
    }*/

}
