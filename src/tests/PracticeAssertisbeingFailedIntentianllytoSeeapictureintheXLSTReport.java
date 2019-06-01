package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Config;
import locators.ExLocators;

public class PracticeAssertisbeingFailedIntentianllytoSeeapictureintheXLSTReport extends Config {

	ExLocators exL= new ExLocators();
	
	@Test
	public void trycathch(){
		String expectedValue= "Up to 30% hotel discounts";
		String actualValue= driver.findElement(By.xpath(exL.hotelDiscount)).getText();
				
//		driver.findElement(By.xpath(exL.hotelDiscount)).getText();
		
		Assert.assertEquals(actualValue,expectedValue);
		
		}
		
	



	
	
	
	
	
	
	
	
}
