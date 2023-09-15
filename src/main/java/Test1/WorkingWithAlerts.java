package Test1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WorkingWithAlerts {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        // Click the button to trigger a JavaScript alert
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        // Switch to the alert
        Alert alert = driver.switchTo().alert();

        // Get the text from the alert
        String alertText = alert.getText();
        System.out.println("Alert Text: " + alertText);

        // Accept (OK) the alert
        alert.accept();

        // Click the button to trigger a JavaScript confirmation alert
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
        // Switch to the confirmation alert
        alert = driver.switchTo().alert();

        // Get the text from the confirmation alert
        alertText = alert.getText();
        System.out.println("Confirmation Alert Text: " + alertText);

        // Dismiss (Cancel) the confirmation alert
        alert.dismiss();

        // Click the button to trigger a JavaScript prompt alert
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();

        // Switch to the prompt alert
        alert = driver.switchTo().alert();

        // Send input to the prompt and accept it
        alert.sendKeys("This is a prompt input");
        alert.accept();


        driver.quit();



    }
}
