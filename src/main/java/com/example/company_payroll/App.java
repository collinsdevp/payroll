package com.example.company_payroll;

import com.example.company_payroll.HR.HR;
import com.example.company_payroll.full_time.FullTimeEmployee;
import com.example.company_payroll.part_time.PartTimeEmployee;
import com.wxample.company_payroll.tax_system.TaxRed;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        HR hr = new HR();
        
        FullTimeEmployee fp = new FullTimeEmployee("collins", "Software",100,2600.54);
       
        PartTimeEmployee pt1 = new PartTimeEmployee("Fred","Cleaner", 101,14, 12.70);
        PartTimeEmployee pt2 = new PartTimeEmployee("Gary", "Security", 102,16, 11.40);

        hr.addEmployee(fp);
        hr.addEmployee(pt1);
        hr.addEmployee(pt2);
        
        System.out.println("All Employees Details before tax: ");
        hr.displayEmployees();
        
        System.out.println("-----------");
 
        
        System.out.println("All Employees Details after tax: ");
        
        // percent (%) reduction for tax in argument
        fp.taxSystemRedPay(5);
        pt1.taxSystemRedPay(2);
        pt2.taxSystemRedPay(2);
        
        hr.displayEmployeesAfterTaxed();
        
        //System.out.print(fp.calcSalary());
       
    
    }
}
