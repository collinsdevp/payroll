package com.example.company_payroll;

import org.junit.jupiter.api.BeforeEach;


import com.example.company_payroll.HR.HR;
import com.example.company_payroll.full_time.FullTimeEmployee;
import com.example.company_payroll.insurance_service.ThirdPartyInsuranceImpl;
import com.example.company_payroll.insurance_service.ThirdPartyInsuranceService;
import com.example.company_payroll.part_time.PartTimeEmployee;

import junit.framework.TestCase;




/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{


	
	static HR hr;
	static FullTimeEmployee fp;
	static PartTimeEmployee pt1;
	static PartTimeEmployee pt2;
	


		
		public void testFullTimeEmployeeMonthlySalary()
	    {
			  
		        assertEquals(fp.calcSalary(), 2600.54);
	    }
		
		
		public void testpartTime1EmployeeMonthlySalary()
	    {
			  
		        assertEquals(pt1.calcSalary(), 177.79999999999998);
	    }
		
		
		
		public void testpartTime2EmployeeMonthlySalary()
	    {
			  
		        assertEquals(pt2.calcSalary(), 182.4);
	    }
		
		// integration with TAX SYSTEM
		
		public void testSalaryWithTaxSystem()
	    {
			  // integration test of tax system with payroll system
		        assertEquals(fp.taxSystemRedPay(4), 2496.5184);
	    }
		
		  @BeforeEach
		  public void setUp() {
			  
		  // Setup that needs to be done before each test
		    hr = new HR();
		        
		    fp = new FullTimeEmployee("collins", "Software",100,2600.54);
		       
		    pt1 = new PartTimeEmployee("Fred","Cleaner", 101,14, 12.70);
		    
		    pt2 = new PartTimeEmployee("Gary", "Security", 102,16, 11.40);

		        hr.addEmployee(fp);
		        hr.addEmployee(pt1);
		        hr.addEmployee(pt2);
		        
		      
		  }
		  
		 
}
