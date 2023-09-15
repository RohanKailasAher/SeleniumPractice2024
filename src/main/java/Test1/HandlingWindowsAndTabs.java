package Test1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindowsAndTabs {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");

        String MainTab = driver.getWindowHandle();
        System.out.println( MainTab); //print Dynamic id of the current tab

//        driver.switchTo().newWindow(WindowType.TAB);
         driver.switchTo().newWindow(WindowType.WINDOW);

        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());

        System.out.println(driver.getWindowHandles()); //print Dynamic id of the all tab


     driver.switchTo().window(MainTab);

      System.out.println(driver.getTitle());

      // driver.close();



    }
}
