package Test1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicOPerations {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //driver.get("https://www.google.co.in/");
        driver.navigate().to("https://www.google.co.in/");

       // driver.close();  //the close the current instance
        driver.quit();    //the close the all the instance
    }
}
