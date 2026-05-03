import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
        By byProductImage = By.xpath("//img[contains(@src,'51KMqAz8xuL')]");
        WebElement productImage = chromeDriver.findElement(byProductImage);
        //2.
        By byLblRealPrice = By.xpath("//h2[.//span[contains(.,'3-Stripes Tricot Track Suit')]]//ancestor::div[@data-component-type='s-search-result']//div[contains(@class,'aok-inline-block') and .//span[contains(text(),'List:')]]");
        WebElement lblRealPrice = chromeDriver.findElement(byLblRealPrice);
        //3.
        By byLblSalePrice = By.xpath("//span[contains(text(),'Samba Indoor Shoe')]//ancestor::div[@data-component-type='s-search-result']//span[@class='a-price-whole']");
        WebElement lblSalePrice = chromeDriver.findElement(byLblSalePrice);
        //4.
        By byInputSearch = By.id("twotabsearchtextbox");
        WebElement inputSearch = chromeDriver.findElement(byInputSearch);
        //5.
        By byLnkNavCart = By.id("nav-cart");
        WebElement lnkNavCart = chromeDriver.findElement(byLnkNavCart);
        //7.
        By byBtnSize = By.xpath("//button[@aria-label='6']");
        WebElement btnSize = chromeDriver.findElement(byBtnSize);
        //8.
        By byLblProductName = By.xpath("//h2//span[text()=\"Men's Basic 3-Stripes Tricot Track Suit\"]");
        WebElement lblProductName = chromeDriver.findElement(byLblProductName);
        //9.
        By byLblDeliveryDate = By.xpath("//span[text()='Unisex Adult Samba Indoor Shoe']/ancestor::div[contains(@class,'s-result-item')]//div[@class='a-column a-span12']//span[@class='a-text-bold']");
        WebElement lblDeliveryDate = chromeDriver.findElement(byLblDeliveryDate);
        //10.
        By byLblBrand = By.xpath("//h2[contains(@class,'a-size-mini')]//span[text()='adidas']");
        WebElement lblBrand = chromeDriver.findElement(byLblBrand);
        //11.
        By byLblResultsTitle = By.xpath("//h2[contains(@class,'a-size-medium-plus') and contains(@class,'a-text-bold')]");
        WebElement lblResultsTitle = chromeDriver.findElement(byLblResultsTitle);
        //12.
        By byChkMenCat = By.xpath("//span[text()='Men']//preceding::input[@type='checkbox']");
        WebElement chkMenCat = chromeDriver.findElement(byChkMenCat);
        //13.
        By byLblResultCount = By.id("//span[@class='a-color-state a-text-bold']");
        WebElement lblResultCount = chromeDriver.findElement(byLblResultCount);

    }
}
