package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.Config;

public class CountIframeinthePage extends Config{

	@Test
	public void countIframe(){
		List<WebElement> xy= driver.findElements(By.tagName("iframe"));
		System.out.println(xy.size());
	}
	
	
	
	
	
}
