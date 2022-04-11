import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tests extends Home1 {

    @Test
    public void EatStreat(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://eatstreet.com/");
        driver.findElement(By.xpath("//div[@aria-pressed='false']")).click();
    }
}
