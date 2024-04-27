package com.example.company_payroll.HR;
import java.util.ArrayList;

import com.example.company_payroll.employee.Employee;

public class HR {
	 public ArrayList<Employee> empList;

	 public HR() {
		 empList = new ArrayList<>();
	 }
	 
	public void addEmployee(Employee employee){
	    	empList.add(employee);
	 }
	

    public void displayEmployees(){
        for (Employee employee : empList) {
            System.out.println(employee);
        }
    }
    
    
    public void displayEmployeesAfterTaxed(){
        for (Employee employee : empList) {
            employee.displaySalaryAfterTax();
        }
    }
    
}

