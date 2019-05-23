package tests;

import org.testng.annotations.Test;

import base.Config;
import locators.ExLocators;
import values.ExValues;

public class UserisAbletoSigninwithValidCredentials extends Config {

	
	ExLocators sI = new ExLocators();
	ExValues sIA = new ExValues();
	
	
	@Test
	public void signInAccount() throws InterruptedException{
		
		clickById(sI.accountHeader);
		
		clickById(sI.signInFromAccountDropdown);
		
		typeById(sI.accountEmail,sIA.email);
		
		typeById(sI.accountPass,sIA.pass);
		
		clickById(sI.signInButton);
		
		Thread.sleep(3000);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
