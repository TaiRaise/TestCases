package testapp;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase5 {
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
	        driver.findElement(By.partialLinkText("Профиль")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.id("my_country")).sendKeys("110");
	        Thread.sleep(1000);
	        driver.findElement(By.id("my_gender")).sendKeys("1");
	        Thread.sleep(1000);
	        driver.findElement(By.id("my_b_day")).sendKeys("14");
	        Thread.sleep(1000);
	        driver.findElement(By.id("my_b_month")).sendKeys("3");
	        Thread.sleep(1000);
	        driver.findElement(By.id("my_b_year")).sendKeys("1993");
	        Thread.sleep(1000);
	        driver.findElement(By.id("my_info")).sendKeys("I'm sexy and i know it!");
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//div[@id='priTable']/tbody/tr[7]/td[2]/input")).click();
	        Thread.sleep(10000);
	  }

	  @After
	  public void tearDown() throws Exception {
	    driver.quit();
	    }
	  }

