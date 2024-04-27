package com.example.company_payroll.insurance_service;

public class ThirdPartyInsuranceImpl {

	private ThirdPartyInsuranceService tpi;
	
	public void setThirdPartyInsuranceService(ThirdPartyInsuranceService t) {
		this.tpi=t;
	}
	
	public double calcInsurance(double pay) {
		return pay+300;
	}
}
