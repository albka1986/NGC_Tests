package interfaces;/* Created by Ponomarenko Oleh on 28/11/16. */

import io.appium.java_client.AppiumDriver;

public interface Registration {
    void validRandomSignUp(AppiumDriver driver) throws InterruptedException;

    void logout(AppiumDriver driver) throws InterruptedException;

    default void validRandomRegistration(AppiumDriver driver) throws InterruptedException {
        validRandomSignUp(driver);
        logout(driver);
    }

    void registrationByData(AppiumDriver driver, String email, String password, String name, String location, boolean photo) throws InterruptedException;

}
