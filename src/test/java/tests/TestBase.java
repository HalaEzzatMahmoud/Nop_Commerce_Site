package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

// for webdrivermangaer
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

    public static WebDriver driver;

    @BeforeSuite
    public void SetUpEnv(){

        // for webdrivermanger
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.navigate().to("https://demo.nopcommerce.com/");

    }

    @AfterSuite
    public void TearDown(){

        driver.quit();
    }

}
