package Test1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waits {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/");

        // Set an implicit wait for 10 seconds (wait for elements to become available)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement downloadsLink = driver.findElement(By.linkText("Downloads"));
        downloadsLink.click();

        // Wait for the downloads page to load using an explicit wait
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.titleContains("Downloads"));
    }
}
