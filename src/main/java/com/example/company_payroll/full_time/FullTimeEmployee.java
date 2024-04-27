package com.example.company_payroll.full_time;

import com.example.company_payroll.employee.Employee;
import com.wxample.company_payroll.tax_system.TaxRed;

public class FullTimeEmployee extends Employee {
    private double monthlyPay;
    private String fullname;
    private String dept;
    private int empID;
    int percentage;
 
    public FullTimeEmployee(String fullname, String dept, int empID, double monthlyPay){
        super(); 
        this.monthlyPay = monthlyPay;
        this.fullname=fullname;
        this.dept=dept;
    }


    @Override
    public double calcSalary(){
        return monthlyPay;
    }
    
    @Override
    public double taxSystemRedPay(int percentage) {
    	
    	this.percentage=percentage;
    	
    	TaxRed tr = new TaxRed(percentage);
    	
    	return tr.mainSalaryAfterDeduct(calcSalary());
    }
	   @Override
	    public String toString(){
	        return "Employee [name="+fullname+", dept.="+dept+", salary="+calcSalary()+"]";
	    }
	   
	   @Override
	   public void displaySalaryAfterTax() {
		   System.out.println("Employee [name="+fullname+", dept.="+dept+", salary="+taxSystemRedPay(4)+"]");
	   }
}
