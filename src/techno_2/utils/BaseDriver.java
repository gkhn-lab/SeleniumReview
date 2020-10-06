package techno_2.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseDriver {
    public static WebDriver driver;

    static {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gokha\\OneDrive\\Desktop\\QA\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
}
