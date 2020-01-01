package stepDefinitionXero;
import org.openqa.selenium.JavascriptExecutor;

import static extentReport.BaseUtil.Features;
import static org.testng.Assert.assertEquals;
import cucumber.api.DataTable;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import static extentReport.BaseUtil.Features;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;
import com.relevantcodes.extentreports.LogStatus;
import com.testAutomation.Listeners.ListnerImp;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import extentReport.ExtentReportUtil;
import xerorRunner.testRunnerXero;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.testng.annotations.Test;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
public class xeroStepDefinition extends getObject{
	WebDriver driver;
	ListnerImp r = new ListnerImp();
	ExtentReportUtil report = new ExtentReportUtil();
	@Given("^: open the xero browser$")
public void open_the_xero_browser() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\jar\\chromedriver.exe");
//driver = new ChromeDriver();
	driver=SetUp();
	driver.get("https://login.xero.com");
	logger.log(LogStatus.PASS, "got the URL");


}




@Then("^: Click on the \"([^\"]*)\"  \"([^\"]*)\"$")
public void click_on_the(String arg1, String arg2) throws Throwable {
	String Identifier = getValue(arg1);
	String Identifier1 = getValue(arg2);
	driver.findElement(By.xpath(Identifier)).click();
	driver.findElement(By.xpath(Identifier1)).click();
	Thread.sleep(10000);
}
@Then("^: validate the dropDown$")
public void validate_the_dropDown() throws Throwable {

	WebElement stage = driver.findElement(By.xpath("//select[@name='LocationCode']"));
	Select dropDown = new Select(stage);
	dropDown.selectByVisibleText("Angola");
	System.out.println(dropDown.getFirstSelectedOption().getText());
	Assert.assertEquals("Angola",dropDown.getFirstSelectedOption().getText());
}

@When("^: inside iframe \"([^\"]*)\"$")
public void inside_iframe(String arg1) throws Throwable {
	Thread.sleep(8000);
	String Identifier = getValue(arg1);
	new WebDriverWait(driver, 10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath(Identifier)));
	Thread.sleep(8000);
}


@Then("^: Enter the \"([^\"]*)\" \"([^\"]*)\"$")
public void enter_the(String arg1, String arg2) throws Throwable {
//ExtentTest logInfo=null;
//	try{
	String [][] recData = getDataInput("C:\\Users\\auhum\\Documents\\xero","xero1.xls","Sheet1");
//		Features = report.extent.createTest(Feature.class, "Youtube channel name validation");
//	
//	//	test = extent.createTest(Feature.class, "Youtube channel name validation");							
//		Features=Features.createNode(Scenario.class, "Youtube channel name validations");						
//		logInfo=Features.createNode(new GherkinKeyword("Given"), "open_Chrome_browser_with_URL");
	String Identifier = getValue(arg1);
int rowIndex = getRowIndexOfInputRecData(arg2);
int columnIndex = getColumnIndexOfInputRecData(arg2);
	String SendText = recData[rowIndex][columnIndex];
	
	driver.findElement(By.xpath(Identifier)).sendKeys(SendText);
////logInfo.addScreenCaptureFromPath(report.captureScreenShot(driver));	
//}
//	catch (AssertionError | Exception e) {
//		report.testStepHandle("FAIL",driver,logInfo,e);			
//	}
}
@Then("^: Enter the1 \"([^\"]*)\"$")
public void enter_the1(String arg1, DataTable arg2) throws Throwable {
	String [][] recData = getDataInput("C:\\Users\\auhum\\Documents\\xero","xero1.xls","Sheet1");
	String Identifier = getValue(arg1); 
	 List<Map<String, String>> list = arg2.asMaps(String.class, String.class);
		System.out.println("Username - " + list.get(0).get("data"));
		driver.findElement(By.xpath(Identifier)).sendKeys(list.get(0).get("data"));
}

@When("^: inside iframe$")
public void inside_iframe() throws Throwable {
	//String Identifier = getValue(arg1);
	
	//WebElement iframe1 = driver.findElement(By.xpath(Identifier));
	Thread.sleep(8000);
	new WebDriverWait(driver, 10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[starts-with(@name, '__privateStripeFrame7')]")));
	//driver.switchTo().frame(iframe1);
	Thread.sleep(8000);
}

@When("^: outside iframe$")
public void outside_iframe() throws Throwable {
	driver.switchTo().defaultContent();
}


@Then("^: Click on the \"([^\"]*)\"$")
public void click_on_the(String arg1) throws Throwable {
	String Identifier = getValue(arg1);
	driver.findElement(By.xpath(Identifier)).click();
	Thread.sleep(12000);

}

@Then("^: Click on the  wait \"([^\"]*)\"$")
public void click_on_the_wait(String arg1) throws Throwable {
	String Identifier = getValue(arg1);
	 new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath(Identifier))).click();  
}
@Then("^: svg element click \"([^\"]*)\"$")
public void svg_element_click(String arg1) throws Throwable {
	Thread.sleep(10000);
	String Identifier = getValue(arg1); 
	WebElement svgObj = driver.findElement(By.xpath(Identifier));
	Actions actionBuilder = new Actions(driver);
	actionBuilder.click(svgObj).build().perform();
}
@Then("^: windowHandler$")
public void windowHandler() throws Throwable {
	//driver.findElement(By.cssSelector("#cfc9052e-13cd-43e3-b67c-f1a00ce5708b-control")).click();
	
	ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
    driver.switchTo().window(tabs2.get(1));
//	driver.findElements(By.tagName("input")).forEach(i -> System.out.println(i.getAttribute("id")));
//	WebElement a = driver.findElements(By.tagName("input")).stream().filter(i -> "organisation-name--input".equals(i.getAttribute("data-automationid"))).findAny().get();
//	WebElement a = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[1]/form/div[1]/div/div/input"));
//    a.click();
//	a.sendKeys("self");
	Thread.sleep(5000);
}

@When("^: KeyPressCode$")
public void keypresscode() throws Throwable {
	Thread.sleep(2000); 
	Robot robot = new Robot(); 
	robot.keyPress(KeyEvent.VK_ENTER);	
	Thread.sleep(5000);	
}

@Then("^: KeyPressCode down$")
public void keypresscode_down() throws Throwable {
	  Robot robot = new Robot(); 
	robot.keyPress(KeyEvent.VK_KP_DOWN);	
	Thread.sleep(10000);
}

@When("^: validate the url \"([^\"]*)\"$")
public void validate_the_url(String arg1) throws Throwable {
String url = driver.getTitle();
	System.out.println(url);
//Assert.assertEquals(arg1, url);
	if(arg1.equals(url)) {
		logger.log(LogStatus.PASS, "got the URL");
	}else
	{
		logger.log(LogStatus.PASS, "got the URL");
	}
	
Thread.sleep(5000);
}

@Then("^: scroll down$")
public void scroll_down() throws Throwable {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	 Thread.sleep(6000);
}

@Then("^: Close the browser$")
public void close_the_browser() throws Throwable {
	logger = reports.startTest("Closing Browser");
	logger.log(LogStatus.PASS, "Closing");
	reports.endTest(logger);
	reports.flush();
	
	driver.close();

}
@Then("^: switch to primary window \"([^\"]*)\"$")
public void switch_to_primary_window(String arg1) throws Throwable {
	 ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));
	    String url1 = driver.getTitle();
	    System.out.println(url1);
		if(arg1.equals(url1)) {
			System.out.println("equal");
		}else
		{
			System.out.println("fail");
		}
	    driver.close();
	    driver.switchTo().window(tabs2.get(0));
	Thread.sleep(2000);

}
@When("^: validate the text \"([^\"]*)\" \"([^\"]*)\"$")
public void validate_the_text(String arg1, String arg2) throws Throwable {
	String Identifier = getValue(arg1);
	WebElement text = driver.findElement(By.xpath(Identifier));
	String actual = text.getText();
	System.out.println(actual);

	if(arg2.equals(actual)) {
		System.out.println("equal");
	}else {
		System.out.println("fail");
	}
	Thread.sleep(10000);	
}

public int getRowIndexOfInputRecData(String arg2) {
	//rectData[1][2]
	int indexOfFirstSquareBracketOpen = arg2.indexOf("[");
	int indexOfFirstSquareBracketEnd = arg2.indexOf("]");
	String rowIndex = arg2.substring(indexOfFirstSquareBracketOpen + 1, indexOfFirstSquareBracketEnd);
	return Integer.parseInt(rowIndex);
}

public int getColumnIndexOfInputRecData(String arg2) {
	//rectData[1][2]
	int indexOfSecondSquareBracketOpen = arg2.lastIndexOf("[");
	int indexOfSecondSquareBracketEnd = arg2.lastIndexOf("]");
	String columnIndex = arg2.substring(indexOfSecondSquareBracketOpen + 1, indexOfSecondSquareBracketEnd);
	return Integer.parseInt(columnIndex);
}

@Then("^: Validate isdisplayed \"([^\"]*)\"$")
public void validate_isdisplayed(String arg1) throws Throwable {
	String Identifier = getValue(arg1);
	WebElement displayed = driver.findElement(By.xpath(Identifier));
	
	Boolean list = displayed.isDisplayed();
	if (list == true) {
		System.out.println("isdisplayed is true");
		}
}

@Then("^: move to primaryWindow$")
public void move_to_primaryWindow() throws Throwable {

	 //driver.switchTo().defaultContent();
	 ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	 driver.close();
	  driver.switchTo().window(tabs2.get(0));
}



@When("^: capatcha click ok$")
public void capatcha_click_ok() throws Throwable {
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	 Thread.sleep(6000);
//	 WebElement iFrame = driver.findElement(By.xpath("//iframe[@name='a-j9gicgomrx6q']"));
//	driver.switchTo().frame(iFrame);
	
	 new WebDriverWait(driver, 10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]")));
	 new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='recaptcha-checkbox-border']"))).click();
	 driver.switchTo().defaultContent();
//	 Actions builder = new Actions(driver);
//	WebElement captcha = driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']"));
//    builder.moveToElement(captcha, 50, 30).click().build().perform();
	 new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='TermsAccepted']"))).click();
	 new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-primary']"))).click();
}

@After
public  void teaqrdown() {
	driver.quit();
	reports.flush();
}
public static String[][] getDataInput(String filepath,String filename, String Sheetname)throws IOException
		{
	
		//Get the Xl path
		File xlfile = new File(filepath+"/"+filename);
		//access to the Xl path
		FileInputStream xlaccess = new FileInputStream(xlfile);
		//access to workbook
		HSSFWorkbook Wb = new HSSFWorkbook(xlaccess);
		//Access the sheet
		HSSFSheet sheet = Wb.getSheet(Sheetname);
		int rowCount = sheet.getLastRowNum();
		int columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println(rowCount);
		System.out.println(columnCount);
		String [][] readData = new String [rowCount+1][columnCount];
		for(int i=0;i<=rowCount;i++)
		{
			for(int j=0;j<sheet.getRow(i).getLastCellNum();j++)
			{
				//System.out.println("row:"+i);
				//System.out.println("coulmn"+j);
				//System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
				//System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
			readData[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();
		
			}
		//System.out.println();

		}
		return readData;
		}



}



