package tests;/* Created by Ponomarenko Oleh on 17/11/16. */

import org.testng.Assert;
import org.testng.annotations.Test;
import utilites.Validation;

public class testValidationMethods {

    Validation validation = new Validation();

    @Test(invocationCount = 10000)
    public void testRandomValidEmail() {
        String s = validation.randomValidEmail();
        Assert.assertTrue(s.length() >= validation.MIN_LENGTH_EMAIL && s.length() <= validation.MAX_LENGTH_EMAIL);
        Assert.assertTrue(s.charAt(0) != '@', s);
        Assert.assertTrue(s.contains("@"));
        Assert.assertTrue(s.contains("."));
    }

    @Test(invocationCount = 1000)
    public void testRandomValidPassword() {
        String s = validation.randomValidPassword();
        Assert.assertTrue(s.length() >= validation.MIN_LENGTH_PASSWORD && s.length() <= validation.MAX_LENGTH_PASSWORD);
    }

    @Test(invocationCount = 1000)
    public void testRandomValidName() {
        String s = validation.randomValidName();
        Assert.assertTrue(s.length() >= validation.MIN_LENGTH_NAME && s.length() <= validation.MAX_LENGTH_NAME);
    }

    @Test(invocationCount = 1000)
    public void testRandomValidLocation() {
        String s = validation.randomValidLocation();
        Assert.assertTrue((s.length() >= validation.MIN_LENGTH_LOCATION && s.length() <= validation.MAX_LENGTH_LOCATION) || s.length() == 0);
    }

    @Test(invocationCount = 1000)
    public void testRandomGender() {
        String s = validation.randomGender();
    }

    @Test(invocationCount = 1000)
    public void testRandomValidFavoriteProduct() {
        String s = validation.randomFavoriteProduct();
        Assert.assertTrue(s.length() == 0 || (s.length() >= validation.MIN_LENGTH_FAVORITE_PRODUCT && s.length() <= validation.MAX_LENGTH_FAVORITE_PRODUCT));
    }

    @Test(invocationCount = 1000)
    public void testRandomValidTag() {
        String s = validation.randomValidTag();
        Assert.assertTrue(s.length() >= validation.MIN_LENGTH_TAG && s.length() <= validation.MAX_LENGTH_TAG);
    }

}
