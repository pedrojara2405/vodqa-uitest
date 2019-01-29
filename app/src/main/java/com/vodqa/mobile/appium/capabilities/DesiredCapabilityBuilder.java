package com.vodqa.mobile.appium.capabilities;

import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilityBuilder {

    public static ThreadLocal<DesiredCapabilities> desiredCapabilitiesThreadLocal = new ThreadLocal<>();

    public DesiredCapabilityBuilder() {
        super();

    }

    public static DesiredCapabilities getDesiredCapability() {
        return desiredCapabilitiesThreadLocal.get();
    }

    public void buildDesiredCapability(String platform, String appPath) throws Exception {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        // Set android deviceName desired capability. Set your device name.
        desiredCapabilities.setCapability("deviceName", "Android Emulator");

        // Set android platformName desired capability. It's Android in our case here.
        desiredCapabilities.setCapability("platformName", platform);

        // Set android appPath desired capability. It is
        // VodQA for calculator application.
        // Set your application's appPath if you are using any other app.
        desiredCapabilities.setCapability("app", appPath);

        desiredCapabilitiesThreadLocal.set(desiredCapabilities);
    }
}
