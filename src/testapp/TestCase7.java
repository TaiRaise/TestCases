package testapp;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase7 {
	private WebDriver driver;
	
	  @Before
	  public void setUp() throws Exception {
	    driver = new FirefoxDriver();
	  }
	
	  @Test
	  public void testtestclass() throws Exception {
		  
	        driver.get("http://www.lostfilm.tv");
	        driver.findElement(By.name("login")).sendKeys("Anton_228");
	        Thread.sleep(1000);
	        driver.findElement(By.name("password")).sendKeys("228sila");
	        Thread.sleep(1000);
	        driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//div[@id='Onwrapper']/div[3]/div[2]/div[2]/a")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.partialLinkText("Главная")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//div[@id='Onwrapper']/div[5]/div[3]/div[2]/a")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.partialLinkText("Главная")).click();
	        Thread.sleep(10000);
	  }

	  @After
	  public void tearDown() throws Exception {
	    driver.quit();
	    }
	  }

