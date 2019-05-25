package tests;

import org.testng.annotations.Test;

import base.Config;
import locators.ExLocators;
import values.ExValues;

public class CreateAnAccountWithExpedia extends Config {

	ExLocators cAcc = new ExLocators();
	ExValues cExAcc = new ExValues();
	
	@Test(priority=1)
	public void accountHeader(){
		clickById(cAcc.hAccount);
		}
	
	@Test(priority=2)
	public void creatAnAccountFromDropDown(){
		clickById(cAcc.creatAnAccount);

	}
	
	@Test(priority=3)
	public void info(){
		typeById(cAcc.firstNameL, cExAcc.firstNameV);
		
		typeById(cAcc.lastNameL,cExAcc.lastNameV);
		
		typeById(cAcc.emailL,cExAcc.email);
		
		typeById(cAcc.passwordL,cExAcc.pass);
		}
	
	@Test(priority=4)
		public void cAccSubmitButton(){
		clickById(cAcc.cAccSubmit);

	}
	
	
	
	
	
	
	
	
}
