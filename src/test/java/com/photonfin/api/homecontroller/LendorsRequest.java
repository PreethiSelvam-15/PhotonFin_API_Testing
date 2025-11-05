package com.photonfin.api.homecontroller;

public class LendorsRequest {

	private String createdDateTime;
	private String updatedDateTime;
	private int id;
	private String name;
	private String logo;
	private String createdBy;
	private String updatedBy;
	private int type;
	private int max_ltv;
	private String interest_rate;
	private String processing_fee;
	private String amount_limit;
	private String approve_time;
	private String age_eligible;
	private String required_document;
	private String tenure;
	private String loan_type;
	private String loantovalue;
	private double actual_interest_rate;
	private String amc;
	private String penal_interest;
	private String pledge_creation_fee;
	private String de_pledge_creation_fee;
	private String late_payment_fee;
	private String loan_termination_fees;
	private String account_opening;
	private String eligible_securities;
	private String prepayment_charges;
	private double minimum_interest_rate;
	private double maximum_interest_rate;
	private double process_fees;
	private double principal;
	private String min_loan_amount;
	private double max_loan_amount;
	private double total_investment;
	private double loan_disbursement;
	private double loan_approval;
	private String repayment;
	private String bureau_score;
	private String user_qualification;
	private String collateral_name;
	private String portfolio_frequency;
	private String lendorName;
	private int status;
	
	public LendorsRequest() {
	}
	
	

	public LendorsRequest(String createdDateTime, String updatedDateTime, int id, String name, String logo,
			String createdBy, String updatedBy, int type, int max_ltv, String interest_rate, String processing_fee,
			String amount_limit, String approve_time, String age_eligible, String required_document, String tenure,
			String loan_type, String loantovalue, double actual_interest_rate, String amc, String penal_interest,
			String pledge_creation_fee, String de_pledge_creation_fee, String late_payment_fee,
			String loan_termination_fees, String account_opening, String eligible_securities, String prepayment_charges,
			double minimum_interest_rate, double maximum_interest_rate, double process_fees, double principal,
			String min_loan_amount, double max_loan_amount, double total_investment, double loan_disbursement,
			double loan_approval, String repayment, String bureau_score, String user_qualification,
			String collateral_name, String portfolio_frequency, String lendorName, int status) {
		super();
		this.createdDateTime = createdDateTime;
		this.updatedDateTime = updatedDateTime;
		this.id = id;
		this.name = name;
		this.logo = logo;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.type = type;
		this.max_ltv = max_ltv;
		this.interest_rate = interest_rate;
		this.processing_fee = processing_fee;
		this.amount_limit = amount_limit;
		this.approve_time = approve_time;
		this.age_eligible = age_eligible;
		this.required_document = required_document;
		this.tenure = tenure;
		this.loan_type = loan_type;
		this.loantovalue = loantovalue;
		this.actual_interest_rate = actual_interest_rate;
		this.amc = amc;
		this.penal_interest = penal_interest;
		this.pledge_creation_fee = pledge_creation_fee;
		this.de_pledge_creation_fee = de_pledge_creation_fee;
		this.late_payment_fee = late_payment_fee;
		this.loan_termination_fees = loan_termination_fees;
		this.account_opening = account_opening;
		this.eligible_securities = eligible_securities;
		this.prepayment_charges = prepayment_charges;
		this.minimum_interest_rate = minimum_interest_rate;
		this.maximum_interest_rate = maximum_interest_rate;
		this.process_fees = process_fees;
		this.principal = principal;
		this.min_loan_amount = min_loan_amount;
		this.max_loan_amount = max_loan_amount;
		this.total_investment = total_investment;
		this.loan_disbursement = loan_disbursement;
		this.loan_approval = loan_approval;
		this.repayment = repayment;
		this.bureau_score = bureau_score;
		this.user_qualification = user_qualification;
		this.collateral_name = collateral_name;
		this.portfolio_frequency = portfolio_frequency;
		this.lendorName = lendorName;
		this.status = status;
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

	public String getLogo() {
		return logo;
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

	public int getMax_ltv() {
		return max_ltv;
	}

	public String getInterest_rate() {
		return interest_rate;
	}

	public String getProcessing_fee() {
		return processing_fee;
	}

	public String getAmount_limit() {
		return amount_limit;
	}

	public String getApprove_time() {
		return approve_time;
	}

	public String getAge_eligible() {
		return age_eligible;
	}

	public String getRequired_document() {
		return required_document;
	}

	public String getTenure() {
		return tenure;
	}

	public String getLoan_type() {
		return loan_type;
	}

	public String getLoantovalue() {
		return loantovalue;
	}

	public double getActual_interest_rate() {
		return actual_interest_rate;
	}

	public String getAmc() {
		return amc;
	}

	public String getPenal_interest() {
		return penal_interest;
	}

	public String getPledge_creation_fee() {
		return pledge_creation_fee;
	}

	public String getDe_pledge_creation_fee() {
		return de_pledge_creation_fee;
	}

	public String getLate_payment_fee() {
		return late_payment_fee;
	}

	public String getLoan_termination_fees() {
		return loan_termination_fees;
	}

	public String getAccount_opening() {
		return account_opening;
	}

	public String getEligible_securities() {
		return eligible_securities;
	}

	public String getPrepayment_charges() {
		return prepayment_charges;
	}

	public double getMinimum_interest_rate() {
		return minimum_interest_rate;
	}

	public double getMaximum_interest_rate() {
		return maximum_interest_rate;
	}

	public double getProcess_fees() {
		return process_fees;
	}

	public double getPrincipal() {
		return principal;
	}

	public String getMin_loan_amount() {
		return min_loan_amount;
	}

	public double getMax_loan_amount() {
		return max_loan_amount;
	}

	public double getTotal_investment() {
		return total_investment;
	}

	public double getLoan_disbursement() {
		return loan_disbursement;
	}

	public double getLoan_approval() {
		return loan_approval;
	}

	public String getRepayment() {
		return repayment;
	}

	public String getBureau_score() {
		return bureau_score;
	}

	public String getUser_qualification() {
		return user_qualification;
	}

	public String getCollateral_name() {
		return collateral_name;
	}

	public String getPortfolio_frequency() {
		return portfolio_frequency;
	}

	public String getLendorName() {
		return lendorName;
	}

	public int getStatus() {
		return status;
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

	public void setLogo(String logo) {
		this.logo = logo;
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

	public void setMax_ltv(int max_ltv) {
		this.max_ltv = max_ltv;
	}

	public void setInterest_rate(String interest_rate) {
		this.interest_rate = interest_rate;
	}

	public void setProcessing_fee(String processing_fee) {
		this.processing_fee = processing_fee;
	}

	public void setAmount_limit(String amount_limit) {
		this.amount_limit = amount_limit;
	}

	public void setApprove_time(String approve_time) {
		this.approve_time = approve_time;
	}

	public void setAge_eligible(String age_eligible) {
		this.age_eligible = age_eligible;
	}

	public void setRequired_document(String required_document) {
		this.required_document = required_document;
	}

	public void setTenure(String tenure) {
		this.tenure = tenure;
	}

	public void setLoan_type(String loan_type) {
		this.loan_type = loan_type;
	}

	public void setLoantovalue(String loantovalue) {
		this.loantovalue = loantovalue;
	}

	public void setActual_interest_rate(double actual_interest_rate) {
		this.actual_interest_rate = actual_interest_rate;
	}

	public void setAmc(String amc) {
		this.amc = amc;
	}

	public void setPenal_interest(String penal_interest) {
		this.penal_interest = penal_interest;
	}

	public void setPledge_creation_fee(String pledge_creation_fee) {
		this.pledge_creation_fee = pledge_creation_fee;
	}

	public void setDe_pledge_creation_fee(String de_pledge_creation_fee) {
		this.de_pledge_creation_fee = de_pledge_creation_fee;
	}

	public void setLate_payment_fee(String late_payment_fee) {
		this.late_payment_fee = late_payment_fee;
	}

	public void setLoan_termination_fees(String loan_termination_fees) {
		this.loan_termination_fees = loan_termination_fees;
	}

	public void setAccount_opening(String account_opening) {
		this.account_opening = account_opening;
	}

	public void setEligible_securities(String eligible_securities) {
		this.eligible_securities = eligible_securities;
	}

	public void setPrepayment_charges(String prepayment_charges) {
		this.prepayment_charges = prepayment_charges;
	}

	public void setMinimum_interest_rate(double minimum_interest_rate) {
		this.minimum_interest_rate = minimum_interest_rate;
	}

	public void setMaximum_interest_rate(double maximum_interest_rate) {
		this.maximum_interest_rate = maximum_interest_rate;
	}

	public void setProcess_fees(double process_fees) {
		this.process_fees = process_fees;
	}

	public void setPrincipal(double principal) {
		this.principal = principal;
	}

	public void setMin_loan_amount(String min_loan_amount) {
		this.min_loan_amount = min_loan_amount;
	}

	public void setMax_loan_amount(double max_loan_amount) {
		this.max_loan_amount = max_loan_amount;
	}

	public void setTotal_investment(double total_investment) {
		this.total_investment = total_investment;
	}

	public void setLoan_disbursement(double loan_disbursement) {
		this.loan_disbursement = loan_disbursement;
	}

	public void setLoan_approval(double loan_approval) {
		this.loan_approval = loan_approval;
	}

	public void setRepayment(String repayment) {
		this.repayment = repayment;
	}

	public void setBureau_score(String bureau_score) {
		this.bureau_score = bureau_score;
	}

	public void setUser_qualification(String user_qualification) {
		this.user_qualification = user_qualification;
	}

	public void setCollateral_name(String collateral_name) {
		this.collateral_name = collateral_name;
	}

	public void setPortfolio_frequency(String portfolio_frequency) {
		this.portfolio_frequency = portfolio_frequency;
	}

	public void setLendorName(String lendorName) {
		this.lendorName = lendorName;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
