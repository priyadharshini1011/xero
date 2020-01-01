package extentReport;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportUtil extends BaseUtil {
String filename = reportLocation + "extentreport.html";
public void ExtentReport() {
	extent = new ExtentReports();
	ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(filename);
	htmlReporter.config().setTheme(Theme.DARK);
	htmlReporter.config().setDocumentTitle("test report for xero");
	htmlReporter.config().setEncoding("utf-8");
	htmlReporter.config().setReportName("test Report");
	extent.attachReporter(htmlReporter);
}
public static void testStepHandle(String teststatus,WebDriver driver,ExtentTest extenttest,Throwable throwable) {
	switch (teststatus) {
	case "FAIL":		
		extenttest.fail(MarkupHelper.createLabel("Test Case is Failed : ", ExtentColor.RED));			
		extenttest.error(throwable.fillInStackTrace());
		
		try {
			extenttest.addScreenCaptureFromPath(captureScreenShot(driver));
			} catch (IOException e) {
			e.printStackTrace();
			}
		
		if (driver != null) {
			driver.quit();
		}		
	break;
	
	case "PASS":			
		extenttest.pass(MarkupHelper.createLabel("Test Case is Passed : ", ExtentColor.GREEN));
		break;
		
	default:
		break;
	}
}

public static String captureScreenShot(WebDriver driver) throws IOException {
	TakesScreenshot screen = (TakesScreenshot) driver;
	File src = screen.getScreenshotAs(OutputType.FILE);
	String dest = "C:\\Users\\auhum\\Documents\\reports" + getcurrentdateandtime() + ".png";
	File target = new File(dest);
	FileUtils.copyFile(src, target);
	return dest;
}

private static String getcurrentdateandtime() {
	String str = null;
	try {
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss:SSS");
		Date date = new Date();
		str = dateFormat.format(date);
		str = str.replace(" ", "").replaceAll("/", "").replaceAll(":", "");
	} catch (Exception e) {
	}
	return str;
}


	public void flush() {
		extent.flush();
	}
}
