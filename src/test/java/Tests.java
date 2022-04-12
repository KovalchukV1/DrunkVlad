import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests extends Home1 {

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void EatStreat(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://eatstreet.com/");
        driver.findElement(By.xpath("//div[@aria-pressed='false']")).click();
    }

    @Test
    public void testIntertop() {
        WebDriverManager.chromedriver().setup();
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
}
