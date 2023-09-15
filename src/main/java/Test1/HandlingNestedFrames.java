package Test1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandlingNestedFrames {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/nested_frames");

        List<WebElement> f =  driver.findElements(By.tagName("frame"));
        System.out.println("Total Frames: "+" "+f.size());

        driver.switchTo().frame(1);

        String BottomFrame = driver.findElement(By.tagName("body")).getText();
        System.out.println(BottomFrame);

        driver.switchTo().parentFrame();

        driver.switchTo().frame("frame-top");

        driver.switchTo().frame("frame-left");

        String LeftFrame = driver.findElement(By.tagName("body")).getText();
        System.out.println(LeftFrame );

        driver.switchTo().defaultContent();

        driver.quit();

    }
}
