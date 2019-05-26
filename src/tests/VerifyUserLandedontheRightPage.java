package tests;

import org.testng.annotations.Test;

import base.Config;

public class VerifyUserLandedontheRightPage extends Config {

	@Test
	public void userLandedontherightpage(){
		System.out.println(driver.getTitle());
		String ab=driver.getTitle();
		if(ab.equalsIgnoreCase("Expedia Travel: Search Hotels, Cheap Flights, Car Rentals & Vacations")){
			System.out.println("User landed on the right page");
		}

		else{System.out.println("User landed on the wrong page");
		}





	}











}
