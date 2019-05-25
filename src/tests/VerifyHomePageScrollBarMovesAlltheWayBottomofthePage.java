package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import base.Config;

public class VerifyHomePageScrollBarMovesAlltheWayBottomofthePage extends Config {
	
	@Test
	public void expediaMainPageScrollBar() throws InterruptedException{
	JavascriptExecutor js = (JavascriptExecutor) driver;  
	js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

	Thread.sleep(3000);
	
	}
	
	
	
	
	
	
	
}
