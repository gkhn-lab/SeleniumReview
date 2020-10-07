package techno_2;

import org.openqa.selenium.JavascriptExecutor;
import techno_2.utils.BaseDriver;

public class _012_2_Scroll_To_Buttom_of_Page extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://triplebyte.com/");

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }
}
