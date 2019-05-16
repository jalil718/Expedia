package locators;

public class ExLocators {

//	All headers tabs locators
	
	public String hFlights = "//*[@id='primary-header-flight']";
	
	public String hHotels = "//*[@id='primary-header-hotel']";
	
	public String hBundleAndSave = "//*[@id='primary-header-package']";
	
	public String hCars = "//*[@id='primary-header-car']";
	
	public String hCruises = "//*[@id='primary-header-cruise']";
	
	public String hThingsToDo = "//*[@id='primary-header-activity']";
	
	public String hVactionRental = "//*[@id='primary-header-vacationRental']";
	
	public String hDeals = "//*[@id='primary-header-vacationRental']";
	
	public String hMobile = "//*[@id='primary-header-mobile']";
	
// All Subheader locators
	
	public String sHFlights="tab-flight-tab-hp";
	
	public String sHHotels="tab-hotel-tab-hp";
	
	public String sHBundleAndSave="tab-package-tab-hp";
	
	public String sHCars = "tab-car-tab-hp";
	
	public String sHCruises = "tab-cruise-tab-hp";
	
	public String sHThingsToDo = "tab-activity-tab-hp";
	
	public String sHvaction = "tab-vacation-rental-tab-hp";

//	Allert Message
	
	public String AlMessage = "//*[@id='travelerAlert']/h2/p";
	
// Flights
	
	public String roundTrip= "tab-flight-tab-flp";
	
	public String oneWay = "flight-type-one-way-label-flp";
	
	public String multipleCity = "flight-type-multi-dest-label-flp";
	
// Partner Services
	
	public  String part1 = "//*[@id='partner-services-links']/li[";
	
	public  String part2="10]/a";
	for(int i=1;i<=10;i++){
	String Completedpath=part1+i+part2;
	}
	


	

	
	
	
	
	
	
	
	
	
	
	
}
