package com.vodqa.mobile.appium.helpers;

import com.vodqa.mobile.appium.manager.AppiumDriverManager;
import com.vodqa.mobile.appium.manager.PageObjectManager;

public class TestContext {
    private AppiumDriverManager appiumDriverManager;
    private PageObjectManager pageObjectManager;

    public TestContext() throws Exception {
        appiumDriverManager = new AppiumDriverManager();
        pageObjectManager = new PageObjectManager(appiumDriverManager.getDriver());
    }

    public AppiumDriverManager getAppiumDriverManager() {
        return appiumDriverManager;
    }

    public PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }
}
