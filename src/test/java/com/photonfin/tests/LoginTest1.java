package com.photonfin.tests;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.photonfin.api.authcontroller.AuthControllerResponse;
import com.photonfin.api.authcontroller.LoginRequest;
import com.photonfin.common.CommonUtilities;
import com.photonfin.common.ExtentReportManager;
import com.photonfin.common.JVMReport;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class LoginTest1 {

	static ExtentReports extent;
	static ExtentTest test;

	@BeforeAll
	public static void setupReport() {
		extent = ExtentReportManager.createReport();
		extent = JVMReport.getReportInstance();
		RestAssured.baseURI = "https://sit.photonfin.com";
	}

	@AfterAll
	public static void tearDown() {
		JVMReport.flushReport();
		extent.flush();
	}

	@Test
	public void loginTest1() throws Exception {
		setupReport();
		test = extent.createTest("Test1: Validate user can  Login with valid data");

		LoginRequest req = new LoginRequest();
		req.setMobileno(CommonUtilities.getCellData("Login", 1, 5));
//		String mobileno = req.setMobileno(CommonUtilities.getCellData("Login", 1, 1));
//        req.setMobile_verification_code(CommonUtilities.fetchLatestOTP(mobileno));
		req.setMobile_verification_code(CommonUtilities.getCellData("Login", 2, 1));
		req.setConsentType(CommonUtilities.getCellData("Login", 3, 1));
		req.setConsentGiven(CommonUtilities.getCellBooleanData("Login", 4, 1));
		req.setWhatsAppEnabled(CommonUtilities.getCellBooleanData("Login", 5, 1));
		req.setPromotionalEnabled(CommonUtilities.getCellBooleanData("Login", 6, 1));

		test.info("Using Data: " + req.toString());

		Response response = given().header("Content-Type", "application/json").body(req).post("/customer/login").then()
				.extract().response();

		String userId = CommonUtilities.getCellData("Login", 7, 1);
		int expUserId = Integer.parseInt(userId);
		AuthControllerResponse globalDatas = new AuthControllerResponse();
		int actUserId = globalDatas.getUserId();
		String.valueOf(actUserId);
		int expStatusCode = 200;
		int actstatusCode = response.statusCode();
		try {
			Assertions.assertEquals(expStatusCode, actstatusCode);
			test.pass("Login Successful as expected | Expected: " + expStatusCode + " | Actual: " + actstatusCode);
			Assertions.assertEquals(expUserId, actUserId);
			test.pass("UserId Pass as expected | Expected:" + expUserId + " | Actual:" + actUserId);
		} catch (AssertionError e) {
			test.fail("Unexpected result | Expected:" + expUserId + " | Actual:" + actUserId);
			test.fail("Failure Reason: " + e.getMessage());
			throw e;
		}

		int statusCode = response.statusCode();

		Assertions.assertEquals(200, statusCode);
		test.pass("Login successful with status code 200");
		ExtentReportManager.logTestResult(test, 200, statusCode, "Login successful as expected");

	}

	@Test
	public void loginTest2() throws Exception {
		test = extent.createTest("Test2: Validate user can  Login with valid data");

		LoginRequest req = new LoginRequest();
		req.setMobileno(CommonUtilities.getCellData("Login", 1, 5));
//		String mobileno = req.setMobileno(CommonUtilities.getCellData("Login", 1, 2));
//        req.setMobile_verification_code(CommonUtilities.fetchLatestOTP(mobileno));
		req.setMobile_verification_code(CommonUtilities.getCellData("Login", 2, 2));
		req.setConsentType(CommonUtilities.getCellData("Login", 3, 2));
		req.setConsentGiven(CommonUtilities.getCellBooleanData("Login", 4, 2));
		req.setWhatsAppEnabled(CommonUtilities.getCellBooleanData("Login", 5, 2));
		req.setPromotionalEnabled(CommonUtilities.getCellBooleanData("Login", 6, 2));

		test.info("Using Data: " + req.toString());

		Response response = given().header("Content-Type", "application/json").body(req).post("/customer/login").then()
				.extract().response();

		int statusCode = response.statusCode();

		Assertions.assertEquals(200, statusCode);
		test.pass("Login successful with status code 200");
		ExtentReportManager.logTestResult(test, 200, statusCode, "Login successful as expected");
	}

	@Test
	public void loginTest3() throws Exception {
		test = extent.createTest("Test3: Validate user can  Login with valid data");

		LoginRequest req = new LoginRequest();
		req.setMobileno(CommonUtilities.getCellData("Login", 1, 5));
//		String mobileno = req.setMobileno(CommonUtilities.getCellData("Login", 1, 3));
//        req.setMobile_verification_code(CommonUtilities.fetchLatestOTP(mobileno));
		req.setMobile_verification_code(CommonUtilities.getCellData("Login", 2, 3));
		req.setConsentType(CommonUtilities.getCellData("Login", 3, 3));
		req.setConsentGiven(CommonUtilities.getCellBooleanData("Login", 4, 3));
		req.setWhatsAppEnabled(CommonUtilities.getCellBooleanData("Login", 5, 3));
		req.setPromotionalEnabled(CommonUtilities.getCellBooleanData("Login", 6, 3));

		test.info("Using Data: " + req.toString());

		Response response = given().header("Content-Type", "application/json").body(req).post("/customer/login").then()
				.extract().response();

		int statusCode = response.statusCode();

		Assertions.assertEquals(200, statusCode);
		test.pass("Login successful with status code 200");
		ExtentReportManager.logTestResult(test, 200, statusCode, "Login successful as expected");
	}

	@Test
	public void loginTest4() throws Exception {
		test = extent.createTest("Test4: Validate user can  Login with invalid data");

		LoginRequest req = new LoginRequest();
		req.setMobileno(CommonUtilities.getCellData("Login", 1, 5));
//		String mobileno = req.setMobileno(CommonUtilities.getCellData("Login", 1, 4));
//        req.setMobile_verification_code(CommonUtilities.fetchLatestOTP(mobileno));
		req.setMobile_verification_code(CommonUtilities.getCellData("Login", 2, 4));
		req.setConsentType(CommonUtilities.getCellData("Login", 3, 4));
		req.setConsentGiven(CommonUtilities.getCellBooleanData("Login", 4, 4));
		req.setWhatsAppEnabled(CommonUtilities.getCellBooleanData("Login", 5, 4));
		req.setPromotionalEnabled(CommonUtilities.getCellBooleanData("Login", 6, 4));

		test.info("Using Data: " + req.toString());

		Response response = given().header("Content-Type", "application/json").body(req).post("/customer/login").then()
				.extract().response();
		int expStatusCode = 400;
		int actstatusCode = response.statusCode();
		try {
			Assertions.assertEquals(expStatusCode, actstatusCode);
			test.pass("Login failed as expected | Expected: " + expStatusCode + " | Actual: " + actstatusCode);
		} catch (AssertionError e) {
			test.fail("Unexpected result | Expected: " + expStatusCode + " | Actual: " + actstatusCode);
			test.fail("Failure Reason: " + e.getMessage());
			throw e;
		}

	}

	@Test
	public void loginTest5() throws Exception {
		test = extent.createTest("Test5: Validate user can  Login with invalid data");

		LoginRequest req = new LoginRequest();
		req.setMobileno(CommonUtilities.getCellData("Login", 1, 5));
//		String mobileno = req.setMobileno(CommonUtilities.getCellData("Login", 1, 5));
//        req.setMobile_verification_code(CommonUtilities.fetchLatestOTP(mobileno));
		req.setMobile_verification_code(CommonUtilities.getCellData("Login", 2, 5));
		req.setConsentType(CommonUtilities.getCellData("Login", 3, 5));
		req.setConsentGiven(CommonUtilities.getCellBooleanData("Login", 4, 5));
		req.setWhatsAppEnabled(CommonUtilities.getCellBooleanData("Login", 5, 5));
		req.setPromotionalEnabled(CommonUtilities.getCellBooleanData("Login", 6, 5));

		test.info("Using Data: " + req.toString());

		Response response = given().header("Content-Type", "application/json").body(req).post("/customer/login").then()
				.extract().response();
		int expStatusCode = 400;
		int actstatusCode = response.statusCode();
		try {
			Assertions.assertEquals(expStatusCode, actstatusCode);
			test.pass("Login failed as expected | Expected: " + expStatusCode + " | Actual: " + actstatusCode);
		} catch (AssertionError e) {
			test.fail("Unexpected result | Expected: " + expStatusCode + " | Actual: " + actstatusCode);
			test.fail("Failure Reason: " + e.getMessage());
			throw e;
		}
	}

	@Test
	public void loginTest6() throws Exception {
		test = extent.createTest("Test6: Validate user can  Login with invalid data");

		LoginRequest req = new LoginRequest();
		req.setMobileno(CommonUtilities.getCellData("Login", 1, 5));
//		String mobileno = req.setMobileno(CommonUtilities.getCellData("Login", 1, 6));
//        req.setMobile_verification_code(CommonUtilities.fetchLatestOTP(mobileno));
		req.setMobile_verification_code(CommonUtilities.getCellData("Login", 2, 6));
		req.setConsentType(CommonUtilities.getCellData("Login", 3, 6));
		req.setConsentGiven(CommonUtilities.getCellBooleanData("Login", 4, 6));
		req.setWhatsAppEnabled(CommonUtilities.getCellBooleanData("Login", 5, 6));
		req.setPromotionalEnabled(CommonUtilities.getCellBooleanData("Login", 6, 6));

		test.info("Using Data: " + req.toString());

		Response response = given().header("Content-Type", "application/json").body(req).post("/customer/login").then()
				.extract().response();

		int expStatusCode = 400;
		int actstatusCode = response.statusCode();
		try {
			Assertions.assertEquals(expStatusCode, actstatusCode);
			test.pass("Login failed as expected | Expected: " + expStatusCode + " | Actual: " + actstatusCode);
		} catch (AssertionError e) {
			test.fail("Unexpected result | Expected: " + expStatusCode + " | Actual: " + actstatusCode);
			test.fail("Failure Reason: " + e.getMessage());
			throw e;
		}
	}

	public LoginRequest createLoginRequest(int rowNum) throws Exception {
		LoginRequest req = new LoginRequest();
		req.setMobileno(CommonUtilities.getCellDataByHeader("API- REQUESTS", rowNum, "mobileno"));
		req.setMobile_verification_code(
				CommonUtilities.getCellDataByHeader("API- REQUESTS", rowNum, "mobile_verification_code"));
		req.setConsentType(CommonUtilities.getCellDataByHeader("API- REQUESTS", rowNum, "consentType"));
		req.setConsentGiven(CommonUtilities.getCellBooleanDataByHeader("API- REQUESTS", rowNum, "consentGiven"));
		req.setWhatsAppEnabled(
				CommonUtilities.getCellBooleanDataByHeader("API- REQUESTS", rowNum, "isWhatsAppEnabled"));
		req.setPromotionalEnabled(
				CommonUtilities.getCellBooleanDataByHeader("API- REQUESTS", rowNum, "isPromotionalEnabled"));
		return req;
	}

//

	public void executeApiTest(Object requestBody, String endpoint, int expectedStatusCode, String testName, int rowNum)
			throws Exception {
		test = extent.createTest("Dynamic Test: " + testName);

		test.info("Request Data: " + requestBody.toString());

		Response response = given().header("Content-Type", "application/json").body(requestBody).post(endpoint).then()
				.extract().response();

		int expUserId = Integer.parseInt(CommonUtilities.getCellDataByHeader("API- EXP_RESPONSES", rowNum, "userId"));
		AuthControllerResponse globalDatas = new AuthControllerResponse();
		int actUserId = globalDatas.getUserId();
		String.valueOf(actUserId);
		int expStatusCode = Integer
				.parseInt(CommonUtilities.getCellDataByHeader("API- EXP_RESPONSES", rowNum, "userId"));
		int actstatusCode = response.statusCode();
		try {
			Assertions.assertEquals(expStatusCode, actstatusCode);
			test.pass("Login Successful as expected | Expected: " + expStatusCode + " | Actual: " + actstatusCode);
			Assertions.assertEquals(expUserId, actUserId);
			test.pass("UserId Pass as expected | Expected:" + expUserId + " | Actual:" + actUserId);
		} catch (AssertionError e) {
			test.fail("Unexpected result | Expected:" + expUserId + " | Actual:" + actUserId);
			test.fail("Failure Reason: " + e.getMessage());
			throw e;
		}

		test.info("Response Body: " + response.getBody().asString());

	}

	@Test
	public void loginWithValidData1() throws Exception {
		LoginRequest req = createLoginRequest(43);
		executeApiTest(req, "/customer/login",
				Integer.parseInt(CommonUtilities.getCellDataByHeader("API- EXP_RESPONSES", 43, "statusCode")),
				"Test1 : Verify that the user can login with valid data", 43);
	}

	@Test
	public void loginWithValidData2() throws Exception {
		LoginRequest req = createLoginRequest(44);
		executeApiTest(req, "/customer/login",
				Integer.parseInt(CommonUtilities.getCellDataByHeader("API- EXP_RESPONSES", 44, "statusCode")),
				"Test2 : Verify that the user can login with valid data", 44);

	}

	@Test
	public void loginWithValidData3() throws Exception {
		LoginRequest req = createLoginRequest(45);
		executeApiTest(req, "/customer/login",
				Integer.parseInt(CommonUtilities.getCellDataByHeader("API- EXP_RESPONSES", 45, "statusCode")),
				"Test3 : Verify that the user can login with valid data",45);
	}

	@Test
	public void loginWithInvalidData4() throws Exception {
		LoginRequest req = createLoginRequest(46);
		executeApiTest(req, "/customer/login",
				Integer.parseInt(CommonUtilities.getCellDataByHeader("API- EXP_RESPONSES", 46, "statusCode")),
				"Test4 : Verify that the user can login with valid data",46);
	}
	@Test
	public void loginWithInvalidData5() throws Exception {
		LoginRequest req = createLoginRequest(47);
		executeApiTest(req, "/customer/login",
				Integer.parseInt(CommonUtilities.getCellDataByHeader("API- EXP_RESPONSES", 47, "statusCode")),
				"Test4 : Verify that the user can login with valid data",47);
	}
	
	@Test
	public void loginWithInvalidData6() throws Exception {
		LoginRequest req = createLoginRequest(48);
		executeApiTest(req, "/customer/login",
				Integer.parseInt(CommonUtilities.getCellDataByHeader("API- EXP_RESPONSES", 48, "statusCode")),
				"Test4 : Verify that the user can login with valid data",48);
	}
	
}
