package techno_2;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _005_Sign_in_Functionality {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gokha\\OneDrive\\Desktop\\QA\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        String[] userNameArr = {"standard_user", "locked_out_user", "problem_user", "performance_glitch_user"};
        String password = "secret_sauce";

        for (String user : userNameArr) {

            WebElement userNameInput = driver.findElement(By.id("user-name"));
            userNameInput.clear();
            userNameInput.sendKeys(user);


            WebElement passwordInput = driver.findElement(By.id("password"));
            passwordInput.clear();
            passwordInput.sendKeys(password);


            WebElement loginButton = driver.findElement(By.id("login-button"));
            loginButton.click();

            Thread.sleep(3000);

            try {
                driver.findElement(By.xpath("//div[text()='Products']"));



                driver.navigate().back();
            } catch (NoSuchElementException e) {
                System.out.println("Not able to login with user " + user );

               String errorMessage = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
                System.out.println(errorMessage);
            }




        }
    }
}