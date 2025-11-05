package com.photonfin.api.homecontroller;

import java.time.LocalDateTime;

public class SecurityTypeRequest {
	 private int id;
	    private String name;
	    private String createdBy;
	    private String updatedBy;
	    private String createdDateTime;
	    private String updatedDateTime;

	    public SecurityTypeRequest() {}
	    public SecurityTypeRequest(int id, String name, String createdBy, String updatedBy) {
	        this.id = id;
	        this.name = name;
	        this.createdBy = createdBy;
	        this.updatedBy = updatedBy;
	        this.createdDateTime = LocalDateTime.now().toString();
	        this.updatedDateTime = LocalDateTime.now().toString();
	    }

		public int getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		public String getCreatedBy() {
			return createdBy;
		}

		public String getUpdatedBy() {
			return updatedBy;
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

		public void setCreatedBy(String createdBy) {
			this.createdBy = createdBy;
		}

		public void setUpdatedBy(String updatedBy) {
			this.updatedBy = updatedBy;
		}

		public void setCreatedDateTime(String createdDateTime) {
			this.createdDateTime = createdDateTime;
		}

		public void setUpdatedDateTime(String updatedDateTime) {
			this.updatedDateTime = updatedDateTime;
		}


}
