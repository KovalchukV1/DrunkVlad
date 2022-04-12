import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Tests extends Home1 {


    @Test
    public void EatStreat(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://eatstreet.com/");
        driver.findElement(By.xpath("//div[@aria-pressed='false']")).click();
    }

    @Test
    public void testIntertop() {
        driver = new ChromeDriver();
        driver.get("https://intertop.ua/ua/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@class='auth-ico']")).click();
        sleep(2);
        driver.findElement(By.xpath("//div/input[@id='email']")).sendKeys("lalokyrbi@gmail.com");
        driver.findElement(By.xpath("//div/input[@id='password']")).sendKeys("blabla");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        sleep(2);
        Assert.assertEquals(driver.findElements(By.xpath("//div[contains(text(), 'Невірний логін або пароль')]")).size(),2);
        driver.quit();
    }

    @Test
    public void Rozetka(){
        driver.get("https://rozetka.com.ua/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Find_X_click("//span[@class='exponea-close-cross']");
        FindS_x_click("//button[@class='header__button ng-star-inserted']", "1");
//        Find_X_click();
//        driver.quit();
    }
}
