package config;

import io.appium.java_client.AppiumDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import utilites.Utilities;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import static utilites.Record.startRecord;
import static utilites.Record.stopVideo;

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

        try {
            startRecord(platform, device);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestFailure(ITestResult tr) {
        try {
            stopVideo("android");
        } catch (IOException | InterruptedException | TimeoutException e) {
            e.printStackTrace();
        }

        Utilities.takeScreenShot(this.driver);
        driver.quit();
    }

    @Override
    public void onTestSkipped(ITestResult tr) {
        System.out.println("Test was skipped");
    }

    @Override
    public void onTestSuccess(ITestResult tr) {
        try {
            stopVideo("android");
        } catch (IOException | InterruptedException | TimeoutException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(120000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Test is OK");

    }


}