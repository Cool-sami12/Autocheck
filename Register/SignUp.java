package Register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class SignUp {
    //import selenium web driver
    private WebDriver driver;

    public void setup() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "resources/chromeDriver.exe");
        driver = new ChromeDriver();

        //waiting for globally
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        // maximize the window
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://marketplace.staging.myautochek.com");
    }
    public void successfulRegistration(){
        //get page title
        System.out.println(driver.getTitle());

        driver.findElement(By.linkText("Register")).click();

        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

        driver.findElement(By.name("firstname")).sendKeys("Test");
        driver.findElement(By.name("lastname")).sendKeys("Test");
        driver.findElement(By.name("email")).sendKeys("test.test@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div[2]/form/div[3]/div/input")).sendKeys("01234566878xxxxx");
        driver.findElement(By.name("password")).sendKeys("test test");
        System.out.println("i have enter my password");
        driver.findElement(By.name("referrer_code")).sendKeys("Test");
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div[2]/form/div[6]/button")).click();


        // close the browser after test
        driver.quit();



    }

    //initiate the test run command
    public static void main(String arg[]) throws InterruptedException {
        SignUp test = new SignUp();
        test.setup();
        test.successfulRegistration();

    }




}
