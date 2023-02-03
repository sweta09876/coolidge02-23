/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
public class CoolidgeTest {

    private WebDriver driver;
    private String baseUrl;

    public CoolidgeTest() {
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
  public void testCoolidgeTestCase() throws Exception {
    driver.get(baseUrl + "chrome://newtab/");
    driver.manage().window().maximize();
    driver.get("https://www.google.com/search?q=coolidge+corner+wine+and+spirits&oq=coolidge+corner+wine+and+spirits&aqs=chrome.0.35i39i355j46i39i175i199j69i60l3.9773j0j15&sourceid=chrome&ie=UTF-8");
  //  driver.findElement(By.xpath("//div[@id='_L_jSY-esIeqdptQPneaMwAs_33']/div/div[2]/div/div/div[2]/div/div/a/div")).click();
    driver.get("https://coolidgecornerwineandspirits.com/");
   // driver.findElement(By.cssSelector("div.ch-customer-profile-icon > svg > path")).click();
    driver.findElement(By.id("ch-profile-icon-wrap")).click();
    //*[@id="ch-customer-profile-icon-container"]/div[1]
    
   //driver.findElement(By.xpath("//div[@id='ch-profile-icon-wrap']/ch-elements.profile-icon/div/ch-profile-icon-dropdown/div/div[2]/ch-user-menu-item/div/a/div/div")).click();
   driver.getWindowHandle(); 
   driver.navigate().forward();
    driver.manage().deleteAllCookies();
    driver.findElement(By.id("name")).click();
    driver.findElement(By.id("name")).clear();
    driver.findElement(By.id("name")).sendKeys("SAM PATEL");
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [doubleClick | id=email | ]]
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [doubleClick | id=email | ]]
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [doubleClick | id=email | ]]
    driver.findElement(By.xpath("//div[@id='city-hive-profile-page-container']/ch-elements.profile-page/div/div/div[2]/div/div/ch-profile-page-my-details/div/button")).click();
  }
}
