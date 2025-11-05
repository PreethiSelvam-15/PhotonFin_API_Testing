package com.photonfin.api.homecontroller;

public class LendorTypeRequest {

	private int id;
	private String name;
	private String createdDateTime;
	private String updatedDateTime;
	
	public LendorTypeRequest() {
	}
	public LendorTypeRequest(int id, String name, String createdDateTime, String updatedDateTime) {
		super();
		this.id = id;
		this.name = name;
		this.createdDateTime = createdDateTime;
		this.updatedDateTime = updatedDateTime;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getCreatedDateTime() {
		return createdDateTime;
	}
	public String getUpdatedDateTime() {
		return updatedDateTime;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCreatedDateTime(String createdDateTime) {
		this.createdDateTime = createdDateTime;
	}
	public void setUpdatedDateTime(String updatedDateTime) {
		this.updatedDateTime = updatedDateTime;
	}
	
	

}
