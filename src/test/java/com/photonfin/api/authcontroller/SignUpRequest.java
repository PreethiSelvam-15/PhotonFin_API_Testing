package com.photonfin.api.authcontroller;

import java.util.List;

public class SignUpRequest {

	private String createdDateTime;
	private String updatedDateTime;
	private int id;
	private String session_id;
	private String email;
	private String username;
	private String password;
	private String first_name;
	private String last_name;
	private String dob;
	private String mobileno;
	private String aadhar_no;
	private String pan_no;
	private String city;
	private int zipcode;
	private String temporary_address;
	private String permanent_address;
	private int role_id;
	private int mail_confirm;
	private int status;
	private int email_verification_code;
	private int mobile_verification_code;
	private String validity_datetime;
	private String journeyType;
	private String createdBy;
	private String updatedBy;
	private List<Role> roles;

	public static class Role {
		private String createdDateTime;
		private String updatedDateTime;
		private int id;
		private String roleName;

		public Role() {
		}

		public Role(String createdDateTime, String updatedDateTime, int id, String roleName) {
			this.createdDateTime = createdDateTime;
			this.updatedDateTime = updatedDateTime;
			this.id = id;
			this.roleName = roleName;
		}

		public String getCreatedDateTime() {
			return createdDateTime;
		}

		public void setCreatedDateTime(String createdDateTime) {
			this.createdDateTime = createdDateTime;
		}

		public String getUpdatedDateTime() {
			return updatedDateTime;
		}

		public void setUpdatedDateTime(String updatedDateTime) {
			this.updatedDateTime = updatedDateTime;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getRoleName() {
			return roleName;
		}

		public void setRoleName(String roleName) {
			this.roleName = roleName;
		}
	}

	// ✅ Constructors
	public SignUpRequest() {
	}

	public SignUpRequest(String createdDateTime, String updatedDateTime, int id, String session_id, String email,
			String username, String password, String first_name, String last_name, String dob, String mobileno,
			String aadhar_no, String pan_no, String city, int zipcode, String temporary_address,
			String permanent_address, int role_id, int mail_confirm, int status, int email_verification_code,
			int mobile_verification_code, String validity_datetime, String journeyType, String createdBy,
			String updatedBy, List<Role> roles) {
		this.createdDateTime = createdDateTime;
		this.updatedDateTime = updatedDateTime;
		this.id = id;
		this.session_id = session_id;
		this.email = email;
		this.username = username;
		this.password = password;
		this.first_name = first_name;
		this.last_name = last_name;
		this.dob = dob;
		this.mobileno = mobileno;
		this.aadhar_no = aadhar_no;
		this.pan_no = pan_no;
		this.city = city;
		this.zipcode = zipcode;
		this.temporary_address = temporary_address;
		this.permanent_address = permanent_address;
		this.role_id = role_id;
		this.mail_confirm = mail_confirm;
		this.status = status;
		this.email_verification_code = email_verification_code;
		this.mobile_verification_code = mobile_verification_code;
		this.validity_datetime = validity_datetime;
		this.journeyType = journeyType;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.roles = roles;
	}

	public String getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(String createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public String getUpdatedDateTime() {
		return updatedDateTime;
	}

	public void setUpdatedDateTime(String updatedDateTime) {
		this.updatedDateTime = updatedDateTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSession_id() {
		return session_id;
	}

	public void setSession_id(String session_id) {
		this.session_id = session_id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getAadhar_no() {
		return aadhar_no;
	}

	public void setAadhar_no(String aadhar_no) {
		this.aadhar_no = aadhar_no;
	}

	public String getPan_no() {
		return pan_no;
	}

	public void setPan_no(String pan_no) {
		this.pan_no = pan_no;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public String getTemporary_address() {
		return temporary_address;
	}

	public void setTemporary_address(String temporary_address) {
		this.temporary_address = temporary_address;
	}

	public String getPermanent_address() {
		return permanent_address;
	}

	public void setPermanent_address(String permanent_address) {
		this.permanent_address = permanent_address;
	}

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public int getMail_confirm() {
		return mail_confirm;
	}

	public void setMail_confirm(int mail_confirm) {
		this.mail_confirm = mail_confirm;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getEmail_verification_code() {
		return email_verification_code;
	}

	public void setEmail_verification_code(int email_verification_code) {
		this.email_verification_code = email_verification_code;
	}

	public int getMobile_verification_code() {
		return mobile_verification_code;
	}

	public void setMobile_verification_code(int mobile_verification_code) {
		this.mobile_verification_code = mobile_verification_code;
	}

	public String getValidity_datetime() {
		return validity_datetime;
	}

	public void setValidity_datetime(String validity_datetime) {
		this.validity_datetime = validity_datetime;
	}

	public String getJourneyType() {
		return journeyType;
	}

	public void setJourneyType(String journeyType) {
		this.journeyType = journeyType;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
}
