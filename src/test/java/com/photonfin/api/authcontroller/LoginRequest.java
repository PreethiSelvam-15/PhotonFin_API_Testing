package com.photonfin.api.authcontroller;

public class LoginRequest {
	private String mobileno;
	private String mobile_verification_code;
	private String consentType;
	private boolean consentGiven;
	private boolean whatsAppEnabled;
	private boolean promotionalEnabled;

	// Getters and setters
	public String getMobileno() {
		return mobileno;
	}

	public String setMobileno(String mobileno) {
		return this.mobileno = mobileno;
	}

	public String getMobile_verification_code() {
		return mobile_verification_code;
	}

	public void setMobile_verification_code(String mobile_verification_code) {
		this.mobile_verification_code = mobile_verification_code;
	}

	public String getConsentType() {
		return consentType;
	}

	public void setConsentType(String consentType) {
		this.consentType = consentType;
	}

	public boolean isConsentGiven() {
		return consentGiven;
	}

	public void setConsentGiven(boolean consentGiven) {
		this.consentGiven = consentGiven;
	}

	public boolean isWhatsAppEnabled() {
		return whatsAppEnabled;
	}

	public void setWhatsAppEnabled(boolean whatsAppEnabled) {
		this.whatsAppEnabled = whatsAppEnabled;
	}

	public boolean isPromotionalEnabled() {
		return promotionalEnabled;
	}

	public void setPromotionalEnabled(boolean promotionalEnabled) {
		this.promotionalEnabled = promotionalEnabled;
	}

	@Override
	public String toString() {
		return "LoginRequest{" + "mobileno='" + mobileno + '\'' + ", mobile_verification_code='"
				+ mobile_verification_code + '\'' + ", consentType='" + consentType + '\'' + ", consentGiven="
				+ consentGiven + ", whatsAppEnabled=" + whatsAppEnabled + ", promotionalEnabled=" + promotionalEnabled
				+ '}';

	}
}
