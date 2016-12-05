package tests;

import static utilites.Utilities.trueOrFalse;

public class Test {

    @org.testng.annotations.Test(invocationCount = 100)
    public void testFalseOrTrue() {
        boolean result = trueOrFalse();
        System.out.println(result);
    }

}
