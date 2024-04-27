package com.wxample.company_payroll.tax_system;

public class TaxRed {

	private int percent;
	
	public TaxRed(int percent) {
		this.percent=percent;
	}
	
	public int getPercent() {
		return percent;
	}
	public double mainSalaryAfterDeduct(double pay) {
		double deduct = pay * (double)getPercent()/100;
		double r = pay - deduct;
		return  r;
		
	}
}
