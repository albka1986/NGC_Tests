package iOS.pages;/* Created by Ponomarenko Oleh on 29/11/16. */

import org.openqa.selenium.By;

public class SignUpPageIOS {


    public By email = xpathBuilderByValue("email");
    public By password = null;
    public By confirmPassword;
    public By name;
    public By location;
    public By nextButton;
    public By tagSports;
    public By createAccount;


    By xpathBuilderByValue(String value) {

        String xpathPart1 = "//*[@value='";
        String xpathPart2 = "']";
        String xpath = xpathPart1 + value + xpathPart2;
        return By.xpath(xpath);
    }
}
