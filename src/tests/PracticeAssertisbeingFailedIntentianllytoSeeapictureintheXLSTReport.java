package tests;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Config;
import locators.ExLocators;

public class PracticeAssertisbeingFailedIntentianllytoSeeapictureintheXLSTReport extends Config {

	ExLocators exL= new ExLocators();
	
	@Test
	public void assertpractice(){
		String expectedValue= "Up to 30% hotel discounts";
		String actualValue= driver.findElement(By.xpath(exL.hotelDiscount)).getText();
				
//		System.out.println(driver.findElement(By.xpath(exL.hotelDiscount)).getText());	
		
		Assert.assertEquals(actualValue,expectedValue);
	}
	


		
		
		
	



	
	
	
	
	
	
	
	
}
