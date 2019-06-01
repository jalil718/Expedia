package tests;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


import base.Config;
import locators.ExLocators;
import values.ExValues;

public class BookingaDesiredCar_Major_Functionality extends Config {

	ExLocators rCL = new ExLocators();
	ExValues  rCV	= new ExValues();


	@Test
	public void carReservation() throws InterruptedException{

		clickByXpath(rCL.hCars);

		clickByXpath(rCL.carOnlyTab);
		
		Thread.sleep(3000);

		typeByXpath(rCL.pickingUp,rCV.pickingUp);

		Thread.sleep(2000);

		typeByXpath(rCL.droppingOff,rCV.droppingOff);

		Thread.sleep(2000);

		typeById(rCL.pickUpDate,rCV.pickUpDate);

		WebElement pickUpTime = driver.findElement(By.id("car-pickup-time-clp"));
		Select sel= new Select(pickUpTime);
		sel.selectByVisibleText("1:45 pm");
		System.out.println(sel.getFirstSelectedOption().getText());

		typeById(rCL.dropOffDate,rCL.dropOffDate);

		WebElement dropOffTime = driver.findElement(By.id("car-dropoff-time-clp"));
		Select selDropTime= new Select(dropOffTime);
		selDropTime.selectByVisibleText("10:45 pm");
		System.out.println(selDropTime.getFirstSelectedOption().getText());

		WebElement	any=driver.findElement(By.xpath(rCL.checkboxCar));
		System.out.println(any.isDisplayed());
		boolean bl= any.isDisplayed();
		if (bl){//bl==true
			System.out.println("Exists");
			boolean enb= any.isEnabled();
			if (enb){
				any.click();
				boolean select=any.isSelected();
				if (select){
					System.out.println(" Check box selected");
				}
				else
				{System.out.println("Check box is not selected");
				}
			}
			else
			{
				System.out.println("Is not enabled");
			}

		}
		else
		{
			System.out.println("Not Existed");
		}
		Thread.sleep(3000);

		//		Advanced Option
		WebElement	ao=driver.findElement(By.xpath(rCL.carOnlyAdvancedOptions));
		System.out.println(ao.isDisplayed());
		boolean cao= ao.isDisplayed();
		if (cao){//bl==true
			System.out.println("Exists");
			boolean enable= ao.isEnabled();
			if (enable){
				ao.click();
				boolean select1=ao.isSelected();
				if (select1){
					System.out.println("Read more button clicked");
				}
				else
				{System.out.println("Read more button failed");
				}
			}
			else
			{
				System.out.println("Is not enabled");
			}

		}
		else
		{
			System.out.println("Not Existed");
		}

		//		clickByClass(rCL.carOnlyAdvancedOptions);
		
		Thread.sleep(3000);

		WebElement chooseCar= driver.findElement(By.name(rCL.carType));
		Select selCar= new Select(chooseCar);
		selCar.selectByVisibleText("Economy");
		System.out.println(selCar.getFirstSelectedOption().getText());

		WebElement chooseRCarCom= driver.findElement(By.name(rCL.rentalCarCompany));
		Select selCarCompany= new Select(chooseRCarCom);
		selCarCompany.selectByValue("AD");
		System.out.println(selCarCompany.getFirstSelectedOption().getText());

		WebElement discountCo= driver.findElement(By.id(rCL.discountCode));
		Select selDisCode= new Select(discountCo);
		selDisCode.selectByValue("0");
		System.out.println(selDisCode.getFirstSelectedOption().getText());
		
		Thread.sleep(4000);
		
		clickById(rCL.carSearchButton);
		
//		Choose and Booking
		
		Thread.sleep(4000);
		clickById(rCL.reserve);
		
	


















	}










}