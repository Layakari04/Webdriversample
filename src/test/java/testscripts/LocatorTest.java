package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LocatorTest {

	WebDriver driver;

	@Test
	public void loginTest() {
		driver = new ChromeDriver();// Launch Browser
		driver.manage().window().maximize();// Maximize the window
		// driver.get("https://www.google.com/"); //Dynamic page
		driver.navigate().to("https://the-internet.herokuapp.com/login"); //move to the particular page
		// WebElement username = driver.findElement(By.id("username"));
		// username.sendKeys("tomsmith");
		// driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
		// WebElement password= driver.findElement(By.id("password"));
		// password.sendKeys("SuperSecretPassword!");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		// driver.findElement(By.className("radius")).click();
		driver.findElement(By.cssSelector("button.radius")).click();//through css selector
		//driver.findElement(By.className("fa fa-2x fa-sign-in")).click();
		//driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
		driver.findElement(By.linkText("Elemental Selenium")).click();
		// driver.findElement(By.partialLinkText("Elemental")).click();
		
		driver.close();
	}
}
