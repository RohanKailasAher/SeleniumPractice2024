package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HeroCycleTest {
    private WebDriver driver;

    public HeroCycleTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public void testAddHeroCycleToCart() {
        driver.get("https://www.flipkart.com");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        // Step 2: Search for Hero cycle
        WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
        searchBox.sendKeys("Hero cycle");
        driver.findElement(By.className("L0Z3Pu")).click();

        // Step 3: Select the Hero cycle
        WebElement heroCycleProduct = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Hero Cycles')]")));
        heroCycleProduct.click();

        // Step 4: Add the Hero cycle to the cart
        WebElement addToCartButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'ADD TO CART')]")));
        addToCartButton.click();

        // Step 5: Navigate to the cart
        WebElement cartIcon = wait.until(ExpectedConditions.elementToBeClickable(By.className("cart-icon")));
        cartIcon.click();
    }

    public void tearDown() {
        driver.quit();
    }

    public static void main(String[] args) {
        HeroCycleTest test = new HeroCycleTest();
        test.testAddHeroCycleToCart();
        test.tearDown();
    }
}
