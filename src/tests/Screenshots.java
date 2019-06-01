package tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import base.Config;

public class Screenshots extends Config {

@Test
public void pictureCapture() throws Exception{

	TakesScreenshot ts = (TakesScreenshot)driver;
	File src= ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("./screenShots/Test.png"));
	System.out.println("Screenshot taken");

}
	
	
	
}
