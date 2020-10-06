package techno_2;

import org.openqa.selenium.JavascriptExecutor;
import techno_2.utils.BaseDriver;

public class _012_1_Scroll extends BaseDriver {
    public static void main(String[] args) throws InterruptedException {

        /*
        *             JavascriptExecuter js = (JavascriptExecuter) driver;
        *             js.executeScript(Script,Arguments);
        * */


        driver.get("https://triplebyte.com/");
        JavascriptExecutor js = (JavascriptExecutor)  driver;
        js.executeScript("window.scrollBy(0,5000)");

        Thread.sleep(2000);

        js.executeScript("window.scrollBy(0,-2000)");


    }
}
