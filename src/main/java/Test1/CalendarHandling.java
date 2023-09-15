package Test1;

import com.google.common.annotations.VisibleForTesting;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CalendarHandling {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

        driver.findElement(By.id("datepicker")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("ui-datepicker")));
        String monthYearVal = driver.findElement(By.className("ui-datepicker-title")).getText();
        System.out.println(monthYearVal);

        String month = monthYearVal.split(" ")[0].trim();
        String year = monthYearVal.split(" ")[1].trim();

        while (!(month.equals("October") && year.equals("2025"))) { // Loop until the desired month and year are reached
            driver.findElement(By.xpath("//a[@title='Next']")).click(); // Clicking on the "Next" button to navigate to the next month
            monthYearVal = driver.findElement(By.className("ui-datepicker-title")).getText(); // Getting the updated month and year value
            System.out.println(monthYearVal);
            month = monthYearVal.split(" ")[0].trim();
            year = monthYearVal.split(" ")[1].trim();
        }

        driver.findElement(By.xpath("//a[text()='29']")).click();
    }
}
