package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class iFrameTest {
	WebDriver driver;
  @Test
  public void FrameTest() {
	  driver = new EdgeDriver();// Launch Browser
			driver.manage().window().maximize();// Ma
			driver.get("https://the-internet.herokuapp.com/iframe");
			//driver.switchTo().frame("mce_0_ifr");
			driver.switchTo().frame(0);
			WebElement iFrameElem = driver.findElement(By.id("mce_0_ifr"));
			driver.switchTo().frame(iFrameElem);
			WebElement inputTxt = driver.findElement(By.id("tinymce"));
			//inputTxt.clear();
			String  strTxt = inputTxt.getText();
			System.out.println("Txt from frame.." + strTxt);
			//Switch back to main page
			//driver.switchTo().parentFrame();
			driver.switchTo().defaultContent();
			
			
			
			
			
			
			
			
	  
  }
}
