package Test1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class InteractionDragAndDropConcept {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");

        driver.switchTo().frame(0);

        WebElement sourceElement = driver.findElement(By.id("draggable"));

        WebElement TargetElement = driver.findElement(By.id("droppable"));

        Actions action = new Actions(driver);

        action.clickAndHold(sourceElement).moveToElement(TargetElement).release().build().perform();

        driver.quit();

    }
}
