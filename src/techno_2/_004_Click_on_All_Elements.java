package techno_2;

import com.google.common.annotations.VisibleForTesting;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _004_Click_on_All_Elements {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gokha\\OneDrive\\Desktop\\QA\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");




        WebElement cartButton = driver.findElement(By.id("shopping_cart_container"));
        cartButton.click();

       // Thread.sleep(3000);
       List<WebElement> removeButtons = driver.findElements(By.xpath("//button[text()='REMOVE']"));
       clickingInTheList(removeButtons);


        removeButtons = driver.findElements(By.xpath("//button[text()='REMOVE']"));


        Assert.assertTrue(removeButtons.size() == 0);

        driver.quit();




        }

        public static void clickingInTheList(List<WebElement> anyList){
        for (WebElement eachElement: anyList){
            eachElement.click();
        }
        }


    }

