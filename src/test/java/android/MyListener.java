package android;/* Created by Ponomarenko Oleh on 16/11/16. */

import io.appium.java_client.AppiumDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import utilites.Utilities;

public class MyListener extends TestListenerAdapter {

    public static AppiumDriver driver;

    public static AppiumDriver getDriver() {
        return driver;
    }

    public static void setDriver(AppiumDriver driver) {
        MyListener.driver = driver;
    }

    @Override
    public void onTestFailure(ITestResult tr) {

        Utilities.takeScreenShot(this.driver);
        if (this.driver == null) {
            System.out.println("Driver == null!!!");
        }
    }

    @Override
    public void onTestSkipped(ITestResult tr) {
        System.out.println("Test was skipped");
    }

    @Override
    public void onTestSuccess(ITestResult tr) {
        System.out.println("Test is OK");
    }


}