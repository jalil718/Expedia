package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.Config;

public class TotalLinksCount extends Config {

	
	
	
	@Test
	public void pageLinksCount() {
		List <WebElement> xy= driver.findElements(By.tagName("a"));
		System.out.println(xy.size());
		for(int i=0;i<xy.size();i++){
		System.out.println(xy.get(i).getText());
			
		}
	
	
	}






}
