package iOS.scenarios;/* Created by Ponomarenko Oleh on 28/12/16. */

import iOS.pages.CampsPageIOS;
import iOS.pages.DrawerPageIOS;
import iOS.pages.MyProfilePageIOS;
import iOS.pages.SignUpPageIOS;
import interfaces.Camps;

public class CampsIOS implements Camps {

    CampsPageIOS camps = new CampsPageIOS();

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
    public void enterStartMessage() {
        camps.enterStartMessage();
    }

    @Override
    public void pressSaveCamp() {
        camps.pressSaveCamp();
    }

    @Override
    public void enterCampTitle() {
        camps.enterCampTitle();
    }

    @Override
    public void pressCreateCamp() {
        camps.pressCreateCamp();
    }

    @Override
    public void selectCampCategory() {
        camps.selectCampCategory();
    }

    @Override
    public void openCamps() {
        new DrawerPageIOS().openCamps();
    }
}
