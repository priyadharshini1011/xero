Feature: Automate testCase in xero
@Smoke 	
Scenario: Navigate to XERO
Given : open the xero browser
Then : Validate isdisplayed "browserValidated"
Then : Enter the1 "User Name"
|data|
|priyadharshini.dp.1011@gmail.com|
Then : Enter the1 "Password"
|data|
|disha@123|
Then : Click on the "Login Button"
When : validate the url "Xero | Dashboard | hcl"
Then : Close the browser

Scenario: Incorrect Email 1C
Given : open the xero browser
Then : Validate isdisplayed "browserValidated"
When : Enter the "User Name" "recData[3][1]"
Then : Enter the "Password" "recData[1][2]"	
Then : Click on the "Login Button"
When : validate the text "errormsg" "Your email or password is incorrect"
Then : Close the browser

Scenario: Incorrect Password 1B
Given : open the xero browser
Then : Validate isdisplayed "browserValidated"
Then : Enter the1 "User Name"
|data|
|priyadharshini.dp.1011@gmail.com|
Then : Enter the1 "Password"
|data|
|disha@12|
Then : Click on the "Login Button"
When : validate the text "errormsg" "Your email or password is incorrect"
Then : Close the browser
	
Scenario: Click on Forgot password 1D
Given : open the xero browser
Then : Validate isdisplayed "browserValidated"
Then : Click on the "Forgot password"
Then : Validate isdisplayed "ForgotP"
Then : Enter the1 "ForgotXpath"
|data|
|priyadharshini.dp.1011@gmail.com|
Then : Click on the "sendLink"
When : validate the url "Forgotten Password"
Then : Close the browser
	
Scenario: Sign Up to XDC 2A
Given : open the xero browser
Then : Validate isdisplayed "browserValidated"
Then : Click on the "try free"
Then : Validate isdisplayed "30dayTrail"
Then : Enter the1 "FirstNameXpath"
|data|
|priyadharshini| 
Then : Enter the1 "LastNamex"
|data|
|radha|
Then : Enter the1 "emailX"
|data|
|priyadharshini.dp.1011@gmail.com|
Then : Enter the1 "phoneX"
|data|
|79870870|
Then : validate the dropDown
When : capatcha click ok
When : validate the url "Signup for Xero - Free Trial | Xero US"
Then : Close the browser

Scenario: Sign Up to XDC 2B
Given : open the xero browser
Then : Validate isdisplayed "browserValidated"
Then : Click on the "try free"
Then : Validate isdisplayed "30dayTrail"
Then : Click on the "GetStarted"
When : validate the text "signuperror" "First name can't be empty"
Then : Close the browser
 	
Scenario: Sign Up to XDC 2C
Given : open the xero browser
Then : Validate isdisplayed "browserValidated"
Then : Click on the "try free"
Then : Validate isdisplayed "30dayTrail"
Then : Click on the "terms"
Then : switch to primary window "Terms of Use | Xero US"
Then : Click on the "privacy"
Then : switch to primary window "Privacy Notice | Xero US"
Then : Close the browser

Scenario: Sign Up to XDC 2D
Given : open the xero browser
Then : Validate isdisplayed "browserValidated"
Then : Click on the "try free"
Then : Click on the "offer details"
Then : switch to primary window "Offer details | Xero US"
Then : Close the browser


Scenario: Sign Up to XDC 2E
Given : open the xero browser
Then : Validate isdisplayed "browserValidated"
Then : Click on the "try free"
Then : Validate isdisplayed "30dayTrail"
Then : Click on the "accountant or bookkeeper"
When : validate the url "Sign up for the Xero Partner Program | Xero US"
Then : Close the browser

Scenario: Test all tabs page 3

Given : open the xero browser
Then : Enter the1 "User Name"
|data|
|priyadharshini.dp.1011@gmail.com|
Then : Enter the1 "Password"
|data|
|disha@123|
Then : Click on the "Login Button"
Then : Click on the "DashBoard"
When : validate the url "Xero | Dashboard | hcl"
When : svg element click "notificationX"
Then : Click on the "accounting"
Then : Validate isdisplayed "accountingdropX"
Then : Click on the "reports"
When : validate the url "Xero | Reports | hcl"
When : Click on the "contacts"
Then : Validate isdisplayed "contactsdropX"
Then : Click on the "democompanyX"
Then : Click on the "settingsX"
Then : validate the url "Xero | Organization settings | hcl"
Then : svg element click "newX"
Then : Validate isdisplayed "newdropX"
When : Click on the "democompanyX"
Then : Click on the "filesX"
Then : validate the url "Xero | Files | hcl"
When : Click on the "notificationX"
When : inside iframe "notificationI"
Then : Validate isdisplayed "dropDownN"
When : outside iframe 
When : Click on the "searchX"
When : inside iframe "searchI"
Then : Validate isdisplayed "dropDowwnS"
When : outside iframe 
When : Click on the "help"
Then : validate the text "helptext" "Help"
Then : Close the browser

Scenario: Test Logout Functionality 04
Given : open the xero browser
Then : Enter the1 "User Name"
|data|
|priyadharshini.dp.1011@gmail.com|
Then : Enter the1 "Password"
|data|
|disha@123|
When : Click on the "Login Button"
Then : Click on the "LoginName"
Then : Click on the "LoginOut"
Then : validate the url "Login | Xero Accounting Software"
Then : Close the browser

Scenario: Test Upload profile image 06
Given : open the xero browser
Then : Enter the1 "User Name"
|data|
|priyadharshini.dp.1011@gmail.com|
Then : Enter the1 "Password"
|data|
|disha@123|
When : Click on the "Login Button"
Then : Click on the "LoginName"
Then : Click on the "userPriya"
Then : Click on the "uploadimage"
When : Enter the1 "browse" 
|data|
|E:\Arun Iphone Pics & vids\2013-03\IMG_0001.JPG|
Then : Click on the "upload"
Then : Validate isdisplayed "uploadX"

Scenario: Add another organization Trail version - 1 8
Given : open the xero browser
Then : Enter the1 "User Name"
|data|
|priyadharshini.dp.1011@gmail.com|
Then : Enter the1 "Password"
|data|
|disha@123|
When : Click on the "Login Button"
When : Click on the "democompanyX"
Then : Click on the "MyXero"
Then : windowHandler
Then : Click on the "addyourbusiness"
Then : Click on the "nameOrganization"
Then : Enter the1 "nameOrganization"
|data|
|self|
Then : Click on the "dropdown"  "tagname"
Then : Click on the "timeZone"
Then : Click on the "timeZoneValue"

When : Enter the1 "OrganizationDo"
|data|
|Engineer|
Then : KeyPressCode 
Then : Click on the "StartTrail"
When : validate the text "trailAccount" "self"
Then : move to primaryWindow
Then : Close the browser

Scenario: Add another organization Trail version - 1 8B
Given : open the xero browser
Then : Enter the "User Name" "recData[1][1]"
Then : Enter the "Password" "recData[1][2]"
When : Click on the "Login Button"
When : Click on the "democompanyX"
Then : Click on the "MyXero"
Then : windowHandler
Then : Click on the "addyourbusiness"
Then : Click on the "nameOrganization"
Then : Enter the "nameOrganization" "recData[15][1]"
When : Enter the "OrganizationDo" "recData[15][2]"
Then : KeyPressCode 
Then : Click on the "BuyNow"
When : validate the text "Plan" "Select a plan"
Then : move to primaryWindow
Then : Close the browser


Scenario: Add another organization Trail version - 1 8c
Given : open the xero browser
Then : Enter the "User Name" "recData[1][1]"
Then : Enter the "Password" "recData[1][2]"
When : Click on the "Login Button"
When : Click on the "democompanyX"
Then : Click on the "MyXero"
Then : windowHandler
Then : Click on the "addyourbusiness"
Then : Click on the "nameOrganization"
Then : Enter the "nameOrganization" "recData[15][1]"
When : Enter the "OrganizationDo" "recData[15][2]"
Then : KeyPressCode 
Then : Click on the "BuyNow"
When : validate the text "Plan" "Select a plan"
Then : Click on the "early"
Then : Click on the "continueBilling"
When : Enter the "streetAddress" "recData[15][3]"
When : Enter the "city" "recData[15][4]"
Then : Click on the "state"
Then : Click on the "specifyState"
When : Enter the "zipcode" "recData[15][5]"

Then : Click on the "continueReview"
When : validate the text "addressverify" "17070 Garden path Drive San Diego California 92127 United States"
Then : Click on the "creditCard"
When : inside iframe
When : Enter the "cardNumber" "recData[17][1]"
When : outside iframe 
When : inside iframe "val"
When : Enter the "expiryDate" "recData[17][2]"
When : outside iframe 
When : Enter the "CVC" "recData[17][3]"

When : Enter the "NameOnCard" "recData[17][4]"
Then : Click on the "confirmPurchase"
Then : move to primaryWindow
Then : Close the browser



Scenario: Add another organization Trail version - 1 8D
Given : open the xero browser
Then : Enter the "User Name" "recData[1][1]"
Then : Enter the "Password" "recData[1][2]"
When : Click on the "Login Button"
When : Click on the "democompanyX"
Then : Click on the "MyXero"
Then : windowHandler
Then : Click on the "addyourbusiness"
Then : Click on the "nameOrganization"
Then : Enter the "nameOrganization" "recData[15][1]"
When : Enter the "OrganizationDo" "recData[15][2]"
Then : KeyPressCode 
Then : Click on the "BuyNow"
When : validate the text "Plan" "Select a plan"
Then : Click on the "growing"
Then : Click on the "continueBilling"
When : Enter the "streetAddress" "recData[15][3]"
When : Enter the "city" "recData[15][4]"
Then : Click on the "state"
Then : Click on the "specifyState"
When : Enter the "zipcode" "recData[15][5]"

Then : Click on the "continueReview"
When : validate the text "addressverify" "17070 Garden path Drive San Diego California 92127 United States"
Then : Click on the "creditCard"
When : inside iframe
When : Enter the "cardNumber" "recData[17][1]"
When : outside iframe 
When : inside iframe "val"
When : Enter the "expiryDate" "recData[17][2]"
When : outside iframe 
When : Enter the "CVC" "recData[17][3]"

When : Enter the "NameOnCard" "recData[17][4]"
Then : Click on the "confirmPurchase"
Then : move to primaryWindow
Then : Close the browser



Scenario: Add another organization Trail version - 1 7E
Given : open the xero browser
Then : Enter the "User Name" "recData[1][1]"
Then : Enter the "Password" "recData[1][2]"
When : Click on the "Login Button"
When : Click on the "democompanyX"
Then : Click on the "MyXero"
Then : windowHandler
Then : Click on the "addyourbusiness"
Then : Click on the "nameOrganization"
Then : Enter the "nameOrganization" "recData[15][1]"
When : Enter the "OrganizationDo" "recData[15][2]"
Then : KeyPressCode 
Then : Click on the "BuyNow"
When : validate the text "Plan" "Select a plan"
Then : Click on the "Established"
Then : Click on the "continueBilling"
When : Enter the "streetAddress" "recData[15][3]"
When : Enter the "city" "recData[15][4]"
Then : Click on the "state"
Then : Click on the "specifyState"
When : Enter the "zipcode" "recData[15][5]"

Then : Click on the "continueReview"
When : validate the text "addressverify" "17070 Garden path Drive San Diego California 92127 United States"
Then : Click on the "creditCard"
When : inside iframe
When : Enter the "cardNumber" "recData[17][1]"
When : outside iframe 
When : inside iframe "val"
When : Enter the "expiryDate" "recData[17][2]"
When : outside iframe 
When : Enter the "CVC" "recData[17][3]"

When : Enter the "NameOnCard" "recData[17][4]"
Then : Click on the "confirmPurchase"
Then : move to primaryWindow
Then : Close the browser


Scenario: Add another organization Trail version - 1 7E
Given : open the xero browser
Then : Enter the1 "User Name"
|data|
|priyadharshini.dp.1011@gmail.com|
Then : Enter the1 "Password"
|data|
|disha@123|
When : Click on the "Login Button"
When : Click on the "democompanyX"
Then : Click on the "MyXero"
Then : windowHandler
Then : Click on the "addyourbusiness"
Then : Click on the "nameOrganization"
Then : Enter the1 "nameOrganization"
|data|
|self|
When : Enter the1 "OrganizationDo" 
|data|
|Engineer|
Then : KeyPressCode 
Then : Click on the "QuickBooks"
Then : Click on the "QuickBooksCheckBox"
Then : Click on the "QuickBooksContinue"
Then : Enter the1 "Quickorganisation"
|data|
|self|
Then : Click on the "buyNowQuick"
Then : validate the url "Billing Subscription"
Then : Close the browser

Scenario: Billing - 10
Given : open the xero browser
Then : Enter the1 "User Name"
|data|
|priyadharshini.dp.1011@gmail.com|
Then : Enter the1 "Password"
|data|
|disha@123|
When : Click on the "Login Button"
Then : Click on the "LoginName"
Then : Click on the "AccountsX"
Then : Click on the "subscription"
Then : validate the url "Billing Subscription"
Then : Close the browser
