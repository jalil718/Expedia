package tests;

import org.openqa.selenium.By;
import org.testng.SkipException;
import org.testng.annotations.Test;

import base.Config;
import locators.ExLocators;

public class VerifySubHeaderTabsTakeUsertotheRightPage extends Config {

	ExLocators sHL = new ExLocators();
	
	@Test
	public void subHeaderTabs(){
		driver.findElement(By.id(sHL.sHFlights)).click();
	
		driver.findElement(By.id(sHL.sHHotels)).click();
	
		driver.findElement(By.id(sHL.sHBundleAndSave)).click();
	
		driver.findElement(By.id(sHL.sHCars)).click();
	
		driver.findElement(By.id(sHL.sHThingsToDo)).click();
	
		driver.findElement(By.id(sHL.sHvaction)).click();
	
	
		throw new SkipException("Requirements changed and we don't need to perform this test anymore");
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
