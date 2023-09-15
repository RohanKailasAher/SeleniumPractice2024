package Test1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class HandlingDynamicDropDown {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));


        driver.get("https://www.makemytrip.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.navigate().refresh();

        // Click the search input box
        WebElement searchInputBox = driver.findElement(By.className("fsw_inputBox"));
        searchInputBox.click();

        // Input text into the search input box
        String optionSelect = "Varanasi, India";
        WebElement searchInput = driver.findElement(By.className("react-autosuggest__input"));
        searchInput.sendKeys("VNS");

        WebElement suggestionsList = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("react-autosuggest__suggestions-list")));

        List<WebElement> optionList = suggestionsList.findElements(By.tagName("li")); //multiple Elements
        for (WebElement element : optionList) {
            String currentOption = element.getText();
            System.out.println("OptionList: " + currentOption);
        }


        driver.quit();
    }
}
