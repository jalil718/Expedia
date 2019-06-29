package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Config;
import locators.ExLocators;

public class TryCatchPractice extends Config {

	ExLocators exL= new ExLocators();
	
	
@Test
public void tryCatchPractice(){
	
	String expval = "nothing to say";
	String actval= driver.findElement(By.xpath(exL.alrightreserve)).getText();
	System.out.println(driver.findElement(By.xpath(exL.alrightreserve)).getText());
	
	try{Assert.assertEquals(actval,expval);
		
	}catch(Throwable t){
		System.err.println("didn't match"+t);
	}
	
	
}
	
	
	
	
	
	
}
