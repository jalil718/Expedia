package tests;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Config;
import locators.ExLocators;
import utils.Xls_Reader;

public class ReadFromXl extends Config {

	
	Xls_Reader xL = new Xls_Reader(System.getProperty("user.dir")+"//testCase.xlsx");
	ExLocators exL= new ExLocators();
	
	
	
	@Test
	public void testReadFromXl(){
		
//	driver.findElement(By.id("primary-header-vacationRental")).click();	
	clickById(exL.hVactionRental);
	
		
	String value= xL.getCellData("expedia","TestData",2);
	
//	System.out.println("value"+value);
	
	driver.findElement(By.id("VR-destination")).sendKeys(value);
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
