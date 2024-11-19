package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.sun.tools.javac.util.List;

public class MouseActionsTest {
	
  /**
 * @throws InterruptedException 
 * 
 */
@Test
  public void MenusTest() throws InterruptedException {
	  ChromeOptions options = new ChromeOptions();
	  //options.setAcceptInsecureerts(True);
	  options.addArguments("--blink-settings-imageEnabledflase");//Page not load with images for testing purpose
	  WebDriver driver = new ChromeDriver(options);// Launch Browser
		driver.manage().window().maximize();// Maximize the window
		Actions actions = new Actions(driver);
		driver.get("https://demo.opencart.com/");
		Thread.sleep(2000);
		//WebElement srcBox = driver.findElement(By.name("Search"));
		actions.contextClick(srcBox).perform();
	WebElement menu = driver.findElement(By.xpath("//ul[@class= 'nav navbar-nav']//descendant::a[text()='Components']"));
	//	actions.moveToElement(menu).perform();
	//	WebElement menuitem= driver.findElement(By.xpath("//ul[@class= 'list-unstyled']//a[contains(text(), 'Monitors (2)')]"));
	//	actions.click(menuitem).perform();
	//	actions.moveToElement(menu).click(menuitem).build().perform();
		
		List<WebElement> items = driver.findElements(By.cssSelector(null));
				
				int numItems = items.size();
		for(int i=0;i < items.size();i++ ) {
			WebElement item = items.get(i);
			if(item.getText().equalsIgnoreCase("Monitors (2)")) {
				item.click();
				break;
				
			}
		}
		
		
		
	  
	  
  }
}
