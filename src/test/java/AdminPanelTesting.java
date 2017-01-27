import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AdminPanelTesting {
    WebDriver driver;
    private String address = "http://campfiire.gotests.com/login";

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/usr/libexec/SeleniumDrivers/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void dumping() throws InterruptedException {

        System.out.println(driver.getTitle());
        driver.get(address);
        Thread.sleep(10000);
        driver.findElement(By.id("username")).sendKeys("qa");
        driver.findElement(By.id("password")).sendKeys("4i?7662r*6z60bZ");
        driver.findElement(By.xpath("/html/body/div/form/div[3]/div[2]/button")).click();
        Thread.sleep(10000);

    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
