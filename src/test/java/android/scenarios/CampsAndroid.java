package android.scenarios;/* Created by Ponomarenko Oleh on 28/12/16. */

import android.pages.CampsPageAndroid;
import android.pages.DrawerPageAndroid;
import android.pages.MyProfilePageAndroid;
import android.pages.SignUpPageAndroid;
import interfaces.Camps;

public class CampsAndroid implements Camps {

    CampsPageAndroid campsPageAndroid = new CampsPageAndroid();

    @Override
    public void logout() {
        MyProfilePageAndroid myProfilePageAndroid = new
                MyProfilePageAndroid();
        myProfilePageAndroid.logout();
    }

    @Override
    public void validRandomSignUp() throws InterruptedException {
        SignUpPageAndroid signUpPageAndroid = new SignUpPageAndroid();
        signUpPageAndroid.validRandomSignUp();
    }

    @Override
    public void enterStartMessage() {
        campsPageAndroid.enterStartMessage();
    }

    @Override
    public void pressSaveCamp() {
        campsPageAndroid.pressSaveCamp();
    }

    @Override
    public void enterCampTitle() {
        campsPageAndroid.enterCampTitle();
    }

    @Override
    public void pressCreateCamp() {
        campsPageAndroid.pressCreateCamp();
    }

    @Override
    public void selectCampCategory() {
        campsPageAndroid.selectCampCategory();

    }


    @Override
    public void openCamps() {
        DrawerPageAndroid drawerPageAndroid = new DrawerPageAndroid();
        drawerPageAndroid.openCamps();
    }
}
