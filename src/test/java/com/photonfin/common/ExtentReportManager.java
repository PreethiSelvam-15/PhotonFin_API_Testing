package com.photonfin.common;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.junit.jupiter.api.Assertions;

public class ExtentReportManager {
	private static ExtentReports extent;

	public static void logTestResult(ExtentTest test, int expected, int actual, String successMsg) {
            try {
        	if (expected==actual) {
                test.pass(successMsg+"|Status Code:" +actual);
            } else {
                test.fail("Expected: "+expected + "but got:"+actual);
                Assertions.assertEquals(expected, actual);
            }
            
            Assertions.assertEquals(expected, actual, 
                    "Expected:"+expected+"but got:"+actual);
            }catch (AssertionError e) {
                test.fail("Assertion failed:"+e.getMessage());
                throw e; 
            }
        }

	public static ExtentReports createReport() {
		if (extent == null) {
			String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
			ExtentSparkReporter reporter = new ExtentSparkReporter("target/ExtentReport/API_TestReport." + timeStamp + "html");
			reporter.config().setReportName("PhotonFin API Test Report");
			reporter.config().setDocumentTitle("API Automation Report");

			extent = new ExtentReports();
			extent.attachReporter(reporter);
			extent.setSystemInfo("Project", "PhotonFin API");
			extent.setSystemInfo("Tester", "Preethi");
		}

		return extent;
	}

}
