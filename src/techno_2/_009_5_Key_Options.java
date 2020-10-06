package techno_2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import techno_2.utils.BaseDriver;

public class _009_5_Key_Options extends BaseDriver {
    public static void main(String[] args) {
        driver.get("http://demoqa.com/auto-complete");


        WebElement singleContainer = driver.findElement(By.id("autoCompleteSingleContainer"));
        Actions actions = new Actions(driver);
       actions.moveToElement(singleContainer).click().keyDown(Keys.SHIFT).sendKeys("r").keyUp(Keys.SHIFT).sendKeys("obin").perform();
    }
}
