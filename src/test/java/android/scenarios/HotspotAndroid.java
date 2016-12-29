package android.scenarios;/* Created by Ponomarenko Oleh on 29/12/16. */

import android.pages.DrawerPageAndroid;
import android.pages.HotspotsPageAndroid;
import android.pages.MyProfilePageAndroid;
import android.pages.SignUpPageAndroid;
import interfaces.Hotspot;

public class HotspotAndroid implements Hotspot {

    HotspotsPageAndroid hotspotsPageAndroid = new HotspotsPageAndroid();


    @Override
    public void logout() {
        MyProfilePageAndroid myProfilePageAndroid = new MyProfilePageAndroid();
        myProfilePageAndroid.logout();
    }

    @Override
    public void validRandomSignUp() throws InterruptedException {
        SignUpPageAndroid signUpPageAndroid = new SignUpPageAndroid();
        signUpPageAndroid.validRandomSignUp();
    }

    @Override
    public void openHotspots() {
        DrawerPageAndroid drawerPageAndroid = new DrawerPageAndroid();
        drawerPageAndroid.openHotspots();
    }

    @Override
    public void pressSaveHotspot() {
        hotspotsPageAndroid.pressSaveHotspot();
    }

    @Override
    public void enterTag(String hotspotTag) {
        hotspotsPageAndroid.enterTag(hotspotTag);
    }

    @Override
    public void enterHotspotTitle(String hotspotTitle) {
        hotspotsPageAndroid.enterHotspotTitle(hotspotTitle);
    }

    @Override
    public void enterDescription(String hotspotDescription) {
        hotspotsPageAndroid.enterDescription(hotspotDescription);
    }

    @Override
    public void pressCreateHotspotButton() throws InterruptedException {
        hotspotsPageAndroid.pressCreateHotspotButton();
    }
}
