package lazyLoad;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMytrip {
	
@Test
public void runLazyLoad() {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	
	int size2 = 0;
	int size;
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	driver.get("https://www.makemytrip.com/");
	
		/*
		 * if(driver.findElement(By.
		 * xpath("//div[@class='autopop__wrap makeFlex column defaultCursor']")).
		 * isEnabled()) {
		 * 
		 * driver. }
		 */
	//driver.findElement(By.xpath("//div[@class='loginModal displayBlock modalLogin dynHeight personal ']")).click();
	
	driver.findElement(By.xpath("//p[@data-cy='submit']/a")).click();
	
	List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='makeFlex perfectCenter appendRight15']"));
	size = findElements.size();
	
	while(size>size2) {
		{
			size2=size;
			js.executeScript("window.scrollBy(0,10000)");
			List<WebElement> findElements2 = driver.findElements(By.xpath("//div[@class='makeFlex perfectCenter appendRight15']"));
			size = findElements2.size();
		}
		System.out.println(size);
	}
	
	
	

}

}
