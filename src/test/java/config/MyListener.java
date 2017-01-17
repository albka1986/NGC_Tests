package config;

import iOS.pages.MyProfilePageIOS;
import io.appium.java_client.AppiumDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import utilites.Utilities;

public class MyListener extends TestListenerAdapter {
    public static String platform;
    public static AppiumDriver driver;
    public static String device;

    public static String getPlatform() {
        return platform;
    }

    public static void setPlatform(String platform) {
        MyListener.platform = platform;
    }

    public static String getDevice() {
        return device;
    }

    public static void setDevice(String device) {
        MyListener.device = device;
    }

    public static AppiumDriver getDriver() {
        return driver;
    }

    public static void setDriver(AppiumDriver driver) {
        MyListener.driver = driver;
    }

    @Override
    public void onTestStart(ITestResult result) {
        super.onTestStart(result);
    }

    @Override
    public void onTestFailure(ITestResult tr) {
        Utilities.takeScreenShot(this.driver);
        System.out.println("\n");
        System.out.println("Driver:");
        System.out.println(driver.getCapabilities().getPlatform());
        try {
            new MyProfilePageIOS().logout();
        } catch (InterruptedException e) {
        }

        driver.quit();
    }

    @Override
    public void onTestSkipped(ITestResult tr) {
    }

    @Override
    public void onTestSuccess(ITestResult tr) {
        System.out.println("The tests are OK!!!");
    }


}