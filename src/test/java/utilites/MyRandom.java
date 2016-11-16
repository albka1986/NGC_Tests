package utilites;

/* Created by Ponomarenko Oleh on 03/11/16. */

import java.util.Random;

public class MyRandom extends Random {

    final static int SIGN_UP_EMAIL_MIN = 3;
    final static int SIGN_UP_EMAIL_MAX = 30;

    /*
    * Validation:
    * length 2-20 symbols
    * contains: a...z
    */
    public static String randomValidName() {
        int requiredLengthOfName = new Random().nextInt(18) + 2;
        StringBuilder name = new StringBuilder(requiredLengthOfName);
        do {

            name.append((char) (new Random().nextInt(26) + 97));
        }
        while (name.length() != requiredLengthOfName);
        return name.toString();
    }

    /*
    * Validation:
    * 18-999
    */
    public static int randomAge() {
        return new Random().nextInt(982) + 18;
    }

    public static String randomValidEmail() {
        int requiredLengthOfEmail = new Random().nextInt(SIGN_UP_EMAIL_MAX - SIGN_UP_EMAIL_MIN + 1) + SIGN_UP_EMAIL_MIN;
        StringBuilder validEmail = new StringBuilder(requiredLengthOfEmail);
        do {

            validEmail.append((char) (new Random().nextInt(26) + 97));
        }
        while (validEmail.length() != requiredLengthOfEmail);
        validEmail.append("@do.ua");
        return validEmail.toString();
    }

    public static String randomPassword() {
        return "12345678";
    }
}
