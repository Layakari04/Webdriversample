package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class GooglePageTest {

	WebDriver driver;

	/**
	* 
	*/
	@Test
	public void SearchJavaTest() {

		// To run in different version

		// ChromeOptions options = new ChromeOptions();
		// options.addArguments("--headless");
		// options.setBrowserVersion("115");//to setup the browser version.It will download the .exe file for the version

		driver = new ChromeDriver();// Launch Browser
		driver.manage().window().maximize();// Maximize the window
		// driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");
		WebElement searchBox = driver.findElement(By.id("APjFqb"));// search with the locator id
		//WebElement searchBox = driver.findElement(By.name("q"));// search with the locator name
		//WebElement searchBox = driver.findElement(By.className("gLFyf"));// search with the locator Class name
		//WebElement searchBox = driver.findElement(By.tagName("textarea"));// search with the locator Tag name
		searchBox.sendKeys("Java Tutorial");// Enter the data in text box
		searchBox.sendKeys(Keys.ENTER);// keyboard keys to press enter
		System.out.println("Page Title : " + driver.getTitle());
//navigate to before page with back method and again move to current page with forward method.
		driver.navigate().back();
		System.out.println("Page Title : after back..." + driver.getTitle());
		driver.navigate().forward();
		// driver.navigate().refresh();
		System.out.println("Page Title : after forward..." + driver.getCurrentUrl());
		driver.close();

	}
}
