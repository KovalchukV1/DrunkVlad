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
        driver.quit();
    }

    @Test
    public void testIntertop() {
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
        FindS_x_click("//button[@class='header__button ng-star-inserted']", "0");
        Assert.assertTrue(driver.findElement(By.xpath("//label[@for='remember_me']")).isDisplayed());
        driver.quit();
    }

    @Test
    public void Intertop(){
        driver.get("https://intertop.ua/ua/");
        driver.manage().window().maximize();
        driver.quit();
    }

    @Test
    public void Amazon(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com/");
        FindS_x_click("//input[@class='a-button-input']","0");
        Find_X_click("//a[@data-csa-c-slot-id='nav_cs_4']");
        Assert.assertTrue(driver.findElement(By.xpath("//h2[contains(text(), 'Sell on Amazon')]")).isDisplayed());
        driver.quit();
    }

    @Test
    public void Kievstar(){
        driver.get("https://kyivstar.ua/uk/mm");
        driver.manage().window().maximize();
        FindS_x_click("//*[@class='link-text']","3");
        Assert.assertTrue(driver.findElement(By.xpath("//span[contains(text(), 'Вхід до особистого кабінету')]")).isDisplayed());
        driver.quit();
    }
}
