package com.vodqa.mobile.pageObjects;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.NoSuchElementException;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import static io.appium.java_client.touch.offset.PointOption.point;

public class SamplesListPage {

    private final AppiumDriver _driver;

    public SamplesListPage(AppiumDriver driver) {
        this._driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(className = "UIAKeyboard")
    private AndroidElement keyboard;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"chainedView\"]")
    private AndroidElement nativeViewElement;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"carousel\"]")
    private AndroidElement carouselElement;

    public boolean isDisplayed() {
        return nativeViewElement.isDisplayed();
    }

    public void tapOnCarouselSwipe() {
        carouselElement.click();
    }

    public void scrollDownTo() {

    }

    public AndroidElement ScrollToElement(String by, String using) {
        AndroidElement element = null;
        int numberOfTimes = 10;
        Dimension size = _driver.manage().window().getSize();
        int anchor = (int) (size.width / 2);
        // Swipe up to scroll down
        int startPoint = (int) (size.height - 10);
        int endPoint = 10;

        for (int i = 0; i < numberOfTimes; i++) {
            try {
                new TouchAction(_driver)
                        .longPress(point(anchor, startPoint))
                        .moveTo(point(anchor, endPoint))
                        .release()
                        .perform();
                element = (AndroidElement) _driver.findElement(by, using);
                i = numberOfTimes;
            } catch (NoSuchElementException ex) {
                System.out.println(String.format("Element not available. Scrolling (%s) times...", i + 1));
            }
        }
        return element;
    }
}
