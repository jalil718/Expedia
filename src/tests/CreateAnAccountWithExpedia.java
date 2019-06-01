package tests;

import org.testng.annotations.Test;

import base.Config;
import locators.ExLocators;
import values.ExValues;

public class CreateAnAccountWithExpedia extends Config {

	ExLocators cAcc = new ExLocators();
	ExValues cExAcc = new ExValues();

	@Test
	public void accountHeader(){
		clickById(cAcc.hAccount);

		clickById(cAcc.creatAnAccount);

		typeById(cAcc.firstNameL, cExAcc.firstNameV);

		typeById(cAcc.lastNameL,cExAcc.lastNameV);

		typeById(cAcc.emailL,cExAcc.email);

		typeById(cAcc.passwordL,cExAcc.pass);

		clickById(cAcc.cAccSubmit);

	}








}
