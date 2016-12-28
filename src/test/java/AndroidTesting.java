import android.configDevice.AndroidSetup;
import android.scenarios.CampsAndroid;
import android.scenarios.MappingAndroid;
import android.scenarios.RegistrationAndroid;
import config.MyListener;
import interfaces.Camps;
import interfaces.Mapping;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyListener.class)
public class AndroidTesting extends AndroidSetup {

    RegistrationAndroid registrationAndroid = new RegistrationAndroid();
    Mapping mappingAndroid = new MappingAndroid();
    Camps camps;

    @BeforeClass
    public void setUp() throws Exception {
        prepareAndroidDevice();
        System.out.println("Android is ready for testing!");
    }

    @AfterClass
    public void tearDown() throws Exception {
        System.out.println("Quit");
        Thread.sleep(5000);
        driver.quit();
    }

    @Test(invocationCount = 10)
    public void validRandomRegistration() throws InterruptedException {
        registrationAndroid.validRandomRegistration(driver);
    }

    @Test
    public void registrationByData() throws InterruptedException {
        registrationAndroid.registrationByData(driver, "mail4@mail.com", "12345678", "Oleh", "Odessa", false);
    }

    @Test(invocationCount = 10)
    public void mapping() throws InterruptedException {
        mappingAndroid.mapper();
    }

    @Test
    public void camps() throws InterruptedException {
        camps = new CampsAndroid();
        camps.createCamp(1);
    }
}
