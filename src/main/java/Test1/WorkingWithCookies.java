package Test1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WorkingWithCookies {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");

        //How to capture cookies from browser
        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println("Size of Cookies : "+cookies.size());

        //How to print cookies from browser
        for (Cookie cookie : cookies){
            System.out.println(cookie.getName()+" : "+cookie.getValue());
        }

        //How to add cookie to the browser
        Cookie cookieObj = new Cookie("MyCookies123","1234567");
        driver.manage().addCookie(cookieObj);

        cookies = driver.manage().getCookies();
        System.out.println("Size of Cookies After Adding : "+cookies.size());

        //How to Delete Specific Cookie in the browser
        driver.manage().deleteCookie(cookieObj);
        cookies = driver.manage().getCookies();
        System.out.println("Size of Cookies After Deletion : "+cookies.size());

        //How to delete all the cookie from browser
        driver.manage().deleteAllCookies();
        cookies = driver.manage().getCookies();
        System.out.println("Size of Cookies After Deletion : "+cookies.size());



        driver.quit();
    }
}
