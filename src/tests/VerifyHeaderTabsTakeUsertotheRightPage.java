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

		//		driver.findElement(By.xpath(hFts.hHotels)).click();
		clickByXpath(hFts.hHotels);

		driver.findElement(By.xpath(hFts.hBundleAndSave)).click();

		clickByXpath(hFts.hCars);
		//		driver.findElement(By.xpath(hFts.hCars)).click();

		driver.findElement(By.xpath(hFts.hCruises)).click();

		driver.findElement(By.xpath(hFts.hVactionRental)).click();

		driver.findElement(By.xpath(hFts.hDeals)).click();

		driver.findElement(By.xpath(hFts.hMobile)).click();



	}


































}
