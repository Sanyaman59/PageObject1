import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.time.Duration;

public class Main
{
    public static void main( String[] args )
    {
        System.setProperty("webdriver.opera.driver", "D:/Components/operadriver/operadriver.exe");
        WebDriver driver = new OperaDriver();
        CatsSearch cs = new CatsSearch(driver);
        cs.setTimeoutInSeconds(10);
        cs.open();
        cs.enterText("Cats");
    }
}