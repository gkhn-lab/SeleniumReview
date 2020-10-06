package techno_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _007_2_Select_DropDown {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gokha\\OneDrive\\Desktop\\QA\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();

        WebElement dropDownMenu = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(dropDownMenu);
        select.selectByIndex(4);
        select.selectByValue("search-alias=computers-intl-ship");
        select.selectByVisibleText("Industrial & Scientific");


    }
}
