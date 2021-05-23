package htmlDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnHtmlUnitDriver {

	public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
		WebDriver driver = new HtmlUnitDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("maheshwaran");
		driver.findElement(By.xpath("(//input[@type='submit'])[3]")).click();
		System.out.println(driver.getTitle());

	}

}
