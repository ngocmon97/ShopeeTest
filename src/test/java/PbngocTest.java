import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PbngocTest {
    WebDriver driver;
    @Test(priority = 1)
    public void test1(){


        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        // abc
        driver.get("https://mvnrepository.com");
    }

}
