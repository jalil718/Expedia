package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Config;
import locators.ExLocators;

public class SubHeaderFlights extends Config {

	ExLocators fL= new ExLocators();
	
	@Test
	public void flights(){
		
		driver.findElement(By.xpath(fL.hFlights)).click();
	
		driver.findElement(By.id(fL.roundTrip)).click();
	
		driver.findElement(By.id(fL.oneWay)).click();
	
		driver.findElement(By.id(fL.multipleCity)).click();
	


	}








}
