package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Config;
import locators.ExLocators;
import utils.Xls_Reader;

public class writeinXl extends Config{

	Xls_Reader xl = new Xls_Reader (System.getProperty("user.dir")+"//testCase.xlsx");
	ExLocators exL = new ExLocators();


	@Test
	public void testWriteinxl(){

		String value=driver.findElement(By.xpath(exL.gettheExpediaApp)).getText();
		xl.setCellData("expedia","TestData",7,value);
		
		String value1=driver.findElement(By.xpath(exL.footerWarningtext)).getText();
		xl.setCellData("expedia","TestData",9,value1);

	}







}
