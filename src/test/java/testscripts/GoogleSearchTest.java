package testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleSearchTest {
	WebDriver driver;
	
	/**
	 * 
	 */
	//@BeforeMethod
	@BeforeTest
	public void setup() {
		 driver = new ChromeDriver();// Launch Browser
			driver.manage().window().maximize();// Maximize the window
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			
		
	}
	@Test(priority = 2)
  public void JavaSearchTest() {
	  driver.get("https://www.google.com/");
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Java Tutorial");// Enter the data in text box
		searchBox.submit();
		Assert.assertEquals("Java Tutorial - Google Search", driver.getTitle());
		
  }
  
  //@Test(enabled = false) // not include method to run in the test
  @Test(priority = 1) //run the code based on the priority given
		
		public void SeleniumSearchTest() {
	  	driver.get("https://www.google.com/");
				WebElement searchBox = driver.findElement(By.name("q"));
				searchBox.sendKeys("Selenium Tutorial");// Enter the data in text box
				searchBox.submit();
				Assert.assertEquals("Selenium Tutorial - Google Search", driver.getTitle());
  }
  
  @Test
  public void CucumberSearchTest() {
	  driver.get("https://www.google.com/");
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Cucumber Tutorial");// Enter the data in text box
		searchBox.submit();
		Assert.assertEquals("Cucumber Tutorial - Google Search", driver.getTitle());
  }
		
  @Test
		  public void AppiumSearchTest() {
			  driver.get("https://www.google.com/");
				WebElement searchBox = driver.findElement(By.name("q"));
				searchBox.sendKeys("Appium Tutorial");// Enter the data in text box
				searchBox.submit();
				Assert.assertEquals("Appium Tutorial - Google Search", driver.getTitle());
		}
  
 // @AfterMethod
  @AfterTest
  public  void tearDown() {
	  driver.close();
	  
  }
}
