package testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableTest {
	WebDriver driver;
  @Test
  public void TableTest() {
	  driver = new ChromeDriver();// Launch Browser
		driver.manage().window().maximize();// Maximize the window
		driver.get("https://testautomationpractice.blogspot.com/"); //Dynamic page
		List<WebElement> items = driver.findElements(By.xpath("//td[contains(text( ), 'Master In Selenium')]//following-sibling::td"));
		System.out.println("Number of items...:" + items.size());
		for(WebElement item : items) {
			System.out.println("Item Value...:" + item.getText());
		}
		List<WebElement> items1 = driver.findElements(By.xpath("//td[contains(text( ), '3000')]//preceding-sibling::td[1]"));
		System.out.println("Number of items...:" + items1.size());
		for(WebElement item1 : items1) {
			System.out.println("Item Value...:" + item1.getText());
		}
		List<WebElement> items2 = driver.findElements(By.cssSelector("input[placeholder='Enter Name']"));
		System.out.println("Number of items...:" + items2.size());
		for(WebElement item2 : items2) {
			System.out.println("Item Value...:" + item2.getText());
		}
		
		driver.close();
  }
}
