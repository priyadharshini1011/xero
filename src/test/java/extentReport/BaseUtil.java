package extentReport;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class BaseUtil {
public WebDriver Driver;
public ExtentReports extent;
public static ExtentTest scenarioDef;
public static ExtentTest Features;
public static String reportLocation="./Reports/Extent_Report.html";
}
