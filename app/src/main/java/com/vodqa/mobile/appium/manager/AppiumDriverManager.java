package com.vodqa.mobile.appium.manager;

import com.vodqa.mobile.appium.capabilities.DesiredCapabilityBuilder;

import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AppiumDriverManager {

    private static ThreadLocal<AppiumDriver> appiumDriver = new ThreadLocal<>();
    private DesiredCapabilityBuilder desiredCapabilityBuilder;
    private static final Logger LOGGER = Logger.getLogger(Class.class.getName());

    public AppiumDriverManager() {
        desiredCapabilityBuilder = new DesiredCapabilityBuilder();
    }

    public static AppiumDriver getDriver() {
        /*if (appiumDriver == null)
            startAppiumDriverInstance();*/
        return appiumDriver.get();

    }

    protected static void setDriver(AppiumDriver driver) {
        appiumDriver.set(driver);
    }

    private AppiumDriver<MobileElement> initialiseDriver(Optional<DesiredCapabilities> capabilities)
            throws Exception {
        AppiumDriver<MobileElement> currentDriverSession;
        DesiredCapabilities desiredCapabilities = capabilities.get();
        String remoteWDHubIP = getRemoteWDHubIP();

        currentDriverSession = new AndroidDriver(new URL(remoteWDHubIP), desiredCapabilities);
        currentDriverSession.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        LOGGER.info("Session Created for Android ---- "
                + currentDriverSession.getSessionId() + "---"
                + currentDriverSession.getSessionDetail("udid"));

        return currentDriverSession;
    }

    private String getRemoteWDHubIP() throws Exception {
        return "http://127.0.0.1:4723/wd/hub";
    }

    private void startAppiumDriverInstance(Optional<DesiredCapabilities> desiredCapabilities)
            throws Exception {
        AppiumDriver<MobileElement> currentDriverSession;
        currentDriverSession = initialiseDriver(desiredCapabilities);
        AppiumDriverManager.setDriver(currentDriverSession);
    }

    public void startAppiumDriverInstance() throws Exception {
        DesiredCapabilities desiredCapabilities = buildDesiredCapabilities();
        startAppiumDriverInstance(Optional.ofNullable(desiredCapabilities));
    }

    private DesiredCapabilities buildDesiredCapabilities()
            throws Exception {
        //String appPath = "D:/Pedro/git/vodqa-uitest/VodQA.apk";
        String appPath = "VodQA.apk";
        desiredCapabilityBuilder.buildDesiredCapability("android", appPath);
        return DesiredCapabilityBuilder.getDesiredCapability();
    }

    public void stopAppiumDriver() throws Exception {
        if (AppiumDriverManager.getDriver() != null
                && AppiumDriverManager.getDriver().getSessionId() != null) {
            LOGGER.info("Session Deleting ---- "
                    + AppiumDriverManager.getDriver().getSessionId() + "---"
                    + AppiumDriverManager.getDriver().getSessionDetail("udid"));
            //AppiumDriverManager.getDriver().close();
            AppiumDriverManager.getDriver().quit();
        }
    }
}
