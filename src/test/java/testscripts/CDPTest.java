package testscripts;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CDPTest {
	
ChromeDriver driver;
DevTools devTools;

//@BeforeMethod
	@BeforeTest
	public void setup() {
		 driver = new ChromeDriver();// Launch Browser
		 devTools = driver.getDevTools();
		 devTools.createSession(driver.getWindowHandle());
			
	}		
  @Test
  public void deviceModeTest() {
	  Map deviceMetrics = new HashMap() {{
		  put("width", 600);
		  put("height", 900);
		  put("deviceScaleFactor", 50);
		  put("mobile", true);
	  }};
	  driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", deviceMetrics);
	  driver.get("https://www.selenium.dev/");
  }
  @Test
  public void GeoLocationTest() {
	  Map deviceMetrics = new HashMap() {{
		  put("latitude", 26.48013);
		  put("longitude", -81.43598);
		  put("accuracy", 100);
	  }};
		  driver.executeCdpCommand("Emulation.setGeoLocationOverride", deviceMetrics);
		  driver.get("https://oldnavy.gap.com/stores");
	  }
	  }
