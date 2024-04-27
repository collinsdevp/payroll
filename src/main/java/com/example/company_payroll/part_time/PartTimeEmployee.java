package com.example.company_payroll.part_time;

import com.example.company_payroll.employee.Employee;
import com.wxample.company_payroll.tax_system.TaxRed;

public class PartTimeEmployee extends Employee{
    private int hours;
    private double hourRate;
    private String dept;
    private String name;
    private int empID;
     int percentage;
    
    public PartTimeEmployee(String name, String dept, int empID,int hours, double hourRate){
        super();
        this.name=name;
        this.hours = hours;
        this.hourRate = hourRate;
        this.dept=dept;
        this.empID=empID;
        
    }

    @Override
    public double calcSalary(){
        return hours * hourRate;
    }
    

    @Override
    public double taxSystemRedPay(int percentage) {
    	
    	this.percentage=percentage;
    	
    	TaxRed tr = new TaxRed(percentage);
    	
    	return tr.mainSalaryAfterDeduct(calcSalary());
    }
	   @Override
	    public String toString(){
	        return "Employee [name="+name+", dept.="+dept+", salary="+calcSalary()+"]";
	    }
	   
	   @Override
	   public void displaySalaryAfterTax() {
		   System.out.println("Employee [name="+name+", dept.="+dept+", salary="+taxSystemRedPay(2)+"]");
	   }
}
