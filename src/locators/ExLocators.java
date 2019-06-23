package locators;

public class ExLocators {

//	All headers tabs locators
	
	public String hFlights = "//*[@id='primary-header-flight']";
	
	public String hHotels = "//*[@id='primary-header-hotel']";
	
	public String hBundleAndSave = "//*[@id='primary-header-package']";
	
	public String hCars = "//*[@id='primary-header-car']";
	
	public String hCruises = "//*[@id='primary-header-cruise']";
	
	public String hThingsToDo = "primary-header-activity";
	
	public String hVactionRental = "primary-header-vacationRental";
	
	public String hDeals = "primary-header-deals";
	
	public String hMobile = "primary-header-mobile";
	
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
	
// Create an Account
	
	public String hAccount = "header-account-menu";
	
	public String creatAnAccount = "account-register";
	
	public String firstNameL = "gss-signup-first-name";
	
	public String lastNameL = "gss-signup-last-name";
	
	public String emailL = "gss-signup-email";
	
	public String passwordL = "gss-signup-password";
	
	public String cAccSubmit = "gss-signup-submit";
	
// Footer linktexts visibility
	
	public String expediaFooter= "//*[@id='expedia-header']/h5";
	
	public String expediaRewardsFooter= "//*[@id='rewards-header']/h5";
	
	public String expediaLinksFooter= "//*[@id='brand-links-header']/h5";
	
	public String expediaSiteMapsFooter = "//*[@id='expedia-sitemaps-header']/h5";
	
	public String expediaPartnerServicesFooter= "//*[@id='partner-services-header']/h5";
	
	public String expediaGlobalSitesFooter = "//*[@id='global-sites-header']/h5";
	
	public String expediaPartnersFooter = "//*[@id='expedia-partners-header']/h5";
	
	public String expediaEndText = "//*[@id='site-footer-wrap']/div[6]";
	
// Sign In
	
	public String accountHeader = "header-account-menu";
	
	public String accountEmail = "gss-signin-email";
	
	public String accountPass = "gss-signin-password";
	
	public String signInButton = "gss-signin-submit";
	
	public String signInFromAccountDropdown = "account-signin";
	
// Page Images
	
	public String expediaLogo="//*[@id='header-logo']/img";
	
	public String scanQRCode = "//*[@id='mad-banner-wrapper']/div/div[1]/section[2]/img";
	
// Car Search/Booking
	
	public String pickingUp = "//*[@id='car-pickup-clp']";
	public String droppingOff = "//*[@id='car-dropoff-clp']";
	public String pickUpDate= "car-pickup-date-clp";
	public String dropOffDate="car-dropoff-date-clp";
	public String carSearchButton= "gcw-submit-car";
	public String carOnlyCheckBOx="aarp-car-rates-check-clp";
	public String carOnlyTab = "//*[@id='tab-car-tab-clp']/span[1]/span";
	public String checkboxCar= "//*[@id='aarp-car-rates-check-label']";
	public String carOnlyAdvancedOptions="//*[@id='gcw-cars-form-clp']/a";
	public String carType = "kind";
	public String rentalCarCompany= "vend";
	public String discountCode = "car-options-discount-clp";
	
	public String reserve="ember1519";
	public String reserve2ndstep="//*[@id='ember1248']";
	public String nameondrivinglicense="//*[@id='preferences']/section/article/fieldset/div[2]/div[2]/label/input";
	public String phoneNumber="//*[@id='preferences']/section/article/fieldset/div[2]/label[2]/input";
	public String insuranceProtectionRadioButton= "//*[@id='carNo']/div/label";
	public String finalReserveButtonforCarBooking= "//*[@id='complete-booking']";
	
	
	
		
	
// Text Message
	public String textMessage= "mad-t2d-form-input";
	public String textSend="//*[@id='mad-banner-wrapper']/div/div[1]/section[1]/fieldset/button";

//	Things to do
	public String thingstoDoDestination= "activity-destination-alp";
	public String thingstoDoFromDate= "activity-start-alp";
	public String thingstoDoToDate="activity-end-alp";
	public String activitiySearchButton="//*[@id='gcw-activities-form-alp']/div[5]/label";
	
// Vacation Rentals//Read from excel
	public String vacationRentalDestination= "VR-destination";
	
// Write in excel
	public String gettheExpediaApp = "//*[@id='mad-banner-wrapper']/div/div[1]/div/h5/div";
	public String footerWarningtext= "//*[@id='site-footer-wrap']/div[6]";//Expedia Warning text
	
// Assert Practice
	public String hotelDiscount= "//*[@id='mad-banner-wrapper']/div/section/ul/li[1]/span[2]";
	
// Search Vacation Rental
	public String vRFromDate= "VR-fromDate";
	public String vRToDate= "VR-toDate";
	public String vRGuest= "VR-NumAdult";
	public String vRSearhButton= "VR-searchButtonExt1";
	


	
	
	
	
	
	
	

	

	
	
	
	
	
	
	
	
	
	
	
}
