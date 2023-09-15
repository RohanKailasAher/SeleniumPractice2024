package Test1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingNormalDropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        Thread.sleep(2000);
        WebElement day = driver.findElement(By.id("day"));
        Select select = new Select(day);
        select.selectByVisibleText("14");
        Thread.sleep(2000);
        WebElement month = driver.findElement(By.id("month"));
        Select select1 = new Select(month);
        select1.selectByVisibleText("Apr");
        Thread.sleep(2000);
        WebElement year = driver.findElement(By.id("year"));
        Select select2 = new Select( year);
        select2.selectByVisibleText("1998");



    }
}
