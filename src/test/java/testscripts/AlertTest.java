package testscripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AlertTest {
	
	WebDriver driver;
  @Test
  public void Atest() throws InterruptedException {
	  
	  driver = new EdgeDriver();// Launch Browser
		driver.manage().window().maximize();// Maximize the window
		Actions actions = new Actions(driver);
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(2000);
		WebElement alertBtn = driver.findElement(By.id("alertButton"));
		actions.scrollToElement(alertBtn).perform();
		Thread.sleep(2000);
		alertBtn.click();
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert Text :" + alert.getText());
		
		alert.accept();
		
		//Handling Confirm Alert
		
		WebElement confirmBtn = driver.findElement(By.id("confirmButton"));
		actions.scrollToElement(confirmBtn).perform();
		Thread.sleep(2000);
		confirmBtn.click();
		Alert confirm = driver.switchTo().alert();
		System.out.println("Confirm Alert Text :" + confirm.getText());
		confirm.dismiss();
		
		//Handling Promt Alert
		WebElement promtBtn = driver.findElement(By.id("promtButton"));
		actions.scrollToElement(promtBtn).perform();
		Thread.sleep(2000);
		promtBtn.click();
	
		Alert promt = driver.switchTo().alert();
		System.out.println("Promt Alert Text :" + promt.getText());
		promt.accept();
				
	  
  }
}
