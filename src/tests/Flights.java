package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Config;
import locators.ExLocators;

public class Flights extends Config {

	ExLocators fL= new ExLocators();
	
	@Test
	public void flights(){
		
		driver.findElement(By.xpath(fL.hFlights)).click();
	}
	
	
	@Test(dependsOnMethods = {"flights"})
	public void rTrip(){
		driver.findElement(By.id(fL.roundTrip)).click();
	}
	
	@Test
	public void onwy(){
		driver.findElement(By.id(fL.oneWay)).click();
	}
	
	@Test
	public void mltCities(){
		driver.findElement(By.id(fL.multipleCity)).click();
	}











}
