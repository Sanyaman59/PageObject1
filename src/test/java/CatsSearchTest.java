import junit.framework.TestCase;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class CatsSearchTest extends TestCase {

    @Test
    public void testTextSearch() {
        System.setProperty("webdriver.opera.driver", "D:/Components/operadriver/operadriver.exe");
        WebDriver driver = new OperaDriver();
        CatsSearch cs = new CatsSearch(driver);
        cs.setTimeoutInSeconds(10);
        cs.open();
        assertTrue(cs.atPage());
        cs.enterText("Cats");
        assertEquals("Cats - Google Search",driver.getTitle());
        cs.close();
    }
}