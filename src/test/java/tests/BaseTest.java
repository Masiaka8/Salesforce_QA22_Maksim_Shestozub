package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import modals.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;
import org.testng.annotations.*;
import pages.*;

import java.util.concurrent.TimeUnit;

//@Listeners(TestListener.class)
public abstract class BaseTest {
    protected final static String BASE_URL ="https://qa22-e.my.salesforce.com/";
    protected final static String BASE_USERNAME ="masiaka8-rfmc@force.com";
    protected final static String BASE_PASSWORD ="1234567m";
    protected WebDriver driver;
    protected LoginPage loginPage;
    protected HomePage homePage;
    protected LeadsPage leadsPage;
    protected LeadsDetailsPage leadsDetailsPage;
    protected NewLeadModal newLeadModal;
    protected BaseModals baseModals;



    //@Parameters ({"browser"})
    @BeforeClass(alwaysRun = true)
    public void setUp(ITestContext testContext) throws Exception {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--headless");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        testContext.setAttribute("driver", driver);

        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        leadsPage = new LeadsPage(driver);
        leadsDetailsPage = new LeadsDetailsPage(driver);
        newLeadModal = new NewLeadModal(driver);
        baseModals = new BaseModals(driver);
    }

    @BeforeMethod(alwaysRun = true)
    public void  navigate() {
        driver.get(BASE_URL);
    }

    @AfterClass(alwaysRun = true)
    public void  tearDown() {
        driver.quit();
    }

}
