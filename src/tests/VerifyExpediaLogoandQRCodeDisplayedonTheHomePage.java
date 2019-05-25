package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.Config;
import locators.ExLocators;

public class VerifyExpediaLogoandQRCodeDisplayedonTheHomePage extends Config {
	
	ExLocators image= new ExLocators();
	
	@Test(priority=1)
	public void expediaLogo(){
		WebElement ImageFile = driver.findElement(By.xpath(image.expediaLogo));
        Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile);
        if (!ImagePresent)
        {
             System.out.println("Image not displayed.");
        }
        else
        {
            System.out.println("Image displayed.");
        }
	}
	
	
	@Test(priority=2)
	public void scanQRCode(){
		WebElement ImageFile = driver.findElement(By.xpath(image.scanQRCode));
        Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile);
        if (!ImagePresent)
        {
             System.out.println("Image not displayed.");
        }
        else
        {
            System.out.println("Image displayed.");
        }

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
