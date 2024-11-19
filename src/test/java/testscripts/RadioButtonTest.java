package testscripts;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButtonTest {
	WebDriver driver;
  @Test
  public void RBTest() throws InterruptedException{
	  driver = new ChromeDriver();// Launch Browser
		driver.manage().window().maximize();// Maximize the window
		//driver.get("https://demoqa.com/automation-practice-form");
		//driver.findElement(By.id("gender-radio-1")).click();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type = 'checkbox'][1])")).click();
		boolean isSel = driver.findElement(By.xpath("(//input[@type = 'checkbox'][2])")).isSelected();
				if(isSel)  {
					
					driver.findElement(By.xpath("(//input[@type = 'checkbox'][2])")).click();
					driver.close();
					
				}
		
		
		
  }
}
