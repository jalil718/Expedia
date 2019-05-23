package tests;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Utils.Xls_Reader;
import base.Config;
import locators.ExLocators;

public class ReadFromXl extends Config {

	
	Xls_Reader xL = new Xls_Reader(System.getProperty("user.dir")+"//testCase.xlsx");
	ExLocators eL= new ExLocators();
	
	
	
	@Test
	public void testReadFromXl(){
	String value= xL.getCellData("expedia","TestData",2);
	
	System.out.println("value"+value);
	
	driver.findElement(By.xpath("//*[@id='flight-origin-hp-flight']")).sendKeys(value);
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
