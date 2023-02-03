/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Sweta
 */
public class Coolidgelogin2Test {
  
    private WebDriver driver;
    private String baseUrl;
  
    public Coolidgelogin2Test() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        
        System.setProperty("webdriver.chrome.driver", "c:\\data1\\chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "https://www.google.com/";
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        driver.close();
    }
    
    
    @Test
  public void testUTestCase() throws Exception {
    driver.get(baseUrl + "chrome://newtab/");
    driver.manage().window().maximize();
    driver.get("https://www.google.com/search?q=coolidge+corner+wine+and+spirits&oq=coolidge+corner+wine+and+spirits&aqs=chrome.0.35i39i355j46i39i175i199j69i60l3.13951j0j15&sourceid=chrome&ie=UTF-8");
    driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div/div/a/h3")).click();
    driver.get("https://coolidgecornerwineandspirits.com/");
 //   driver.findElement(By.cssSelector("div.ch-customer-profile-icon > svg > path")).click();
  //  driver.findElement(By.linkText("Logout")).click();
    driver.findElement(By.linkText("Login/Sign Up")).click();
    driver.findElement(By.xpath("//div[@id='login-page-container']/ch-elements.login-page/div/div/ch-login-login-selector/div/div/button[2]/span")).click();
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).clear();
    driver.findElement(By.name("email")).sendKeys(FileUtil.readForm().getEmail());
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    
     //   explicit wait
          WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));  //20 sec
           wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
    
    driver.findElement(By.name("password")).click();
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys(FileUtil.readForm().getPassword());
    driver.findElement(By.xpath("//button[@type='submit']")).click();
  }
    
}
