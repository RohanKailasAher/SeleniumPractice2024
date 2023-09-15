package Test1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;

import java.io.File;
import java.io.IOException;

public class TakingScreenShot {
    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.neosofttech.com/");

        // Create a File object to store the screenshot
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        String fileName = "screenshot";

        String filePath = "C:\\Users\\user\\IdeaProjects\\Selenium-Practicles\\Pics" + fileName + ".png";

       // Copy the screenshot to the specified file path
        FileUtils.copyFile(file, new File(filePath));
        System.out.println("Screenshot saved to: " + filePath);

        driver.quit();
    }
}
// File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
// File: This is a class in Java that represents files and directories.
//TakesScreenshot: This is an interface in Selenium WebDriver that allows you to capture screenshots of the web page.
//driver: This is your WebDriver instance, which represents the web browser.
//.getScreenshotAs(OutputType.FILE): This line captures a screenshot of the current web page displayed in your browser and stores it in a File object called file.
//=============
//FileUtils.copyFile(file, new File(filePath));
//FileUtils: This is a utility class from the Apache Commons IO library that provides methods for working with files and directories.
//.copyFile(file, new File(filePath)): This line copies the screenshot file (stored in the file variable) to the specified filePath using the FileUtils.copyFile method.