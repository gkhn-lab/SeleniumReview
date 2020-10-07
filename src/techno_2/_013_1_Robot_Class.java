package techno_2;

import techno_2.utils.BaseDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class _013_1_Robot_Class extends BaseDriver {
    public static void main(String[] args) throws AWTException, InterruptedException {
        driver.get("https://www.cleartrip.com/flights");
    // Robot class is not from Selenium. It is in Java.
        Robot robot = new Robot();

        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);

        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);

        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);



    }
}
