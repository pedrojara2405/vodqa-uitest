package com.vodqa.mobile.appium.manager;

import com.vodqa.mobile.pageObjects.CarouselSwipePage;
import com.vodqa.mobile.pageObjects.LoginPage;
import com.vodqa.mobile.pageObjects.SamplesListPage;

import org.openqa.selenium.WebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class PageObjectManager {

    private AppiumDriver _driver;
    private LoginPage _loginPage;
    private SamplesListPage _samplesListPage;
    private CarouselSwipePage _carouselSwipePage;

    public PageObjectManager(AppiumDriver driver) {
        this._driver = driver;
    }

    public LoginPage getLoginPage() {
        return (_loginPage == null) ? _loginPage = new LoginPage(_driver) : _loginPage;
    }

    public SamplesListPage getSamplesListPage() {
        return (_samplesListPage == null) ? _samplesListPage = new SamplesListPage(_driver) : _samplesListPage;
    }

    public CarouselSwipePage getCarouselSwipePage() {
        return (_carouselSwipePage == null) ? _carouselSwipePage = new CarouselSwipePage(_driver) : _carouselSwipePage;
    }
}
