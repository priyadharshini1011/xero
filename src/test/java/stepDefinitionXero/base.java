package stepDefinitionXero;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class base {
	WebDriver driver;
	public static ExtentReports reports;
	public static ExtentTest logger;

//asd
	public WebDriver SetUp()
	{

	//String path = "C:\\Users\\Megha\\Desktop\\Automation_Architect\\ExtentReports\\SFDC.html";
	SimpleDateFormat simpledateformatter = new SimpleDateFormat("'sampledemo_'yyyyMMddHHmm'.html'");
Date currentDate =new Date();
	String filename = simpledateformatter.format(currentDate);
String path = "C:\\Users\\auhum\\eclipse-workspace\\xeroApp\\extendreport"+filename;
		reports = new ExtentReports(path);
		logger=reports.startTest("Application Xero");
	logger.assignAuthor("GeetaK");
	logger.assignCategory("Smoke tEsting");

	System.setProperty("webdriver.chrome.driver", "C:\\jar\\chromedriver.exe");
	driver = new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	logger.log(LogStatus.PASS, "Chrome launched successfully");
	return driver;
	}

	}


