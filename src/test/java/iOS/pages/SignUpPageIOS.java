package iOS.pages;/* Created by Ponomarenko Oleh on 29/11/16. */

import org.openqa.selenium.By;

import static utilites.Utilities.xpathBuilderByValue;

public class SignUpPageIOS {


    public By email = xpathBuilderByValue("email");
    public By password = xpathBuilderByValue("password");
    public By confirmPassword = xpathBuilderByValue("confirm password");
    public By name = xpathBuilderByValue("name");
    public By location = xpathBuilderByValue("location");
    public By nextStepButton = By.name("Next Step");
    public By createAccountButton = By.name("Create Account");
    public By tags[] = {By.name("clubs"), By.name("games"), By.name("cars"), By.name("sports"), By.name("business"), By.name("music"), By.name("shops")};
    public By dateOfBirth = xpathBuilderByValue("date of birth");
    public By dateOfBirthDone = By.name("Done");
}
