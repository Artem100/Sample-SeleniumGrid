import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class RemoteDriver {
    protected WebDriver driver;
    String aTitle;
    String eTitle = "Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay";

    @Test
    public void simpleTest() {
        WebDriver driver = null;
        try {
            driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),// хост где находится удаленый вебДрайвер
                    DesiredCapabilities.firefox()); // тут мы можем указывать или firefox или chrome
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        driver.get("https://www.ebay.com/");
        aTitle = driver.getTitle();
        driver.close();
    }
}
