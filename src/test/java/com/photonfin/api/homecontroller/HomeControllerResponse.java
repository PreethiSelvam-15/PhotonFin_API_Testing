package com.photonfin.api.homecontroller;

public class HomeControllerResponse {

	private String status;
	private String message;
	private String data;
	private int statusCode;
	private String timestamp;
	private String error;
	private String path;
	private int status1;

	public String getStatus() {
		return status;
	}

	public String getMessage() {
		return message;
	}

	public String getData() {
		return data;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public String getError() {
		return error;
	}

	public String getPath() {
		return path;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setData(String data) {
		this.data = data;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public void setError(String error) {
		this.error = error;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	public void setStatus1(int status1) {
		this.status1 = status1;
	}

	public int getStatus1() {
		return status1;
	}

	public void userTypeResponse(int statusCode, String status, String message, String data) {

	}

	public void tenorTypeResponseValid(int statusCode, String status, String message, String data) {

	}

	public void tenorTypeResponseInvalid(int status1, String message, String data) {

	}
	
	

}
