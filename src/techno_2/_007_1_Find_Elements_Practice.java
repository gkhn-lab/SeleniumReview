package techno_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class _007_1_Find_Elements_Practice  {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gokha\\OneDrive\\Desktop\\QA\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        WebElement userNameInput = driver.findElement(By.id("user-name"));
        userNameInput.clear();
        userNameInput.sendKeys("standard_user");


        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.clear();
        passwordInput.sendKeys("secret_sauce");


        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        List<WebElement> addToCart = driver.findElements(By.className("inventory_item_name"));
        //System.out.println(addToCart.size());

        List<WebElement> addToCartButton = driver.findElements(By.xpath("//button[@class='btn_primary btn_inventory']"));
        clickAllElements(addToCartButton);

        WebElement basket = driver.findElement(By.id("shopping_cart_container"));
        basket.click();

        WebElement basketEnd =driver.findElement(By.id("shopping_cart_container"));
        basketEnd.click();

        List<WebElement> itemName =driver.findElements(By.className("inventory_item_name"));
        webElementToString(itemName);




    }

    private static void clickAllElements(List<WebElement> myList) {
        for (WebElement clickAll : myList){
            clickAll.click();
        }
    }

    public static List<String> webElementToString(List<WebElement> myList){

        List<String> stringList = new ArrayList<>();
        for (int i =0; i<myList.size(); i++){
            stringList.add(myList.get(i).getText());
        }
        return stringList;

    }


}


