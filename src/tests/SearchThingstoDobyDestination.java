 package tests;

import org.testng.annotations.Test;

import base.Config;
import locators.ExLocators;
import values.ExValues;

public class SearchThingstoDobyDestination extends Config{

	ExLocators exL= new ExLocators();
	ExValues exV = new ExValues();
	
	@Test
	public void thingstoDo() throws InterruptedException{
		clickById(exL.hThingsToDo);
		
		Thread.sleep(2000);
		
		typeById(exL.thingstoDoDestination,exV.thingstoDoLocation);
		
		typeById(exL.thingstoDoFromDate,exV.thingstoDoFromDate);
		
		typeById(exL.thingstoDoToDate,exV.thingstoDoToDate);
		
		clickByXpath(exL.activitiySearchButton);
		
		Thread.sleep(4000);
	}
}
