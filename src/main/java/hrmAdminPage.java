import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class hrmAdminPage {
    public static void main(String[] args) throws InterruptedException {
        //Khoi tao instant chromeDriver
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        options.setExperimentalOption("useAutomationExtension", false);
        WebDriver chromeDriver = new ChromeDriver(options);
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://opensource-demo.orangehrmlive.com/");

        Thread.sleep(2000);

        //lam cai login

        //Xac dinh locator
        //1.
        By adminMenu = By.xpath("//a[.//span[text()='Admin']]");
        //2.
        By pimMenu = By.xpath("//a[.//span[text()='PIM']]");
        //3.
        By leaveMenu = By.xpath("//a[.//span[text()='Leave']]");
        //4.
        By usernameInput = By.xpath("//label[text()='Username']/following::input[1]");
        //5.
        By userRoleDropdown = By.xpath("//label[text()='User Role']/following::div[contains(@class,'oxd-select-text')]");
        //6.
        By adminOption = By.xpath("//span[text()='Admin']");
        //7.
        By essOption = By.xpath("//span[text()='ESS']");
        //8.
        By employeeNameInput = By.xpath("//input[@placeholder='Type for hints...']");
        //9.
        By resetButton = By.xpath("//button[normalize-space()='Reset']");
        //10.
        By searchButton = By.xpath("//button[normalize-space()='Search']");
        //11.
        By userManagementTab = By.xpath("//span[normalize-space()='User Management']");
        //12.
        By usernameCell = By.xpath("//div[@role='cell']//div[text()='Admin12']");
        //13.
        By userRoleCell = By.xpath("//div[@role='cell']//div[text()='ESS']");
        //14.
        By deleteIcon = By.xpath("//i[contains(@class,'bi-trash')]");
        //15.
        By editIcon = By.xpath("//i[contains(@class,'bi-pencil-fill')]");
        //16.
        By userRole = By.xpath("//div[text()='User Role']");
        //17.
        By employeeName = By.xpath("//div[text()='Employee Name']");
        //18.
        By breadcrumbTab = By.xpath("//span[contains(@class,'breadcrumb')]");
        //19.
        By closeSidebarButton = By.xpath("//i[contains(@class,'oxd-icon bi-chevron-left')]/ancestor::button");
        //20.
        By toggleButton = By.xpath("//i[contains(@class,'bi-caret-up-fill')]/ancestor::button");
        //21.
        By addButton = By.xpath("//button[normalize-space()='Add']");

        WebElement adminMenuEl = chromeDriver.findElement(adminMenu);
        WebElement pimMenuEl = chromeDriver.findElement(pimMenu);
        WebElement leaveMenuEl = chromeDriver.findElement(leaveMenu);
        WebElement usernameInputEl = chromeDriver.findElement(usernameInput);
        WebElement userRoleDropdownEl = chromeDriver.findElement(userRoleDropdown);
        WebElement adminOptionEl = chromeDriver.findElement(adminOption);
        WebElement essOptionEl = chromeDriver.findElement(essOption);
        WebElement employeeNameInputEl = chromeDriver.findElement(employeeNameInput);
        WebElement resetButtonEl = chromeDriver.findElement(resetButton);
        WebElement searchButtonEl = chromeDriver.findElement(searchButton);
        WebElement userManagementTabEl = chromeDriver.findElement(userManagementTab);
        WebElement deleteIconEl = chromeDriver.findElement(deleteIcon);
        WebElement editIconEl = chromeDriver.findElement(editIcon);
        WebElement addButtonEl = chromeDriver.findElement(addButton);
        WebElement usernameCellEl = chromeDriver.findElement(usernameCell);
        WebElement userRoleCellEl = chromeDriver.findElement(userRoleCell);
        WebElement userRoleEl = chromeDriver.findElement(userRole);
        WebElement employeeNameEl = chromeDriver.findElement(employeeName);
        WebElement breadcrumbTabEl = chromeDriver.findElement(breadcrumbTab);
        WebElement toggleButtonEl = chromeDriver.findElement(toggleButton);
        WebElement closeSidebarButtonEl = chromeDriver.findElement(closeSidebarButton);

        Thread.sleep(3000);
        chromeDriver.quit();

    }
}
