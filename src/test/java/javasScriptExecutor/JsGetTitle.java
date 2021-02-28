package javasScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JsGetTitle {

	
	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		RemoteWebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String string = js.executeScript("return document.title").toString();
		
		System.out.println(string);
	}
}
