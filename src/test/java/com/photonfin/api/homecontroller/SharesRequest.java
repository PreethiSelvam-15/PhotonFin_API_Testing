package com.photonfin.api.homecontroller;

public class SharesRequest {
	private String createdDateTime;
	private String updatedDateTime;
	private int id;
	private String name;
	private String code;
	private String amc_code;
	private String isin;
	private String logo;
	private int  per_share;
	private int market_value;
	private int week_high;
	private int week_low;
	private int min_ltv;
	private int max_ltv;
	private int week_perf;
	private int lendors_loan_offer;
	private String low_achieved;
	private String high_achieved;
	private String one_week;
	private String one_month;
	private String one_months;
	private String one_year;
	private String createdBy;
	private String updatedBy;
	private int type;

	    public SharesRequest() {}

	    public SharesRequest(String createdDateTime, String updatedDateTime, int id, String name, String code,
	                         String amc_code, String isin, String logo, int per_share, int market_value,
	                         int week_high, int week_low, int min_ltv, int max_ltv, int week_perf,
	                         int lendors_loan_offer, String low_achieved, String high_achieved,
	                         String one_week, String one_month, String one_months, String one_year,
	                         String createdBy, String updatedBy, int type) {
	        this.createdDateTime = createdDateTime;
	        this.updatedDateTime = updatedDateTime;
	        this.id = id;
	        this.name = name;
	        this.code = code;
	        this.amc_code = amc_code;
	        this.isin = isin;
	        this.logo = logo;
	        this.per_share = per_share;
	        this.market_value = market_value;
	        this.week_high = week_high;
	        this.week_low = week_low;
	        this.min_ltv = min_ltv;
	        this.max_ltv = max_ltv;
	        this.week_perf = week_perf;
	        this.lendors_loan_offer = lendors_loan_offer;
	        this.low_achieved = low_achieved;
	        this.high_achieved = high_achieved;
	        this.one_week = one_week;
	        this.one_month = one_month;
	        this.one_months = one_months;
	        this.one_year = one_year;
	        this.createdBy = createdBy;
	        this.updatedBy = updatedBy;
	        this.type = type;
	    }

	    // Optionally, a shorter constructor (for testing without timestamps)
	    public SharesRequest(int id, String name, String code, int per_share, int market_value, String createdBy, int type) {
	        this.id = id;
	        this.name = name;
	        this.code = code;
	        this.per_share = per_share;
	        this.market_value = market_value;
	        this.createdBy = createdBy;
	        this.type = type;
	        this.createdDateTime = java.time.LocalDateTime.now().toString();
	        this.updatedDateTime = java.time.LocalDateTime.now().toString();
	    }

		public String getCreatedDateTime() {
			return createdDateTime;
		}

		public String getUpdatedDateTime() {
			return updatedDateTime;
		}

		public int getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		public String getCode() {
			return code;
		}

		public String getAmc_code() {
			return amc_code;
		}

		public String getIsin() {
			return isin;
		}

		public String getLogo() {
			return logo;
		}

		public int getPer_share() {
			return per_share;
		}

		public int getMarket_value() {
			return market_value;
		}

		public int getWeek_high() {
			return week_high;
		}

		public int getWeek_low() {
			return week_low;
		}

		public int getMin_ltv() {
			return min_ltv;
		}

		public int getMax_ltv() {
			return max_ltv;
		}

		public int getWeek_perf() {
			return week_perf;
		}

		public int getLendors_loan_offer() {
			return lendors_loan_offer;
		}

		public String getLow_achieved() {
			return low_achieved;
		}

		public String getHigh_achieved() {
			return high_achieved;
		}

		public String getOne_week() {
			return one_week;
		}

		public String getOne_month() {
			return one_month;
		}

		public String getOne_months() {
			return one_months;
		}

		public String getOne_year() {
			return one_year;
		}

		public String getCreatedBy() {
			return createdBy;
		}

		public String getUpdatedBy() {
			return updatedBy;
		}

		public int getType() {
			return type;
		}

		public void setCreatedDateTime(String createdDateTime) {
			this.createdDateTime = createdDateTime;
		}

		public void setUpdatedDateTime(String updatedDateTime) {
			this.updatedDateTime = updatedDateTime;
		}

		public void setId(int id) {
			this.id = id;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public void setAmc_code(String amc_code) {
			this.amc_code = amc_code;
		}

		public void setIsin(String isin) {
			this.isin = isin;
		}

		public void setLogo(String logo) {
			this.logo = logo;
		}

		public void setPer_share(int per_share) {
			this.per_share = per_share;
		}

		public void setMarket_value(int market_value) {
			this.market_value = market_value;
		}

		public void setWeek_high(int week_high) {
			this.week_high = week_high;
		}

		public void setWeek_low(int week_low) {
			this.week_low = week_low;
		}

		public void setMin_ltv(int min_ltv) {
			this.min_ltv = min_ltv;
		}

		public void setMax_ltv(int max_ltv) {
			this.max_ltv = max_ltv;
		}

		public void setWeek_perf(int week_perf) {
			this.week_perf = week_perf;
		}

		public void setLendors_loan_offer(int lendors_loan_offer) {
			this.lendors_loan_offer = lendors_loan_offer;
		}

		public void setLow_achieved(String low_achieved) {
			this.low_achieved = low_achieved;
		}

		public void setHigh_achieved(String high_achieved) {
			this.high_achieved = high_achieved;
		}

		public void setOne_week(String one_week) {
			this.one_week = one_week;
		}

		public void setOne_month(String one_month) {
			this.one_month = one_month;
		}

		public void setOne_months(String one_months) {
			this.one_months = one_months;
		}

		public void setOne_year(String one_year) {
			this.one_year = one_year;
		}

		public void setCreatedBy(String createdBy) {
			this.createdBy = createdBy;
		}

		public void setUpdatedBy(String updatedBy) {
			this.updatedBy = updatedBy;
		}

		public void setType(int type) {
			this.type = type;
		}
	    
	    

	}

	
	
