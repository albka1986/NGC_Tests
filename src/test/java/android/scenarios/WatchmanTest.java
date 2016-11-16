package android.scenarios;/* Created by Ponomarenko Oleh on 09/11/16. */

import android.config.AndroidSetup;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static org.testng.FileAssert.fail;

public class WatchmanTest extends AndroidSetup {

    private static String watchedLog;

    protected AndroidDriver driver;

    @BeforeClass
    public void setUp() throws Exception {

    }


    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Rule
    public TestWatcher watchman = new TestWatcher() {
        @Override
        protected void failed(Throwable e, Description description) {
            System.out.println("SAY: FAILED!!! ");
        }

        @Override
        protected void succeeded(Description description) {
            System.out.println(" SAY: SUCCEEDED!!!");
        }
    };

    @Test
    public void fails() {
        fail();
    }

    @Test
    public void succeeds() {
    }

}