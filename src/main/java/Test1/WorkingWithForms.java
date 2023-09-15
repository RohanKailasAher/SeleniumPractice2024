package Test1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;


import java.time.Duration;

public class WorkingWithForms {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //firstName
        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys("Ms");
        //lastName
        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.sendKeys("Dhoni");
        //Email
        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys("ms.dhoni@gmail.com");
        //Gender
        WebElement gender = driver.findElement(By.xpath("//label[normalize-space()='Male']"));
        gender.click();
        // MobileNo
        WebElement mobileNo = driver.findElement(By.id("userNumber"));
        mobileNo.sendKeys("8888888888");
        //ScrollDown
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", " ");
        //dateOfBirth
       driver.findElement(By.id("dateOfBirthInput")).click();
       driver.findElement(By.className("react-datepicker__month-container")).getText();

        WebElement month = driver.findElement(By.className("react-datepicker__month-select"));
        Select select = new Select(month);
        select.selectByVisibleText("July");
        Thread.sleep(2000);

        WebElement year = driver.findElement(By.className("react-datepicker__year-select"));
        Select select1 = new Select(year);
        select1.selectByVisibleText("1981");
        Thread.sleep(2000);
        //WebElement day = driver.findElement(By.className("react-datepicker__day react-datepicker__day--007"));
        WebElement day = driver.findElement(By.xpath("//div[@aria-label ='Choose Tuesday, July 7th, 1981']"));
        day.click();


        //Subjects
        WebElement subjectsInput = driver.findElement(By.id("subjectsInput"));
        subjectsInput.sendKeys("Maths");
        subjectsInput.sendKeys(Keys.ENTER);
        subjectsInput.sendKeys("English");
        subjectsInput.sendKeys(Keys.ENTER);
        // Hobbies
        WebElement Checkbox1 = driver.findElement(By.xpath("//label[normalize-space()='Sports']"));
        Checkbox1.click();
        WebElement Checkbox2 = driver.findElement(By.xpath("//label[normalize-space()='Reading']"));
        Checkbox2.click();
        WebElement Checkbox3 = driver.findElement(By.xpath("//label[normalize-space()='Music']"));
        Checkbox3.click();
        //pitureUplode
        WebElement UplodeFile = driver.findElement(By.id("uploadPicture"));
        UplodeFile.sendKeys("C:\\Users\\user\\Pictures\\msd.jpg");

        //CurrentAddress
        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("123 Main Street, Ranchi, Chennai");
//        // Select State and City
//        WebElement stateDropdown = driver.findElement(By.id("state"));
//        Select stateSelect = new Select(stateDropdown);
//        stateSelect.selectByVisibleText("NCR");
//
//        WebElement cityDropdown = driver.findElement(By.id("city"));
//        Select citySelect = new Select(cityDropdown);
//        citySelect.selectByVisibleText("Delhi");
//
//        // Submit
//        WebElement submitButton = driver.findElement(By.id("submit"));
//        submitButton.click();


        driver.quit();


    }
}
