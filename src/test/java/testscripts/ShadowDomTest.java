package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ShadowDomTest {
	
	WebDriver driver;
  @Test
  public void SDTest() {
	  driver = new ChromeDriver();// Launch Browser
		driver.manage().window().maximize();// Maximize the window
		driver.get("http://watir.com/examples/shadow_dom.html");
		WebElement shadowHost = driver.findElement(By.cssSelector("div#shadow_host"));
		SearchContext context =  shadowHost.getShadowRoot();
		WebElement shadowContent = context.findElement(By.cssSelector("span#shadow_content"));
		;
	System.out.println("Shadow Dom Content : " + shadowContent.getText());
	SoftAssert softAssert = new SoftAssert();
	softAssert.assertEquals(shadowContent.getText(), "some text1" );
	
	WebElement innerShadow = context.findElement(By.cssSelector("div#nested_shadow_host"));
	SearchContext innerContext =  innerShadow.getShadowRoot();
	String innerTxt = innerContext.findElement(By.cssSelector("div#nested_shadow_content")).getText();
	System.out.println("Inner Dom Text : " + innerTxt);
	softAssert.assertEquals(innerTxt, "nested text" );
	softAssert.assertAll();
	
	
  }
}