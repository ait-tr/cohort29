package com.remindly.fw;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class ApplicationManager {
    AppiumDriver driver;
    DesiredCapabilities capabilities;

    MainScreenHelper mainScreen;
    ReminderHelper reminder;

    public void init() throws MalformedURLException {
        capabilities = new DesiredCapabilities();

        capabilities.setCapability( "platformName", "Android");
        capabilities.setCapability( "platformVersion", "8.0");
        capabilities.setCapability(  "deviceName", "mob");
        capabilities.setCapability(  "automationName", "Appium");
        capabilities.setCapability(   "appPackage", "com.blanyal.remindly");
        capabilities.setCapability(   "appActivity", "com.blanyal.remindme.MainActivity");
        capabilities.setCapability(   "app", "C:/mobile/remindly.apk");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);

        mainScreen = new MainScreenHelper(driver);
        reminder = new ReminderHelper(driver);
    }

    public MainScreenHelper getMainScreen() {
        return mainScreen;
    }

    public ReminderHelper getReminder() {
        return reminder;
    }
}
