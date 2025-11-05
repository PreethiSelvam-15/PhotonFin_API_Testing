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

public class CustomerLogin {
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

// Mapping LoginRequest  
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

// Execute API 

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
				.parseInt(CommonUtilities.getCellDataByHeader("API- EXP_RESPONSES", rowNum, "statusCode"));
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
	}

//Map response and Write back to Excel 
	public void writeResponse(Object responseBody, String endpoint, int rowNum) throws Exception {
		Response response = given().header("Content-Type", "application/json").body(responseBody).post(endpoint).then()
				.extract().response();
		int actstatusCode = response.statusCode();

		AuthControllerResponse resp = new AuthControllerResponse();
		resp.setStatusCode(actstatusCode);
		resp.setMessage(response.jsonPath().getString("message"));
		resp.setStatus(response.jsonPath().getString("status"));
		resp.setData(response.jsonPath().getString("data"));
		resp.setUserId(response.jsonPath().getInt("data.userId"));

		if (resp.getMessage() == null)
			resp.setMessage("N/A");
		if (resp.getStatus() == null)
			resp.setStatus("N/A");
		if (resp.getData() == null)
			resp.setData(response.getBody().asString());
		test.info("Response Body: " + response.getBody().asString());

		CommonUtilities.setApiResponseData("API- ACT_RESPONSES", rowNum, resp.getMessage(), resp.getStatus(),
				resp.getStatusCode(), resp.getData(), String.valueOf(resp.getUserId()));

		test.info("Response Body: " + response.getBody().asString());
		System.out.println("Response Body: " + response.getBody().asString());
		System.out.println("Content Type: " + response.getHeader("Content-Type"));
	}

// Test 
	@Test
	public void loginValidUser1() throws Exception {
		int rowNum = 43;
		LoginRequest req = createLoginRequest(rowNum);
		AuthControllerResponse resp = new AuthControllerResponse();
		executeApiTest(req, "/customer/login",
				Integer.parseInt(CommonUtilities.getCellDataByHeader("API- EXP_RESPONSES", rowNum, "statusCode")),
				"Test1 : Verify that the user can login with valid data", rowNum);
		writeResponse(resp, "/customer/login", rowNum);

	}

	@Test
	public void loginValidUser2() throws Exception {
		int rowNum = 44;
		LoginRequest req = createLoginRequest(rowNum);
		AuthControllerResponse resp = new AuthControllerResponse();
		executeApiTest(req, "/customer/login",
				Integer.parseInt(CommonUtilities.getCellDataByHeader("API- EXP_RESPONSES", rowNum, "statusCode")),
				"Test2 : Verify that the user can login with valid data", rowNum);
		writeResponse(resp, "/customer/login", rowNum);
	}

	@Test
	public void loginValidUser3() throws Exception {
		int rowNum = 45;
		LoginRequest req = createLoginRequest(rowNum);
		AuthControllerResponse resp = new AuthControllerResponse();
		executeApiTest(req, "/customer/login",
				Integer.parseInt(CommonUtilities.getCellDataByHeader("API- EXP_RESPONSES", rowNum, "statusCode")),
				"Test3 : Verify that the user can login with valid data", rowNum);
		writeResponse(resp, "/customer/login", rowNum);
	}

	@Test
	public void loginInvalidUser4() throws Exception {
		int rowNum = 46;
		LoginRequest req = createLoginRequest(rowNum);
		AuthControllerResponse resp = new AuthControllerResponse();
		executeApiTest(req, "/customer/login",
				Integer.parseInt(CommonUtilities.getCellDataByHeader("API- EXP_RESPONSES", rowNum, "statusCode")),
				"Test4 : Verify that the user can login with invalid data", rowNum);
		writeResponse(resp, "/customer/login", rowNum);
		}

	@Test
	public void loginInvalidUser5() throws Exception {
		int rowNum = 47;
		LoginRequest req = createLoginRequest(rowNum);
		AuthControllerResponse resp = new AuthControllerResponse();
		executeApiTest(req, "/customer/login",
				Integer.parseInt(CommonUtilities.getCellDataByHeader("API- EXP_RESPONSES", rowNum, "statusCode")),
				"Test5 : Verify that the user can login with invalid data", rowNum);
		writeResponse(resp, "/customer/login", rowNum);
		}

	@Test
	public void loginInvalidUser6() throws Exception {
		int rowNum = 48;
		LoginRequest req = createLoginRequest(rowNum);
		AuthControllerResponse resp = new AuthControllerResponse();
		executeApiTest(req, "/customer/login",
				Integer.parseInt(CommonUtilities.getCellDataByHeader("API- EXP_RESPONSES", rowNum, "statusCode")),
				"Test6 : Verify that the user can login with invalid data", rowNum);
		writeResponse(resp, "/customer/login", rowNum);
		}
}