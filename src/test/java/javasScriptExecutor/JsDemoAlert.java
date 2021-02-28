package javasScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JsDemoAlert {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		RemoteWebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//js.executeScript("alert('Hey You')"); //Normal Alert
		
		//js.executeScript("prompt('Enter Your Name')"); // prompt Alert
		
		//js.executeScript("confirm('Are you ok')");		
		
		
		
	}
}
