package tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import base.Config;

public class VerifyUserLandedontheRightPage extends Config {

	@Test
	public void userLandedontherightpage() throws IOException{
		System.out.println(driver.getTitle());
		String ab=driver.getTitle();
		if(ab.equalsIgnoreCase("Expedia Travel: Search Hotels, Cheap Flights, Car Rentals & Vacations")){
			System.out.println("User landed on the right page");
		}

		else{System.out.println("User landed on the wrong page");
		}

		TakesScreenshot ts = (TakesScreenshot)driver;
		File src= ts.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(src, new File("./screenShots/.png"));




	}











}
