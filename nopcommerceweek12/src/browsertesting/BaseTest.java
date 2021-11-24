package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BaseTest {

    public static WebDriver driver;
    public void openBrowser(String baseUrl){


        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();//max window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));// we give implicit time to driver to load page

    }
    public void closeBrowser(){
        driver.quit();
    }
}
