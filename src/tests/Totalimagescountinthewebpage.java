package tests;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.Config;

public class Totalimagescountinthewebpage extends Config {

	@Test
	public void totalImageCount(){
		List<WebElement> xy= driver.findElements(By.tagName("img"));
		System.out.println(xy.size());
		
	}
	
	
	
	
	
	
	
}