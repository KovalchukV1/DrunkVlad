import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Home1 {
    WebDriver driver;

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @BeforeMethod
    public void beforeMrthod() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public void Find_X_click(String locator) {
        driver.findElement(By.xpath(locator)).click();
    }

    public void Find_X_SendKeys(String locator, String slovo) {
        driver.findElement(By.xpath(locator)).sendKeys(slovo);
    }

    public void FindS_x_click(String locator, String get) {
        driver.findElements(By.xpath(locator)).get(Integer.parseInt(get)).click();
    }

}
