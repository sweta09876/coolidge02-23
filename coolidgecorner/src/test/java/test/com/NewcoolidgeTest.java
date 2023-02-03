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
public class NewcoolidgeTest {

    private WebDriver driver;
    private String baseUrl;

    public NewcoolidgeTest() {
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
        driver.get("https://www.google.com/search?q=coolidge+corner+wine+and+spirits&oq=coolidge+corner+wine+and+spirits&aqs=chrome.0.35i39i355j46i39i175i199j69i60l3.14136j0j15&sourceid=chrome&ie=UTF-8");
        //  driver.findElement(By.xpath("//div[@id='_JPvRY_WfJ5qu5NoP7IKyaA_33']/div/div[2]/div/div/div[2]/div/div/a/div")).click();
        // driver.findElement(By.xpath("*[@id="sites-header-row"]/section[3]/div/nav/div/ul[2]/li[3]/a/div/div[1]")).click();
        driver.get("https://coolidgecornerwineandspirits.com/");
        driver.findElement(By.xpath("//div[@id='sites-header-row']/section[3]/div/nav/div/ul[2]/li[3]/a/div/div")).click();
        driver.findElement(By.xpath("//img[@alt='Red']")).click();
        driver.findElement(By.xpath("//div[@id='shop-page']/ch-elements.search-results/div[2]/div[2]/ch-product-search-results/div/div/ch-product-item/a/div/ch-product-image/div/div")).click();
    }

//    @Test
//  public void testCoolidgeTestCase() throws Exception {
//    driver.get(baseUrl + "chrome://newtab/");
//    driver.get("https://www.google.com/search?q=coolidge+corner+wine+and+spirits&oq=coolidge+corner+wine+and+spirits&aqs=chrome.0.35i39i355j46i39i175i199j69i60l3.10255j0j15&sourceid=chrome&ie=UTF-8");
//   // driver.findElement(By.xpath("//div[@id='_QMPSY7PzIMus5NoPjtW--Ag_33']/div/div[2]/div/div/div[2]/div/div/a/div")).click();
//    driver.get("https://coolidgecornerwineandspirits.com/");
//  //  driver.findElement(By.cssSelector("div.ch-customer-profile-icon > svg > path")).click();
//  //  driver.findElement(By.xpath("//div[@id='ch-profile-icon-wrap']/ch-elements.profile-icon/div/ch-profile-icon-dropdown/div/div[2]/ch-user-menu-item[4]/div/a/div/div")).click();
//  //  driver.findElement(By.xpath("//div[@id='city-hive-profile-page-container']/ch-elements.profile-page/div/div/div[2]/div/div/ch-profile-page-addresses/div/div/ch-profile-page-address-row/div/div[3]/div[2]/button")).click();
//  //*[@id="street"] 
//  driver.findElement(By.id("street")).click();
//    driver.findElement(By.id("street")).clear();
//    driver.findElement(By.id("street")).sendKeys(FileUtil.loadData().getAddress());
//    driver.findElement(By.id("city")).click();
//    driver.findElement(By.id("state")).click();
//    driver.findElement(By.id("state")).clear();
//    driver.findElement(By.id("state")).sendKeys(FileUtil.loadData().getState());
//    driver.findElement(By.id("zipcode")).click();
//    driver.findElement(By.id("zipcode")).clear();
//    driver.findElement(By.id("zipcode")).sendKeys(FileUtil.loadData().getZipCode());
//    driver.findElement(By.xpath("//button[@type='submit']")).click();
//  }
 
//    
//  @Test
//  public void testCoolidgeTestCase() throws Exception {
//    driver.get(baseUrl + "chrome://newtab/");
//    driver.get("https://www.google.com/search?q=coolidge+corner+wine+and+spirits&oq=coolidge+corner+wine+and+spirits&aqs=chrome.0.35i39i355j46i39i175i199j69i60l3.13110j0j7&sourceid=chrome&ie=UTF-8");
//   // driver.findElement(By.xpath("//div[@id='_DOzSY4vVFLTj5NoPmOqSoAM_33']/div/div[2]/div/div/div[2]/div/div/a/div")).click();
//   driver.manage().window().maximize();
//    driver.get("https://coolidgecornerwineandspirits.com/");
//    //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='facebook'])[1]/following::*[name()='svg'][1]")).click();
//    driver.findElement(By.xpath("//div[@id='ch-profile-icon-wrap']/ch-elements.profile-icon/div/ch-profile-icon-dropdown/div/div[2]/ch-user-menu-item[4]/div/a/div/div")).click();
//    driver.findElement(By.xpath("//div[@id='city-hive-profile-page-container']/ch-elements.profile-page/div/div/div[2]/div/div/ch-profile-page-addresses/div/div/ch-profile-page-address-row/div/div[3]/div[2]/button")).click();
//    driver.findElement(By.id("street")).click();
//    driver.findElement(By.id("street")).clear();
//    driver.findElement(By.id("street")).sendKeys("3 BOXWOOD LANE");
//    driver.findElement(By.id("city")).click();
//    driver.findElement(By.id("city")).clear();
//    driver.findElement(By.id("city")).sendKeys("DARTMOUTH");
//    driver.findElement(By.id("state")).click();
//    driver.findElement(By.id("zipcode")).click();
//    driver.findElement(By.id("recipient")).click();
//    driver.findElement(By.id("recipient")).clear();
//    driver.findElement(By.id("recipient")).sendKeys("SWETA Patel");
//    driver.findElement(By.xpath("//button[@type='submit']")).click();
//  }
//
//    
}
