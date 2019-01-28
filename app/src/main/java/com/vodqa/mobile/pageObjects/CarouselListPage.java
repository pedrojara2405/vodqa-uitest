package com.vodqa.mobile.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CarouselListPage {

    private final WebDriver _driver;

    public CarouselListPage(WebDriver driver) {
        this._driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigateTo_LoginPage() {
        //_driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
    }
}
