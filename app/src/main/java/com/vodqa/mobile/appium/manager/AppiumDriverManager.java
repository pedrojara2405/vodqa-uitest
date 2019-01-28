package com.vodqa.mobile.appium.manager;

import org.openqa.selenium.WebDriver;

import io.appium.java_client.AppiumDriver;;

public class AppiumDriverManager {

    private WebDriver appiumDriver;

    public AppiumDriverManager() {

    }

    /*public static AppiumDriver getDriver() {
        return appiumDriver.get();
    }

    protected static void setDriver(AppiumDriver driver) {
        appiumDriver.set(driver);
    }*/

    /*private AppiumDriver<MobileElement> initialiseDriver(
            Optional<DesiredCapabilities> capabilities)
            throws Exception {
        AppiumDriver<MobileElement> currentDriverSession;
        DesiredCapabilities desiredCapabilities = capabilities.get();
        String remoteWDHubIP = getRemoteWDHubIP();
        if (AppiumDeviceManager.getMobilePlatform().name().equalsIgnoreCase("iOS")) {
            currentDriverSession = new IOSDriver(new URL(remoteWDHubIP),
                    desiredCapabilities);
            LOGGER.info("Session Created for iOS ---- "
                    + currentDriverSession.getSessionId() + "---"
                    + currentDriverSession.getSessionDetail("udid"));
        } else {
            currentDriverSession = new AndroidDriver(new URL(remoteWDHubIP),
                    desiredCapabilities);
            LOGGER.info("Session Created for Android ---- "
                    + currentDriverSession.getSessionId() + "---"
                    + currentDriverSession.getSessionDetail("udid"));
        }

        return currentDriverSession;
    }

    private String getRemoteWDHubIP() throws Exception {
        String hostName = AppiumDeviceManager.getAppiumDevice().getHostName();
        IAppiumManager appiumManager = AppiumManagerFactory.getAppiumManager(hostName);
        return appiumManager.getRemoteWDHubIP(hostName);
    }

    private void startAppiumDriverInstance(Optional<DesiredCapabilities> desiredCapabilities)
            throws Exception {
        AppiumDriver<MobileElement> currentDriverSession;
        currentDriverSession = initialiseDriver(desiredCapabilities);
        AppiumDriverManager.setDriver(currentDriverSession);
    }

    // Should be used by Cucumber as well
    public void startAppiumDriverInstance() throws Exception {
        String userSpecifiedCaps;
        DesiredCapabilities desiredCapabilities;
        userSpecifiedCaps = getCapsPath();
        desiredCapabilities = buildDesiredCapabilities(userSpecifiedCaps);
        startAppiumDriverInstance(Optional.ofNullable(desiredCapabilities));
    }

    private String getCapsPath() {
        if (prop.getProperty("CAPS") == null) {
            return System.getProperty("user.dir")
                    + "/caps/capabilities.json";
        } else {
            return prop.getProperty("CAPS");
        }
    }

    private DesiredCapabilities buildDesiredCapabilities(String capabilityPath)
            throws Exception {
        String capabilities = capabilityPath;
        if (new File(capabilityPath).exists()) {
            Path path = FileSystems.getDefault().getPath(capabilityPath);
            if (!path.getParent().isAbsolute()) {
                capabilities = path.normalize()
                        .toAbsolutePath().toString();
            }
            if (AppiumDeviceManager.getMobilePlatform().equals(MobilePlatform.ANDROID)) {
                desiredCapabilityBuilder
                        .buildDesiredCapability("android", capabilities);
            } else {
                desiredCapabilityBuilder
                        .buildDesiredCapability("iOS", capabilities);
            }
            return DesiredCapabilityBuilder.getDesiredCapability();
        } else {
            System.out.println("Capability file not found");
            return null;
        }
    }

    protected void stopAppiumDriver() throws Exception {
        String OS = System.getProperty("os.name").toLowerCase();
        String command;
        if (AppiumDeviceManager.getAppiumDevice().getDevice().getUdid().length()
                == IOSDeviceConfiguration.IOS_UDID_LENGTH) {
            String hostName = AppiumDeviceManager.getAppiumDevice().getHostName();
            AppiumManagerFactory.getAppiumManager(hostName).destoryIOSWebKitProxy(hostName);
        }
        if (AppiumDeviceManager.getAppiumDevice().getChromeDriverPort() > 0) {
            if (OS.contains("mac")) {
                command = "kill -9 $(lsof -ti tcp:"
                        + AppiumDeviceManager.getAppiumDevice().getChromeDriverPort() + ")";
                new CommandPrompt().runCommand(command);
            }
            AppiumDeviceManager.getAppiumDevice().setChromeDriverPort(0);
        }
        if (AppiumDriverManager.getDriver() != null
                && AppiumDriverManager.getDriver().getSessionId() != null) {
            LOGGER.info("Session Deleting ---- "
                    + AppiumDriverManager.getDriver().getSessionId() + "---"
                    + AppiumDriverManager.getDriver().getSessionDetail("udid"));
            AppiumDriverManager.getDriver().quit();
        }
    }*/
}
