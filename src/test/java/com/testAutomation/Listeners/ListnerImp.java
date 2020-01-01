package com.testAutomation.Listeners;
import java.io.IOException;
import static extentReport.BaseUtil.Features;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext ;		
import org.testng.ITestListener ;		
import org.testng.ITestResult ;

import com.aventstack.extentreports.ExtentReports;

import extentReport.ExtentReportUtil;
public class ListnerImp implements ITestListener {
	WebDriver driver;
	ExtentReportUtil extentReportUtil = new ExtentReportUtil();
	private static ExtentReports extent;
    @Override		
    public void onFinish(ITestContext arg0) {					
        // TODO Auto-generated method stub				
    	System.out.println("completed");
    	extentReportUtil.flush();
    }		

    @Override		
    public void onStart(ITestContext arg0) {					
        // TODO Auto-generated method stub				
    	 System.out.println("testcase started");
    		extentReportUtil.ExtentReport();	
    	
    }		

    @Override		
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestFailure(ITestResult arg0) {					
        // TODO Auto-generated method stub				
    	System.out.println("fail");		
    }		

    @Override		
    public void onTestSkipped(ITestResult arg0) {					
        // TODO Auto-generated method stub				
    	System.out.println("skip");				
    }		

    @Override		
    public void onTestStart(ITestResult arg0) {					
        // TODO Auto-generated method stub				
    
    }		

    @Override		
    public void onTestSuccess(ITestResult arg0) {					
        // TODO Auto-generated method stub				
    	System.out.println("pass");	
    	try {
			extentReportUtil.captureScreenShot(driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }		
}
