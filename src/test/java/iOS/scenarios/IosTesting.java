package iOS.scenarios;

import iOS.config.iosSetup;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class IosTesting extends iosSetup {

    @BeforeClass
    public void setUp() throws Exception {
        prepareIosSimulator();
    }

    @Test
    public void testApp() {

            driver.tap(1, 100, 100, 1);

    }

    @AfterClass
    public void tearDown() throws Exception {
        Thread.sleep(10000);
        driver.quit();
    }
}
