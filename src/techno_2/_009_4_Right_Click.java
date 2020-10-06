package techno_2;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import techno_2.utils.BaseDriver;

public class _009_4_Right_Click extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://www.demoqa.com/buttons");

        WebElement rightClickButton = driver.findElement(By.id("rightClickBtn"));
        Actions actions = new Actions(driver);
        actions.contextClick(rightClickButton).perform();

       WebElement rightClickMessage = driver.findElement(By.id("rightClickMessage"));
        Assert.assertEquals("You have done a right click", rightClickMessage.getText());

        driver.quit();
    }
}
