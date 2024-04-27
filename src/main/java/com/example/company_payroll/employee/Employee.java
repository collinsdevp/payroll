package com.example.company_payroll.employee;

import com.wxample.company_payroll.tax_system.TaxRed;

public class Employee {
	
	public Employee(){
		
	}
	
	private String fullName;
    private String dept;
    private int empID;
    
	    public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}

	 public double calcSalary() {
		 return 0.0;
	 }
	
	   @Override
	    public String toString(){
	        return "Employee [name="+fullName+", dept.="+dept+", salary="+calcSalary()+"]";
	    }
	   
	   public double taxSystemRedPay(int percentage) {
	    	
	    	return 0.0;
	    }

	   public void displaySalaryAfterTax() {
		   
	   }
}