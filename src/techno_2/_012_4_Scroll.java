package techno_2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import techno_2.utils.BaseDriver;

import java.util.concurrent.TimeUnit;

public class _012_4_Scroll extends BaseDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.etsy.com/ca/");


        WebElement whatIsEtsy = driver.findElement(By.xpath("//h2[text()=' What is Etsy? ']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();" , whatIsEtsy);

        Thread.sleep(3000);

        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

        Thread.sleep(2000);

        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");


    }
}
