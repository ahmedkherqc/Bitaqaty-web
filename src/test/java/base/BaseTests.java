package base;
import com.example.pages.HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BaseTests {

    public WebDriver driver;
    protected HomePage homePage;

    @BeforeClass

    public void setUp() {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        driver = new ChromeDriver();
        driver.navigate().to("https://www.bitaqaty.com/");
        driver.manage().window().maximize();

        homePage = new HomePage(driver);

    }

    @AfterClass
    public void Teardown() {
        driver.quit();
    }
}
