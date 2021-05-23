package sugan;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrontAccounting {

	@Test
	public void runit() {
	
		WebDriverManager.firefoxdriver().setup();
		
		RemoteWebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
	}
}
