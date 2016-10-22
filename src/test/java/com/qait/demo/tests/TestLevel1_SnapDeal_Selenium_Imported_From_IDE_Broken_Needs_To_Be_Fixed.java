/**
 * This is a sample test recorded in selenium ide and exported to eclipse
 * Step 1 : Open snapdeal.com
 * Step 2 : Search A product - Mobile
 * Step 3 : Select First Product
 * Step 4 : Add the product to cart
 * Step 5 : Verify the product has been added to cart
 *
 * Task : You have to fix this test and run it.
 */
package com.qait.demo.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestLevel1_SnapDeal_Selenium_Imported_From_IDE_Broken_Needs_To_Be_Fixed {

    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    String windowHandle;

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/selenium-driver/chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "https://www.snapdeal.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
  public void testECommerceSite() throws Exception {
   try{
    driver.get(baseUrl + "/");
    driver.findElement(By.id("inputValEnter")).click();
    driver.findElement(By.id("inputValEnter")).clear();
    driver.findElement(By.id("inputValEnter")).sendKeys("mobile");
    driver.findElement(By.xpath("//button[@onclick=\"submitSearchForm('go_header');\"]")).click();
    driver.findElement(By.xpath("(//img[contains(@class,'product-image')])[1]")).click();
    for (String s : driver.getWindowHandles())
  driver.switchTo().window(s);
    driver.findElement(By.xpath("//div[@id='add-cart-button-id']/span")).click();
    driver.findElement(By.xpath("//a[text()='Proceed To Checkout']")).click();
   }
   catch(Exception e){
  
    e.printStackTrace();
   }
  }
}
    
