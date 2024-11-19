package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownTest {
	WebDriver driver;
	
  /**
 * @throws InterruptedException
 */
@Test
  public void DDTest() throws InterruptedException { 
	  driver = new ChromeDriver();// Launch Browser
		driver.manage().window().maximize();// Maximize the window
		driver.get("https://www.stqatools.com/demo/Multiselect.php");
		Thread.sleep(2000);
		Select dateSel = new Select(driver.findElement(By.id("gender-radio-1")));
  }
}
