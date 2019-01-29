package com.vodqa.mobile.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CarouselSwipePage {

    private final AppiumDriver _driver;

    public CarouselSwipePage(AppiumDriver driver) {
        this._driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

}
