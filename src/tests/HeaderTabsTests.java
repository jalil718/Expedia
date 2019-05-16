package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Config;
import locators.ExLocators;

public class HeaderTabsTests extends Config {

	
	ExLocators hFts= new ExLocators();
	
	@Test
	public void flights(){
		
		driver.findElement(By.xpath(hFts.hFlights)).click();
	}
	
	@Test
	public void  hotels(){
		driver.findElement(By.xpath(hFts.hHotels)).click();
	}
	
	@Test
	public void bundleAndSave(){
		driver.findElement(By.xpath(hFts.hBundleAndSave)).click();
	}
	
	@Test
	public void cars(){
		driver.findElement(By.xpath(hFts.hCars)).click();
	}
	@Test
	public void cruises(){
		driver.findElement(By.xpath(hFts.hCruises)).click();
	}
	
	@Test
	public void thingsToDo(){
		driver.findElement(By.xpath(hFts.hVactionRental)).click();
	}
	
	@Test
	public void deals(){
		driver.findElement(By.xpath(hFts.hDeals)).click();
	}
	
	@Test
	public void mobile(){
		driver.findElement(By.xpath(hFts.hMobile)).click();
	}


































}
