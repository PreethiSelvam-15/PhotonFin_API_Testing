package com.photonfin.common;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class JVMReport {
	private static ExtentReports extent;
	private static ExtentSparkReporter spark;

	public static ExtentReports getReportInstance() {
		if (extent == null) {
			String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
			String reportPath = System.getProperty("user.dir") + "/target/JVMReport/JVM_TestReport_" + timeStamp + ".html";
			spark = new ExtentSparkReporter(new File(reportPath));

			spark.config().setDocumentTitle("PhotonFin API Automation Report");
			spark.config().setReportName("PhotonFin API Test Execution Report");
			spark.config().setTheme(Theme.STANDARD);

			extent = new ExtentReports();
			extent.attachReporter(spark);
			extent.setSystemInfo("Project", "PhotonFin API");
			extent.setSystemInfo("Environment", "QA");
			extent.setSystemInfo("Tester", "Automation Framework");
		}
		return extent;
	}

	public static ExtentTest createTest(String testName) {
		return extent.createTest(testName);
	}

	public static void flushReport() {
		if (extent != null) {
			extent.flush();
		}
	}
}
