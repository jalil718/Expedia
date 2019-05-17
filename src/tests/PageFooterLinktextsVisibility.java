package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Config;
import locators.ExLocators;

public class PageFooterLinktextsVisibility extends Config {
	
	ExLocators exFoo = new ExLocators();
	
	@Test(priority=1)
	public void expedia(){
	
	linkTextsVis(exFoo.expediaFooter);
	
	String ab= 	"System.out.println(driver.findElement(By.xpath(loc)).getText())";

	if(ab.equalsIgnoreCase("Expedia")){
		System.out.println("Right text visible");
	}
	else{
		System.out.println("Right text not visible");
		}
	}
	
	@Test(priority=2)
	public void expediaFooterLinkTexts(){
		String part1="//*[@id='expedia-links']/li[";
		String part2="]/a";
		for(int i=1;i<=10;i++){
		String Completedpath=part1+i+part2;
		System.out.println(driver.findElement(By.xpath(Completedpath)).getText());
				}
		}
	
	@Test(priority=3)
	public void expediaRewardsFooterLinkTexts(){
		
		linkTextsVis(exFoo.expediaRewardsFooter);

		
		String part1="//*[@id='rewards-links']/li[";
		String part2="]/a";
		for(int i=1;i<=5;i++){
		String Completedpath=part1+i+part2;
		System.out.println(driver.findElement(By.xpath(Completedpath)).getText());
				}
		}
	
	@Test(priority=4)
	public void expediaLinksFooterLinktexts(){
		
		linkTextsVis(exFoo.expediaLinksFooter);

		
		String part1="//*[@id='brand-links-links']/li[";
		String part2="]/a";
		for(int i=1;i<=6;i++){
		String Completedpath=part1+i+part2;
		System.out.println(driver.findElement(By.xpath(Completedpath)).getText());
				}
		}
	
	@Test(priority=5)
	public void expediaSitemapsFooterLinkTexts(){
		
		linkTextsVis(exFoo.expediaSiteMapsFooter);

		String part1="//*[@id='expedia-sitemaps-links']/li[";
		String part2="]/a";
		for(int i=1;i<=6;i++){
		String Completedpath=part1+i+part2;
		System.out.println(driver.findElement(By.xpath(Completedpath)).getText());
				}
		}
	
	@Test(priority=6)
	public void expediaPartnerServicesFooterLinkTexts(){
		
		linkTextsVis(exFoo.expediaPartnerServicesFooter);

		
		String part1="//*[@id='partner-services-links']/li[";
		String part2="]/a";
		for(int i=1;i<=10;i++){
		String Completedpath=part1+i+part2;
		System.out.println(driver.findElement(By.xpath(Completedpath)).getText());
				}
	}
	
	@Test(priority=7)
	public void expediaGlobalSitesFooterLinkTexts(){
		
		linkTextsVis(exFoo.expediaGlobalSitesFooter);

		
		String part1="//*[@id='global-sites-links']/li[";
		String part2="]/a";
		for(int i=1;i<=41;i++){
		String Completedpath=part1+i+part2;
		System.out.println(driver.findElement(By.xpath(Completedpath)).getText());
				}
	}
	
	@Test(priority=8)
	public void expediaPartnersFooterLinktexts(){
		
		linkTextsVis(exFoo.expediaPartnersFooter);

		String part1="//*[@id='expedia-partners-links']/li[";
		String part2="]/a";
		for(int i=1;i<=14;i++){
		String Completedpath=part1+i+part2;
		System.out.println(driver.findElement(By.xpath(Completedpath)).getText());
				}
	}
	
	@Test(priority=9)
	public void expediaEndTextAfterLinkTexts(){
		linkTextsVis(exFoo.expediaEndText);

	}
	
	
	
	
	
	
	
	
}
