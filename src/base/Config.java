package base;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.WebDriverFunctions;

public class Config extends WebDriverFunctions {	


	@BeforeMethod
	public void beforeTestStart(){
		//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mdjal\\Documents\\GitHub\\Expedia\\drivers\\chromedriver.exe");		// init the chrome driver
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		// lets go to facebook.com
		driver.get("https://www.expedia.com/");
		// maximize the window 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	} 
	@AfterMethod
	public void closewindow(){
		driver.close();
	}
}
