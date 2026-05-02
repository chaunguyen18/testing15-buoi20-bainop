import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class amazonSearchResultPage {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        options.setExperimentalOption("useAutomationExtension", false);
        WebDriver chromeDriver = new ChromeDriver(options);
        chromeDriver.get("https://demo5.cybersoft.edu.vn/");


        //Xac dinh locator
        //1.
        By productImage = By.xpath("//img[contains(@src,'716XjP47jKL')]");
        //2.

    }
}
