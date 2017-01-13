import android.configDevice.AndroidSetup;
import android.pages.SearchPageAndroid;
import android.pages.SignInPageAndroid;
import android.scenarios.*;
import config.MyListener;
import interfaces.Camps;
import interfaces.Hotspot;
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
        registrationAndroid.registrationByData(driver, "mail6@mail.com", "12345678", "Oleh", "", false);
    }

    @Test(invocationCount = 3)
    public void mapping() throws InterruptedException {
        mappingAndroid.mapper();
    }

    @Test
    public void camps() throws InterruptedException {
        camps = new CampsAndroid();
        camps.createCamp(100);
    }

    @Test
    public void hotspots() throws InterruptedException {
        Hotspot hotspot = new HotspotAndroid();
        hotspot.createHotspot(1);
    }

    @Test
    public void friendship() throws InterruptedException {
        FriendsAndroid friendsAndroid = new FriendsAndroid();
        friendsAndroid.friendship(10);
    }

    @Test
    public void signIn() {
        String email = "";
        String password = "";
        SignInPageAndroid signInPageAndroid = new SignInPageAndroid();
        signInPageAndroid.signInByData(email, password);
    }

    @Test
    public void findUserByName() throws InterruptedException {
        SignInPageAndroid signInPageAndroid = new SignInPageAndroid();
        signInPageAndroid.signInByData("mail@mail.com", "12345678");
        SearchPageAndroid searchPageAndroid = new SearchPageAndroid();
        searchPageAndroid.findUserByName("MF");
    }

    @Test
    public void acceptFriendship() {
        FriendsAndroid friendsAndroid = new FriendsAndroid();
        friendsAndroid.acceptFriendship();
    }


}
