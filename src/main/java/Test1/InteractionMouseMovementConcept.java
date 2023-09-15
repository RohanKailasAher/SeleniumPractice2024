package Test1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class InteractionMouseMovementConcept {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://mrbool.com/");  //how to handle menu with sub-menu

        Actions action = new Actions(driver);

        action.moveToElement(driver.findElement(By.className("menulink"))).build().perform();

        Thread.sleep(3000);

        WebElement Article = driver.findElement(By.xpath("//ul[@class='submenu']//a[contains(text(),'Articles')]"));
        Article .click();

    }
}
