package techno_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import techno_2.utils.BaseDriver;

import java.util.List;
import java.util.Random;

public class _007_3_Facebook extends BaseDriver  {
    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gokha\\OneDrive\\Desktop\\QA\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/reg/");
       // driver.manage().window().maximize();

        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("Good");
        WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys("Morning");
        WebElement mobile = driver.findElement(By.xpath("//input[@name='reg_email__']"));
        mobile.sendKeys("79279579275");
        WebElement password = driver.findElement(By.id("password_step_input"));
        password.sendKeys("7978");
        WebElement month = driver.findElement(By.id("month"));
        Select s1 = new Select(month);
        s1.selectByValue("11");
        WebElement day = driver.findElement(By.id("day"));
        Select s2 = new Select(day);
        s2.selectByIndex(12);
        WebElement year = driver.findElement(By.id("year"));
        Select s3 = new Select(year);
       // s3.selectByValue("2020");
        List<WebElement> yearList = s3.getOptions();
        Random rnd = new Random();
        int randomNum = rnd.nextInt(yearList.size());
        s3.selectByIndex(randomNum);
        WebElement radio = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
        radio.click();
    }
}
