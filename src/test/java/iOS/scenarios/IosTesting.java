package iOS.scenarios;

import iOS.config.iosSetup;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

public class IosTesting extends iosSetup {

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

    @Before
    public void setUp() throws Exception {
        prepareIosSimulator();
    }

    @Test
    public void testApp() {
        try {
            driver.tap(1, 100, 100, 1);
        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(10000);
        driver.quit();
    }
}
