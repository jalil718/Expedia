package tests;

import org.openqa.selenium.By;
import org.testng.SkipException;
import org.testng.annotations.Test;

import base.Config;
import locators.ExLocators;

public class VerifyHeaderTabsTakeUsertotheRightPage extends Config {


	ExLocators hFts= new ExLocators();

	@Test
	public void headerTabsClickability(){

		//		driver.findElement(By.xpath(hFts.hFlights)).click();
		clickByXpath(hFts.hFlights);
		System.out.println(driver.getTitle());
		String ab=driver.getTitle();
		if(ab.equalsIgnoreCase("Cheap Flights: Airline Tickets, Airfare Deals & One Way Flights | Expedia")){
			System.out.println("User landed on the right page");
		}
		else{System.out.println("User landed on the wrong page");}

		clickByXpath(hFts.hHotels);
		System.out.println(driver.getTitle());
		String cd=driver.getTitle();
		if(cd.equalsIgnoreCase("Hotels: Search Cheap Hotels, Deals, Discounts & Reservations | Expedia")){
			System.out.println("User landed on the right page");
		}
		else{System.out.println("User landed on the wrong page");}


		driver.findElement(By.xpath(hFts.hBundleAndSave)).click();
		System.out.println(driver.getTitle());
		String ef=driver.getTitle();
		if(ef.equalsIgnoreCase("Vacation Packages: Find Travel Deals for Cheap Vacations | Expedia")){
			System.out.println("User landed on the right page");
		}
		else{System.out.println("User landed on the wrong page");}


		clickByXpath(hFts.hCars);
		System.out.println(driver.getTitle());
		String gh=driver.getTitle();
		if(gh.equalsIgnoreCase("Car Rental: Cheap Airport Car Rentals & Rental Car Deals | Expedia")){
			System.out.println("User landed on the right page");
		}
		else{System.out.println("User landed on the wrong page");}


		driver.findElement(By.xpath(hFts.hCruises)).click();
		System.out.println(driver.getTitle());
		String ij=driver.getTitle();
		if(ij.equalsIgnoreCase("Cruises: Find Cheap Cruise Deals & Last Minute Cruises | Expedia")){
			System.out.println("User landed on the right page");
		}
		else{System.out.println("User landed on the wrong page");}


		clickById(hFts.hThingsToDo);
		System.out.println(driver.getTitle());
		String kl=driver.getTitle();
		if(ab.equalsIgnoreCase("Things To Do Near Me: Find Fun Activities Nearby | Expedia")){
			System.out.println("User landed on the right page");
		}
		else{System.out.println("User landed on the wrong page");}


		clickById(hFts.hVactionRental);
		System.out.println(driver.getTitle());
		String mn=driver.getTitle();
		if(mn.equalsIgnoreCase("Vacation Rentals: Search for Condos, Cabins, Villas and Home Rentals | Expedia")){
			System.out.println("User landed on the right page");
		}
		else{System.out.println("User landed on the wrong page");}


		clickById(hFts.hDeals);
		System.out.println(driver.getTitle());
		String op=driver.getTitle();
		if(op.equalsIgnoreCase("Travel Deals: Find Cheap Deals on Travel, Trips & Tours | Expedia.com")){
			System.out.println("User landed on the right page");
		}
		else{System.out.println("User landed on the wrong page");}


		clickById(hFts.hMobile);
		System.out.println(driver.getTitle());
		String qr=driver.getTitle();
		if(qr.equalsIgnoreCase("Expedia Mobile App")){
			System.out.println("User landed on the right page");
		}
		else{System.out.println("User landed on the wrong page");}



	}


































}
