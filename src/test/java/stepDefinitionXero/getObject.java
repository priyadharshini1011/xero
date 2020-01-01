package stepDefinitionXero;

import java.util.HashMap;

import com.testAutomation.Listeners.ListnerImp;

public class getObject extends base {
	public String getValue(String arg1) {
		// TODO Auto-generated method stub
		HashMap<String,String> objectRepo = new HashMap<String,String>();
		objectRepo.put("User Name", "//input[@id='email']");

		objectRepo.put("Password", "//input[@id='password']");
		objectRepo.put("Login Button", "//button[@id='submitButton']");
		
		objectRepo.put("errormsg", "//p[contains(text(),'Your email or password is incorrect')]");
	
		objectRepo.put("Forgot password", "//a[@class='forgot-password-advert']");
		
		objectRepo.put("ForgotXpath", "//input[@id='UserName']");
		
		objectRepo.put("sendLink", "//span[@class='text']");
	
		objectRepo.put("try free", "//a[contains(text(),'Try Xero for free')]");
		objectRepo.put("FirstNameXpath", "//input[@name='FirstName']");
		objectRepo.put("LastNamex", "//input[@name='LastName']");
		objectRepo.put("emailX", "//input[@name='EmailAddress']");
		objectRepo.put("phoneX", "//input[@name='PhoneNumber']");
		
		objectRepo.put("TermsCondition", "//input[@name='TermsAccepted']");
		objectRepo.put("GetStarted", "//span[@class='g-recaptcha-submit']");
		
		objectRepo.put("signuperror", "//span[@id='signup-form-error-message-1']");
		objectRepo.put("terms", "//a[contains(text(),'terms')]");
		objectRepo.put("privacy", "//a[contains(text(),'privacy')]");
	
		objectRepo.put("offer details", "//a[contains(text(),'offer details')]");
		objectRepo.put("accountant or bookkeeper", "//a[contains(text(),'accountant or bookkeeper')]");
		objectRepo.put("DashBoard", "//a[@class='xrh-focusable xrh-tab--body xrh-tab--body-is-selected']");
		objectRepo.put("accounting", "//button[contains(text(),'Accounting')]");
		objectRepo.put("reports", "//a[contains(text(),'Reports')]");
		
		objectRepo.put("accountingdropX", "//div[@class='xrh-dropdown-layout xrh-nav--dropdown xrh-dropdown-is-open xrh-dropdown-is-opening xrh-dropdown-positionleft']");
		objectRepo.put("contactsdropX", "//div[@class='xrh-dropdown-layout xrh-nav--dropdown xrh-dropdown-is-open xrh-dropdown-is-opening xrh-dropdown-positionleft']//div[@class='xrh-dropdown--body']");
		objectRepo.put("contacts", "//button[contains(text(),'Contacts')]");
	
		objectRepo.put("democompanyX", "//div[@class='xrh-appbutton--body']");
		objectRepo.put("settingsX", "//a[contains(text(),'Settings')]");
		objectRepo.put("newX", "//body[@class='xui-body x-sandbox']/div[@id='header']/header[@class='xrh-header xrh-header-business xrh-header-wide']/div[@class='xrh-header--main']/ol[@class='xrh-addons xrh-header-background-color']/li[1]/button[1]/div[1]/*[1]");
		objectRepo.put("newdropX", "//span[contains(text(),'Create new')]");

		objectRepo.put("filesX", "//a[contains(text(),'Files')]");
		objectRepo.put("notificationX", "//li[3]//button[1]//div[1]");
		objectRepo.put("searchX", "//li[2]//button[1]//div[1]");
		objectRepo.put("help", "//li[4]//button[1]//div[1]");

		objectRepo.put("searchtext", "//div[@class='input-container show-placeholder']");
		objectRepo.put("LoginName", "/html/body/div[1]/header/div/ol[2]/li[5]/button/div/abbr");
		objectRepo.put("helptext", "//h3[contains(text(),'Help')]");

		objectRepo.put("LoginOut", "//div[@class='xrh-dropdown-layout xrh-addon--dropdown xrh-dropdown-is-open xrh-dropdown-is-opening xrh-dropdown-positionright']//a[@class='xrh-verticalmenuitem--body'][contains(text(),'Log out')]");
		
		objectRepo.put("uploadimage", "//span[@id='button-1041-btnInnerEl']");
		objectRepo.put("browse", "//input[@class='x-form-file-input']");
		objectRepo.put("upload", "//span[@id='button-1178-btnInnerEl']");
		objectRepo.put("userPriya", "//h4[@class='xrh-verticalmenuitem--heading']");

		objectRepo.put("uploadX", "//span[@id='button-1043-btnInnerEl']");
	
		objectRepo.put("dropDownN", "//div[@class='panelBody']");
		objectRepo.put("notificationI", "//iframe[@id='post_office_frame']");
		objectRepo.put("dropDowwnS", "//div[@id='dropdown-panel']");
		objectRepo.put("searchI", "//input[@id='queryInput']");
		objectRepo.put("MyXero", "//a[contains(text(),'My Xero')]");
		objectRepo.put("addyourbusiness", "//a[contains(text(),'Add an organization')]");
		objectRepo.put("trailAccount", "//h1[@class='xui-pageheading--title']");
		objectRepo.put("nameOrganization", "/html/body/div/div/div[2]/div/div/div[1]/form/div[1]/div/div/input");
		
		objectRepo.put("OrganizationDo", "/html/body/div/div/div[2]/div/div/div[1]/form/div[4]/div/div/div/div[2]/div/input");
		objectRepo.put("StartTrail", "//button[@class='xui-button xui-actions--primary xui-actions--button-spacing xui-button-main xui-button-medium']");
		
		objectRepo.put("BuyNow", "//button[@class='xui-button xui-actions--secondary xui-button-standard xui-button-medium']");
		
		objectRepo.put("Plan", "//span[contains(text(),'Select a plan')]");
		
		objectRepo.put("early", "//section[@id='Early']//div[@class='xui-styledcheckboxradio--radio']");

		objectRepo.put("continueBilling", "//span[contains(text(),'Continue to select billing account')]");
		objectRepo.put("streetAddress", "//input[@id='contactAddress']");
		
		objectRepo.put("continueReview", "//span[contains(text(),'Continue to review & pay')]");
		objectRepo.put("city", "//input[@id='contactCity']");
		objectRepo.put("zipcode", "//input[@id='contactPostalCode']");
		objectRepo.put("state", "//div[@id='postalAddress']//button[@class='xui-button xui-select--button xui-button-standard']");
		objectRepo.put("specifyState", "//span[@class='xui-pickitem--text'][contains(text(),'California')]");
		
		objectRepo.put("addressverify", "//div[@class='xui-margin-horizontal-large xui-padding-vertical']//p[@class='xui-text-secondary']");
		objectRepo.put("creditCard", "//span[contains(text(),'Credit card')]");
		objectRepo.put("cardNumber", "//input[@name='cardnumber']");
		objectRepo.put("expiryDate", "//input[@name='exp-date']");
		objectRepo.put("CVC", "//div[@id='stripe-card-cvc']//input[@class='__PrivateStripeElement-input']");
		objectRepo.put("NameOnCard", "//input[@id='stripe-cardholder-name']");
		objectRepo.put("confirmPurchase", "//span[contains(text(),'Confirm purchase')]");
	
		objectRepo.put("xpath", "/html/body/div[2]/div/div/div/div/div[2]/div[2]/div[2]/section/section[2]/div/div/div/div[1]/div[1]/div/iframe");
		
		objectRepo.put("growing", "//div[@class='xui-padding-top xui-padding-left plancard-popular']//div[@class='xui-styledcheckboxradio--radio']");
		objectRepo.put("Established", "//section[@id='Established']//div[@class='xui-styledcheckboxradio--radio']");
		
objectRepo.put("QuickBooks", "//button[@class='xui-button xui-button-icon xui-button-icon-medium']");
		
		objectRepo.put("QuickBooksCheckBox", "//div[@class='xui-styledcheckboxradio--checkbox xui-styledcheckboxradio--checkbox-small']");
		objectRepo.put("QuickBooksContinue", "//button[@class='xui-button xui-actions--secondary xui-button-main xui-button-medium']");
		objectRepo.put("Quickorganisation", "/html/body/div[4]/form/div/div/div/div[1]/span/div/div[1]/div/div/div/div[2]/div/div/table/tbody/tr/td[2]/input");
		objectRepo.put("buyNowQuick", "//a[@id='simplebutton-1031']");
		objectRepo.put("val", "//iframe[@name='__privateStripeFrame8']");
		objectRepo.put("AccountsX", "//div[@class='xrh-dropdown-layout xrh-addon--dropdown xrh-dropdown-is-open xrh-dropdown-is-opening xrh-dropdown-positionright']//a[@class='xrh-verticalmenuitem--body'][contains(text(),'Account')]");
		objectRepo.put("subscription", "//a[contains(text(),'Subscriptions & Billing')]");
		objectRepo.put("dropdown", "//form/div[2]/div/div/div/div[2]/div/div/button");
		objectRepo.put("tagname", "//li[@id='CNTRY/US']//span[@class='xui-pickitem--text']");
		objectRepo.put("timeZone", "//form/div[3]/div/div/div/div[2]/div/div/button/div");
		objectRepo.put("timeZoneValue", "//span[contains(text(),'(UTC-08:00) Pacific Time (US & Canada)')]");
		
	
		String value = objectRepo.get(arg1);
		return value;
	}
	public String getSendKeys(String arg2) {
		// TODO Auto-generated method stub
		HashMap<String,String> objectRepo = new HashMap<String,String>();
		objectRepo.put("priya", "priyadharshini.dp.1011@gmail.com");

		objectRepo.put("incorrect", "rrr@gmail.com");
		objectRepo.put("pass", "disha@123");
		
		objectRepo.put("wrongPassword", "disha");

		objectRepo.put("name", "rajaram");
		objectRepo.put("lastname", "raj");
		objectRepo.put("emailID", "raj@gmail.com");
		objectRepo.put("phoneNO", "4567892");
		String value = objectRepo.get(arg2);
		return value;
	}
}
