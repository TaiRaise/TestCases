package testapp;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase4 {
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
	        driver.findElement(By.partialLinkText(" »ÕŒ«¿À")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//div[@id='Onwrapper']/div[4]/div[1]/div[3]/table/tbody/tr[2]/td[2]/nobr/div/a[2]")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//div[@id='Onwrapper']/div[4]/div[1]/div/div[2]/div[1]/a[2]")).click();
	        Thread.sleep(10000);
	  }

	  @After
	  public void tearDown() throws Exception {
	    driver.quit();
	    }
	  }

