package testscripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class WindowTest {
	WebDriver driver;
  /**
 * 
 */
@Test
  public void WinTest() {
	  driver = new EdgeDriver();// Launch Browser
		driver.manage().window().maximize();// Ma
		driver.get("https://stqatools.com/demo/Windows.php");
		String parentWin = driver.getWindowHandle();
		System.out.println("Parent Win: " + parentWin);
		
		WebElement tabBtn = driver.findElement(By.xpath("//button[contains(text(), 'new Tab')]"));
		tabBtn.click();
		System.out.println("Page Title :" + driver.getTitle());
		Set<String> tabs = driver.getWindowHandles();
		System.out.println("Number of windows..." +tabs.size());
		for(String child:tabs) {
			System.out.println("Windows..." + child);
			if(!child.equalsIgnoreCase(parentWin)) {
				driver.switchTo().window(child);
				
			}
			
		}
		
		
  }
}
