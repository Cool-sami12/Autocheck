package Marketplace;

import Register.SignUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Home {
    private WebDriver driver;
    @BeforeTest
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
    @Test(priority=1)
    public void  SearchAllCars(){
        driver.findElement(By.linkText("Search all cars")).click();
        driver.get("https://marketplace.staging.myautochek.com/en/ng/cars-for-sale");
        System.out.println(" I am in search all cars page ");

    }
    @Test(priority=2)
    public void  ApplyFinance(){
        driver.manage().deleteAllCookies();
        driver.get("https://marketplace.staging.myautochek.com");
        driver.findElement(By.linkText("Apply for car financing")).click();
        driver.get("https://marketplace.staging.myautochek.com/en/ng/get-prequalified");
        System.out.println(" I am in Apply for car Financing page ");

    }
    @Test(priority=3)
    public void  BuyTrucks(){
        driver.manage().deleteAllCookies();
        driver.get("https://marketplace.staging.myautochek.com");
        driver.findElement(By.linkText("Get Started")).click();
        driver.get("https://marketplace.staging.myautochek.com/en/ng/cars-for-sale/truck");
        System.out.println(" I am in Sell Truck page  ");
    }
    @Test(priority=4)
    public void  FixCar(){
        driver.manage().deleteAllCookies();
        driver.get("https://marketplace.staging.myautochek.com");
        driver.findElement(By.linkText("Pick a Service")).click();
        driver.get("https://marketplace.staging.myautochek.com/en/ng/fix-your-car");
        System.out.println(" I am in  fix your car page  ");

    }
    @Test(priority=5)
    public void  BrandNew(){
        driver.manage().deleteAllCookies();
        driver.get("https://marketplace.staging.myautochek.com");
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[2]/div[1]/div/a") ).click();
        driver.get("https://marketplace.staging.myautochek.com/ng/brand-new");
        System.out.println(" I am in  brand new page  ");

    }
    @Test(priority=6)
    public void SearchCars(){
        driver.manage().deleteAllCookies();
        driver.get("https://marketplace.staging.myautochek.com");
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[3]/div[1]/div/div[1]/div[3]/div[1]/div/div[1]/div[1]")).sendKeys("Toyota ");
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[3]/div[1]/div/div[1]/div[3]/div[2]/div/div[1]/div[1]")).sendKeys("Prius");
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[3]/div[1]/div/div[1]/div[3]/button")).click();
        driver.get("https://marketplace.staging.myautochek.com/ng/cars-for-sale?make_id=106&model_id=1912");
        System.out.println(" I am in Search Cars page  ");

    }
    @Test(priority=7)
    public void FeaturedCar(){
        driver.manage().deleteAllCookies();
        driver.get("https://marketplace.staging.myautochek.com");
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[3]/div[2]/div[2]/span[5]/div/div/button/span")).click();
        driver.get("https://marketplace.staging.myautochek.com/ng/loan/car?car_id=f0PrMfXn4");
        System.out.println(" I am in  Featured car page  ");

        // close the browser after test
        driver.quit();
    }
//    @Test(priority=8)
//    public void PickService(){
//        driver.manage().deleteAllCookies();
//        driver.get("https://marketplace.staging.myautochek.com");
//        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[3]/div[4]/div/div[1]/div[3]/button")).click();
//        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[3]/div[4]/div[2]/div[2]/div/div/div/div/form/div[1]/div/input")).sendKeys("aaaaaaaaaaa");
//        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[3]/div[4]/div[2]/div[2]/div/div/div/div/form/div[2]/div/input")).sendKeys("xxxxxxxxxxxxx");
//        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[3]/div[4]/div[2]/div[2]/div/div/div/div/form/div[3]/div/input")).sendKeys("test@test.com");
//        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[3]/div[4]/div[2]/div[2]/div/div/div/div/form/div[4]/div[2]/div/label/span[1]/svg")).click();
//        System.out.println(" I am in Pick a Service page  ");
//    }
//    @Test(priority=9)
//    public void PlayStore(){
//        driver.manage().deleteAllCookies();
//        driver.get("https://marketplace.staging.myautochek.com");
//        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[3]/div[5]/div[2]/div[1]/div[3]/a[1]/img")).click();
//        driver.get("https://play.google.com/store/apps/details?id=com.autochek.buysalefixcars&utm_source=website&utm_medium=banner&utm_campaign=appdownload");
//        System.out.println(" I am in  play store page  ");

    //}
    //initiate the test run command
    public static void main(String arg[]) throws InterruptedException {
        Home test = new Home();
        test.setup();
        test.SearchAllCars();
        test.ApplyFinance();
        test.BuyTrucks();
        test.BrandNew();
        test.FixCar();
        test.FeaturedCar();
        test.SearchCars();
       // test.PickService();
        // test.PlayStore();
    }



}
