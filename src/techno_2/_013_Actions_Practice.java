package techno_2;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import techno_2.utils.BaseDriver;

public class _013_Actions_Practice extends BaseDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.yogaalliance.org");


        WebElement becomeMember = driver.findElement(By.linkText("Become a Member"));
        Actions actions = new Actions(driver);

        Thread.sleep(2000);
        actions.moveToElement(becomeMember).perform();

        WebElement teachers = driver.findElement(By.xpath("(//a[text()='Teachers'])[2]"));
        teachers.click();

        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.titleContains("Teachers | Yoga Alliance"));

        String URL = driver.getCurrentUrl();
        System.out.println(URL);

        Assert.assertTrue(URL.contains("Teachers"));

        driver.quit();
    }
}
