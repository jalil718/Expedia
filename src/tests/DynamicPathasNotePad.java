package tests;

import org.testng.annotations.Test;

public class DynamicPathasNotePad {
	
	@Test(enabled=false)
	public void dynamicath() {

//		System.out.println(" the path is " +System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");

	}
}


