package testapp;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase8 {
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
	        driver.findElement(By.partialLinkText("Настройки")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.partialLinkText("Безопасность")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.partialLinkText("ЛС")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.partialLinkText("Выйти")).click();
	        Thread.sleep(10000);
	  }

	  @After
	  public void tearDown() throws Exception {
	    driver.quit();
	    }
	  }

