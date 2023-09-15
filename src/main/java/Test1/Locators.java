package Test1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://login.yahoo.com/");

        Thread.sleep(3000);
        //1.id = id is unique locator-----I

	      WebElement username =  driver.findElement(By.id("login-username"));
	      username.sendKeys("testrohan@yahoo.com");

	      WebElement Nextbtn = driver.findElement(By.id("login-signin"));
	      Nextbtn.click();

        //2.name = name is unique locator-----------I

//	      WebElement username =  driver.findElement(By.name("username"));
//	      username.sendKeys("testrohan@yahoo.com");
//
//	      WebElement Nextbtn = driver.findElement(By.name("signin"));
//	      Nextbtn.click();

        //3.xpath--------------II

//	      WebElement username =  driver.findElement(By.xpath("//input[@id=\'login-username\']"));
//	      username.sendKeys("testrohan@yahoo.com");
//
//	      WebElement Nextbtn = driver.findElement(By.xpath("//input[@id=\'login-signin\']"));
//	      Nextbtn.click();

        //4.cssSelector----------------II
//
//	      WebElement username =  driver.findElement(By.cssSelector("#login-username"));
//	      username.sendKeys("testrohan@yahoo.com");
//
//	      WebElement Nextbtn = driver.findElement(By.cssSelector("#login-signin"));
//	      Nextbtn.click();

        //5.linkText = only for links------------------IV

//	      WebElement forgetLink =  driver.findElement(By.linkText("Forgot username?"));
//	      forgetLink.click();


//	      WebElement createAcc =  driver.findElement(By.linkText("Create an account"));
//	      createAcc.click();

        //6.partialLinkTest = only for links but not recommended.-----------IV
//	      WebElement createAcc =  driver.findElement(By.partialLinkText("Create")); //pass the starting part
//	      createAcc.click();

        //both link are same it is not work
        //hey rohan, are you facing some problem to sign up?
        //hey rohan, are you facing some problem to register?

        //7.ClassName = is not unique----------V
//
//        WebElement username =  driver.findElement(By.className("phone-no"));
//        username.sendKeys("testrohan@yahoo.com");
Thread.sleep(2000);
driver.quit();

    }
}
