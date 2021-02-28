package eventFiringListener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class MyListener extends AbstractWebDriverEventListener{

	@Override
	public void beforeNavigateBack(WebDriver driver) {
	System.out.println("Code is in Listener Before Navigate Back");
	}

	@Override
	public void afterNavigateBack(WebDriver driver) {
	System.out.println("Code is in Listener after Navigate Back");
	}

	@Override
	public void beforeNavigateForward(WebDriver driver) {
	System.out.println("Code is in Listener Before Navigate Forward");
	}

	@Override
	public void afterNavigateForward(WebDriver driver) {
	System.out.println("Code is in Listener After Navigate Forward");
	}

	
}
