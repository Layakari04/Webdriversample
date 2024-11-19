package testscripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class RemoteWebDriversTest {
	
WebDriver driver;
	
	/**
	 * 
	 */
	//@BeforeMethod
	@BeforeTest
	public void setup() {
		 driver = new ChromeDriver();// Launch Browser
			driver.manage().window().maximize();// Maximize the window
			
		
	}
	public void RWDTest() throws MalformedURLException {
		ChromeOptions options = new ChromeOptions();
		options.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
	//options.setCapability(CapabilityType.BROWSER_VERSION, 110);
		String strHub = "";
		driver = new RemoteWebDriver(new URL(strHub), options);
		
	  driver.get("https://www.google.com/");
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Java Tutorial");// Enter the data in text box
		searchBox.submit();
		AssertJUnit.assertEquals("Java Tutorial - Google Search", driver.getTitle());
		
  }
}
