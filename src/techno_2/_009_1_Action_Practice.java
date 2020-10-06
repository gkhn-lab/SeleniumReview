package techno_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import techno_2.utils.BaseDriver;

import java.util.concurrent.TimeUnit;

public class _009_1_Action_Practice extends BaseDriver {
    public static void main(String[] args)  {

        driver.get("https://www.birtwhistle.com");
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

        WebElement businessInsurance = driver.findElement(By.id("menu-item-18"));

        Actions act1 = new Actions(driver);
        act1.moveToElement(businessInsurance).build().perform();

        WebElement umbrellaInsurance = driver.findElement(By.xpath("//span[text()='Commercial Umbrella Insurance']"));
        umbrellaInsurance.click();


    }
}
