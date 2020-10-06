package techno_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import techno_2.utils.BaseDriver;

public class _009_2_Drag_Drop extends BaseDriver {
    public static void main(String[] args) {
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        Actions act1 = new Actions(driver);

        WebElement box1 = driver.findElement(By.id("box1"));
        WebElement box101 = driver.findElement(By.id("box101"));
        act1.dragAndDrop(box1,box101).build().perform();
        WebElement box3 = driver.findElement(By.id("box3"));
        WebElement box103 = driver.findElement(By.id("box103"));
        act1.dragAndDrop(box3,box103).build().perform();
        WebElement box5 = driver.findElement(By.id("box5"));
        WebElement box105 = driver.findElement(By.id("box105"));
        act1.dragAndDrop(box5, box105).build().perform();
    }
}
