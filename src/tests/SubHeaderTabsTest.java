package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Config;
import locators.ExLocators;

public class SubHeaderTabsTest extends Config {

	ExLocators sHL = new ExLocators();
	
	@Test
	public void flights(){
		driver.findElement(By.id(sHL.sHFlights)).click();
	}
	
	@Test
	public void hotes(){
		driver.findElement(By.id(sHL.sHHotels)).click();
	}
	
	@Test
	public void bundleAndSave(){
		driver.findElement(By.id(sHL.sHBundleAndSave)).click();
	}
	
	@Test
	public void cars(){
		driver.findElement(By.id(sHL.sHCars)).click();
	}
	
	@Test
	public void Cruises(){
		driver.findElement(By.id(sHL.sHThingsToDo)).click();
	}
	
	@Test
	public void vacation(){
		driver.findElement(By.id(sHL.sHvaction)).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
