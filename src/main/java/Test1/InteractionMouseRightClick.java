package Test1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class InteractionMouseRightClick {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        Actions action = new Actions(driver);
        WebElement RightClickButton = driver.findElement(By.cssSelector(".context-menu-one"));

        action.contextClick(RightClickButton).build().perform();

        WebElement copy = driver.findElement(By.cssSelector(".context-menu-icon-copy"));

        String copyText = copy.getText();
        System.out.println(copyText);
        copy.click();

    }
}
