import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Home1 {
WebDriver driver;

        @Test
    public void EatStreat(){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("https://eatstreet.com/");
        }

}
