import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class airbnbHomePage {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        options.setExperimentalOption("useAutomationExtension", false);
        WebDriver chromeDriver = new ChromeDriver(options);
        chromeDriver.get("https://demo5.cybersoft.edu.vn/");


        //Xac dinh locator
        //1.
        By logoMenu = By.xpath("//nav//span[normalize-space()='CyberSoft']");
        //2.
        By homeMenu = By.xpath("//nav//a[normalize-space()='Home']");
        //3.
        By aboutMenu = By.xpath("//nav//a[normalize-space()='About']");
        //4.
        By profileMenu = By.xpath("//img[contains(@class,'h-10')]/ancestor::button");
        //5.
        By txtPlace = By.xpath("//p[text()='Địa điểm']/..");
        //6.
        By txtDate = By.xpath("//p[text()='03/05/2026']/..");
        //7.
        By btnMoreGuest = By.xpath("//p[text()='Thêm khách']/..");
        //8.
        By btnIncreaseGuest = By.xpath("//button[.//div[text()='+']]");
        //9.
        By btnDecreaseGuest = By.xpath("//button[.//div[text()='-']]");
        //10.
        By btnHCMCard = By.xpath("//a[.//h2[contains(text(),'Hồ Chí Minh')]]");
        //11.
        By lblCanThoCard = By.xpath("//a//h2[contains(text(),'Cần Thơ')]");
        //12.
        By btnTypeOfPlace = By.xpath("//button[text()='Loại nơi ở']");
        //13.
        By btnPrice = By.xpath("//button[text()='Giá']");
        //14.
        By txtNhaTrangTime = By.xpath("//a[.//h2[contains(text(),'Nha Trang')]]//p");

        WebElement logoMenuEl = chromeDriver.findElement(logoMenu);
        WebElement homeMenuEl = chromeDriver.findElement(homeMenu);
        WebElement aboutMenuEl = chromeDriver.findElement(aboutMenu);
        WebElement profileMenuEl = chromeDriver.findElement(profileMenu);
        WebElement txtPlaceEl = chromeDriver.findElement(txtPlace);
        WebElement txtDateEl = chromeDriver.findElement(txtDate);
        WebElement btnMoreGuestEl = chromeDriver.findElement(btnMoreGuest);
        btnMoreGuestEl.click();
        WebElement btnIncreaseGuestEl = chromeDriver.findElement(btnIncreaseGuest);
        WebElement btnDecreaseGuestEl = chromeDriver.findElement(btnDecreaseGuest);
        WebElement btnHCMCardEl = chromeDriver.findElement(btnHCMCard);
        WebElement lblCanThoCardEl = chromeDriver.findElement(lblCanThoCard);
        WebElement btnTypeOfPlaceEl = chromeDriver.findElement(btnTypeOfPlace);
        WebElement btnPriceEl = chromeDriver.findElement(btnPrice);
        WebElement txtNhaTrangTimeEl = chromeDriver.findElement(txtNhaTrangTime);


        Thread.sleep(3000);
        chromeDriver.quit();

    }
}
