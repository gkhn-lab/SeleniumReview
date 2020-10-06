package techno_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import techno_2.utils.BaseDriver;

import java.util.concurrent.TimeUnit;

public class _010_Waits  extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://demoblaze.com");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement s6 = driver.findElement(By.linkText("Samsung galaxy s6"));
        s6.click();

        WebElement addToCartButton = driver.findElement(By.xpath("//a[@onclick='addToCart(1)']"));
        addToCartButton.click();

        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }
}
