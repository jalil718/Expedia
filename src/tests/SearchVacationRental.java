package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.Config;
import locators.ExLocators;
import values.ExValues;

public class SearchVacationRental extends Config {

	ExLocators exL= new ExLocators();
	ExValues exV= new ExValues();
	
	@Test
	public void vacationRental(){
	clickById(exL.hVactionRental);
	
	typeById(exL.vacationRentalDestination,exV.vRDestinationDC);
	
	typeById(exL.vRFromDate,exV.vRFromDate);
	
	typeById(exL.vRToDate,exV.vRToDate);
	
	WebElement vacationRental=driver.findElement(By.id(exL.vRGuest));
	Select sel= new Select(vacationRental);
	sel.selectByVisibleText("3");
	System.out.println(sel.getFirstSelectedOption().getText());
	
	clickById(exL.vRSearhButton);


	
	
	
	
	
	
	
	}

}

