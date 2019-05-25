package tests;

import org.testng.annotations.Test;

import base.Config;

public class VerifyUserUsedRightUrl extends Config {
	
	@Test
	public void usingrighturl(){
		System.out.println(driver.getCurrentUrl());
		String ab=driver.getCurrentUrl();
		
		if(ab.equalsIgnoreCase("https://www.expedia.com/")){
			System.out.println("User input right url");
		}
		else{
			System.out.println("User used wrong url");
		}
	}
	
	
}
