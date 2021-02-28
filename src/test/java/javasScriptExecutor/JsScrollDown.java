package javasScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JsScrollDown {

	
	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		RemoteWebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		
		WebElement findElementByXPath = driver.findElementByXPath("//input[@class='gLFyf gsfi']");
		
		js.executeScript("arguments[0].value='maheshwaran'", findElementByXPath);
		
		WebElement findElementByXPath1 = driver.findElementByXPath("(//input[@type='submit'])[3]");
		
		js.executeScript("arguments[0].click()", findElementByXPath1);
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
}
