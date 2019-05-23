package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


import base.Config;
import locators.ExLocators;
import values.ExValues;

public class userisAbletoReserveaCar extends Config {

	ExLocators rCL = new ExLocators();
	ExValues  rCV	= new ExValues();
	

	@Test
	public void carReservation() throws InterruptedException{
		clickByXpath(rCL.hCars);	
		
		typeByXpath(rCL.pickingUp,rCV.pickingUp);
		
		Thread.sleep(2000);
		
		typeByXpath(rCL.droppingOff,rCV.droppingOff);
		
		Thread.sleep(2000);
		
		typeById(rCL.pickUpDate,rCV.pickUpDate);
		
		WebElement pickUpTime = driver.findElement(By.id("car-pickup-time-clp"));
		Select sel= new Select(pickUpTime);
		sel.selectByVisibleText("1:45 pm");
		System.out.println(sel.getFirstSelectedOption().getText());
		
		typeById(rCL.dropOffDate,rCV.dropOffDate);
		
		WebElement dropOffTime = driver.findElement(By.id("car-dropoff-time-clp"));
		Select selDropTime= new Select(dropOffTime);
		sel.selectByVisibleText("10:45 pm");
		System.out.println(sel.getFirstSelectedOption().getText());
				
		clickById(rCL.carOnlyCheckBOx);
		
		clickByClass(rCL.carOnlyAdvancedOptions);

		clickById(rCL.carSearchButton);	
		
		
		

		











	}










}
