package iOS.scenarios;/* Created by Ponomarenko Oleh on 29/12/16. */

import iOS.pages.DrawerPageIOS;
import iOS.pages.HotspotsPageIOS;
import iOS.pages.MyProfilePageIOS;
import iOS.pages.SignUpPageIOS;
import interfaces.Hotspot;

public class HotspotsIOS implements Hotspot {
    HotspotsPageIOS hotspotsPageIOS = new HotspotsPageIOS();

    @Override
    public void logout() throws InterruptedException {
        MyProfilePageIOS myProfilePageIOS = new MyProfilePageIOS();
        myProfilePageIOS.logout();
    }

    @Override
    public void validRandomSignUp() throws InterruptedException {
        SignUpPageIOS signUpPageIOS = new SignUpPageIOS();
        signUpPageIOS.validRandomSignUp();
    }

    @Override
    public void openHotspots() {
        DrawerPageIOS drawerPageIOS = new DrawerPageIOS();
        drawerPageIOS.openHotspots();
    }

    @Override
    public void pressSaveHotspot() {
        hotspotsPageIOS.pressSaveHotspot();
    }

    @Override
    public void enterTag(String hotspotTag) {
        hotspotsPageIOS.enterTag(hotspotTag);
    }

    @Override
    public void enterHotspotTitle(String hotspotTitle) {
        hotspotsPageIOS.enterHotspotTitle(hotspotTitle);
    }

    @Override
    public void enterDescription(String hotspotDescription) {
        hotspotsPageIOS.enterDescription(hotspotDescription);
    }

    @Override
    public void pressCreateHotspotButton() throws InterruptedException {
        hotspotsPageIOS.pressCreateHotspotButton();
    }
}
