package com.photonfin.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CommonUtilities {

// GET CELL DATA 

	public static String getCellData(String sheetName, int rowNum, int cellNum) throws IOException {
		String res = "";
		File file = new File(
				"C:\\Users\\Preethi\\eclipse-workspace\\PhotonFin_APITesting_Swagger\\src\\test\\resources\\TestData.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);

		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		CellType cellType = cell.getCellType();
		switch (cellType) {
		case STRING:
			res = cell.getStringCellValue();
			break;
		case NUMERIC:
			double numericCellValue = cell.getNumericCellValue();
			if (DateUtil.isCellDateFormatted(cell)) {

				Date date = cell.getDateCellValue();
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
				res = simpleDateFormat.format(date);
			} else {
				long round = Math.round(numericCellValue);
				if (round == numericCellValue) {
					res = String.valueOf(round);
				} else {
					String.valueOf(numericCellValue);
				}
				System.out.println(numericCellValue);
			}
			break;
		default:
			break;
		}
		workbook.close();
		return res;
	}

// GET CELL BOOLEAN DATA 

	public static boolean getCellBooleanData(String sheetName, int rowNum, int colNum) throws IOException {
		File file = new File(
				"C:\\Users\\Preethi\\eclipse-workspace\\PhotonFin_APITesting_Swagger\\src\\test\\resources\\TestData.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet(sheetName);
		Cell cell = sheet.getRow(rowNum).getCell(colNum);

		if (cell == null) {
			return false;
		}

		switch (cell.getCellType()) {
		case BOOLEAN:
			return cell.getBooleanCellValue();
		case STRING:
			String value = cell.getStringCellValue().trim().toLowerCase();
			return value.equals("true") || value.equals("yes");
		case NUMERIC:
			return cell.getNumericCellValue() != 0; // treat 1 = true, 0 = false
		default:
			return false;
		}
	}

	private static String excelFilePath = "C:\\Users\\Preethi\\eclipse-workspace\\PhotonFin_APITesting_Swagger\\src\\test\\resources\\TestData.xlsx";

// GET CELL DATA BY HEADER

	public static String getCellDataByHeader(String sheetName, int rowNum, String headerName) throws Exception {
		FileInputStream fis = new FileInputStream(excelFilePath);
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet(sheetName);
		if (sheet == null) {
			workbook.close();
			throw new Exception(
					"Sheet not found: '" + sheetName + "'. Available sheets are: " + getAvailableSheets(workbook));
		}

		Row headerRow = sheet.getRow(0);
		Map<String, Integer> headerMap = new HashMap<>();
		for (Cell cell : headerRow) {
			headerMap.put(cell.getStringCellValue().trim(), cell.getColumnIndex());
		}

		Integer colIndex = headerMap.get(headerName);
		if (colIndex == null) {
			workbook.close();
			System.out.println("Available headers:");
			for (Cell c : headerRow) {
				System.out.println("'" + c.getStringCellValue().trim() + "'");
			}
			throw new Exception("Header not found: " + headerName);
		}

		Row row = sheet.getRow(rowNum);
		if (row == null) {
			workbook.close();
			throw new Exception("Row " + rowNum + " not found in sheet: " + sheetName);
		}

		Cell cell = row.getCell(colIndex);
		String value = "";

		if (cell != null) {
			switch (cell.getCellType()) {
			case STRING:
				value = cell.getStringCellValue().trim();
				break;
			case NUMERIC:
				if (DateUtil.isCellDateFormatted(cell)) {
					value = cell.getDateCellValue().toString();
				} else {
					value = String.valueOf((long) cell.getNumericCellValue());
				}
				break;
			case BOOLEAN:
				value = String.valueOf(cell.getBooleanCellValue());
				break;
			case FORMULA:
				value = cell.getCellFormula();
				break;
			case BLANK:
			default:
				value = "";
				break;
			}
		}

		workbook.close();
		return value;
	}

//  SET API RESPONSE DATA INTO EXCEL 

	public static void setApiResponseData(String sheetName, int rowNum, String message, String status, int statusCode,
			String data, String userId) throws Exception {

		FileInputStream fis = new FileInputStream(excelFilePath);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		fis.close();

		XSSFSheet sheet = workbook.getSheet(sheetName);
		
		if (sheet == null) {
			throw new Exception("Sheet not found: " + sheetName);
		}

		Row headerRow = sheet.getRow(0);
		if (headerRow == null) {
			throw new Exception("Header row is missing in sheet: " + sheetName);
		}

		Map<String, Integer> headerMap = new HashMap<>();
		for (Cell cell : headerRow) {
			headerMap.put(cell.getStringCellValue().trim(), cell.getColumnIndex());
		}

		Row row = sheet.getRow(rowNum);
		if (row == null) {
			row = sheet.createRow(rowNum);
		}

		writeCell(sheet, row, headerMap, "Message", message);
		writeCell(sheet, row, headerMap, "Status", status);
		writeCell(sheet, row, headerMap, "StatusCode", String.valueOf(statusCode));
		writeCell(sheet, row, headerMap, "Data", data);
		writeCell(sheet, row, headerMap, "UserId", userId);

		FileOutputStream fos = new FileOutputStream(excelFilePath);
		workbook.write(fos);
		workbook.close();

		System.out.println("✅ Response written successfully for row " + rowNum + " in sheet " + sheetName);
	}

	public static void writeCell(Sheet sheet, Row row, Map<String, Integer> headerMap, String headerName,
			String value) {
		Integer colIndex = headerMap.get(headerName);
		if (colIndex == null) {
			Row headerRow = sheet.getRow(0);
			if (headerRow == null) {
				headerRow = sheet.createRow(0);
			}
			int newcolIndex = headerRow.getLastCellNum() == -1 ? 0 : headerRow.getLastCellNum();
			headerRow.createCell(newcolIndex).setCellValue(headerName);
			headerMap.put(headerName, newcolIndex);
			colIndex = newcolIndex;
		}

		Cell cell = row.getCell(colIndex);
		if (cell == null) {
			cell = row.createCell(colIndex);
		}
		cell.setCellValue(value);
	}

// GET OR CREATE A COLUMN INDEX 

	public static int getOrCreateColumn(Row headerRow, Map<String, Integer> headerMap, String columnName) {
		if (headerMap.containsKey(columnName)) {
			return headerMap.get(columnName);
		} else {
			int newCol = headerRow.getLastCellNum();
			if (newCol < 0)
				newCol = 0;
			headerRow.createCell(newCol).setCellValue(columnName);
			return newCol;
		}
	}

//  GET CELL BOOLEAN DATA BY HEADER

	public static boolean getCellBooleanDataByHeader(String sheetName, int rowNum, String headerName) throws Exception {
		return Boolean.parseBoolean(getCellDataByHeader(sheetName, rowNum, headerName));
	}

	private static final String DB_URL = "jdbc:mysql://your-db-host:3306/your_db";
	private static final String DB_USER = "your_db_user";
	private static final String DB_PASS = "your_db_password";

	public static String fetchLatestOTP(String mobileNo) {
		String otp = null;
		String query = "SELECT otp_code FROM otp_table WHERE mobile_no = ? ORDER BY created_time DESC LIMIT 1";

		try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
				PreparedStatement ps = con.prepareStatement(query)) {
			mobileNo = getCellData("Login", 1, 1);
			ps.setString(1, mobileNo);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				otp = rs.getString("otp_code");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return otp;
	}
	

// CREATE CELL / SET CELL VALUE 

	public void createOneCellData(String sheetName, int rowNum, int cellNum, String data) throws IOException {
		File file = new File("");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.createCell(cellNum);
		cell.setCellValue(data);
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		workbook.write(fileOutputStream);
		workbook.close();
	}

// GET AVAILABLE SHEETS 
	private static String getAvailableSheets(Workbook workbook) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
			sb.append(workbook.getSheetName(i));
			if (i < workbook.getNumberOfSheets() - 1)
				sb.append(", ");
		}
		return sb.toString();
	}

//WRITE / UPDATE CELL BY HEADER
	
	public static void setCellDataByHeader(String sheetName, int rowNum, String headerName, String value)
			throws Exception {
		FileInputStream fis = new FileInputStream(excelFilePath);
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet(sheetName);
		if (sheet == null)
			throw new Exception("Sheet not found: " + sheetName);

		Row headerRow = sheet.getRow(0);
		if (headerRow == null)
			throw new Exception("Header row missing");

		Map<String, Integer> headerMap = new HashMap<>();
		for (Cell cell : headerRow) {
			headerMap.put(cell.getStringCellValue().trim(), cell.getColumnIndex());
		}

		Integer colIndex = headerMap.get(headerName);
		if (colIndex == null) {
			// create a new header if not exist
			int newcolIndex = headerRow.getLastCellNum() == -1 ? 0 : headerRow.getLastCellNum();
			headerRow.createCell(newcolIndex).setCellValue(headerName);
			colIndex = newcolIndex;
		}

		Row row = sheet.getRow(rowNum);
		if (row == null)
			row = sheet.createRow(rowNum);
		Cell cell = row.getCell(colIndex);
		if (cell == null)
			cell = row.createCell(colIndex);

		cell.setCellValue(value == null ? "" : value);

		fis.close();
		FileOutputStream fos = new FileOutputStream(excelFilePath);
		workbook.write(fos);
		fos.close();
		workbook.close();

		System.out.println("Excel updated: [" + sheetName + "] Row " + rowNum + " -> " + headerName + " = " + value);
	}

//BULK WRITE TEST RESULTS
	public static void setApiResponseData1(String sheetName, int rowNum, String message, String status, int statusCode,
			String data, String userId) throws Exception {
		setCellDataByHeader(sheetName, rowNum, "message", message);
		setCellDataByHeader(sheetName, rowNum, "status", status);
		setCellDataByHeader(sheetName, rowNum, "statusCode", String.valueOf(statusCode));
		setCellDataByHeader(sheetName, rowNum, "data", data);
		setCellDataByHeader(sheetName, rowNum, "userId", userId);
	}
}
