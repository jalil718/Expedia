package Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverFunctions {

	protected WebDriver driver;
	// type
	 // by xpath, 
	 // by id
	 // by class
	 // by css
	
	// click
	 // by link
	 // tagname
	 // by xpatch
	
	// getText
	// radioButton
	// dropdown
	// iFrame
	// windows handle
	// switch
	// ---------------------------- EDIT BOX ----------------
	public void typeByXpath (String loc, String val){
		driver.findElement(By.xpath(loc)).sendKeys(val);
	}
	
	public void typeByName (String loc, String val){
		driver.findElement(By.name(loc)).sendKeys(val);
	}
	
	public void typeById(String loc, String val){
		driver.findElement(By.id(loc)).sendKeys(val);
	}
	
	public void typeByClass(String loc, String val){
		driver.findElement(By.className(loc)).sendKeys(val);
	}
	
	public void typeByCss(String loc, String val){
		driver.findElement(By.cssSelector(loc)).sendKeys(val);
	}
	
	
	
	
	
	// ----------------------- CLICK -------------------
	public void clickByXpath (String loc){
		driver.findElement(By.xpath(loc)).click();
	}
	
	public void clickByLinkText(String val){
		driver.findElement(By.linkText(val));
	}
	
	public void clickByName(String val){
		driver.findElement(By.name(val)).click();
	}
	
	public void clickById(String val){
		driver.findElement(By.id(val)).click();
	}
	
	public void clickByClass(String val){
		driver.findElement(By.className(val)).click();
	}
	
	public void clickByCss(String val){
		driver.findElement(By.cssSelector(val)).click();
	}
	
	
	// -------------- TIME
	public void currentTime() {
		// java code to get the current time
	}
	
	
	// implicit wait
	public void customSleep (int x) throws InterruptedException{
		Thread.sleep(x);
	}
	public void implicitWait(int y){
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	//	explicit wait
	
	// ------------------ RadioButton
	
	//linktexts visibility
	
	public void linkTextsVis(String loc){
	
	System.out.println(driver.findElement(By.xpath(loc)).getText());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
