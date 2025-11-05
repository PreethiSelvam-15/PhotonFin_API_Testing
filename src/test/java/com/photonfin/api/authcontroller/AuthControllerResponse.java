package com.photonfin.api.authcontroller;

public class AuthControllerResponse {

	private int userId;
	private String logtoken;
	private String status;
	private String message;
	private String data;
	private int statusCode;

	public int getStatusCode() {
		return statusCode;
	}

	public int getUserId() {
		return userId;
	}

	public String getLogtoken() {
		return logtoken;
	}

	public String getStatus() {
		return status;
	}

	public String getMessage() {
		return message;
	}

	public String getData() {
		return data;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public void setLogtoken(String logtoken) {
		this.logtoken = logtoken;
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

	@Override
	public String toString() {
		return "AuthControllerResponse{" + "statusCode=" + statusCode + ", status='" + status + '\'' + ", message='"
				+ message + '\'' + ", userId=" + userId + '}';
	}

}
