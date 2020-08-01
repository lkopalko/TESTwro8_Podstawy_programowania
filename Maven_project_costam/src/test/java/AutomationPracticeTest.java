import com.sun.org.apache.bcel.internal.util.ByteSequence;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.DeleteSession;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import static org.junit.Assert.assertEquals;

public class AutomationPracticeTest {
    private WebDriver driver;
    Logger logger = Logger.getLogger("TestAutomation");
    //WebDriverWait wait = new WebDriverWait(driver, 10);

    @Before
    public void setUp(){
//        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        logger.info("Chrome started");
        // Maksymalizujemy okno
        driver.manage().window().maximize();
        logger.info("Chrome maximized");
//        // Ustawienie czasu niejawnego oczekiwania na 10 sekund
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Przechodzimy na wybrana strone
        driver.get("http://automationpractice.com/index.php");
        logger.info("Google page displayed");
    }

    @Test
    public void loginTest()
    {

        WebElement signInBtn = driver.findElement(By.className("login"));
        signInBtn.click();
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("dddfg@sdfsdf.pl");
        WebElement passField = driver.findElement(By.id("passwd"));
        passField.sendKeys("ppppp");
        WebElement submit = driver.findElement(By.id("SubmitLogin"));
        submit.click();
        WebElement information = driver.findElement(By.className("icon-user"));
        information.click();
        WebElement email = driver.findElement(By.id("email"));



    }

    @After
    public void tearDown() throws Exception{
        //driver.quit();
    }


}
