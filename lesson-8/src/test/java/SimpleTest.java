/**
 * Created by Jacek on 2015-08-01.
 */

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.ie.InternetExplorerDriver;

import static org.junit.Assert.*;

public class SimpleTest {

    private static FirefoxDriver driver;

    private static final String URL = "http://jacekokrojek.github.io/jak-to-zrobic-w-js/signup";

    @Before
    public  void openBrowser(){
		driver = new FirefoxDriver(); 
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
    }

    @Test
    public  void register(){
		driver.get(URL);
        //driver.navigate.to(URL);
        String title = driver.getTitle();
        assertEquals("Protractor workshop | Sign up", title);
		WebElement element1 = driver.findElement(By.id("usernamesignup"));
		element1.sendKeys("usertest");
		WebElement element2 = driver.findElement(By.id("emailsignup"));
		element2.sendKeys("email@signup.pl");
		WebElement element3 = driver.findElement(By.id("passwordsignup"));
		element3.sendKeys("123456");
		WebElement element4 = driver.findElement(By.id("passwordsignup_confirm"));
		element4.sendKeys("123456");
		WebElement button=driver.findElement(By.cssSelector(".signin > a:nth-child(1)"));

		


    }

    @After
    public void closeBrowser(){
        driver.quit();
    }
}
