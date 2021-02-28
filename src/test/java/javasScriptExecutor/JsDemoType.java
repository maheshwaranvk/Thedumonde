package javasScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JsDemoType {

public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	
	RemoteWebDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.com/");
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	WebElement findElementByXPath = driver.findElementByXPath("(//input[@class='gLFyf gsfi'])");
	
	js.executeScript("arguments[0].value='Maheshwaran'", findElementByXPath);
	
}
	
	
}
