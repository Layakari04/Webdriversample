package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DoubleClickTest {
	WebDriver driver;
  @Test
  public void ClickmeTest() {
	  driver = new ChromeDriver();// Launch Browser
		driver.manage().window().maximize();// Maximize the window
		Actions actions = new Actions(driver);
		driver.get("https://www.stqatools.com/demo/DoubleClick.php");
		WebElement button = driver.findElement(By.xpath("//button[text()='Click Me / Double Click Me!']"));
	actions.click(button).perform();
		
  }
}
