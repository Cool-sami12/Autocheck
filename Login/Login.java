package Login;

import Register.SignUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Login {
    //
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

    public void successfulLogin(){

        driver.findElement(By.linkText("Sign In")).click();
        //get page title
        System.out.println(driver.getTitle());

        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        driver.findElement(By.name("email")).sendKeys("test@test.com");
        driver.findElement(By.name("password")).sendKeys("testtest");
        System.out.println("i have enter my password");

        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div[2]/form/div[4]/button")).click();

        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        System.out.println("I Have successfully login ");

        driver.get("https://marketplace.staging.myautochek.com");

        // close the browser after test
        driver.quit();




    }


    //initiate the test run command
    public static void main(String arg[]) throws InterruptedException {
        Login test = new Login();
        test.setup();
        test.successfulLogin();

    }

}
