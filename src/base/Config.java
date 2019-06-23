package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

import utils.WebDriverFunctions;

public class Config extends WebDriverFunctions {	

	@Parameters("browser")
	@BeforeMethod
	public void beforeTestStart(String browser){
		//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mdjal\\Documents\\GitHub\\Expedia\\drivers\\chromedriver.exe");		// init the chrome driver
		if(browser.equalsIgnoreCase("ch")){
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();

		}

		else if(browser.equalsIgnoreCase("ff")){
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\drivers\\geckodriver.exe");
			driver= new FirefoxDriver();
		}

		// lets go to facebook.com
		driver.get("https://www.expedia.com/");
		// maximize the window 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	} 
	@AfterMethod
	public void closeWindow(){
		driver.close();
	}









}
