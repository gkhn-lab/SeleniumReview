package techno_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import techno_2.utils.BaseDriver;

public class _011_IFrame extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://www.123formbuilder.com/free-form-templates/Online-Event-Registration-Form-271174/");

        WebElement okButton = driver.findElement(By.linkText("OK"));
        okButton.click();

        WebElement frameElement = driver.findElement(By.xpath("//div[@class='form-embed']/iframe"));
        driver.switchTo().frame(frameElement);

        WebElement name = driver.findElement(By.xpath("//input[@placeholder='First']"));
        name.sendKeys("John");

        driver.switchTo().defaultContent();

        WebElement continueButton = driver.findElement(By.linkText("Continue with template"));
        continueButton.click();


    }
}
