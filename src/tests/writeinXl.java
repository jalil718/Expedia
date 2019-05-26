package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Utils.Xls_Reader;
import base.Config;
import locators.ExLocators;

public class writeinXl extends Config{

	Xls_Reader xl = new Xls_Reader (System.getProperty("user.dir")+"//testCase.xlsx");
	ExLocators exL = new ExLocators();


	@Test
	public void testWriteinxl(){

		String value=driver.findElement(By.xpath(exL.gettheExpediaApp)).getText();
		xl.setCellData("expedia","TestData",5,value);

	}







}
