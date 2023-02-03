/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
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
public class CoolidgesearchTest {

    private WebDriver driver;
    private String baseUrl;

    public CoolidgesearchTest() {
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

  //  @Test
    public void hover() throws Exception {
        //   driver = new ChromeDriver();
        driver.manage().window().maximize();
        // implicit wait condition
        //   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // this opens the url
        driver.get("https://coolidgecornerwineandspirits.com/");

        //Mouse hover
        WebElement elem1 = driver.findElement(By.xpath("//<div _ngcontent-qlc-c74=\"\" data-hook=\"]"));
        Actions act = new Actions(driver);
        Action a1 = act.moveToElement(elem1).build();
        a1.perform();

        //To wait for element visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void testUTestCase() throws Exception {
        driver.get(baseUrl + "chrome://newtab/");
        driver.manage().window().maximize();

        driver.get("https://www.google.com/search?q=coolidge+corner+wine+and+spirits&oq=coolidge+corner+wine+and+spirits&aqs=chrome.0.35i39i355j46i39i175i199j69i60l3.9205j0j15&sourceid=chrome&ie=UTF-8");
        //  driver.findElement(By.xpath("//div[@id='_u2rVY8aILOLj5NoP8ry66Ag_33']/div/div[2]/div/div/div[2]/div/div/a/div")).click();
        driver.get("https://coolidgecornerwineandspirits.com/");
        driver.findElement(By.xpath("//input[@type='search']")).click();
        driver.findElement(By.xpath("//input[@type='search']")).clear();
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("wine");
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.ENTER);
        
   //      @Test
  //  public void testScroll () throws Exception{
       //driver.get(baseUrl);
       Thread.sleep(10*100);
       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("window.scrollBy(0,620)", "");
       Thread.sleep(10*1000);
 //  }
       // driver.findElement(By.xpath("//div[@id='ch-search-box-wrap']/ch-elements.search-box/div/ch-search-box-input/div/div/form/button")).click();
        //  driver.findElement(By.xpath("//div[@id='shop-page']/ch-elements.search-results/div[2]/div[2]/ch-product-search-results/div/div[8]/ch-product-item/a/div/ch-product-item-cart-quantity-control/div")).click();
        driver.findElement(By.xpath("//*[@id=\"shop-page\"]/ch-elements.search-results/div[2]/div[2]/ch-product-search-results/div/div[9]/ch-product-item/a/div[1]/ch-product-image/div/div")).click();
       // driver.findElement(By.xpath("//*[@id=\"shop-page\"]/ch-elements.search-results/div[2]/div[2]/ch-product-search-results/div/div[8]/ch-product-item/a/div[1]/ch-product-item-cart-quantity-control/div")).click();
        driver.findElement(By.xpath("//article[@id='product-element']/ch-elements.product.page/div/div/div[3]/div[2]/div/div[4]/ch-product-cart-actions/div/div/div/div/button/span/span")).click();
        driver.findElement(By.xpath("//button[@id='ch-shopping-cart-icon-container']/div[2]")).click();
       // driver.findElement(By.xpath("//div[@id='ch-shopping-cart-wrap']/div/div[3]/ch-elements.cart-dropdown/div[2]/div[3]/div/div[2]/button")).click();
        //driver.findElement(By.xpath("//*[@id=\"product-element\"]/ch-elements.product.page/div/div[1]/div[3]/div[2]/div[1]/div[4]/ch-product-cart-actions/div/div/div[1]/div/button")).click();
 
      // driver.findElement(By.xpath("//div[@id='city-hive-cart-page-container']/ch-elements.cart-page/div[2]/div[3]/div/div[2]/div/button")).click();
       //*[@id="product-element"]/ch-elements.product.page/div/div[1]/div[3]/div[2]/div[1]/div[4]/ch-product-cart-actions/div/div/div[1]/div/button
    }
}
       //*[@id="product-element"]/ch-elements.product.page/div/div[1]/div[3]/div[2]/div[1]/div[4]/ch-product-cart-actions/div/div/div[1]/div/button
//*[@id="product-element"]/ch-elements.product.page/div/div[1]/div[3]/div[2]/div[1]/div[4]/ch-product-cart-actions/div/div/div[1]/div/button