package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Config;
import locators.ExLocators;
import values.ExValues;

public class ConfirmUserReceivedLinktexttoDownloadExpediaApp extends Config {

	ExLocators tm= new ExLocators();
	ExValues tv=new ExValues();
	
	@Test
	public void textMessageReceive(){
		typeById(tm.textMessage,tv.textMessage);
		clickByXpath(tm.textSend);
		driver.findElement(By.id("mad-t2d-form-input")).clear();
	
		System.out.println(driver.findElement(By.id("t2d-footer-success")).getText());
		String ef=driver.findElement(By.id("t2d-footer-success")).getText();
		if(ef.equalsIgnoreCase("Thank you! A text with the download link has been sent to your mobile device")){
			System.out.println("Link sent");
		}
		else{
			System.out.println("Link didn't send");
		}
	
	
	
	
	}
		
	
	
	
	
	}
	
	

