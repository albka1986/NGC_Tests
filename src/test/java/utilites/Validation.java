package utilites;


import java.util.Random;

public class Validation {

    // email: - unique; - x@x.x;
    public final static int MIN_LENGTH_EMAIL = 5;

    //Sign Up Page
    public final static int MAX_LENGTH_EMAIL = 30;
    public final static String EMAIL_CONTAINS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_-";
    // password
    public final static int MIN_LENGTH_PASSWORD = 8;
    public final static int MAX_LENGTH_PASSWORD = 18;
    public final static String PASSWORD_CONTAINS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-._";
    /***/
    //ConfirmPassword == password

    // name
    public final static int MIN_LENGTH_NAME = 2;
    public final static int MAX_LENGTH_NAME = 20;
    public final static String NAME_CONTAINS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz-. ";
    // location
    public final static int MIN_LENGTH_LOCATION = 5;
    public final static int MAX_LENGTH_LOCATION = 40;
    public final static String LOCATION_CONTAINS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz /.,";
    /***/
    // Birthday: minAge >= 18;


    public final static String gender[] = {"Male", "Female", "None"};
    // favoriteProduct
    public final static int MIN_LENGTH_FAVORITE_PRODUCT = 2;
    public final static int MAX_LENGTH_FAVORITE_PRODUCT = 20;
    public final static String FAVORITE_PRODUCT_CONTAINS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz _-.";
    // tag: amount of tags: >=1 && <=10;
    public final static int MIN_LENGTH_TAG = 2;
    public final static int MAX_LENGTH_TAG = 15;
    public final static String TAG_CONTAINS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_";
    static Random random = new Random();

    public static String randomValidEmail() {
        int randomLengthOfEmail = random.nextInt(MAX_LENGTH_EMAIL - MIN_LENGTH_EMAIL + 1) + MIN_LENGTH_EMAIL;
        StringBuilder validEmail = new StringBuilder(randomLengthOfEmail);
        String x = "";
        String y = "";
        String z = "";

        do {
            int numberRandomChar = random.nextInt(EMAIL_CONTAINS.length());
            char randomChar = EMAIL_CONTAINS.charAt(numberRandomChar);

            int switcher = random.nextInt(3);
            switch (switcher) {
                case 0:
                    x += randomChar;
                    break;
                case 1:
                    y += randomChar;
                    break;
                case 2:
                    z += randomChar;
                    break;
            }
        }
        while ((x.length() + y.length() + z.length()) != randomLengthOfEmail - 2);
        validEmail = validEmail.append(x).append("@").append(y).append(".").append(z);
        return validEmail.toString();
    }

    public static String randomValidPassword() {
        int randomLengthPassword = random.nextInt(MAX_LENGTH_PASSWORD - MIN_LENGTH_PASSWORD + 1) + MIN_LENGTH_PASSWORD;
        StringBuilder validPassword = new StringBuilder(randomLengthPassword);
        do {
            int numberChar = random.nextInt(PASSWORD_CONTAINS.length());
            char randomChar = PASSWORD_CONTAINS.charAt(numberChar);
            validPassword.append(randomChar);
        } while (validPassword.length() != randomLengthPassword);

        return validPassword.toString();
    }

    public static String randomValidName() {
        int randomLengthOfName = random.nextInt(MAX_LENGTH_NAME - MIN_LENGTH_NAME + 1) + MIN_LENGTH_NAME;
        StringBuilder name = new StringBuilder(randomLengthOfName);
        do {
            int numberChar = random.nextInt(NAME_CONTAINS.length());
            char randomChar = NAME_CONTAINS.charAt(numberChar);
            name.append(randomChar);
        }
        while (name.length() != randomLengthOfName);
        return name.toString();
    }

    public static String randomValidLocation() {
        String result = "";
        switch (random.nextInt(2)) {
            case 0:
                int randomLengthLocation = random.nextInt(MAX_LENGTH_LOCATION - MIN_LENGTH_LOCATION + 1) + MIN_LENGTH_LOCATION;
                StringBuilder location = new StringBuilder(randomLengthLocation);
                do {
                    int numberChar = random.nextInt(LOCATION_CONTAINS.length());
                    char randomChar = LOCATION_CONTAINS.charAt(numberChar);
                    location.append(randomChar);
                } while (location.length() != randomLengthLocation);
                result = location.toString();
                break;
        }

        return result;
    }

    public static String randomGender() {
        int i = random.nextInt(3);
        return gender[i];
    }

    public static String randomValidTag() {
        int randomLengthTag = random.nextInt(MAX_LENGTH_TAG - MIN_LENGTH_TAG + 1) + MIN_LENGTH_TAG;
        StringBuilder tag = new StringBuilder(randomLengthTag);
        do {
            int numberChar = random.nextInt(TAG_CONTAINS.length());
            char randomChar = TAG_CONTAINS.charAt(numberChar);
            tag.append(randomChar);
        } while (tag.length() != randomLengthTag);
        return tag.toString();
    }

    public String randomFavoriteProduct() {
        String result = "";
        switch (random.nextInt(2)) {
            case 0:
                int randomLengthFavoriteProduct = random.nextInt(MAX_LENGTH_FAVORITE_PRODUCT - MIN_LENGTH_FAVORITE_PRODUCT + 1) + MIN_LENGTH_FAVORITE_PRODUCT;
                StringBuilder favoriteProduct = new StringBuilder(randomLengthFavoriteProduct);
                do {
                    int randomNumber = random.nextInt(FAVORITE_PRODUCT_CONTAINS.length());
                    char randomChar = FAVORITE_PRODUCT_CONTAINS.charAt(randomNumber);
                    favoriteProduct.append(randomChar);
                } while (favoriteProduct.length() != randomLengthFavoriteProduct);
                result = favoriteProduct.toString();
                break;
        }
        return result;
    }
}
