package techno_2;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import techno_2.utils.BaseDriver;

import java.util.concurrent.TimeUnit;

public class _009_3_Double_Click extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://www.demoqa.com/buttons");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));
        Actions actions = new Actions(driver);
        actions.doubleClick(doubleClickButton).perform();

        WebElement doubleClickMessage = driver.findElement(By.id("doubleClickMessage"));
        Assert.assertEquals("You have done a double click", doubleClickMessage.getText());



    }
}
