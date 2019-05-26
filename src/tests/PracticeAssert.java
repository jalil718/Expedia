package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Config;
import locators.ExLocators;

public class PracticeAssert extends Config {

	ExLocators exL= new ExLocators();
	
	@Test
	public void trycathch(){
		String expectedValue= "30% off";
		String actualValue= "Up to 30% hotel discounts for app users";
		Assert.assertEquals(expectedValue, actualValue);
	
	
	}
	
	
	



	
	
	
	
	
	
	
	
}
