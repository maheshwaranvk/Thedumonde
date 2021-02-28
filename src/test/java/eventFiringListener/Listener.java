package eventFiringListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Listener {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		EventFiringWebDriver ef = new EventFiringWebDriver(driver);
		
		MyListener listener = new MyListener();
		ef.register(listener);
		
		ef.navigate().to("https://www.google.com/");
		
		ef.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("maheshwaran");
		ef.findElement(By.xpath("(//input[@type='submit'])[3]")).click();
		
		ef.navigate().back();
		ef.navigate().forward();
		
	}

}
