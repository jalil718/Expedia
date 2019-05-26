package tests;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.SkipException;
import org.testng.annotations.Test;

import base.Config;
import locators.ExLocators;

public class AlertMessage extends Config {

	ExLocators alM = new ExLocators();
	
	@Test(enabled=false)
	
	public void alertMessage(){

	System.out.println(driver.findElement(By.xpath(alM.AlMessage)).getText());
	String ab= driver.findElement(By.xpath(alM.AlMessage)).getText();
	

	if(ab.equalsIgnoreCase("We are currently experiencing high call volume and long wait times. If your needs are not urgent, please consider postponing your call to avoid long hold times.")){
		System.out.println("Correct message");
	}
	
	else{
		System.out.println("Wrong message");
	}
		
		
	}
	
	
	
	
	
}
