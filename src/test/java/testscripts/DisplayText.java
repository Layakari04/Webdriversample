package testscripts;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DisplayText {
	
	WebDriver driver;
  @Test
  public void HiddenTest() {
	  driver = new ChromeDriver();// Launch Browser
		driver.manage().window().maximize();// Maximize the window
		driver.get("https://automationbookstore.dev/");
		driver.findElement(By.id("searchBar")).sendKeys("Test");
		
		TakeScreeshot Screen = (TakeScreenshot)driver;
		File SrcImg = Screen.getScreenshotAs(OutputType.FILE);
		String StrPlaceholder = driver. findElement(
			By.id("searchBar")).getAttribute("placeholder");
		System.out.println(StrPlaceholder);
		WebElement CloseIcon = driver.findElement(
				By.cssSelector("a[title = 'Clear Text]"));
				System.out.println(CloseIcon.isDisplayed());
				if(CloseIcon.isDisplayed()) {
					CloseIcon.click();
				}
		
  }
}
