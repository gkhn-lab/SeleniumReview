package techno_2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import techno_2.utils.BaseDriver;

public class _012_3_Scroll_To_WebElement extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://triplebyte.com/");

        WebElement feedback = driver.findElement(By.xpath("/html/body/div/main/div[4]/div/h4[1]"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", feedback);
    }
}
